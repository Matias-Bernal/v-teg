package SERVER;

import java.io.IOException;
import java.net.SocketException;
import java.util.LinkedList;

import RESOURCES.ilanguage;

public class Chat_Server_Thread extends Thread{
	
	private LinkedList<Server_Client> client_list;
	private int i;
	private int n_client;
	private String mensaje;
	private ilanguage lang;
	
	public Chat_Server_Thread(LinkedList<Server_Client> client_list,int i,int n_client){
		this.client_list=client_list;
		this.i=i;
		this.n_client=n_client;
		this.lang=new ilanguage();
	}
	
	public void processingClient (){
		// determina que lenguaje usa y comienza la transmicion de flujos
		try{
			mensaje = ( String ) client_list.get(i).getIn().readObject();
			lang= lang.getLanguage(mensaje);
			client_list.get(i).getOut().writeObject(lang.get_chat_welcome()+(n_client)+"\n");;
			client_list.get(i).getOut().flush();			
			System.out.println("\n Cliente "+client_list.get(i).getConnection().getInetAddress().toString()+" se ha conectado.");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		while (true){
			try{
				mensaje = ( String ) client_list.get(i).getIn().readObject();
				if (! mensaje.isEmpty()){
					sendMge( lang.get_chat_client_n()+client_list.get(i).getClient_Number()+lang.get_chat_say()+ mensaje);
					if (mensaje.equals("DISCONNECT")) {
						n_client--;
						break;//corta el ciclo
					}
				}
			}catch ( IOException exception ) {
				  if (exception.getClass().equals(SocketException.class)){
					  break;
				  }
				  System.out.println( "\n Se recibió un tipo de objeto desconocido" );
		    }catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		try{
			client_list.get(i).getConnection().close();
			client_list.get(i).getOut().close();
			client_list.get(i).getIn().close();
			//client_list.remove(i);
			client_list.get(i).setActive(false);
	        sendMge(lang.get_chat_client_n()+client_list.get(i).getClient_Number()+lang.get_chat_disconnect());
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	
	public void sendMge(String msj) {
		int i = 0;
		while (i<client_list.size()){
			//if (!(client_list.get(i).getConnection().getInetAddress().equals(client.getConnection().getInetAddress()))){
				if(client_list.get(i).isActive()){
					try {
						client_list.get(i).getOut().writeObject(msj);
						client_list.get(i).getOut().flush();
				    }catch ( IOException excepcionES ) {// si hubo un error al transmitir el msj
			          System.out.println("\n Error al escribir objeto en el CLIENTE ");
			        }
				}
			//}
			i++;
		}	       
	}
	
	@Override
	public void run (){
		processingClient();
	}

}

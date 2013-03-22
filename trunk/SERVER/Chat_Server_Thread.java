package SERVER;

import java.io.IOException;
import java.net.SocketException;
import java.util.LinkedList;

public class Chat_Server_Thread extends Thread{
	
	private LinkedList<Server_Client> client_list;
	private int i;
	private int n_client;
	private String mensaje;
	
	public Chat_Server_Thread(LinkedList<Server_Client> client_list,int i,int n_client){
		this.client_list=client_list;
		this.i=i;
		this.n_client=n_client;
	}
	
	public void processingClient (){
		while (true){
			try{
				mensaje = ( String ) client_list.get(i).getIn().readObject();
				if (! mensaje.isEmpty()){
					sendMge(client_list.get(i), mensaje);
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
	        System.out.println("\n CLIENTE N "+client_list.get(i).getClient_Number()+" DESCONECTADO>>> ");
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	public void sendMge(Server_Client client, String text) {
		int i = 0;
		while (i<client_list.size()){
			//if (!(client_list.get(i).getConnection().getInetAddress().equals(client.getConnection().getInetAddress()))){
			    try {
					client_list.get(i).getOut().writeObject( "CLIENTE N "+client.getClient_Number()+" DICE>>> " + text );
					client_list.get(i).getOut().flush();
			        System.out.println("CLIENTE N "+client.getClient_Number()+" DICE>>> " + text );
			    }catch ( IOException excepcionES ) {// si hubo un error al transmitir el msj
		          System.out.println("\n Error al escribir objeto en el CLIENTE N"+client.getClient_Number() );
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

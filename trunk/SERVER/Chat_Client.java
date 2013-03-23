package SERVER;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.*;

import GUI.Chat_window;
import RESOURCES.ilanguage;
import RESOURCES.lang_es;

public class Chat_Client extends Thread{

	private Socket client;
	private ObjectOutputStream out;
	private ObjectInputStream in;

	private String host;
	private Integer port;
   
	private Chat_window chat_window;
	private ilanguage language;
   
	
	public Chat_Client(String host, Integer port,ilanguage language){
		this.setHost(host);
		this.setPort(port);
		this.setLanguage(language);
		try{
			client = new Socket( host, port );
		    out = new ObjectOutputStream( client.getOutputStream() );      
		    out.flush();
		    in = new ObjectInputStream( client.getInputStream() );
		    sendMge( language.getClass().toString());
		}catch (IOException ioExcep){
			System.out.println("Error al crear el cliente");
		}
		chat_window = new Chat_window(this,language);
		chat_window.setVisible(true);
		chat_window.repaint();
	}
	
	public void sendMge(String mge){
	      try {
	         out.writeObject( mge );
	         out.flush();
	         //chat_window.setChatText(mge);
	      }
	      catch ( IOException excepcionES ) {
	         System.out.println("\n Error del cliente al enviar mensaje" );
	      }
	}
	
	public void getMsg(){
		  String mge = "";
	      do {
	          try {
	        	  mge = ( String ) in.readObject();
	        	  chat_window.setChatText(mge);
	          }
	          catch ( ClassNotFoundException excepcionClaseNoEncontrada ) {
	             System.out.println("\n Se recibió un objeto de tipo desconocido" );
	          }
	          catch (IOException ioExcep){
	        	  System.out.println("\n Error del cliente al recibir un mensaje");
	        	  break;
	          }

	       } while ( !mge.equals( "SERVIDOR>>> TERMINAR" ) );
	}
	
	//ver cuando se ejecuta
 
    @SuppressWarnings("unused")
	private void closeConection() 
	   {
	      try {
	         out.close();
	         in.close();
	         client.close();
	      }
	      catch( IOException excepcionES ) {
	         excepcionES.printStackTrace();
	      }
	   }
	public static void main(String[] args) {
		Chat_Client client = new Chat_Client("localhost", 11000,new lang_es());
		client.getMsg();
	}
	
	@Override
	public void run (){
		getMsg();
	}
	
	//Gets and Sets
	
	public ObjectInputStream getIn() {
		return in;
	}
	public Socket getClient() {
		return client;
	}

	public void setClient(Socket client) {
		this.client = client;
	}

	public void setIn(ObjectInputStream in) {
		this.in = in;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}

	public ObjectOutputStream getOut() {
		return out;
	}

	public void setOut(ObjectOutputStream out) {
		this.out = out;
	}

	public ilanguage getLanguage() {
		return language;
	}

	public void setLanguage(ilanguage language) {
		this.language = language;
	}

}

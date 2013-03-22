package SERVER;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.*;

import GUI.Chat_window;

public class Chat_Client {

	private Socket client;
	private ObjectOutputStream out;
	private ObjectInputStream in;
   
	private String host = "localhost";
	private Integer port = 11000;
   
	private static Chat_window chat_window;
   
	
	public Chat_Client(){
		//chat_window = new Chat_window(this);
	}
	/**
	 * @param args
	 */
	
	public void sendMge(String mge){
		
	}
	
	@SuppressWarnings("unused")
	private void serverConnect() throws IOException{
		client = new Socket( host, port );
	}
	
	public void getMsg() throws IOException{
	      // establecer flujo de entrada para los objetos
	      setIn(new ObjectInputStream( client.getInputStream() ));
	}
	
	public void sendMsg() throws IOException{
	      out = new ObjectOutputStream( client.getOutputStream() );      
	      out.flush(); // vacíar búfer de salida para enviar información de encabezado
	}
	
	public static void main(String[] args) {

	}
	public static Chat_window getChat_window() {
		return chat_window;
	}
	public static void setChat_window(Chat_window chat_window) {
		Chat_Client.chat_window = chat_window;
	}
	public ObjectInputStream getIn() {
		return in;
	}
	public void setIn(ObjectInputStream in) {
		this.in = in;
	}

}

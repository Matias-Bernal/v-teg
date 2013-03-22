package SERVER;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Server_Client {
	
	private Socket connection;
	private ObjectOutputStream out;
	private ObjectInputStream in;
	private int client_number;
	
	public Server_Client(Socket connection, ObjectOutputStream out, ObjectInputStream in, int client_numer){
		this.connection = connection;
		this.out = out;
		this.in = in;
		this.client_number = client_numer;
	}
	
	public void setConnection(Socket connection){
		this.connection = connection;
	}
	public Socket getConnection(){
		return connection;
	}
	
	public void setOut(ObjectOutputStream out){
		this.out = out;
	}
	public ObjectOutputStream getOut(){
		return out;
	}
	
	public void setIn(ObjectInputStream in){
		this.in = in;
	}
	public ObjectInputStream getIn(){
		return in;
	}
	
	public void setClient_Number(int client_number){
		this.client_number = client_number;
	}
	public int getClient_Number(){
		return client_number;
	}
	
}

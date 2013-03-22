package SERVER;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

public class Chat_Server {

	private ServerSocket server;
	private LinkedList<Server_Client> client_list;
	private String server_log;

	public Chat_Server(int port) {
		try {
			server = new ServerSocket(port);
			client_list = new LinkedList<Server_Client>();
			server_log = new String();
		}
		catch (IOException excepcionES) {
			excepcionES.printStackTrace();
		}
	}

	public void runServer() {
		String mensaje;
		int n_client = 1;
			while (true){
				try {
					server_log.concat("Esperando una conexión\n");
					System.out.println("Esperando una conexión\n");
					@SuppressWarnings("resource")
					Socket connection = new Socket();
					connection = server.accept();
					int i = 0;
					boolean find = false;
					while (i<client_list.size() && !find){
						
						
						if (client_list.get(i).getConnection().getInetAddress().equals(connection.getInetAddress())){
							server_log.concat("Intento de conexion fallido, cliente ya esta en la lista\n");
							System.out.println("Intento de conexion fallido, cliente ya esta en la lista\n");
							find = true;
						}
						i++;
					}
					if (!find) {
						ObjectOutputStream new_out = new ObjectOutputStream(connection.getOutputStream());
						ObjectInputStream new_in = new ObjectInputStream(connection.getInputStream());
						Server_Client new_client = new Server_Client(connection, new_out, new_in,n_client);
						client_list.add(new_client);
						n_client++;
						new_out.flush();
						mensaje = "SERVIDOR VTEG DICE:>>> BIENVENIDO AL SERVER DE VTEG O.1";
						new_out.writeObject(mensaje);
						new_out.flush();
						server_log.concat("\n Cliente "+connection.getInetAddress().toString()+" se ha conectado.");
						System.out.println("\n Cliente "+connection.getInetAddress().toString()+" se ha conectado.");
					}
				}
				catch (Exception excepcionES) {
					server_log.concat("\n ERROR AL CONECTAR");
					System.out.println("\n ERROR AL CONECTAR");
				}
				try{
					boolean exit = false;
					while (!exit){ 
			          
						Integer i = 0;
						while (i<client_list.size()){
							try {
								//TODO Error aca se queda esperando infinitamente a un unico cliente
								mensaje = ( String ) client_list.get(i).getIn().readObject();
								if (! mensaje.isEmpty()){
									if (mensaje.equals("CLIENTE N "+client_list.get(i).getClient_Number()+" DICE>>> DISCONNECT")) {
										client_list.remove(i);
										n_client--;
										
									}else{
										sendMge(client_list.get(i), mensaje);
									}
								}
								i++;
								
							}catch ( IOException Exception ) {
						       	  System.out.println( "\nSe recibió un tipo de objeto desconocido" );
						       	  Exception.printStackTrace();
						    } catch (ClassNotFoundException e) {
								e.printStackTrace();
							}
						}				
					}
				}

				finally {
				      try {
							int i = 0;
							while (i<client_list.size()){
									client_list.get(i).getConnection().close();
									client_list.get(i).getOut().close();
									client_list.get(i).getIn().close();
							        server_log.concat("CLIENTE N "+client_list.get(i).getClient_Number()+" DESCONECTADO>>> ");
							        System.out.println("CLIENTE N "+client_list.get(i).getClient_Number()+" DESCONECTADO>>> ");
									i++;
							}
				      }
				      catch( IOException excepcionES ) {
				         excepcionES.printStackTrace();
				      };
				}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Chat_Server server = new Chat_Server(11000);
		server.runServer();
	}

	public void sendMge(Server_Client client, String text) {
	      try {
				int i = 0;
				while (i<client_list.size()){
					if (!(client_list.get(i).getConnection().getInetAddress().equals(client.getConnection().getInetAddress()))){
						client_list.get(i).getOut().writeObject( "CLIENTE N "+client.getClient_Number()+" DICE>>> " + text );
						client_list.get(i).getOut().flush();
				        server_log.concat("CLIENTE N "+client.getClient_Number()+" DICE>>> " + text );
				        System.out.println("CLIENTE N "+client.getClient_Number()+" DICE>>> " + text );
					}
					i++;
				}
	       }
	       catch ( IOException excepcionES ) {
	          System.out.println("\nError al escribir objeto" );
	       }
	}

}

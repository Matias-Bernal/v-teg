package SERVER;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

public class Chat_Server extends Thread{

	private ServerSocket server;
	private LinkedList<Server_Client> client_list;


	public Chat_Server(int port) {
		try {
			server = new ServerSocket(port);
			client_list = new LinkedList<Server_Client>();
		}
		catch (IOException excepcionES) {
			excepcionES.printStackTrace();
		}
	}

	public void runServer() {
		int n_client = 1;
		Integer e = 0;
		while (true){
			try {
				System.out.println("Esperando una conexión \n");
				@SuppressWarnings("resource")
				Socket connection = new Socket();
				connection = server.accept();
				boolean find = false;
				/*
				int i = 0;
				while (i<client_list.size() && !find){
					if (client_list.get(i).getConnection().getInetAddress().equals(connection.getInetAddress())&&client_list.get(i).isAvtive()){
						System.out.println("Intento de conexion fallido, cliente ya esta en la lista\n");
						find = true;
					}
					i++;
				}*/
				if (!find) {
					ObjectOutputStream new_out = new ObjectOutputStream(connection.getOutputStream());
					ObjectInputStream new_in = new ObjectInputStream(connection.getInputStream());
					Server_Client new_client = new Server_Client(connection, new_out, new_in,n_client);
					client_list.add(new_client);
					//si se pudo conectar manda el hilo que maneja la recepcion y reenvio de msj
					new Chat_Server_Thread(client_list, e, n_client).start();
					n_client++;
					e++;
				}
			}
			catch (Exception excepcionES) {
				System.out.println("\n Error server al conectar cliente");
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

}

package GUI;

import java.util.LinkedList;

public interface IVtegMap{
	
	String pathBackground = "";
	LinkedList<JPanel_Country> countrys = new LinkedList<JPanel_Country>();
	int maxPlayer =2;
	String[] idPlayer = new String[maxPlayer];//url de cada color de ficha
	LinkedList adyacencias = null;
	

}

package Interface;

import java.awt.peer.FramePeer;
import java.util.LinkedList;

public interface IVtegMap extends FramePeer{
	
	String pathBackground = "";
	LinkedList<ICountry> countrys = new LinkedList<ICountry>();
	LinkedList<IContinent> continents = new LinkedList<IContinent>();
	int maxPlayer =2;
	IPlayer[] players = new IPlayer[maxPlayer];//conjunto de fichas
	LinkedList<Adjacent> adyacents = new LinkedList<Adjacent>();
	LinkedList <IMision> misions = new LinkedList<IMision>();

	
/*
	public boolean repOK(){
		return true;
	}*/
}

package MODEL;

import java.util.LinkedList;

public interface IPlayer{
	int id =0; // debera setearse con el correspondiente indice del arreglo en el  Game
	String path_img_chip = "";//identificador de color o imagen de la fichaaaa!!!
	Mision mision=null;
	LinkedList <Card> cards = new LinkedList<Card>();
		
	//methods
	public String get_path_img_chip();
	public void set_path_img_chip(String path);
	public void set_id(int id);
	public long get_id();
	public void set_mision(Mision id);
	public Mision get_mision();
	public LinkedList<Card> getCards();
	public void setCards(LinkedList<Card> cards);
	public Card getACard(int index);
	public void setCard(int i,Card c);
	public boolean addCard(Card c);
	public boolean removeCard(Card c);
	//------------------------------------------------------------------
	
	
}

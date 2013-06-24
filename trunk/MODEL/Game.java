package MODEL;

import java.util.LinkedList;

public abstract class Game extends SuperGame {

	/***************/
	Map map;
	int maxPlayer;
	IPlayer[] players = new IPlayer[maxPlayer];//conjunto de fichas
	LinkedList <Mision> misions = new LinkedList<Mision>();
	LinkedList <Card> cards = new LinkedList<Card>();
	/***************/	
	
	public Game(){
		super();
	}
	
	public Game(String pathBackground, int maxPlayer) {
		super();
		this.maxPlayer = maxPlayer;
	}
	//---------------------------------------------------------------
	public int getMaxPlayer() {
		return maxPlayer;
	}
	public void setMaxPlayer(int maxPlayer) {
		this.maxPlayer = maxPlayer;
	}
	//---------------------------------------------------------------
	public IPlayer[] getPlayers() {
		return players;
	}
	public void setPlayers(IPlayer[] players) {
		this.players = players;
	}
	public IPlayer getPlayer(int index) {
		return this.players[index];
	}
	public void setPlayer(int i,IPlayer player) {
		this.players[i]= player;
	}
	//---------------------------------------------------------------
	public LinkedList<Mision> getMisions() {
		return misions;
	}
	public void setMisions(LinkedList<Mision> misions) {
		this.misions = misions;
	}
	public Mision getAMisiont(int index) {
		return this.misions.get(index);
	}
	public void setMision(int i,Mision mision) {
		this.misions.set(i, mision);
	}
	public boolean addMision(Mision mision) {
		return this.misions.add(mision);
	}
	public boolean removeMision(Mision mision) {
		return this.misions.remove(mision);
	}
	//---------------------------------------------------------------
	public LinkedList<Card> getCards() {
		return cards;
	}
	public void setCards(LinkedList<Card> cards) {
		this.cards = cards;
	}
	public Card getACard(int index) {
		return this.cards.get(index);
	}
	public void setCard(int i,Card c) {
		this.cards.set(i, c);
	}
	public boolean addCard(Card c) {
		return this.cards.add(c);
	}
	public boolean removeCard(Card c) {
		return this.cards.remove(c);
	}
	//---------------------------------------------------------------
	public boolean repOK(){
		if (!map.repOK())
			return false;
		//control de la cantidad de player
		if (maxPlayer<2 || maxPlayer>map.countrys.size())
			return false;
		
		//control de las misiones
		for(int i = 0; i<misions.size();i++){
			if (!misions.get(i).repOK())
				return false;
			for (int j= 0; j<misions.get(i).getObjetive().size();j++){
				if (!map.getContinents().contains((Continent)(misions.get(i).getMisionComponent(j).getFirst()))){
					return false;
				}	
			}
			
		}
		//controla cartas
		if(!(map.getCountrys().size()==cards.size()))
			return false;
		
		for(int i = 0; i<cards.size();i++){
			if (!map.getCountrys().contains(cards.get(i).get_Country()))
				return false;
			for(int j = i+1; j<cards.size();j++){				
				if (cards.get(i).get_Country()==cards.get(j).get_Country())
					return false;
			}
		}					
		return true;
	}
}

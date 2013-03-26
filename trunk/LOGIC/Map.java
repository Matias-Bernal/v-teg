package LOGIC;

import java.util.LinkedList;

public abstract class Map {
	
	String pathBackground;
	LinkedList<Country> countrys = new LinkedList<Country>();
	LinkedList<Continent> continents = new LinkedList<Continent>();
	int maxPlayer;
	IPlayer[] players = new IPlayer[maxPlayer];//conjunto de fichas
	LinkedList<Adjacent> adjacents = new LinkedList<Adjacent>();
	LinkedList <Mision> misions = new LinkedList<Mision>();

	
	public Map(String pathBackground, int maxPlayer) {
		super();
		this.pathBackground = pathBackground;
		this.maxPlayer = maxPlayer;
	}
	//---------------------------------------------------------------
	public String getPathBackground() {
		return pathBackground;
	}
	public void setPathBackground(String pathBackground) {
		this.pathBackground = pathBackground;
	}
	//---------------------------------------------------------------
	public int getMaxPlayer() {
		return maxPlayer;
	}
	public void setMaxPlayer(int maxPlayer) {
		this.maxPlayer = maxPlayer;
	}
	//---------------------------------------------------------------	
	
	public LinkedList<Country> getCountrys() {
		return countrys;
	}
	public void setCountrys(LinkedList<Country> countrys) {
		this.countrys = countrys;
	}
	public Country getCountry(int index) {
		return this.countrys.get(index);
	}
	public void setCountry(int i,Country country) {
		this.countrys.set(i, country);
	}
	public boolean addCountry(Country country) {
		return this.countrys.add(country);
	}
	public boolean removeCountry(Country country) {
		return this.countrys.remove(country);
	}
	//---------------------------------------------------------------

	public LinkedList<Continent> getContinents() {
		return continents;
	}
	public void setContinents(LinkedList<Continent> continents) {
		this.continents = continents;
	}
	public Continent getContinent(int index) {
		return this.continents.get(index);
	}
	public void setContinent(int i,Continent continent) {
		this.continents.set(i, continent);
	}
	public boolean addContinent(Continent continent) {
		return this.continents.add(continent);
	}
	public boolean removeContinent(Continent continent) {
		return this.continents.remove(continent);
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
	public LinkedList<Adjacent> getAdjacents() {
		return adjacents;
	}
	public void setAdjacents(LinkedList<Adjacent> adjacents) {
		this.adjacents = adjacents;
	}
	public Adjacent getAdjacent(int index) {
		return this.adjacents.get(index);
	}
	public void setAdjacent(int i,Adjacent adjacent) {
		this.adjacents.set(i, adjacent);
	}
	public boolean addAdjacent(Adjacent adjacent) {
		return this.adjacents.add(adjacent);
	}
	public boolean removeAdjacent(Adjacent adjacent) {
		return this.adjacents.remove(adjacent);
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
	public boolean repOK(){
		
		//control de la cantidad de player
		if (maxPlayer<2 || maxPlayer>countrys.size())
			return false;
		
		//control de las adyacencias
		for(int i = 0; i<adjacents.size();i++)
			if (!adjacents.get(i).repOK())
				return false;

		//control de las misiones
		for(int i = 0; i<misions.size();i++)
			if (!misions.get(i).repOK())
				return false;
		
		//controla q los continentes solo contengan paises del mapa y q no tengan paises repetidos
		for(int i = 0; i<continents.size();i++){
			LinkedList<Country> current_countrys =continents.get(i).get_countrys();
			if (!countrys.containsAll(current_countrys))
				return false;
			for(int j = i+1; j<continents.size();j++){
				LinkedList<Country> next_countrys = continents.get(j).get_countrys();
				for(int k=0; k<next_countrys.size();k++){
					if (current_countrys.contains(next_countrys.get(k)))
						return false;
				}
			}
		}
					
		return true;
	}
}

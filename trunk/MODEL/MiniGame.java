package MODEL;

import java.util.LinkedList;

public class MiniGame extends SuperGame{
	
	LinkedList <Card> cards = new LinkedList<Card>();
	LinkedList<Country> countrys = new LinkedList<Country>();
	LinkedList<Continent> continents = new LinkedList<Continent>();
	
	//---------------------------------------------------------------	

	public MiniGame() {
		super();
	}
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
	//------------------------------------------------------------------
}

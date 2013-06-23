package MODEL;

import java.util.LinkedList;

public abstract class Map {
	LinkedList<Country> countrys = new LinkedList<Country>();
	LinkedList<Continent> continents = new LinkedList<Continent>();
	LinkedList<Adjacent> adjacents = new LinkedList<Adjacent>();

	
	public Map() {
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
	public boolean repOK(){
		
		//control de las adyacencias
		for(int i = 0; i<adjacents.size();i++)
			if (!adjacents.get(i).repOK())
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

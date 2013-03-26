package LOGIC;

import java.io.Serializable;
import java.util.LinkedList;

public abstract class Continent implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	LinkedList<Country> countrys_in_continent= new LinkedList<Country>();
	
	//methods
	public LinkedList<Country> get_countrys(){
		return countrys_in_continent;
	}
	public Country get_country(int index){
		return countrys_in_continent.get(index);
	}
	public int get_cant_of_countrys(){
		return countrys_in_continent.size();
	}
	public void set_countrys(LinkedList<Country> countrys){
		this.countrys_in_continent= countrys;
	}
	public void set_country(int index,Country country){
		this.countrys_in_continent.set(index, country);
	}
	public boolean add_country(Country country){
		return this.countrys_in_continent.add(country);
	}
	public boolean contain_country(Country country){
		return this.countrys_in_continent.contains(country);
	}
	public boolean remove_country(Country country){
		return this.countrys_in_continent.remove(country);
	}
}

package Interface;

import java.io.Serializable;
import java.util.LinkedList;

public interface IContinent extends Serializable {
	LinkedList<ICountry> countrys_in_continent= new LinkedList<ICountry>();
	
	//methods
	public LinkedList<ICountry> get_countrys();
	public ICountry get_country(int index);
	public int get_cant_of_countrys();
	public void set_countrys(LinkedList<ICountry> countrys);
	public void set_country(ICountry country,int index);
	public boolean add_country(ICountry country);
	public boolean contain_country(ICountry country);
	public boolean remove_country(int index);
	public boolean repOK();
}

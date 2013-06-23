package MODEL;

import java.io.Serializable;

public class Card implements Serializable  {

	private static final long serialVersionUID = 1L;
	Country country;
	int type;
	
	public Card(Country c,int t) {
		country=c;
		type=t;
	}

	
	public long get_id (){
		return serialVersionUID;
	}
	
	
	
	public Country get_Country() {
		return country;
	}


	public void set_Country(Country country) {
		this.country = country;
	}


	public int get_Type() {
		return type;
	}


	public void set_Type(int type) {
		this.type = type;
	}


	public boolean repOK(){
		return type>0 && type<5;
	}
	
}

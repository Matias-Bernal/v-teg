package LOGIC;

import java.io.Serializable;

public abstract class Country implements Serializable {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name = "";
	
	//methods
	public String get_name(){
		return name;
	}
	public void set_name(String name){
		this.name= name;
	}
	public long get_id(){
		return serialVersionUID;
	}

}

package Interface;

import java.io.Serializable;

public interface ICountry extends Serializable {	
	String name = "";
	
	//methods
	public String get_name();
	public void set_name(String name);
	public Object get_id();

}

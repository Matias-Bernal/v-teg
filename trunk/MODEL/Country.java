package MODEL;

import java.io.Serializable;

public abstract class Country implements Serializable {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name = "";
	IPlayer player;
	int nroTrops;
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
	public IPlayer get_Player() {
		return player;
	}
	public void set_Player(IPlayer player) {
		this.player = player;
	}
	public int get_NroTrops() {
		return nroTrops;
	}
	public void set_NroTrops(int nroTrops) {
		this.nroTrops = nroTrops;
	}

	
}

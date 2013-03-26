package LOGIC;

import java.io.Serializable;

public class Adjacent extends Pair implements Serializable  {

	private static final long serialVersionUID = 1L;
	
	public Adjacent(Country first, Country second) {
		super(first, second);		
	}

	public boolean isAdjacent(Country c1 , Country c2){
		boolean combinacion1 =(((Country)getFirst()).get_id()==c1.get_id())&&(((Country)getSecond()).get_id()==c2.get_id());
		boolean combinacion2 =(((Country)getFirst()).get_id()==c2.get_id())&&(((Country)getSecond()).get_id()==c1.get_id());
		return combinacion1 || combinacion2;
	}

	public long get_id (){
		return serialVersionUID;
	}
	
	public boolean repOK(){
		return ((Country)getFirst()).get_id()!=((Country)getSecond()).get_id();
	}
	
}

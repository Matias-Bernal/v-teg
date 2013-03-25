package Interface;

import java.io.Serializable;

public class Adjacent extends Pair implements Serializable  {

	private static final long serialVersionUID = 1L;
	
	public Adjacent(ICountry first, ICountry second) {
		super(first, second);		
	}

	public boolean isAdjacent(ICountry c1 , ICountry c2){
		boolean combinacion1 =(((ICountry)getFirst()).get_id()==c1.get_id())&&(((ICountry)getSecond()).get_id()==c2.get_id());
		boolean combinacion2 =(((ICountry)getFirst()).get_id()==c2.get_id())&&(((ICountry)getSecond()).get_id()==c1.get_id());
		return combinacion1 || combinacion2;
	}

	public long get_id (){
		return serialVersionUID;
	}
	
	public boolean repOK(){
		return ((ICountry)getFirst()).get_id()!=((ICountry)getSecond()).get_id();
	}
	
}

package MODEL;


public class MisionComponent extends Pair {
	
	public MisionComponent(Continent cont,Integer cant) {
		super(cont, cant);		
	}
	
	public boolean repOK(){
		return (((Continent)getFirst()).get_cant_of_countrys()>=(Integer)getSecond())&&(Integer)getSecond()>=0;
	}
	
}

package MODEL;

import java.util.LinkedList;

public abstract class Mision {
	private boolean misionComun=false;
	private int valueMisionComun=0;
	private LinkedList<MisionComponent> objetive;
	
	public Mision() {
		super();
	}

	public boolean isMisionComun() {
		return misionComun;
	}

	public void setMisionComun(boolean misionComun) {
		this.misionComun = misionComun;
	}

	public int getValueMisionComun() {
		return valueMisionComun;
	}

	public void setValueMisionComun(int valueMisionComun) {
		this.valueMisionComun = valueMisionComun;
	}

	public LinkedList<MisionComponent> getObjetive() {
		return objetive;
	}

	public void setObjetive(LinkedList<MisionComponent> objetive) {
		this.objetive = objetive;
	}
	
	public MisionComponent getMisionComponent(int i) {
		return objetive.get(i);
	}

	public boolean addMisionComponent(MisionComponent mc) {
		return objetive.add(mc);
	}
	
	public boolean removeMisionComponent(MisionComponent mc) {
		return objetive.remove(mc);
	}
	
	public boolean repOK(){
		if (misionComun && valueMisionComun<=0)
			return false;
		for (int i = 0; i < objetive.size(); i++) {
			if(!objetive.get(i).repOK())
				return false;
		}
		for (int i = 0; i < objetive.size(); i++) {
			for (int j = i+1; j < objetive.size(); j++) {
				if(objetive.get(i)==objetive.get(j))
					return false;
			}
		}
		return true;
	}
	
}

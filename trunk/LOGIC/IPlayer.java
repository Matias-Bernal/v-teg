package Interface;

public interface IPlayer{
	int id =0; // debera setearse con el correspondiente indice del arreglo en el  mapa
	String path_img_chip = "";
		
	//methods
	public String get_path_img_chip();
	public void set_path_img_chip(String path);
	public void set_id(int id);
	public long get_id();
	
	
}

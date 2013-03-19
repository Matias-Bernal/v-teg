package RESOURCES;

public class ilanguage {

	public String main_menu_title = null;
	
	public String main_menu_menu_game = null;
	public String main_menu_menu_game_connect = null;
	public String main_menu_menu_game_disconnect = null;
	public String main_menu_menu_game_exit = null;
	
	public String main_menu_menu_settings = null;
	
	public String main_menu_menu_help = null;
	public String main_menu_menu_help_instructions = null;
	public String main_menu_menu_help_rules = null;
	public String main_menu_menu_help_about = null;

	public void set_mm_tittle(String tittle){
		main_menu_title = tittle;
	}
	public String get_mm_tittle(){
		return main_menu_title;
	}
	
	public void set_mm_game(String game){
		main_menu_menu_game = game;
	}
	public void set_mm_game_connect(String game_connect){
		main_menu_menu_game_connect = game_connect;
	}
	public void set_mm_game_disconnect(String game_disconnect){
		main_menu_menu_game_disconnect = game_disconnect;
	}
	public void set_mm_game_exit(String exit){
		main_menu_menu_game_exit = exit;
	}
	
	
	public void set_mm_settings(String settings){
		main_menu_menu_settings = settings;
	}
	
	
	public void set_mm_game_help(String help){
		main_menu_menu_help = help;
	}
	public void set_mm_game_help_instructions(String instructions){
		main_menu_menu_help_instructions = instructions;
	}
	public void set_mm_game_help_rules(String rules){
		main_menu_menu_help_rules = rules;
	}
	public void set_mm_game_help_about(String about){
		main_menu_menu_help_about = about;
	}
}
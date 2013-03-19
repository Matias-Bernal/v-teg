package RESOURCES;

public class ilanguage {

	//Menu Principal
	public String main_menu_title = null;
	//Menu Game
	public String main_menu_menu_game = null;
	public String main_menu_menu_game_connect = null;
	public String main_menu_menu_game_disconnect = null;
	public String main_menu_menu_game_exit = null;
	//Menu Acciones
	public String main_menu_menu_actions = null;
	//Menu Configuraciones
	public String main_menu_menu_settings = null;
	public String main_menu_menu_settings_language = null;
	public String main_menu_menu_settings_language_spanish = null;
	public String main_menu_menu_settings_language_english = null;
	//Menu Ayuda
	public String main_menu_menu_help = null;
	public String main_menu_menu_help_instructions = null;
	public String main_menu_menu_help_rules = null;
	public String main_menu_menu_help_about = null;
	
	//About window
	
	public String about_tittle = null;
	public String about_text = null;
	

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
	public void set_mm_settings_language(String language){
		main_menu_menu_settings_language = language;
	}
	public void set_mm_settings_language_spanish(String spanish){
		main_menu_menu_settings_language_spanish = spanish;
	}
	public void set_mm_settings_language_englihs(String english){
		main_menu_menu_settings_language_english = english;
	}
	
	public void set_mm_actions(String actions){
		main_menu_menu_actions = actions;
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
	
	//
	
	public void set_aw_tittle(String tittle){
		about_tittle = tittle;
	}
	
	public void set_aw_text(String text){
		about_text = text;
	}
	
}
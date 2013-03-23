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
	
	public String about_title = null;
	public String about_text = null;
	
    //chat
	public String chat_title = null;
	public String chat_welcome = null;
	public String chat_client_n= null;
	public String chat_say = null;
	public String chat_disconnect = null;
	public String chat_send = null;
	
	//connection
	public String connection_title = null;
	public String connection_ip_adress_label = null;
	public String connection_port_label = null;
	public String connection_cancel = null;
	public String connection_conect = null;
	
	
	public void set_mm_title(String tittle){
		main_menu_title = tittle;
	}
	public String get_mm_title(){
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
		about_title = tittle;
	}
	
	public void set_aw_text(String text){
		about_text = text;
	}
	public String get_chat_welcome() {
		return chat_welcome;
	}
	public void set_chat_welcome(String chat_welcome) {
		this.chat_welcome = chat_welcome;
	}
	public String get_chat_client_n() {
		return chat_client_n;
	}
	public void set_chat_client_n(String chat_client_n) {
		this.chat_client_n = chat_client_n;
	}
	public String get_chat_say() {
		return chat_say;
	}
	public void set_chat_say(String chat_say) {
		this.chat_say = chat_say;
	}
	public String get_chat_disconnect() {
		return chat_disconnect;
	}
	public void set_chat_disconnect(String chat_disconnect) {
		this.chat_disconnect = chat_disconnect;
	}
	
	public String get_chat_send() {
		return chat_send;
	}
	public void set_chat_send(String chat_send) {
		this.chat_send = chat_send;
	}
	
	public String get_chat_title() {
		return chat_title;
	}
	public void set_chat_title(String chat_title) {
		this.chat_title = chat_title;
	}
	
	public String get_connection_title() {
		return connection_title;
	}
	public void set_connection_title(String conection_title) {
		this.connection_title = conection_title;
	}
	public String get_connection_ip_adress_label() {
		return connection_ip_adress_label;
	}
	public void set_connection_ip_adress_label(String conection_ip_adress_label) {
		this.connection_ip_adress_label = conection_ip_adress_label;
	}
	public String get_connection_port_label() {
		return connection_port_label;
	}
	public void set_connection_port_label(String conection_port_label) {
		this.connection_port_label = conection_port_label;
	}
	public String get_connection_cancel() {
		return connection_cancel;
	}
	public void set_connection_cancel(String conection_cancel) {
		this.connection_cancel = conection_cancel;
	}
	public String get_connection_conect() {
		return connection_conect;
	}
	public void set_connection_conect(String conection_conect) {
		this.connection_conect = conection_conect;
	}
	public ilanguage getLanguage (String classString){
		if(classString.equals(lang_es.class.toString()))
			return new lang_es();
		//dafalut
		return new lang_es();
	}
	
	
}
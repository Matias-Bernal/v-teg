package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import java.awt.BorderLayout;
import javax.swing.JMenu;
import RESOURCES.*;
import RESOURCES.lang_es;
import javax.swing.JMenuItem;
import java.awt.Toolkit;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import javax.swing.JLabel;




public class main_menu {

	private ilanguage language;
	private JFrame frmVTeg;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main_menu window = new main_menu();
					window.frmVTeg.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main_menu() {
		language = new lang_es();
		initialize();
	}
	
	public ilanguage getLanguage(){
		return language;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVTeg = new JFrame();
		frmVTeg.setResizable(false);
		frmVTeg.setIconImage(Toolkit.getDefaultToolkit().getImage(main_menu.class.getResource("/RESOURCES/Icons/icon_vteg.png")));
		frmVTeg.setTitle(language.main_menu_title);
		frmVTeg.setBounds(100, 100, 700, 500);
		frmVTeg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmVTeg.getContentPane().add(menuBar, BorderLayout.NORTH);
		
		JMenu mnGame = new JMenu(language.main_menu_menu_game);
		menuBar.add(mnGame);
		
		JMenuItem miConnect = new JMenuItem(language.main_menu_menu_game_connect);
		mnGame.add(miConnect);
		
		JMenuItem miDisconnect = new JMenuItem(language.main_menu_menu_game_disconnect);
		mnGame.add(miDisconnect);
		
		JSeparator separator_game = new JSeparator();
		mnGame.add(separator_game);
		
		JMenuItem miExit = new JMenuItem(language.main_menu_menu_game_exit);
		mnGame.add(miExit);
		
		JMenu mnSettings = new JMenu(language.main_menu_menu_settings);
		menuBar.add(mnSettings);
		
		JMenu mnHelp = new JMenu(language.main_menu_menu_help);
		menuBar.add(mnHelp);
		
		JMenuItem miInstructions = new JMenuItem(language.main_menu_menu_help_instructions);
		mnHelp.add(miInstructions);
		
		JMenuItem miRules = new JMenuItem(language.main_menu_menu_help_rules);
		mnHelp.add(miRules);
		
		JMenuItem miAbout = new JMenuItem(language.main_menu_menu_help_about);
		mnHelp.add(miAbout);
		
		JSeparator separator = new JSeparator();
		frmVTeg.getContentPane().add(separator, BorderLayout.CENTER);
		
		JPanel panel_central = new JPanel_Whit_Image("/RESOURCES/Images/mini_map.png");
		frmVTeg.getContentPane().add(panel_central, BorderLayout.CENTER);
		
		JPanel panel_south = new JPanel();
		frmVTeg.getContentPane().add(panel_south, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("VIRTUAL T.E.G - M@ti@s - 2013");
		panel_south.add(lblNewLabel);
	}

}

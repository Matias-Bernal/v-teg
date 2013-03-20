package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;

import RESOURCES.ilanguage;
import RESOURCES.lang_es;




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
	
	public JFrame getFrameMenu(){
		return frmVTeg;
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
		mnGame.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnGame.setIcon(new ImageIcon(main_menu.class.getResource("/RESOURCES/Icons/game.png")));
		menuBar.add(mnGame);
		
		JMenuItem miConnect = new JMenuItem(language.main_menu_menu_game_connect);
		miConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection_window connection = new Connection_window();
				connection.setVisible(true);
			}
		});
		mnGame.add(miConnect);
		
		JMenuItem miDisconnect = new JMenuItem(language.main_menu_menu_game_disconnect);
		mnGame.add(miDisconnect);
		
		JSeparator separator_game = new JSeparator();
		mnGame.add(separator_game);
		
		JMenuItem miExit = new JMenuItem(language.main_menu_menu_game_exit);
		miExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mnGame.add(miExit);
		
		JMenu mnActions = new JMenu(language.main_menu_menu_actions);
		mnActions.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnActions.setIcon(new ImageIcon(main_menu.class.getResource("/RESOURCES/Icons/acctions.png")));
		menuBar.add(mnActions);
		
		JMenu mnSettings = new JMenu(language.main_menu_menu_settings);
		mnSettings.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnSettings.setIcon(new ImageIcon(main_menu.class.getResource("/RESOURCES/Icons/config.png")));
		menuBar.add(mnSettings);
		
		JMenu mnLanguage = new JMenu(language.main_menu_menu_settings_language);
		mnSettings.add(mnLanguage);
		
		JMenuItem miSpanish = new JMenuItem(language.main_menu_menu_settings_language_spanish);
		miSpanish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				language = new lang_es();
				frmVTeg.repaint();
			}
		});
		mnLanguage.add(miSpanish);
		
		JMenuItem miEnglish = new JMenuItem(language.main_menu_menu_settings_language_english);
		miEnglish.setEnabled(false);
		miEnglish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	language = new lang_en();
				frmVTeg.repaint();
			}
		});
		mnLanguage.add(miEnglish);
		
		JMenu mnHelp = new JMenu(language.main_menu_menu_help);
		mnHelp.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnHelp.setIcon(new ImageIcon(main_menu.class.getResource("/RESOURCES/Icons/help.png")));
		menuBar.add(mnHelp);
		
		JMenuItem miInstructions = new JMenuItem(language.main_menu_menu_help_instructions);
		miInstructions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Instructions_window intructions = new Instructions_window();
				intructions.setVisible(true);
			}
		});
		mnHelp.add(miInstructions);
		
		JMenuItem miRules = new JMenuItem(language.main_menu_menu_help_rules);
		mnHelp.add(miRules);
		
		JMenuItem miAbout = new JMenuItem(language.main_menu_menu_help_about);
		miAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,language.about_text,language.about_title, JOptionPane.INFORMATION_MESSAGE);
			}
		});
		mnHelp.add(miAbout);
		
		JSeparator separator = new JSeparator();
		frmVTeg.getContentPane().add(separator, BorderLayout.CENTER);
		
		JPanel panel_central = new JPanel_Whit_Image("/RESOURCES/Images/mini_map.png");
		frmVTeg.getContentPane().add(panel_central, BorderLayout.CENTER);
		
		JPanel panel_south = new JPanel();
		frmVTeg.getContentPane().add(panel_south, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("VIRTUAL T.E.G - 2013");
		panel_south.add(lblNewLabel);
	}
}

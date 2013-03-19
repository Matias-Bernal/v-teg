package GUI;

import java.awt.BorderLayout;
import javax.swing.JDialog;
import RESOURCES.ilanguage;
import RESOURCES.lang_es;
import java.awt.Toolkit;
import javax.swing.JTextPane;

@SuppressWarnings("serial")
public class About_Game extends JDialog {

	private ilanguage languaje;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ilanguage lang = new lang_es();
			About_Game dialog = new About_Game(lang);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public About_Game(ilanguage lang) {
		languaje = lang;
		setTitle(languaje.about_tittle);
		setIconImage(Toolkit.getDefaultToolkit().getImage(About_Game.class.getResource("/RESOURCES/Icons/hm-about.png")));
		setBounds(100, 100, 225, 300);
		
		JTextPane txtpnAbout = new JTextPane();
		txtpnAbout.setText(languaje.about_text);
		getContentPane().add(txtpnAbout, BorderLayout.CENTER);
	}

}

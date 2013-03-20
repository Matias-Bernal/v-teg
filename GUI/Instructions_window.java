package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.Action;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import java.awt.Component;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

import javax.swing.border.EtchedBorder;
import javax.swing.text.BadLocationException;
import javax.swing.text.Caret;
import javax.swing.text.Document;
import javax.swing.text.EditorKit;
import javax.swing.text.ViewFactory;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import java.awt.Scrollbar;

public class Instructions_window extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Instructions_window() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTextPane txtpnHolaVengoA = new JTextPane();
		contentPane.add(txtpnHolaVengoA, BorderLayout.CENTER);
		txtpnHolaVengoA.setContentType("text/html");
		txtpnHolaVengoA.setText( 
						"<b>hola</b><br>" + "<i>adios</i><br>" +
						"<font face=\"arial\">fuente arial</font><br>" +
						"<font face=\"courier\">fuente courier</font><br>" +
						"<font size=\"24\">fuente grande</font><br>" +
						"<font color=\"red\">color rojo</font><br>"+
						"<img src=\"RESOURCES\\Icons\\game.png\"></img>");
		txtpnHolaVengoA.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
	}

}

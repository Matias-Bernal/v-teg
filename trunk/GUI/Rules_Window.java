package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

@SuppressWarnings("serial")
public class Rules_Window extends JFrame {

	private JPanel contentPane;

	//Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rules_Window window = new Rules_Window();
					window.contentPane.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public Rules_Window() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		//setContentPane(contentPane);
		
		JTextPane tpInstructions = new JTextPane();
		contentPane.add(tpInstructions, BorderLayout.CENTER);
		tpInstructions.setContentType("text/html");
		tpInstructions.setText( 
						"<head><base href=\""+this.getClass().getResource("/")+"\"></head>"+
						"<b>hola</b><br>" + "<i>adios</i><br>" +
						"<font face=\"arial\">fuente arial</font><br>" +
						"<font face=\"courier\">fuente courier</font><br>" +
						"<font size=\"24\">fuente grande</font><br>" +
						"<font color=\"red\">color rojo</font><br>"+
						"<img src=\"RESOURCES\\Icons\\game.png\"></img>"+
						"<b>hola</b><br>" + "<i>adios</i><br>" +
						"<b>hola</b><br>" + "<i>adios</i><br>" +
						"<b>hola</b><br>" + "<i>adios</i><br>" +
						"<b>hola</b><br>" + "<i>adios</i><br>" +
						"<b>hola</b><br>" + "<i>adios</i><br>" +
						"<b>hola</b><br>" + "<i>adios</i><br>" +
						"<b>hola</b><br>" + "<i>adios</i><br>" +
						"<b>hola</b><br>" + "<i>adios</i><br>" +
						"<b>hola</b><br>" + "<i>adios</i><br>");
		tpInstructions.setCaretPosition(0);
		tpInstructions.setEditable(false);
		tpInstructions.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		JScrollPane scrollPane = new JScrollPane ();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setViewportView(contentPane);
		setContentPane(scrollPane);
	}

}

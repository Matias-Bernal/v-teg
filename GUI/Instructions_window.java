package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class Instructions_window extends JFrame {

	private JPanel contentPane;
	private JMenuItem item;

	//Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Instructions_window window = new Instructions_window(new JMenuItem(), new JFrame());
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
	public Instructions_window(JMenuItem i,JFrame rootFrame) {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				item.setEnabled(true);
			}
		});
		item=i;
		
		item.setEnabled(false);
		rootFrame.repaint();
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

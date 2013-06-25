package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JSeparator;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Panel;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;

public class Game_Window extends JFrame {

	private JPanel contentPane;
	private Modern_Map_Window map_window;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game_Window frame = new Game_Window();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Game_Window() {
		setTitle("VTEG");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_map = new JPanel();
		panel_map.setBounds(10, 11, 639, 372);
		FlowLayout fl_panel_map = (FlowLayout) panel_map.getLayout();
		fl_panel_map.setVgap(0);
		fl_panel_map.setHgap(0);
		panel_map.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		
		map_window = new Modern_Map_Window();
		panel_map.add(map_window);
		GroupLayout gl_map_window = new GroupLayout(map_window);
		gl_map_window.setHorizontalGroup(
			gl_map_window.createParallelGroup(Alignment.LEADING)
				.addGap(0, 637, Short.MAX_VALUE)
		);
		gl_map_window.setVerticalGroup(
			gl_map_window.createParallelGroup(Alignment.LEADING)
				.addGap(0, 370, Short.MAX_VALUE)
		);
		map_window.setLayout(gl_map_window);
		contentPane.add(panel_map);
		
		JPanel panel_chat = new JPanel();
		panel_chat.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panel_chat.setBounds(10, 399, 764, 131);
		contentPane.add(panel_chat);
		
		//TODO setear el estado inicial del mapa
		

	}
}

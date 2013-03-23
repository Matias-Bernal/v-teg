package GUI;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import java.awt.Panel;
import java.awt.Button;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;

import RESOURCES.ilanguage;
import SERVER.Chat_Client;
import SERVER.Chat_Server;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Create_match_window extends JFrame {

	/**
	 * 
	 */
	private JPanel contentPane;
	private JTextField tfPort;
	private ilanguage lang;
	/**
	 * Create the frame.
	 */
	public Create_match_window(ilanguage lang) {
		this.lang=lang;
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Create_match_window.class.getResource("/RESOURCES/Icons/hm-about.png")));
		setTitle(lang.create_match_title);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 300, 162);
		contentPane = new JPanel();
		contentPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JSeparator separator = new JSeparator();
		contentPane.add(separator, BorderLayout.CENTER);
		
		Panel pTextFields = new Panel();
		contentPane.add(pTextFields, BorderLayout.CENTER);
		
		JLabel lblPortLabel = new JLabel(lang.create_match_port_label);
		lblPortLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblPortLabel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblPortLabel.setFont(new Font("Lucida Console", Font.BOLD, 16));
		
		tfPort = new JTextField();
		tfPort.setText("11000");
		tfPort.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		tfPort.setToolTipText("Port of Server");
		tfPort.setHorizontalAlignment(SwingConstants.CENTER);
		tfPort.setFont(new Font("Lucida Console", Font.PLAIN, 16));
		lblPortLabel.setLabelFor(tfPort);
		tfPort.setColumns(10);
		GroupLayout gl_pTextFields = new GroupLayout(pTextFields);
		gl_pTextFields.setHorizontalGroup(
			gl_pTextFields.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pTextFields.createSequentialGroup()
					.addGap(45)
					.addComponent(lblPortLabel)
					.addGap(18)
					.addComponent(tfPort, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addGap(65))
		);
		gl_pTextFields.setVerticalGroup(
			gl_pTextFields.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pTextFields.createSequentialGroup()
					.addGap(43)
					.addGroup(gl_pTextFields.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPortLabel)
						.addComponent(tfPort, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(32, Short.MAX_VALUE))
		);
		pTextFields.setLayout(gl_pTextFields);
		
		Panel pButtons = new Panel();
		contentPane.add(pButtons, BorderLayout.SOUTH);
		
		Button bCancel = new Button(lang.create_match_cancel);
		bCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		bCancel.setFont(new Font("Lucida Console", Font.BOLD, 12));
		pButtons.add(bCancel);
		
		Button bConnect = new Button(lang.create_match_conect);
		bConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Chat_Server(Integer.parseInt(tfPort.getText())).start();
				new Chat_Client("localhost",Integer.parseInt(tfPort.getText()) , getLanguage()).start();				
			}
		});
		bConnect.setFont(new Font("Lucida Console", Font.BOLD, 12));
		pButtons.add(bConnect);
	}
	
	public ilanguage getLanguage(){
		return lang;
	}

}

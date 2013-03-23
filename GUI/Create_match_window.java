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
import javax.swing.LayoutStyle.ComponentPlacement;
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
	private JTextField tfAdrress;
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
		
		JLabel lblAdrressLabel = new JLabel(lang.create_match_ip_adress_label);
		lblAdrressLabel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblAdrressLabel.setFont(new Font("Lucida Console", Font.BOLD, 16));
		lblAdrressLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblPortLabel = new JLabel(lang.create_match_port_label);
		lblPortLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblPortLabel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblPortLabel.setFont(new Font("Lucida Console", Font.BOLD, 16));
		
		tfAdrress = new JTextField();
		tfAdrress.setText("localhost");
		tfAdrress.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		tfAdrress.setHorizontalAlignment(SwingConstants.CENTER);
		tfAdrress.setFont(new Font("Lucida Console", Font.PLAIN, 16));
		lblAdrressLabel.setLabelFor(tfAdrress);
		tfAdrress.setToolTipText("Server Adrress");
		tfAdrress.setColumns(10);
		
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
					.addContainerGap()
					.addGroup(gl_pTextFields.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblPortLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblAdrressLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pTextFields.createParallelGroup(Alignment.LEADING)
						.addComponent(tfPort, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfAdrress, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE))
					.addGap(89))
		);
		gl_pTextFields.setVerticalGroup(
			gl_pTextFields.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pTextFields.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pTextFields.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAdrressLabel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfAdrress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pTextFields.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPortLabel)
						.addComponent(tfPort, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(30, Short.MAX_VALUE))
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
				new Chat_Client(tfAdrress.getText(),Integer.parseInt(tfPort.getText()) , getLanguage()).start();				
			}
		});
		bConnect.setFont(new Font("Lucida Console", Font.BOLD, 12));
		pButtons.add(bConnect);
	}
	
	public ilanguage getLanguage(){
		return lang;
	}

}

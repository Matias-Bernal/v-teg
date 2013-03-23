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
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Create_window extends JFrame {

	/**
	 * 
	 */
	private JPanel contentPane;
	private JTextField tfAdrress;
	private JTextField tfPort;

	/**
	 * Create the frame.
	 */
	public Create_window() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Create_window.class.getResource("/RESOURCES/Icons/hm-about.png")));
		setTitle("Connect");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 320, 164);
		contentPane = new JPanel();
		contentPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JSeparator separator = new JSeparator();
		contentPane.add(separator, BorderLayout.CENTER);
		
		Panel pTextFields = new Panel();
		contentPane.add(pTextFields, BorderLayout.CENTER);
		
		JLabel lblAdrressLabel = new JLabel("IP ADRRESS");
		lblAdrressLabel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblAdrressLabel.setFont(new Font("Lucida Console", Font.BOLD, 16));
		lblAdrressLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblPortLabel = new JLabel("PORT");
		lblPortLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblPortLabel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblPortLabel.setFont(new Font("Lucida Console", Font.BOLD, 16));
		
		tfAdrress = new JTextField();
		tfAdrress.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		tfAdrress.setHorizontalAlignment(SwingConstants.CENTER);
		tfAdrress.setFont(new Font("Lucida Console", Font.PLAIN, 16));
		lblAdrressLabel.setLabelFor(tfAdrress);
		tfAdrress.setToolTipText("Server Adrress");
		tfAdrress.setColumns(10);
		
		tfPort = new JTextField();
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
					.addGroup(gl_pTextFields.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pTextFields.createSequentialGroup()
							.addGap(44)
							.addComponent(lblPortLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(42))
						.addGroup(gl_pTextFields.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblAdrressLabel)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_pTextFields.createParallelGroup(Alignment.LEADING)
						.addComponent(tfAdrress, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfPort, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
					.addGap(8))
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
						.addComponent(tfPort, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPortLabel))
					.addContainerGap(70, Short.MAX_VALUE))
		);
		pTextFields.setLayout(gl_pTextFields);
		
		Panel pButtons = new Panel();
		contentPane.add(pButtons, BorderLayout.SOUTH);
		
		Button bCancel = new Button("Cancelar");
		bCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		bCancel.setFont(new Font("Lucida Console", Font.BOLD, 12));
		pButtons.add(bCancel);
		
		Button bConnect = new Button("Conectar");
		bConnect.setFont(new Font("Lucida Console", Font.BOLD, 12));
		pButtons.add(bConnect);
	}

}

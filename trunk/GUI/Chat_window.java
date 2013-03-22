package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

import SERVER.Chat_Client;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public class Chat_window extends JFrame {

	private JPanel contentPane;
	private Chat_Client chat_client;
	private JTextArea current_text;
	private JTextArea history_text;
	private JScrollPane scroll_chat_text;
	
	public Chat_window(Chat_Client client) {
		setType(Type.UTILITY);
		setTitle("Chat VTEG");
		this.chat_client = client;
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sendMge();
			}
		});
		
		JScrollPane scroll_history_text = new JScrollPane();
		
		scroll_chat_text = new JScrollPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addComponent(scroll_history_text, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(scroll_chat_text, GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnEnviar, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(scroll_history_text, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnEnviar, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
						.addComponent(scroll_chat_text, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
					.addContainerGap())
		);
		
		current_text = new JTextArea();
		scroll_chat_text.setViewportView(current_text);
		current_text.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		history_text = new JTextArea();
		history_text.setEditable(false);
		scroll_history_text.setViewportView(history_text);
		contentPane.setLayout(gl_contentPane);
	}
	
	public void sendMge(){
		chat_client.sendMge(current_text.getText());
		current_text.setText("");
	}
	
	public void setChatText(String new_mge){
		String update_text = history_text.getText()+"\n"+new_mge;
		history_text.setText(update_text);
		history_text.setCaretPosition(update_text.length());
		//history_text.append(new_mge);
	}
}

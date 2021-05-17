package multichat.server;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;

public class ServerGuI extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JTextArea ta = new JTextArea(40,25);
	private JTextField tf = new JTextField(25);
	private ServerBackGround server = new ServerBackGround(); 
	
	public ServerGuI() throws IOException {
		add(ta, BorderLayout.CENTER);
		add(tf, BorderLayout.SOUTH);
		tf.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(400,500);
		setTitle("Server");
		
		server.setGui(this);
		server.setting();
	}
	
	
	public static void main(String[] args) throws IOException{
		new ServerGuI();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = "¼­¹ö:" + tf.getText() + "\n";
		System.out.println(msg);
		tf.setText("");
	}
	
	public void appendMsg(String msg) {
		ta.append(msg);
	}
}

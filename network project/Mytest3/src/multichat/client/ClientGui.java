package multichat.client;


import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.io.DataOutputStream;
import java.net.Socket;
import javax.swing.*;


public class ClientGui extends JFrame implements ActionListener {

	private static final long serialVersionUID =1L;
    private JTextArea ta = new JTextArea();
	private JTextField tf = new JTextField(40);
	private JButton send = new JButton("send");
	private JButton setime = new JButton("Timer");
	private JTextArea users = new JTextArea();
	private static String username;
	private JTextField nick = new JTextField(20);
	private JButton login = new JButton("Login");
	private ClientBackground client = new ClientBackground();
	private JList list;
	DefaultListModel<String> model;
	
	
	ClientGui(){
	JPanel p = new JPanel();
    p.setLayout(null);
    
    //my client: username
    JLabel l1 = new JLabel("My Client: ");
    l1.setFont(new Font("Serif", Font.BOLD, 23 ));
	l1.setBounds(20,20,130,30); 
	p.add(l1);

	//nickname field
	nick.setFont(new Font(" SansSerif", Font.BOLD, 17 ));
	nick.setBounds(20,60,150,30);
	p.add(nick);
	
	//button to set "connection"
	login.setBounds(180,60,100,30);
	
	//user-list banner
	JLabel l3 = new JLabel("Users List");
	l3.setFont(new Font("SansSerif", Font.BOLD, 17));
	l3.setForeground(Color.GRAY);
	l3.setBounds(330,60,145,30);
	p.add(l3);
	//
	
	//set Text view area
	ta.setBounds(20,100,300,320);
	ta.setEditable(false); // edit ธ๘วิ
    p.add(ta);
	
    //text field 
    tf.setFont(new Font("SansSerif", Font.BOLD, 12));
	tf.setBounds(20,430,300,30);
	p.add(tf);
	
	//set send Button
	send.setBounds(330, 430, 70, 30);
	p.add(send);
	
	//Timer set button
	setime.setBounds(410, 430, 70, 30);
	p.add(setime);
	
	model = new DefaultListModel<String>();
	list = new JList(model);
	//users
	list.setBounds(330, 100, 140, 320);
	p.add(list);
	add(p);
	
	client.setGui(this);
	//Login_button event
	ActionListener logact = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			username = nick.getText();
			nick.setEditable(false);
			client.setNickname(username);
			client.start();
		}
	};
	
	login.addActionListener(logact);
	p.add(login);
	send.addActionListener(this);
	
	
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	setSize(500,525);
	setTitle("Client");
	}
	
    public static void main(String[] args) {
    	new ClientGui();
 
	}
	
	public void actionPerformed(ActionEvent e) {
		String msg = username + ":" + tf.getText() + "\n";
		client.sendMessage(msg);
		tf.setText("");
	}
	public void appendMsg(String msg) {
		if(msg!=username) {
		ta.append(msg);
		}
		else {
			model.addElement(msg);
		}
		
	}

	
	

}


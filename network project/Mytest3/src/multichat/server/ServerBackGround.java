package multichat.server;

import java.io.*;
import java.net.*;
import java.util.*;

public class ServerBackGround {

	
private ServerSocket ServerSocket;
private Socket socket;
private ServerGuI gui;
private String msg;

private Map<String, DataOutputStream> ClientsMap = new HashMap<String, DataOutputStream>();

public final void setGui(ServerGuI gui) {
	this.gui = gui;
}

public void setting() throws IOException{
	Collections.synchronizedMap(ClientsMap);
	ServerSocket = new ServerSocket(7777);
	while(true) {
		System.out.println("���� �����..");
		socket= ServerSocket.accept(); 
		System.out.println(socket.getInetAddress()+ "���� �����߽��ϴ�.");
		
		Receiver receiver = new Receiver(socket);
		receiver.start();
	}
}

	public static void main(String[] args) throws IOException {
		ServerBackGround serverbackground = new ServerBackGround();
		serverbackground.setting();

	}

	public void addClient(String nick, DataOutputStream out) throws IOException{
		sendMessage(nick+ "���� �����ϼ̽��ϴ�.\n");
		ClientsMap.put(nick, out);
		
	}
	public void removeClient(String nick) {
		sendMessage(nick + "���� �����̽��ϴ�.\n");
		ClientsMap.remove(nick);
		
	}
	
	//�޽��� ���� ����
	public void sendMessage(String msg) {
		Iterator<String>it = ClientsMap.keySet().iterator();
		String key = "";
		while(it.hasNext()) {
			key = it.next();
			try {
				ClientsMap.get(key).writeUTF(msg);
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	

//-----------------------------------------------------------------------
class Receiver extends Thread{
	private DataInputStream in;
	private DataOutputStream out;
	private String nick;
	
	public Receiver(Socket socket) throws IOException{
		out = new DataOutputStream(socket.getOutputStream());
		in = new DataInputStream(socket.getInputStream());
		nick = in.readUTF(); 
		addClient(nick, out);
	}
	public void run() {
		try { 
			while(in != null) {
				msg = in.readUTF();
				sendMessage(msg);
				gui.appendMsg(msg);
			}
		}catch(IOException e) {
			removeClient(nick);
		}
	}
}
	
	
}

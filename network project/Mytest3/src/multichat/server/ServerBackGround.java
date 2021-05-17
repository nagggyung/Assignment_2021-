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
		System.out.println("서버 대기중..");
		socket= ServerSocket.accept(); 
		System.out.println(socket.getInetAddress()+ "에서 접속했습니다.");
		
		Receiver receiver = new Receiver(socket);
		receiver.start();
	}
}

	public static void main(String[] args) throws IOException {
		ServerBackGround serverbackground = new ServerBackGround();
		serverbackground.setting();

	}

	public void addClient(String nick, DataOutputStream out) throws IOException{
		sendMessage(nick+ "님이 접속하셨습니다.\n");
		ClientsMap.put(nick, out);
		
	}
	public void removeClient(String nick) {
		sendMessage(nick + "님이 나가셨습니다.\n");
		ClientsMap.remove(nick);
		
	}
	
	//메시지 내용 전파
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

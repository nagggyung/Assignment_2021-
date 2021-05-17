package multichat.client;

import java.io.*;
import java.net.*;
import java.util.*;

public class ClientBackground extends Thread {
	private Socket socket;
	private DataInputStream in;
	private DataOutputStream out;
	private ClientGui gui;
	private String msg;
	private String nickName;
	public final void setGui(ClientGui gui) {
	this.gui =gui;
		
	}

	public void run() {
		try {
			socket = new Socket("127.0.0.1", 7777);
			System.out.println("서버 연결됨.");
			
			out = new DataOutputStream(socket.getOutputStream());
			in = new DataInputStream(socket.getInputStream());
			out.writeUTF(nickName);
			System.out.println("클라이언트: 메시지 전송 완료");
		}catch(Exception e){}
			try {
			while(in != null)
			{ 
				msg = in.readUTF();
				if(msg.equals(nickName))
					gui.appendMsg(msg);
				else
					gui.appendMsg(msg);
					
			}	
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ClientBackground clientBackground = new ClientBackground();
		
	}
	public void sendMessage(String msg2) {
		try {
			out.writeUTF(msg2);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void setNickname(String nickName) {
		this.nickName = nickName;
	}
	
}

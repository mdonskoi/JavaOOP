package SocketsChat.ChatServer.src;

import SocketsChat.Message;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.List;

public class ClientThread extends Thread {

	private Socket socket;
	private List<Message> msg;
	private int pos = 0;
	
	public ClientThread(Socket socket, List<Message> msg) {
		this.socket = socket;
		this.msg = msg;
	}
	
	private void listToBytes(OutputStream os) throws IOException {
		final int sz = msg.size();
		for (int i = pos; i < sz; i++)
			msg.get(i).writeToStream(os);
		
		pos = msg.size();
	}
	
	public void run() {
		try {
			final InputStream is = socket.getInputStream();
			final OutputStream os = socket.getOutputStream();
			
			while ( ! isInterrupted()) {
				if (pos < msg.size())
					listToBytes(os);
				
				Message m = Message.readFromStream(is);
				if (m != null)
					msg.add(m);
			}
			
			socket.close();
			
		} catch (Exception e) {
			return;
		}
	}
}

package SocketsChat.ChatServer.src;

public class Main {
    public static void main(String[] args) throws Exception {
        Server s = new Server(5000);
        s.start();
    }
}

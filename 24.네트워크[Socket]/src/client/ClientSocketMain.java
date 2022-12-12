package client;

import java.net.InetAddress;
import java.net.Socket;

public class ClientSocketMain {

	public static void main(String[] args) throws Exception {
		/*
		Socket socket = new Socket("www.naver.com", 80);
		System.out.println(socket);
		*/
		Socket socket = new Socket("192.168.15.15", 3333);
		System.out.println("client socket : " + socket);
		InetAddress remoteAddress = socket.getInetAddress(); // 강사님 pc remote
		InetAddress localAddress = socket.getLocalAddress(); // 내 pc local
		System.out.println("remote ip   : " + remoteAddress.getHostAddress());
		System.out.println("remote port : " + socket.getPort());
		System.out.println("local ip    : " + localAddress.getHostAddress());
		System.out.println("local port  : " + socket.getPort());

	}

}

package serverSocket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		Thread ej = new ej();
		ej.start();
	}

}


class ej extends Thread {

	ServerSocket ssc;
	public void run() {
	try{	
		ssc = new ServerSocket(12345);
		while(true){
		Socket eu = ssc.accept();
		DataInputStream ee = new DataInputStream(eu.getInputStream());
		System.out.println(ee.readUTF());
		DataOutputStream ei = new DataOutputStream(eu.getOutputStream());
		ei.writeUTF("¾ÆÀ×~~");
		eu.close();
		}
	}catch(Exception e){
		System.out.println("¾ÆÀ×~");

		}
	}
}


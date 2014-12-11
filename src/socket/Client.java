package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		try {
			Socket a = new Socket("200.1.4.211", 60000);
			DataOutputStream al = new DataOutputStream(a.getOutputStream());
			al.writeUTF("¾ÆÀ×~~");
			DataInputStream ar = new DataInputStream(a.getInputStream());
			System.out.println(ar.readUTF());
			a.close();
		} catch (Exception e) {
		}

	}
}

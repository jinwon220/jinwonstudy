
import java.util.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;

public class server {

	public static void main(String[] args) {
		try {

			ServerSocket serversocket = new ServerSocket(9999);
			/*
			 * ServerSocket
			 * public ServerSocket(int port) throws IOException
			 * 
			 * Creates a server socket, bound to the specified port.
			 * A port number of 0 means that the port number is automatically allocated,
			 * typically from an ephemeral port range.
			 */
			System.out.println("Client의 접속을 기다리고 있습니다..");

			Socket socket = serversocket.accept();
			/*
			 * accept public Socket accept() throws IOException
			 * 
			 * Listens for a connection to be made to this socket and accepts it.
			 * The method blocks until a connection is made.
			 * 
			 * Returns:the new Socket
			 */
			new read_S(socket).start();
			new write_S(socket).start();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

class read_S extends Thread {

	Socket socket;

	public read_S(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		DataInputStream dis = null;
		try {

			dis = new DataInputStream(socket.getInputStream());

			while (true) {
				String msg = dis.readUTF();
				System.out.println("상대방 msg : " + msg);
				System.out.println();
				if (msg.equals("exit"))
					break;

			}

			/*
			 * A data input stream lets an application read primitive Java data types from
			 * an underlying input stream in a machine-independent way. An application uses
			 * a data output stream to write data that can later be read by a data input
			 * stream.
			 */

			/*
			 * DataInputStream public DataInputStream(InputStream in)
			 * 
			 * Creates a DataInputStream that uses the specified underlying InputStream.
			 * 
			 * Parameters:in - the specified input stream
			 */

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

class write_S extends Thread {

	Socket socket;

	public write_S(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(socket.getOutputStream());

			while (true) {
				System.out.print("할 말 : ");
				String msg = sc.nextLine();
				System.out.println();
				dos.writeUTF(msg);

				if (msg.equals("exit"))
					break;

			}

		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			try {
				dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}

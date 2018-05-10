import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//Echo : �������� ������ ó�� (Ex01 ~ Ex03) 
//--------------------
//Server : read, write
//Client : read, write
//���ÿ� (Thread)....
//read (Thread)
//write (Thread)

//1:1 ä���� �Է°� ��� ���ÿ� �̷���� 
public class Ex04_TCP_Chatt_Server {
	static ServerSocket serverSocket = null;
	static Socket socket = null;
	
	public static void main(String[] args) {

		try {
			serverSocket = new ServerSocket(9999);
			System.out.println("���� �����...");
			socket = serverSocket.accept(); //Ŭ���̾�Ʈ�� �����ϸ�...
			System.out.println("����Ϸ�");
			
			//ServerSend ��ü��
			//ServerReceive ��ü��
			//socket ��ü�� �ּҰ� �ʿ�
			//why : socket�� ���ؼ� read, write�� �ؾ� �ϱ� ������
			
			//ServerSend send = new ServerSend();
			//send.start();
			new ServerSend().start();
			
			//ServerReceive receive = new ServerReceive();
			//receive.start();
			new ServerReceive().start();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

//��� : socket (read, write ��ü)
//Write : socket > outputStream
class ServerSend extends Thread{

	@Override
	public void run() {
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			//buffer >> Line() ������ read
			//InputStreamReader(System.in) ��ĳ�� ���ҵ� ���� �Ѵ�
			br = new BufferedReader(new InputStreamReader(System.in));
			pw = new PrintWriter(Ex04_TCP_Chatt_Server.socket.getOutputStream(), true);
			
			while(true) {
				String data = br.readLine();
				if(data.equals("exit")) break;
				pw.println(data); //������ Ŭ���̾�Ʈ���� �޽��� ������
			}
			System.out.println("server send �۾�����");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				pw.close();
				br.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
}

//Read : socket > inputStream
class ServerReceive extends Thread{
	//����� socket �� ���ؼ� read �ؼ�
	//cmd ����� ���
	@Override
	public void run() {
		BufferedReader br = null;
		//PrintWriter pw = null;
		try {
			//buffer >> Line() ������ read
			//InputStreamReader(System.in) ��ĳ�� ���ҵ� ���� �Ѵ�
			
			//br = new BufferedReader(new InputStreamReader(System.in));
			//pw = new PrintWriter(Ex04_TCP_Chatt_Server.socket.getOutputStream(), true);
			br = new BufferedReader(new InputStreamReader(Ex04_TCP_Chatt_Server.socket.getInputStream()));
			
			String data = null;
			while((data = br.readLine()) != null) {
				System.out.println("Client�� ���� �޽��� [ " + data + " ]");
			}
			System.out.println("server receive �۾�����");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

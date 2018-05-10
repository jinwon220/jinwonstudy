import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
//Inner Class ����ؼ� ����
import java.util.Scanner;

//ClientSend
//ClinentReceive
public class Ex04_TCP_Chatt_Client {
	Socket socket = null;
	public static void main(String[] args) {
		Ex04_TCP_Chatt_Client client = new Ex04_TCP_Chatt_Client();
	}

	Ex04_TCP_Chatt_Client(){
		try {
			socket = new Socket("192.168.0.45", 9999);
			System.out.println("������ ���� �Ǿ����ϴ�.");
			new ClientSend().start();
			new ClinentReceive().start();
		}catch (Exception e) {
			
		}
	}
	class ClientSend extends Thread{

		@Override
		public void run() {
			BufferedReader br = null;
			PrintWriter pw = null;
			try {
				//buffer >> Line() ������ read
				//InputStreamReader(System.in) ��ĳ�� ���ҵ� ���� �Ѵ�
				br = new BufferedReader(new InputStreamReader(System.in));
				pw = new PrintWriter(socket.getOutputStream(), true);
				
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
	
	class ClinentReceive extends Thread{
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
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				String data = null;
				while((data = br.readLine()) != null) {
					System.out.println("Server�� ���� �޽��� [ " + data + " ]");
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
}

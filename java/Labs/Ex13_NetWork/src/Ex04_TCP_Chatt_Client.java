import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
//Inner Class 사용해서 구현
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
			System.out.println("서버와 연결 되었습니다.");
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
				//buffer >> Line() 단위로 read
				//InputStreamReader(System.in) 스캐너 역할도 같이 한다
				br = new BufferedReader(new InputStreamReader(System.in));
				pw = new PrintWriter(socket.getOutputStream(), true);
				
				while(true) {
					String data = br.readLine();
					if(data.equals("exit")) break;
					pw.println(data); //접속한 클라이언트에게 메시지 보내기
				}
				System.out.println("server send 작업종료");
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
		//연결된 socket 을 통해서 read 해서
		//cmd 결과를 출력
		@Override
		public void run() {
			BufferedReader br = null;
			//PrintWriter pw = null;
			try {
				//buffer >> Line() 단위로 read
				//InputStreamReader(System.in) 스캐너 역할도 같이 한다
				
				//br = new BufferedReader(new InputStreamReader(System.in));
				//pw = new PrintWriter(Ex04_TCP_Chatt_Server.socket.getOutputStream(), true);
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				String data = null;
				while((data = br.readLine()) != null) {
					System.out.println("Server가 보낸 메시지 [ " + data + " ]");
				}
				System.out.println("server receive 작업종료");
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

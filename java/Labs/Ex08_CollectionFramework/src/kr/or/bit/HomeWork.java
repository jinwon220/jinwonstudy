package kr.or.bit;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Date{
	Calendar cal = Calendar.getInstance();
	boolean attend = false;
	
	Date(){}
	Date(boolean attend){
		this.attend = attend;
	}
}
class View{ //Ȯ��
	Map<String, String> log = new HashMap<>(); //login
	//Map<String, Boolean> attendance = new HashMap<>(); //�⼮
	Map<String, Date> attendance = new HashMap<>(); //�⼮
	Scanner sc = new Scanner(System.in);
	
	private void check(String id) { //�⼮üũ
		//attendance.put(id, true);
		attendance.put(id, new Date(true));
	}

	private void search(String id) {
		if(!attendance.get(id).attend) {
			System.out.println("\n==>>" +attendance.get(id).cal.MONTH +"�� "
										+attendance.get(id).cal.DATE 
										+ "�� ���⼮�Դϴ�.\n");
		} else {
			System.out.println("\n==>>" +attendance.get(id).cal.MONTH +"�� "
										+attendance.get(id).cal.DATE 
										+ "�� �⼮�Դϴ�.\n");
		}
	}
	private String login_menu() { //�α��� �޴�
		while(true) {
			System.out.println("************************");
			System.out.println("1.�α���  2.������� ");
			System.out.println("************************");
			int choice;
			
			try {
				choice = Integer.parseInt(sc.nextLine()); // ���ڷ� �޾��� ���
			}catch(Exception e){
				choice = 0;
			}
			
			
			switch(choice) {
			case 1:
				String id = login();
				if(id != null) {
					return id;
				}
				break;
			case 2:
				join();
				break;
			default:
				System.out.println("�߸� �Է��߽��ϴ�.");
				break;
			}
		}
	}
	
	public void menu() { //�޴�		
		String id = login_menu();
		do {
			System.out.println("************************");
			System.out.println(id+"�� �ȳ��ϼ���");
			System.out.println("1.�⼮  2.�����ȸ  3.���� ");
			System.out.println("************************");
			System.out.print("���Ͻô� ���񽺸� �������ּ���-> ");
			int choice;
			try {
				choice = Integer.parseInt(sc.nextLine()); // ���ڷ� �޾��� ���
			}catch(Exception e){
				choice = 0;
			}
			
			switch(choice) {
			case 1:
				check(id);
				System.out.println("\n~~~~�⼮ �Ǿ����ϴ�.~~~~\n");
				break;
			case 2:
				search(id);
				break;
			case 3:
				return; //����
			}
		}while(true);
	}
	
	private void join() { //�������
		while(true) {
			System.out.print("���̵� �Է� : ");
			String id = sc.nextLine().trim(); // trim() �糡 ���ڿ� ����

			System.out.print("��й�ȣ �Է� : ");
			String pw = sc.nextLine().trim();

			if (!log.containsKey(id)) {
				log.put(id, pw);
				System.out.println("[������ ��� �Ǿ����ϴ�.]");
				attendance.put(id, new Date()); // ������ ��� �Ǿ��� �� ��� ���´� false
				return; //����
			} else {
				System.out.println("[���� �̸��� ���̵� �ֽ��ϴ�.]");
				return;
			}
		}
	}
	
	private String login() { // �α��� ���
		System.out.print("���̵� �Է� : ");
		String id = sc.nextLine().trim(); // trim() �糡 ���ڿ� ����

		System.out.print("��й�ȣ �Է� : ");
		String pw = sc.nextLine().trim();

		if (!log.containsKey(id)) {
			System.out.println("[ID�� �����ϴ�.]");
			id = null;

		} else {
			if (log.get(id).equals(pw)) {
			} else {
				System.out.println("[PW�� �ٸ��ϴ�.]");
				id = null;
			}
		}

		return id;
	}
}

public class HomeWork {
	public static void main(String[] args) {
		View v = new View();
		v.menu();
	}

}

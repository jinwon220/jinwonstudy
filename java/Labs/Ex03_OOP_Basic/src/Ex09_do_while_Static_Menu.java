import java.util.Scanner;

public class Ex09_do_while_Static_Menu {

	static Scanner sc = new Scanner(System.in);
	//sc�� �޸𸮿� �ö� �ְ� , new Scanner�� heap�� �ö��ִ�.
	
	static void inputRecord() { //��ȯ�Ǵ°� ���� static �Լ� (�Է�)
		System.out.println("���� ������ �Է�");
	}
	static void deleteRecord() {//��ȯ�Ǵ°� ���� static �Լ� (����)
		System.out.println("���� ������ ����");
	}
	static void sortRecord() {//��ȯ�Ǵ°� ���� static �Լ� (����)
		System.out.println("���� ������ ����");
	}
	static int displayMenu() { // int Ÿ�� ��ȯ static �Լ�
		//�޴� �����ִ� ��
		System.out.println("*************");
		System.out.println("***[��������]***");
		System.out.println("1.�л����� �Է��ϱ�");
		System.out.println();
		System.out.println("2.�л����� �����ϱ�");
		System.out.println();
		System.out.println("3.�л����� �̸��� ����");
		System.out.println();
		System.out.println("4.���α׷� ����");
		System.out.println();
		
		//�Է��� �޴��� ��ȣ�� ��ȯ �����ֱ�
		int menu = 0; // ��ȯ �� �޴� ��ȣ
		do { //���� ����
			try { 
				menu = Integer.parseInt(sc.nextLine()); // ���� �Է�
				if(menu >= 1 && menu <= 4) { // 1~4 ��ȣ�� �Է��ϸ� break;
					break;
				}else { // 1~4 �̿��� ���� �Է��ϸ� ����
					throw new Exception("�����߻�");
				}
			}catch(Exception e) { //else�� ���� �Ǹ� catch�� ����
				System.out.println("�޴��� �߸� ����");
				System.out.println("�޴�(1~4)���� ����");
			}
		}while(true); //���ѹݺ�
		
		return menu;
	}
	public static void main(String[] args) {
		while(true) {
			switch (displayMenu()) { //�޴��� ����
			case 1: inputRecord();   // 1�� �ԷµǸ� ����ǰ�
				break;               // ����������
			case 2: deleteRecord();  // 2�� �ԷµǸ� ����ǰ�
				break;               // ��������
			case 3: sortRecord();    // 3�� �ԷµǸ� ����ǰ�
				break;               // ��������
			case 4: System.out.println("���α׷� ����");
					System.exit(0);  //���α׷� ���� ����
			
			}
		}
	}

}

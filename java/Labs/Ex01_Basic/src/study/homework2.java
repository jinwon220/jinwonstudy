package study;

import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		
		//1�� ����
		int sum = 0; // ��
		for(int i = 1; i <= 20; i++) { //i=1~20����
			if(i%2 != 0 && i%3 !=0 ) //i�� 2�� 3�� ����� �ƴ� ��
				sum += i;
		}
		System.out.println("1~20�� ���� �� 2�� 3�� ����� �ƴ� ���� �� :"+sum);

		
		//2�� ����
		int n = 1; // n�� ° ����� ��
		for(int i = 1; i <= 6; i++) { //ù��° �ֻ���
			for(int j = 1; j <= 6; j++) { //�ι�° �ֻ���
				if(i+j==6) { // �� ���� ���� 6�� ���
					System.out.printf("%d��° : %d + %d = 6", n++, i, j);
					System.out.println();
				}
			}
		}
		
		//3�� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �� ���� : ");
		String user = sc.nextLine(); // ������ �� ����������
		
		int com = (int)(((Math.random()*10)+1))/3; //������ ���� 1~3
		String com_string; // ��ǻ�Ͱ� �� ����������
		String result = null; // ���
		if(com == 1) {
			com_string = "����";
			//���ڿ��� ���� �� �� �Ͽ� ��� ����
			if(user.equals("����")) result = "DRAW";
			else if(user.equals("����"))  result = "WIN";
			else if(user.equals("��"))  result = "LOSE";
			else System.out.println("���� �߸� �Է� �߽��ϴ�.");
		}
		else if(com == 2) {
			com_string = "����";
			if(user.equals("����"))  result = "LOSE";
			else if(user.equals("����")) result = "DRAW";
			else if(user.equals("��")) result = "WIN";
			else System.out.println(" ���� �߸� �Է� �߽��ϴ�.");
		}
		else {
			com_string = "��";
			if(user.equals("����")) result = "WIN";
			else if(user.equals("����")) result = "LOSE";
			else if(user.equals("��")) result = "DRAW";
			else System.out.println(" ���� �߸� �Է� �߽��ϴ�.");
		}
		
		System.out.printf("\n(����)%s : (��ǻ��)%s  {USER %s}", user, com_string, result);
	}
}

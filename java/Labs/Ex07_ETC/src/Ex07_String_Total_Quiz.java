import java.util.Scanner;

//�ֹι�ȣ : �޹�ȣ ù�ڸ� : 1,3 ���� , 2,4 ����

//main �Լ� Scanner  ��� �ֹι�ȣ �Է¹ް�
//��:6�ڸ� ��:7�ڸ�
//�Է°� : 123456-1234567 

//1. �ڸ��� üũ (���)�Լ� (14 ok)
//2. �޹�ȣ ù��° �ڸ��� 1~4������ ���� ��� ����Լ�
//3. �޹�ȣ ù��° �ڸ����� ������ 1,3 ���� , 2,4 ���� ��� ����Լ�
//3���� �Լ� static 

public class Ex07_String_Total_Quiz {
	static int lengthCheck(String s) {
		return s.length();
	}
	
	static String numCheck(String s) {
		String check = "";
		if (s.indexOf("-") == 6) {
			if (s.charAt(s.indexOf("-") + 1) == '1' || s.charAt(s.indexOf("-") + 1) == '3') {
				check = "����";
			} else if (s.charAt(s.indexOf("-") + 1) == '2' || s.charAt(s.indexOf("-") + 1) == '4') {
				check = "����";
			}
		}
		return check;
	}
	
	public static void main(String[] args) {
		String ssn = "";
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("000000-0000000 ���·� �Է��Ͻÿ�");
			ssn = sc.nextLine();
			if(lengthCheck(ssn)==14) {
				if(numCheck(ssn).equals("����")) {
					System.out.println("�����Դϴ�");
					break;
				} else if(numCheck(ssn).equals("����")) {
					System.out.println("�����Դϴ�");
					break;
				} else System.out.println("\"-\"��ġ�� ��ȣ�� �߸� �Է��߽��ϴ�.");
			}else System.out.println("14�ڸ��� �ƴմϴ�.");
			
		}while(true); //while(�ڸ���check �Լ�, 1~4���� check �Լ�)
	}

}

package Homwork;

//1. 1~45������ ������ �߻����� 6���� �迭�� ��������
//2. �迭�� ��� 6���� �迭���� �ߺ����� ������ �ȵǿ�
//3. �迭�� �ִ� 6���� ���� ���� ������ ���Ľ�Ű����
//4. �ζ� �迭�� ����� 30~35 ���̰� �ƴѰ�� ������
//������ ����� ������ class �����ϼ���
//member field , method (���) , �޴�

import java.util.Arrays;
import java.util.Scanner;

class Lotto2 {
	private static int[] lotto_number; // �ζ� ��ȣ 6��
	
	public Lotto2(int[] lotto_number) {
		this.lotto_number = lotto_number;
	}

	public void print(int[] lotto_number) { //���
		System.out.println(Arrays.toString(lotto_number));
	}
	public void function() { //���
		stop : do {
			int x = showMenu();
			switch(x) {
			case 1:
				do {
					selectNumber();
				}while(conditionNumber(lotto_number)!=true);
				sortNumber(lotto_number);
				System.out.println(Arrays.toString(lotto_number));
				break;
			case 2:
				break stop;
			default:
				System.out.println("���� �߸� �Է��Ͽ����ϴ�.");
			}
		}
		while(true);
	}
	
	private int showMenu() { //�޴���
		System.out.println("***********");
		System.out.println("1.�ζǹ�ȣ ����");
		System.out.println("2.��   ��");
		System.out.println("***********");
		System.out.print("�޴��Է� : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); 
		return x;
	}
	
	private boolean conditionNumber(int[] lotto_number) { //����
		int sum = 0;
		for(int i = 0; i < lotto_number.length; i++) {
			sum += lotto_number[i];
		}
		float avg =(float)sum/lotto_number.length;
		return 30 <= avg && avg <= 35;
	}
	
	private int[] selectNumber() { // 6���� �ߺ����� ���� ������ �Է�
		do {
			for (int i = 0; i < lotto_number.length; i++) {
				lotto_number[i] = (int) (Math.random() * 45) + 1; // 1~45������ ����
				for (int j = 0; j < i; j++) {
					if (i != j) { // ���� �迭 �� �ƴ϶�� [0] != [0]
						if (lotto_number[i] == lotto_number[j])
							i--; // lotto_number[n] = [n+1]�� ���ٸ� i--�� �����
					}
				}
			}
			break;
		} while (true);
		return lotto_number;
	}
	
	private void sortNumber(int[] lotto_number){ //����
		int temp = lotto_number[0]; // �ӽ�����
		for (int i = 0; i < lotto_number.length - 1; i++) {
			for (int j = i; j < lotto_number.length; j++) {
				if (lotto_number[i] > lotto_number[j]) {
					temp = lotto_number[i];
					lotto_number[i] = lotto_number[j];
					lotto_number[j] = temp;
				}
			}
		}
	}
	
	public void showNumber() { //���
		System.out.println("�ζ� ��ȣ : " + Arrays.toString(lotto_number));
	}
}

public class Homework2 {
	public static void main(String[] args) {
		int[] n = new int[6];
		Lotto2 lotto = new Lotto2(n);
		lotto.function();
		lotto.print(n);
	}

}

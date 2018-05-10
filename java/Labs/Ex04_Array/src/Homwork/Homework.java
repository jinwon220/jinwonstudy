//1. 1~45������ ������ �߻����� 6���� �迭�� ��������
//2. �迭�� ��� 6���� �迭���� �ߺ����� ������ �ȵǿ�
//3. �迭�� �ִ� 6���� ���� ���� ������ ���Ľ�Ű����
//4. �ζ� �迭�� ����� 30~35 ���̰� �ƴѰ�� ������
//������ ����� ������ class �����ϼ���
//member field , method (���) , �޴� 
package Homwork;

import java.util.Arrays;

class Lotto {
	private static int[] lotto_number = new int[6]; // �ζ� ��ȣ 6��

	public static void selectNumber() { // 6���� �ߺ����� ���� ������ �Է�
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
	}

	public static void sortNumber(){ //����
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
	
	public static void showNumber() { //���
		System.out.println("�ζ� ��ȣ : " + Arrays.toString(lotto_number));
	}
	
	public static int sumNumber() { //�ζ� ��ȣ ��
		int sum = 0;
		for(int i = 0; i < lotto_number.length; i++) {
			sum += lotto_number[i];
		}
		return sum;
	}
	
	public static float avg() { //�ζ� ��ȣ�� ���
		float avg =(float)sumNumber()/lotto_number.length;
		return avg;
	}
}

public class Homework {

	public static void main(String[] args) {
		Lotto lotto = new Lotto();

		int n = 0;
		do {
			n++;
			System.out.println(n+"��°\t��!��!��!");
			lotto.selectNumber(); // �ζǹ�ȣ �����ϰ� �ߺ��� ���� ó�� �Լ�
			lotto.avg(); // ���
		} while(30 >= lotto.avg() || lotto.avg() >= 35);
		
		System.out.println(n + "�� ������ �� ��� ���� 30~35�� �ζǹ�ȣ");
		System.out.print("��� �� ");
		lotto.showNumber(); // �ζ� �� ����ϴ� �Լ�
		lotto.sortNumber(); // �迭�� ��� �ζ� ��ȣ �����ϴ� �Լ�
		System.out.print("���� �� ");
		lotto.showNumber(); // �ζ� �� ����ϴ� �Լ�(���� ��)
	}
}

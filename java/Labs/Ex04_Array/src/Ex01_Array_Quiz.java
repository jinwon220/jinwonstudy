
public class Ex01_Array_Quiz {

	public static void main(String[] args) {
		//���а� �л����� �⸻��� ��������
		int[] score = new int[] {79,88,97,54,56,95};
		int max = score[0]; //79
		int min = score[0]; //79
		/*
		 ����`���� ����ؼ� max ��� �������� �ִ밪, min �������� �ּҰ��� ��⵵�� �ۼ�
		 ex)max = 97 , min = 54
		*/
		//max���ϱ� min���ϱ�
		for(int i = 0; i < score.length-1; i++) {
			max =(score[i] >= score[i+1])?score[i]:score[i+1];
			min =(score[i] <= score[i+1])?score[i]:score[i+1];
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		
		///////////////////////////////////////////////////
		int[] number = new int[10];
		/*
		 10���� ���� ���� 1~10���� ������ �ʱ�ȭ��Ű����
		 number[0] ����ϸ� 1�̶�� ���
		*/
		for(int i = 0; i < number.length; i++) {
			number[i] = i+1;
			System.out.printf("number[%d] = %d \n", i, number[i]);
		}
		
		///////////////////////////////////////////////////
		//��� �л��� �⸻��� �������� (5����)
		int sum = 0;
		float average = 0f;
		int[] jumsu = {100,55,90,60,78};
		/*
		 1.�� ���� ��
		 2.��� ���������� ��
		 3.������ ���
		 ��) 2, 3������ �ϳ��� for���� ���
		*/
		//1��
		System.out.println("�� ������ ���� : " + jumsu.length + "��");
		//2��
		for(int i = 0; i < jumsu.length; i++) {
			sum += jumsu[i];
		}
		System.out.println("�� ���� ������ �� : " + sum);
		//3��
		average = (float)sum/jumsu.length;
		System.out.println("������ ���  : " + average + "��");
	}
}

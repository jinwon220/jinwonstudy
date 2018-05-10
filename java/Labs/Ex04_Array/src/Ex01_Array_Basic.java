import java.util.Arrays;

//�迭(Array)�� ��ü��
/*
�迭�� �ѹ� ����� ũ�⸦ ������ �� ����.
ex) int[] score = new int[5]
5���� ���� ������µ� n���� �� ����� ������ ���� �迭�� �������Ѵ�
*/

public class Ex01_Array_Basic {
	public static void main(String[] args) {
		int[] score = new int[3];
		System.out.println("score ���� (����) : " + score); //�ּ� (�迭�� ���۰� �ּ�)
		
		//Array �迭�� ������ ���� ������ �ִ� (������ ���� Type(int)�� ������ ũ�� ����)
		//������ ���� ������ : ÷��(index) �� ���� : �迭�� ���۰��� : 0
		//score[0] , score[1], score[2]
		//�迭�� ����(length)�� ������ ÷��(index) ���� 1�� �׻� ũ�� (���α׷� ����)
		//�迭�� Ÿ���� �ʱⰪ�� ������
		System.out.println(score[0]);
		score[2] = 333;
		System.out.println(score[2]);
		
		/*
		//score[3] = 500; //score[3]�� 4��° ���̴�. (���� ���� 3��° �����) : �迭�� [0]���� ����
		//���ܰ� �߻��߽��ϴ�. (Exception �� �߻��߽��ϴ�)
		//���α׷��� ���������� ����....
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
		//at Ex01_Array_Basic.main(Ex01_Array_Basic.java:22)
		
		//System.out.println("���� �ȵ�~"); // ���� �ȵ�  (������ ���ܰ� �߻��Ͽ� ���������� �����)
		*/
		
		// Array �� ������ ���� ���� �����?
		// for�� why? ��� ������ ��Ȯ�ϰ� ���ð� �Ǿ��ְ�
		// �迭�� ������� ���� �ִ��� ��Ȯ�ϰ� ���ð� �Ǿ��ֱ� ������
		for (int i = 0; i < 3; i++) {
			System.out.printf("[%d] = %d", i, score[i]);
		}
		System.out.println();
		
		for (int i = 0; i < score.length; i++) { //length�ڿ� �迭�� ����...
			System.out.printf("[%d] = %d", i, score[i]);
		}
		System.out.println();
		
		//�迭(Array) ���� �����ִ� Ŭ����(help Ŭ����)
		//Array.toString();
		String result = Arrays.toString(score); //�迭�� �ִ� ���� Ȯ���� ��
		System.out.println(result);
		score[0]=6666;
		System.out.println(result);
		Arrays.sort(score);
		System.out.println(Arrays.toString(score));
		
		//point (�ϱ�)
		//�迭�� ����� 3���� ���
		int[] arr = new int[5]; //�⺻ (���� ���� ���� >> �⺻��)
		int[] arr2 = new int[]{100, 200, 300}; //3���� �� (���� ����ŭ �� ����)
		int[] arr3 = {11, 12, 13, 14, 15}; //�����Ϸ��� ���������� new�� ����
		//JavaScript��  var cars = ["", "", ""] // ���ȣ �����̴�.
		
		for(int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		//�迭�� ���� �� �Ҵ��� �и� �� �� �ִ�.
		//ex)Car car; ���� 
		//   c= new Car(); �Ҵ�
		
		//int[] arr4=null;
		//System.out.println(arr4);
		
		int[] arr4; //�迭����
		arr4 = new int[] {21,22,23,24,25}; //�Ҵ�(�޸��� �ּҸ� ���´�)
		
		int[] arr5 = arr4; //�迭�� �ּҰ� �Ҵ�
		System.out.println(arr5 == arr4);
		
		//�迭�� 8���� �⺻ Ÿ�� + String + Ŭ���� ��...
		char[] ch = new char[10]; // default ���� '\u0000'
		for(int j = 0; j < ch.length; j++) {
			System.out.println(">"+ch[j]+"<");
		}
	}
}
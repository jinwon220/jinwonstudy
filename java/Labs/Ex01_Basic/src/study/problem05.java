package study;
/*
�տ������� ���� ���� �ڿ������� ���� ���� ����� ���� ���� ��Ī��(palindrome)��� �θ��ϴ�.
�� �ڸ� ���� ���� ���� �� �ִ� ��Ī�� �� ���� ū ���� 9009 (= 91 �� 99) �Դϴ�.
�� �ڸ� ���� ���� ���� �� �ִ� ���� ū ��Ī���� ���Դϱ�?
*/

public class problem05 {

	public static void main(String[] args) {
		int palindrome = 0; //��Ī��
		int max = 0; //�ִ밪
		//int n = 1000; //���� ��
		int n = 100000;
		//int[] num = {0,0,0,0}; //�ڸ���(99*99 = 9801)�ִ밪 4�ڸ� ��
		int[] num = {0,0,0,0,0,0}; // 999*999 = 998001 �ִ밪 6�ڸ�
		for(int i = 10; i < 1000; i++) { //ù��° ���ڸ��� ����
			for(int j = i; j < 1000; j++) { //�ι�° ���ڸ��� ����
				n = 100000; //���� ��
				palindrome = i*j;
				for(int k = 0; k < num.length; k++) {
					if((palindrome / n) == 0) {
						num[k] = 0;
						palindrome = palindrome % n; //1000���ڸ����ٸ� 100�ڸ��� ����
						n = n/10; // �� 4�� ���µ��� 1000 -> 100 -> 10 -> 1 �� ����(�ڸ������ϱ�)
					}else {
						num[k] = palindrome / n;
						palindrome = palindrome % n; //1000���ڸ����ٸ� 100�ڸ��� ����
						n = n/10; // �� 4�� ���µ��� 1000 -> 100 -> 10 -> 1 �� ����(�ڸ������ϱ�)
					}
				}
				//if(num[0] == num[3] && num[1] == num[2]) {
				//	max = (max >= i*j)?max:i*j; //�� ū ���� ����
				//	System.out.println("max = "+max +"/ i = "+i+"/ j =" +j);
				//}
				if(num[0] == num[5] && num[1] == num[4] && num[2] == num[3]) {
					max = (max >= i * j) ? max : i * j; // �� ū ���� ����
					System.out.println("max = " + max + "/ i = " + i + "/ j =" + j);
				}
			}
		}
		System.out.println(max);
	}
}

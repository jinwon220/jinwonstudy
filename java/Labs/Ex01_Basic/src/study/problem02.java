package study;

public class problem02 {

	//�Ǻ���ġ ������ �� ���� �ٷ� ���� �� �� ���� ���� ���� �˴ϴ�. 1�� 2�� �����ϴ� ��� �� ������ �Ʒ��� �����ϴ�.
	//1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ... 
	//¦���̸鼭 4�鸸 ������ ��� ���� ���ϸ� �󸶰� �˴ϱ�?

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1; //ù ��° ��
		int b = 2; //�� ��° ��
		int c = 0; //���� �� ��
		int sum = 0; //��
		
		while(c <= 4000000) { 
			c = a + b; // c=0 a=1 b=2 => c=3
			a = b; // a=1 b=2 => a=2
			b = c; // b=2 c=3 => b=3

			if (a % 2 == 0) { // ¦��
				sum += a;
			}

		}
		
		System.out.println("400�� ������ ¦���� ��� ���� �� : " + sum);
	}

}

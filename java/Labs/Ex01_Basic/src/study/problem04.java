package study;

/*
� ���� �Ҽ��� �����θ� ��Ÿ���� ���� ���μ����ض� �ϰ�, �� �Ҽ����� �� ���� ���μ���� �մϴ�.
���� ��� 13195�� ���μ��� 5, 7, 13, 29 �Դϴ�.

600851475143�� ���μ� �߿��� ���� ū ���� ���ϼ���.
*/
public class problem04 {
	public static void main(String[] args) {
		long x = 600851475143L;
		long result = 0;
		for(long i = 1L; i <= x; i++) {
			if(x%i==0) {
				x = x/i;
				result = (result<i)? i:result;
			}
			if(x==i) {
				result = (result<i)?i:result;
				System.out.println(i);
				break;
				
			}
		}
		System.out.println(result);
	}

}

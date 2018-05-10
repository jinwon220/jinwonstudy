package study;

public class problem02 {

	//피보나치 수열의 각 항은 바로 앞의 항 두 개를 더한 것이 됩니다. 1과 2로 시작하는 경우 이 수열은 아래와 같습니다.
	//1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ... 
	//짝수이면서 4백만 이하인 모든 항을 더하면 얼마가 됩니까?

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1; //첫 번째 수
		int b = 2; //두 번째 수
		int c = 0; //저장 될 수
		int sum = 0; //합
		
		while(c <= 4000000) { 
			c = a + b; // c=0 a=1 b=2 => c=3
			a = b; // a=1 b=2 => a=2
			b = c; // b=2 c=3 => b=3

			if (a % 2 == 0) { // 짝수
				sum += a;
			}

		}
		
		System.out.println("400만 이하의 짝수를 모두 더한 값 : " + sum);
	}

}

package study;

/*
10보다 작은 자연수 중에서 3 또는 5의 배수는 3, 5, 6, 9 이고, 
이것을 모두 더하면 23입니다.
1000보다 작은 자연수 중에서 3 또는 5의 배수를 모두 더하면 얼마일까요?
*/


public class problem01 {

	public static void main(String[] args) {
		int sum = 0; // 합
		
		for(int i = 0; i < 1000; i++) //1000미만의 자연수
			if(i%3==0 || i%5==0)  // 3또는 5의 배수
				sum += i;
			
		
		System.out.println("1000미만의 자연수 중 3또는 5의 배수의 합 : " + sum);
	}

}

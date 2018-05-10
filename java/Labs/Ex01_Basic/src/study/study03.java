package study;

import java.util.Arrays;

public class study03 {
	public static void main(String[] args) {
		//거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제
		//변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력
		//단, 가능한 한 적은 수의 동전으로 거슬러 주어야 한다.
		
		int[] coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		System.out.println("money="+money);
		
		for(int i = 0; i<coinUnit.length;i++) {
			int cnt = 0;
			while( money>=coinUnit[i]) {
				money -= coinUnit[i];
				cnt++;
			}
			coinUnit[i] = cnt;
		}
		System.out.println(Arrays.toString(coinUnit));
	}

}

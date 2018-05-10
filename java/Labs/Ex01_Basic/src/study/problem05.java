package study;
/*
앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 부릅니다.
두 자리 수를 곱해 만들 수 있는 대칭수 중 가장 큰 수는 9009 (= 91 × 99) 입니다.
세 자리 수를 곱해 만들 수 있는 가장 큰 대칭수는 얼마입니까?
*/

public class problem05 {

	public static void main(String[] args) {
		int palindrome = 0; //대칭수
		int max = 0; //최대값
		//int n = 1000; //나눌 값
		int n = 100000;
		//int[] num = {0,0,0,0}; //자릿수(99*99 = 9801)최대값 4자리 수
		int[] num = {0,0,0,0,0,0}; // 999*999 = 998001 최대값 6자리
		for(int i = 10; i < 1000; i++) { //첫번째 두자리의 정수
			for(int j = i; j < 1000; j++) { //두번째 두자리의 정수
				n = 100000; //나눌 값
				palindrome = i*j;
				for(int k = 0; k < num.length; k++) {
					if((palindrome / n) == 0) {
						num[k] = 0;
						palindrome = palindrome % n; //1000의자리였다면 100자리로 변경
						n = n/10; // 총 4번 도는동안 1000 -> 100 -> 10 -> 1 로 변경(자릿수구하기)
					}else {
						num[k] = palindrome / n;
						palindrome = palindrome % n; //1000의자리였다면 100자리로 변경
						n = n/10; // 총 4번 도는동안 1000 -> 100 -> 10 -> 1 로 변경(자릿수구하기)
					}
				}
				//if(num[0] == num[3] && num[1] == num[2]) {
				//	max = (max >= i*j)?max:i*j; //더 큰 수로 변경
				//	System.out.println("max = "+max +"/ i = "+i+"/ j =" +j);
				//}
				if(num[0] == num[5] && num[1] == num[4] && num[2] == num[3]) {
					max = (max >= i * j) ? max : i * j; // 더 큰 수로 변경
					System.out.println("max = " + max + "/ i = " + i + "/ j =" + j);
				}
			}
		}
		System.out.println(max);
	}
}

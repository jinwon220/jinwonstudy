package study;

import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		
		//1번 문제
		int sum = 0; // 합
		for(int i = 1; i <= 20; i++) { //i=1~20까지
			if(i%2 != 0 && i%3 !=0 ) //i가 2와 3의 배수가 아닌 수
				sum += i;
		}
		System.out.println("1~20의 정수 중 2와 3의 배수가 아닌 수의 합 :"+sum);

		
		//2번 문제
		int n = 1; // n번 째 경우의 수
		for(int i = 1; i <= 6; i++) { //첫번째 주사위
			for(int j = 1; j <= 6; j++) { //두번째 주사위
				if(i+j==6) { // 두 눈의 합이 6인 경우
					System.out.printf("%d번째 : %d + %d = 6", n++, i, j);
					System.out.println();
				}
			}
		}
		
		//3번 문제
		Scanner sc = new Scanner(System.in);
		System.out.print("가위 바위 보 선택 : ");
		String user = sc.nextLine(); // 유저가 낼 가위바위보
		
		int com = (int)(((Math.random()*10)+1))/3; //랜덤한 정수 1~3
		String com_string; // 컴퓨터가 낸 가위바위보
		String result = null; // 결과
		if(com == 1) {
			com_string = "가위";
			//문자열에 대한 값 비교 하여 결과 내기
			if(user.equals("가위")) result = "DRAW";
			else if(user.equals("바위"))  result = "WIN";
			else if(user.equals("보"))  result = "LOSE";
			else System.out.println("값을 잘못 입력 했습니다.");
		}
		else if(com == 2) {
			com_string = "바위";
			if(user.equals("가위"))  result = "LOSE";
			else if(user.equals("바위")) result = "DRAW";
			else if(user.equals("보")) result = "WIN";
			else System.out.println(" 값을 잘못 입력 했습니다.");
		}
		else {
			com_string = "보";
			if(user.equals("가위")) result = "WIN";
			else if(user.equals("바위")) result = "LOSE";
			else if(user.equals("보")) result = "DRAW";
			else System.out.println(" 값을 잘못 입력 했습니다.");
		}
		
		System.out.printf("\n(유저)%s : (컴퓨터)%s  {USER %s}", user, com_string, result);
	}
}

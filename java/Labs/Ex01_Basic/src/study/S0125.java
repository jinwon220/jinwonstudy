package study;

public class S0125 {
	public static void main(String[] args) {

		int intValue = 103029770;
		byte byteValue = (byte)intValue;
		
		System.out.println(byteValue);// 형변환을 했을 때
		// 큰 타입의 값이 작은 타입의 값의범위를 초과 하였기 때문에
		// 전혀 다른 값이 나옴 ( 쓰래기 값 )
		
		//별 순차 생성
		for(int i = 1; i <= 5 ; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("");
		
		//단축기
		//syso > ctrl + space => System.out.println();
		//코드 정렬하기 : 원하는 블록 잡기(전체블록 ctrl + a) -> ctrl + shift + f (자동 들여쓰기 정렬)
		
		//***
		//**
		//*
		for(int i = 5; i >= 1; i--) { // 5번 반복 시킨다
			for(int j = 1; j <= i; j++) // i의 숫자보다 커질 때 까지 반복 시킨다
				System.out.print("*"); // *입력
			System.out.println(); //줄바꿈
		}
		
		System.out.println("------------");
		
		//  *
		// **
		//***
		for(int i = 0; i < 5; i++) { // 5번 반복 시킨다
			for(int j = 4; j > i; j--) // i보다 작아질 때 까지 반복 시킨다
				System.out.print(" "); // 공백
			for(int j = 0; j < i+1; j++) //i+1보다 작아질 때 까지 반복 시킨다 
				System.out.print("*");  //
			System.out.println();
		}
		
		for(int i = 1; i <= 5; i++) { // 5번 반복
			for(int j = 5; j > i - 1; j--) // 반복되는 만큼 빈칸을 띄어준다
				// i가 반복 될 수록 빈칸이 늘어 난다
				System.out.print(" ");     
			for(int j = 1; j < i + 1; j++) // i+1보다 커질 때 까지 *생성
				// i가 반복 될 수록 삼각형이 생성 되는데 빈칸 옆에 더해짐으로
				// 방향이 y축으로 뒤집힌다.
				System.out.print("*");     
			for(int j = 1; j < i; j++)     // i보다 커질 때 까지 *생성
				System.out.print("*");
			System.out.println();
		}
		
		
		
		
	}
}

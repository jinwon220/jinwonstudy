package study;

import java.util.Scanner;

public class conversion_8_2 {

	public static void main(String[] args) {

		int bin[] = new int[100]; //2진수 넣을 배열
		int cnt = 0; // 배열의 위치
		int mok; // 8진수를  10으로 나눈 몫
		int nmg; // 8진수를 10으로 나눈 나머지
		int mok2; // 나머지를 2로 나눈 몫 (2진수 변경)
		int nmg2; // 나머지를 2로 나눈 나머지 (2진수 변경)
		int a; // nmg를 a로 대체 후 재배열
		
		
		Scanner sc = new Scanner(System.in);
		
		int pal = Integer.parseInt(sc.nextLine());
		
		do {
			mok = pal/10;
			nmg = pal - mok*10;
			a = nmg;
			
			for(int i =1; i <= 3; i++) {
				mok2 = a / 2;
				nmg2 = a - mok2*2;
				cnt = cnt +1;
				bin[cnt] = nmg2;
				a = mok2;
			}
			
			pal = mok;
		} while(mok != 0); {
			for (int i = cnt; i>=1; i--) {
				System.out.print(bin[i]);
			}
		}
		
		
	}

}

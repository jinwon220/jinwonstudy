package Homwork;

//1. 1~45까지의 난수를 발생시켜 6개의 배열에 담으세요
//2. 배열에 담긴 6개의 배열값은 중복값이 나오면 안되요
//3. 배열에 있는 6개의 값을 낮은 순으로 정렬시키세요
//4. 로또 배열의 평균이 30~35 사이가 아닌경우 재추출
//위에서 만드시 내용을 class 설계하세요
//member field , method (기능) , 메뉴

import java.util.Arrays;
import java.util.Scanner;

class Lotto2 {
	private static int[] lotto_number; // 로또 번호 6개
	
	public Lotto2(int[] lotto_number) {
		this.lotto_number = lotto_number;
	}

	public void print(int[] lotto_number) { //출력
		System.out.println(Arrays.toString(lotto_number));
	}
	public void function() { //기능
		stop : do {
			int x = showMenu();
			switch(x) {
			case 1:
				do {
					selectNumber();
				}while(conditionNumber(lotto_number)!=true);
				sortNumber(lotto_number);
				System.out.println(Arrays.toString(lotto_number));
				break;
			case 2:
				break stop;
			default:
				System.out.println("값을 잘못 입력하였습니다.");
			}
		}
		while(true);
	}
	
	private int showMenu() { //메뉴판
		System.out.println("***********");
		System.out.println("1.로또번호 생성");
		System.out.println("2.종   료");
		System.out.println("***********");
		System.out.print("메뉴입력 : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); 
		return x;
	}
	
	private boolean conditionNumber(int[] lotto_number) { //조건
		int sum = 0;
		for(int i = 0; i < lotto_number.length; i++) {
			sum += lotto_number[i];
		}
		float avg =(float)sum/lotto_number.length;
		return 30 <= avg && avg <= 35;
	}
	
	private int[] selectNumber() { // 6개의 중복되지 않은 랜덤값 입력
		do {
			for (int i = 0; i < lotto_number.length; i++) {
				lotto_number[i] = (int) (Math.random() * 45) + 1; // 1~45까지의 정수
				for (int j = 0; j < i; j++) {
					if (i != j) { // 같은 배열 이 아니라면 [0] != [0]
						if (lotto_number[i] == lotto_number[j])
							i--; // lotto_number[n] = [n+1]이 같다면 i--로 재실행
					}
				}
			}
			break;
		} while (true);
		return lotto_number;
	}
	
	private void sortNumber(int[] lotto_number){ //정렬
		int temp = lotto_number[0]; // 임시저장
		for (int i = 0; i < lotto_number.length - 1; i++) {
			for (int j = i; j < lotto_number.length; j++) {
				if (lotto_number[i] > lotto_number[j]) {
					temp = lotto_number[i];
					lotto_number[i] = lotto_number[j];
					lotto_number[j] = temp;
				}
			}
		}
	}
	
	public void showNumber() { //출력
		System.out.println("로또 번호 : " + Arrays.toString(lotto_number));
	}
}

public class Homework2 {
	public static void main(String[] args) {
		int[] n = new int[6];
		Lotto2 lotto = new Lotto2(n);
		lotto.function();
		lotto.print(n);
	}

}

//1. 1~45까지의 난수를 발생시켜 6개의 배열에 담으세요
//2. 배열에 담긴 6개의 배열값은 중복값이 나오면 안되요
//3. 배열에 있는 6개의 값을 낮은 순으로 정렬시키세요
//4. 로또 배열의 평균이 30~35 사이가 아닌경우 재추출
//위에서 만드시 내용을 class 설계하세요
//member field , method (기능) , 메뉴 
package Homwork;

import java.util.Arrays;

class Lotto {
	private static int[] lotto_number = new int[6]; // 로또 번호 6개

	public static void selectNumber() { // 6개의 중복되지 않은 랜덤값 입력
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
	}

	public static void sortNumber(){ //정렬
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
	
	public static void showNumber() { //출력
		System.out.println("로또 번호 : " + Arrays.toString(lotto_number));
	}
	
	public static int sumNumber() { //로또 번호 합
		int sum = 0;
		for(int i = 0; i < lotto_number.length; i++) {
			sum += lotto_number[i];
		}
		return sum;
	}
	
	public static float avg() { //로또 번호의 평균
		float avg =(float)sumNumber()/lotto_number.length;
		return avg;
	}
}

public class Homework {

	public static void main(String[] args) {
		Lotto lotto = new Lotto();

		int n = 0;
		do {
			n++;
			System.out.println(n+"번째\t재!추!출!");
			lotto.selectNumber(); // 로또번호 추출하고 중복값 배제 처리 함수
			lotto.avg(); // 평균
		} while(30 >= lotto.avg() || lotto.avg() >= 35);
		
		System.out.println(n + "번 재추출 된 평균 값이 30~35인 로또번호");
		System.out.print("출력 된 ");
		lotto.showNumber(); // 로또 값 출력하는 함수
		lotto.sortNumber(); // 배열에 담긴 로또 번호 정렬하는 함수
		System.out.print("정렬 된 ");
		lotto.showNumber(); // 로또 값 출력하는 함수(정렬 후)
	}
}

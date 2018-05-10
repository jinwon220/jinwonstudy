import java.util.Arrays;

/*
 1. 1~45까지의 난수를 발생시켜 6개의 배열에 담으세요
 2. 배열에 담긴 6개의 배열값은 중복값이 나오면 안되요
 3. 배열에 있는 6개의 값은 낮은 순으로 정렬 시키세요
 4. 위 결과를 담고 있는 배열을 출력하세요
*/
public class Ex02_Lotto_Main {
	public static void main(String[] args) {
		
		//1번과 2번
		int[] lotto_number = new int[6]; //로또 번호 6개
		
		do {
			for(int i = 0; i < lotto_number.length; i++) {
				lotto_number[i] = (int)(Math.random()*45)+1; //1~45까지의 정수
				for(int j = 0; j < i; j++) {
					if(i != j) { // 같은 배열 이 아니라면 [0] != [0]
						if(lotto_number[i] == lotto_number[j])
							i--; // lotto_number[n] = [n+1]이 같다면 i--로 재실행
					}
				}
			}
			break;
		}while(true);
		
		System.out.println(Arrays.toString(lotto_number));
		//3번 4번
		int small = lotto_number[0]; //작은 수로 배열하기위해 저장될 공간
		int temp = lotto_number[0]; //임시저장
		for(int i = 0; i < lotto_number.length-1; i++) {
			for(int j = i; j < lotto_number.length; j++) {
				if(lotto_number[i] > lotto_number[j]) {
					temp = lotto_number[i];
					lotto_number[i] = lotto_number[j];
					lotto_number[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(lotto_number));

	}
}

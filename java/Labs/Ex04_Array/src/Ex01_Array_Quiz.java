
public class Ex01_Array_Quiz {

	public static void main(String[] args) {
		//수학과 학생들의 기말고사 시험점수
		int[] score = new int[] {79,88,97,54,56,95};
		int max = score[0]; //79
		int min = score[0]; //79
		/*
		 제어`문을 사용해서 max 라는 변수에는 최대값, min 변수에는 최소값이 담기도록 작성
		 ex)max = 97 , min = 54
		*/
		//max구하기 min구하기
		for(int i = 0; i < score.length-1; i++) {
			max =(score[i] >= score[i+1])?score[i]:score[i+1];
			min =(score[i] <= score[i+1])?score[i]:score[i+1];
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		
		///////////////////////////////////////////////////
		int[] number = new int[10];
		/*
		 10개의 방의 값을 1~10까지 값으로 초기화시키세요
		 number[0] 출력하면 1이라고 출력
		*/
		for(int i = 0; i < number.length; i++) {
			number[i] = i+1;
			System.out.printf("number[%d] = %d \n", i, number[i]);
		}
		
		///////////////////////////////////////////////////
		//어느 학생의 기말고사 시험점수 (5과목)
		int sum = 0;
		float average = 0f;
		int[] jumsu = {100,55,90,60,78};
		/*
		 1.총 과목 수
		 2.모든 과목점수의 합
		 3.과목의 평균
		 단) 2, 3문제는 하나의 for문을 사용
		*/
		//1번
		System.out.println("총 과목의 개수 : " + jumsu.length + "개");
		//2번
		for(int i = 0; i < jumsu.length; i++) {
			sum += jumsu[i];
		}
		System.out.println("총 과목 점수의 합 : " + sum);
		//3번
		average = (float)sum/jumsu.length;
		System.out.println("점수의 평균  : " + average + "점");
	}
}

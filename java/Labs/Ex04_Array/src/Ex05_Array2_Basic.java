
class Car{
	int door;
	String color;
}

public class Ex05_Array2_Basic {
	public static void main(String[] args) {
		//2차원(행과 열)
		//[행],[열]
		int[][] score = new int[3][2];
		System.out.println(score[0][0]);
		System.out.println(score[2][1]);
		//System.out.println(score[2][2]); // Error 2행에는 [2]열이 없다 / 2열은 [1]
		score[0][0] = 100;
		score[0][1] = 200;
		
		score[1][0] = 300;
		score[1][1] = 400;
		
		score[2][0] = 500;
		score[2][1] = 600;
		
		System.out.println(score.length); // 행의 수 (1차원 배열의 수)
		//행의 개수 : 배열이름.lengh -> score.length
		//열의 개수 : 배열이름[i] -> score[0].length
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.printf("score[%d][%d] = %d\n", i, j, score[i][j]);
			}
			System.out.println();
		}
		
		// 가변배열
		int[][] score2 = new int[5][];
		// 행은 지정 되어있지만 열은 사용하고 싶은 만큼 넣을 줄때 마다 길이가 늘어난다.

		
		//TODAY POINT(Array >> Collection(중요!!!)
		//TODAY for문 >> 개선된 for문 (배열 전용 for문)
		//C# : for(Type변수명 in 배열 or 컬렉션){출력구문} => javascript와 문법이 같다
		//JAVA : for(Type변수명 : 배열 or 컬렉션){출력구문}
		int[] arr3 = {5, 6, 7, 8, 9, 10};
		/*
		for(int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		*/
		for(int v : arr3){
			System.out.println(v);
		}
		
		String[] sarr = {"A", "B", "C", "D", "FFFF"};
		for(String s : sarr) {
			System.out.println(s);
		}
		//센스 퀴즈
		//3행 2열
		int[][] score3 = new int[][] {
										{11, 13},
										{13, 14},
										{15, 16}
									 };
		//개선된 for문을 사용해서 값을 출력하세요
		for(int[] i : score3) {
			for(int j : i) {
				System.out.println("값 : " + j);
			}
		}
		
		//객체 배열
		Car[] cararr = new Car[2];
		cararr[0] = new Car();
		cararr[0].color = "red";
		cararr[0].door = 4;
		
		cararr[1] = new Car();
		cararr[1].color = "blue";
		cararr[1].door = 2;
		
		//일반 for문 자동차 색상과, 문의 개수
		for(int i = 0; i<cararr.length; i++) {
			System.out.println("차 색 : " + cararr[i].color + "\t문 개수 : " + cararr[i].door);
		}
		//개선된 for문
		for(Car i : cararr) {
			System.out.println("차 색 : " + i.color + "\t문 개수 : " + i.door);
		}
	}
}

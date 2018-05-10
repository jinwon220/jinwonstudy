import java.util.Arrays;

//배열(Array)는 객체다
/*
배열은 한번 만들면 크기를 변경할 수 없다.
ex) int[] score = new int[5]
5개의 방을 만들었는데 n개를 더 만들고 싶으면 새로 배열을 만들어야한다
*/

public class Ex01_Array_Basic {
	public static void main(String[] args) {
		int[] score = new int[3];
		System.out.println("score 변수 (참조) : " + score); //주소 (배열의 시작값 주소)
		
		//Array 배열은 각각의 방을 가지고 있다 (각각의 방은 Type(int)을 가지고 크기 결정)
		//각각의 방의 접근은 : 첨자(index) 로 접근 : 배열의 시작값은 : 0
		//score[0] , score[1], score[2]
		//배열의 개수(length)는 마지막 첨자(index) 보다 1이 항상 크다 (프로그램 명제)
		//배열은 타입의 초기값을 가진다
		System.out.println(score[0]);
		score[2] = 333;
		System.out.println(score[2]);
		
		/*
		//score[3] = 500; //score[3]은 4번째 방이다. (만든 방은 3번째 방까지) : 배열은 [0]부터 시작
		//예외가 발생했습니다. (Exception 가 발생했습니다)
		//프로그램이 강제적으로 종료....
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
		//at Ex01_Array_Basic.main(Ex01_Array_Basic.java:22)
		
		//System.out.println("실행 안됨~"); // 실행 안됨  (위에서 예외가 발생하여 강제적으로 종료됨)
		*/
		
		// Array 와 궁합이 제일 좋은 제어문은?
		// for문 why? 몇번 도는지 정확하게 명시가 되어있고
		// 배열은 몇번까지 방이 있는지 정확하게 명시가 되어있기 때문에
		for (int i = 0; i < 3; i++) {
			System.out.printf("[%d] = %d", i, score[i]);
		}
		System.out.println();
		
		for (int i = 0; i < score.length; i++) { //length자원 배열의 개수...
			System.out.printf("[%d] = %d", i, score[i]);
		}
		System.out.println();
		
		//배열(Array) 사용시 도와주는 클래스(help 클래스)
		//Array.toString();
		String result = Arrays.toString(score); //배열에 있는 값을 확인할 때
		System.out.println(result);
		score[0]=6666;
		System.out.println(result);
		Arrays.sort(score);
		System.out.println(Arrays.toString(score));
		
		//point (암기)
		//배열을 만드는 3가지 방법
		int[] arr = new int[5]; //기본 (방의 개수 생성 >> 기본값)
		int[] arr2 = new int[]{100, 200, 300}; //3개의 값 (값의 수만큼 방 생성)
		int[] arr3 = {11, 12, 13, 14, 15}; //컴파일러가 내부적으로 new를 생성
		//JavaScript는  var cars = ["", "", ""] // 대괄호 블럭이다.
		
		for(int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		//배열은 선언 과 할당을 분리 할 수 있다.
		//ex)Car car; 선언 
		//   c= new Car(); 할당
		
		//int[] arr4=null;
		//System.out.println(arr4);
		
		int[] arr4; //배열선언
		arr4 = new int[] {21,22,23,24,25}; //할당(메모리의 주소를 갖는다)
		
		int[] arr5 = arr4; //배열은 주소값 할당
		System.out.println(arr5 == arr4);
		
		//배열은 8가지 기본 타입 + String + 클래스 등...
		char[] ch = new char[10]; // default 빈문자 '\u0000'
		for(int j = 0; j < ch.length; j++) {
			System.out.println(">"+ch[j]+"<");
		}
	}
}

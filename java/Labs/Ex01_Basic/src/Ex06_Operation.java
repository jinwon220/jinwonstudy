//연산자, 제어문 

public class Ex06_Operation {
	public static void main(String[] args) {
		int sum = 0;

		// 대입 연산자 (+=, -=, *= ...)
		sum += 1; // sum = sum + 1;
		sum -= 1; // sum = sum - 1;
		System.out.println("sum :" + sum);

		// if문과 대입 연산자
		// 간단한 학점 계산기
		// 학점에 대해서 A+ , B-
		// 94점
		// 95점 보다 크면 A+
		// 그외는 A-

		int score = 97;
		String grade = ""; // 문자열 초기화 ""
		System.out.println("당신의 점수는 : " + score);

		if (score >= 90) {
			grade = "A";
			if (score >= 95)
				grade += "+";
			else
				grade += "-";
		} else if (score >= 80) {
			grade = "B";
			if (score >= 85)
				grade += "+";
			else
				grade += "-";
		} else if (score >= 70) {
			grade = "C";
			if (score >= 75)
				grade += "+";
			else
				grade += "-";
		} else
			grade = "F";

		/* 삼항연산자로 만드는 방법
		if (score >= 90) 
			grade = (score >= 95) ? "A+" : "A-";
		else if (score >= 80)
			grade = (score >= 95) ? "B+" : "B-";
		else if (score >= 70) 
			grade = (score >= 95) ? "C+" : "C-";
		else
			grade = "F";
		*/
		
		System.out.println("당신의 학점은 : " + grade + "입니다");

		// 단축기
		// syso > ctrl + space => System.out.println();
		// 코드 정렬하기 : 원하는 블록 잡기(전체블록 ctrl + a) -> ctrl + shift + f (자동 들여쓰기 정렬)

		// switch문
		int data = 100;
		switch (data) {
		case 100:
			System.out.println("100입니다.");
			break;
		case 90:
			System.out.println("90입니다.");
			break;
		case 80:
			System.out.println("80입니다.");
			break;
		default:
			System.out.println("default");
		}

		// break 구문은 없어도 된다.
		// 다만, 빠져나가지 않고 전부 실행한다.
		switch (data) {
		case 100:
			System.out.println("100입니다^^");
		case 90:
			System.out.println("90입니다^^");
		case 80:
			System.out.println("80입니다^^");
		default:
			System.out.println("default^^");
		}

		//////////////////////////////////////
		
		// break 구문을 사용하지 않고
		// 전부 실행했을 때, 사용 활용 방법
		int month = 3;
		String res;

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			res = "31";
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			res = "30";
			break;
		case 2:
			res = "29";
			break;
		default:
			res = "월이 아닙니다.";
		}
		System.out.println(month + "월은 " + res + "일까지 입니다.");

		//난수 (랜덤값 : 임의의 추측 값)
		//import java.lang.Math (Math 클래스)
		//default > java.lang > import 내부적으로...
		//java.lang 안에 있는 자원은 java에서 기본적으로 열어둠 (import 없이 사용가능하다.)
		//Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0
		//Math.Random() 자원은 Random() 함수가 static 이기 때문에 객체 생성 없이도 사용 가능하다
		//결과 : 0.0 <= random < 1.0 의 double 타입의 값 올 추출
		
		System.out.println("Math.random() : " + Math.random());
		System.out.println("Math.random() *10 : " + Math.random()*10);
		//0~9까지의 정수
		System.out.println("(int)(Math.random()*10) :" + (int)(Math.random()*10));
		//1~10까지의 정수
		System.out.println("1 ~ 10 랜덤 정수 :" + ((int)(Math.random()*10)+1));
		
		/*
		개별 Quiz
		만들려고 하는 시스템은 백화점 경품 추첨 시스템입니다.
		경품 추첨시 1000점이 나오면
		겸품으로 TV, NoteBook, 냉장고, 한우세트, 휴지
		경품 추첨시 900점이 나오면
		겸품으로 NoteBook, 냉장고, 한우세트, 휴지
		경품 추첨시 800점이 나오면
		겸품으로 냉장고, 한우세트, 휴지
		경품 추첨시 700점이 나오면
		겸품으로 한우세트, 휴지
		경품 추첨시 600점이 나오면
		겸품으로 휴지
		그외 100 ~ 500 까지는 칫솔
		
		사용자가 와서 경품시스템을 사용하게 되면 랜덤하게 100 ~ 1000 까지의 점수가 나온다.
		
		*/
		
		/*
		100~1000 의 100단위 정수 구하는 방법
		
		jumsu = (int)(Math.random()*1000);
		
		if(jumsu > 900) 	
			jumsu = 1000;
		else if(jumsu > 800)
			jumsu = 900;
		else if(jumsu > 700)
			jumsu = 800;
		else if(jumsu > 600)
			jumsu = 700;
		else if(jumsu > 500)
			jumsu = 600;
		else if(jumsu > 400)
			jumsu = 500;
		else if(jumsu > 300)
			jumsu = 400;
		else if(jumsu > 200)
			jumsu = 300;
		else if(jumsu > 100)
			jumsu = 200;
		else
			jumsu = 100;
		*/
		
		int jumsu;
		String giveaway = "";
		
		
		jumsu = (int)((Math.random()*10) + 1)*100;

		System.out.println(jumsu);
		switch(jumsu) {
			case 1000:
				giveaway += "TV";
			case 900:
				giveaway += " NoteBook";
			case 800:
				giveaway += " 냉장고";
			case 700:
				giveaway += " 한우세트";
			case 600:
				giveaway += " 휴지";
				break;
			default :
				giveaway = "칫솔";
		}
		System.out.println("점수는 " + jumsu +"이고, 겸품은 " + giveaway + " 입니다");
		
		
	}
}

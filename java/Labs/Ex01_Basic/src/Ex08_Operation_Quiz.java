import java.util.Scanner;

/*
간단한 사칙 연산기 (+, -, *, /)
입력값 3개 (입력값은 nextLine() 으로 받아서 필요하다면 숫자로 변환)

화면
>입력값:숫자
>입력값(기호):+
>입력값:숫자
>연산결과 : 사칙연산한 결과

hint) if(){} else if(){}
hint) if(opr == "+"){더하기 연산할꺼야} -> 이렇게 사용 하지 않기 (빵점!!)
Today Point
문자열에 대한 비교는 == 아니고 (equals() 함수를 사용한다)
hint) if(opr.equals("+")) {더하기 연산}
*/

public class Ex08_Operation_Quiz {

	public static void main(String[] args) {
		int su1 = 0;  // 첫번째 입력값
		int su2 = 0;  // 두번째 입력값
		String opr = "";  // 사칙연산 기호
		int result = 0; // 결과
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 입력 : ");
		su1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("사칙연산 기호(+,-,*,/)  : ");
		opr = sc.nextLine();
		
		System.out.print("두번째 숫자 입력 : ");
		su2 = Integer.parseInt(sc.nextLine());
		
		if(opr.equals("+"))
			result = su1 + su2;
		else if(opr.equals("-"))
			result = su1 - su2;
		else if(opr.equals("*"))
			result = su1 * su2;
		else if(opr.equals("/"))
			result = su1 / su2;
		else {
			System.out.println("지원하지 않는 연산자 입니다.");
			//key point
			//return 키워드 : **[함수단위]의 종결자** > main 함수 탈출 > 종료
			return;
		}
		
		System.out.println("두 수의 연산 결과  : " + result);
		System.out.printf("[%d %s %d = %d]", su1, opr, su2, result);

	}

}

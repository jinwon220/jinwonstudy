import java.util.Scanner;

//주민번호 : 뒷번호 첫자리 : 1,3 남자 , 2,4 여자

//main 함수 Scanner  사용 주민번호 입력받고
//앞:6자리 뒷:7자리
//입력값 : 123456-1234567 

//1. 자리수 체크 (기능)함수 (14 ok)
//2. 뒷번호 첫번째 자리값 1~4까지의 값만 허용 기능함수
//3. 뒷번호 첫번째 자리값을 가지고 1,3 남자 , 2,4 여자 출력 기능함수
//3개의 함수 static 

public class Ex07_String_Total_Quiz {
	static int lengthCheck(String s) {
		return s.length();
	}
	
	static String numCheck(String s) {
		String check = "";
		if (s.indexOf("-") == 6) {
			if (s.charAt(s.indexOf("-") + 1) == '1' || s.charAt(s.indexOf("-") + 1) == '3') {
				check = "남자";
			} else if (s.charAt(s.indexOf("-") + 1) == '2' || s.charAt(s.indexOf("-") + 1) == '4') {
				check = "여자";
			}
		}
		return check;
	}
	
	public static void main(String[] args) {
		String ssn = "";
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("000000-0000000 형태로 입력하시오");
			ssn = sc.nextLine();
			if(lengthCheck(ssn)==14) {
				if(numCheck(ssn).equals("남자")) {
					System.out.println("남자입니다");
					break;
				} else if(numCheck(ssn).equals("여자")) {
					System.out.println("여자입니다");
					break;
				} else System.out.println("\"-\"위치나 번호를 잘못 입력했습니다.");
			}else System.out.println("14자리가 아닙니다.");
			
		}while(true); //while(자리수check 함수, 1~4까지 check 함수)
	}

}

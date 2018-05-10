import java.util.Scanner;

public class Ex09_do_while_Static_Menu {

	static Scanner sc = new Scanner(System.in);
	//sc는 메모리에 올라가 있고 , new Scanner는 heap에 올라가있다.
	
	static void inputRecord() { //반환되는것 없는 static 함수 (입력)
		System.out.println("성적 데이터 입력");
	}
	static void deleteRecord() {//반환되는것 없는 static 함수 (삭제)
		System.out.println("성적 데이터 삭제");
	}
	static void sortRecord() {//반환되는것 없는 static 함수 (정렬)
		System.out.println("성적 데이터 정렬");
	}
	static int displayMenu() { // int 타입 반환 static 함수
		//메뉴 보여주는 곳
		System.out.println("*************");
		System.out.println("***[성적관리]***");
		System.out.println("1.학생성적 입력하기");
		System.out.println();
		System.out.println("2.학생성적 삭제하기");
		System.out.println();
		System.out.println("3.학생성적 이름순 정렬");
		System.out.println();
		System.out.println("4.프로그램 종료");
		System.out.println();
		
		//입력한 메뉴의 번호를 반환 시켜주기
		int menu = 0; // 반환 할 메뉴 번호
		do { //먼저 실행
			try { 
				menu = Integer.parseInt(sc.nextLine()); // 숫자 입력
				if(menu >= 1 && menu <= 4) { // 1~4 번호를 입력하면 break;
					break;
				}else { // 1~4 이외의 값을 입력하면 실행
					throw new Exception("문제발생");
				}
			}catch(Exception e) { //else가 실행 되면 catch문 실행
				System.out.println("메뉴를 잘못 선택");
				System.out.println("메뉴(1~4)까지 선택");
			}
		}while(true); //무한반복
		
		return menu;
	}
	public static void main(String[] args) {
		while(true) {
			switch (displayMenu()) { //메뉴판 에서
			case 1: inputRecord();   // 1이 입력되면 실행되고
				break;               // 빠져나가기
			case 2: deleteRecord();  // 2가 입력되면 실행되고
				break;               // 빠져나감
			case 3: sortRecord();    // 3이 입력되면 실행되고
				break;               // 빠져나감
			case 4: System.out.println("프로그램 종료");
					System.exit(0);  //프로그램 강제 종료
			
			}
		}
	}

}

package kr.or.bit;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Date{
	Calendar cal = Calendar.getInstance();
	boolean attend = false;
	
	Date(){}
	Date(boolean attend){
		this.attend = attend;
	}
}
class View{ //확인
	Map<String, String> log = new HashMap<>(); //login
	//Map<String, Boolean> attendance = new HashMap<>(); //출석
	Map<String, Date> attendance = new HashMap<>(); //출석
	Scanner sc = new Scanner(System.in);
	
	private void check(String id) { //출석체크
		//attendance.put(id, true);
		attendance.put(id, new Date(true));
	}

	private void search(String id) {
		if(!attendance.get(id).attend) {
			System.out.println("\n==>>" +attendance.get(id).cal.MONTH +"월 "
										+attendance.get(id).cal.DATE 
										+ "일 미출석입니다.\n");
		} else {
			System.out.println("\n==>>" +attendance.get(id).cal.MONTH +"월 "
										+attendance.get(id).cal.DATE 
										+ "일 출석입니다.\n");
		}
	}
	private String login_menu() { //로그인 메뉴
		while(true) {
			System.out.println("************************");
			System.out.println("1.로그인  2.정보등록 ");
			System.out.println("************************");
			int choice;
			
			try {
				choice = Integer.parseInt(sc.nextLine()); // 문자로 받았을 경우
			}catch(Exception e){
				choice = 0;
			}
			
			
			switch(choice) {
			case 1:
				String id = login();
				if(id != null) {
					return id;
				}
				break;
			case 2:
				join();
				break;
			default:
				System.out.println("잘못 입력했습니다.");
				break;
			}
		}
	}
	
	public void menu() { //메뉴		
		String id = login_menu();
		do {
			System.out.println("************************");
			System.out.println(id+"님 안녕하세요");
			System.out.println("1.출석  2.출결조회  3.종료 ");
			System.out.println("************************");
			System.out.print("원하시는 서비스를 선택해주세요-> ");
			int choice;
			try {
				choice = Integer.parseInt(sc.nextLine()); // 문자로 받았을 경우
			}catch(Exception e){
				choice = 0;
			}
			
			switch(choice) {
			case 1:
				check(id);
				System.out.println("\n~~~~출석 되었습니다.~~~~\n");
				break;
			case 2:
				search(id);
				break;
			case 3:
				return; //종료
			}
		}while(true);
	}
	
	private void join() { //정보등록
		while(true) {
			System.out.print("아이디 입력 : ");
			String id = sc.nextLine().trim(); // trim() 양끝 빈문자열 제거

			System.out.print("비밀번호 입력 : ");
			String pw = sc.nextLine().trim();

			if (!log.containsKey(id)) {
				log.put(id, pw);
				System.out.println("[정보가 등록 되었습니다.]");
				attendance.put(id, new Date()); // 정보가 등록 되었을 때 출결 상태는 false
				return; //종료
			} else {
				System.out.println("[같은 이름의 아이디가 있습니다.]");
				return;
			}
		}
	}
	
	private String login() { // 로그인 기능
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine().trim(); // trim() 양끝 빈문자열 제거

		System.out.print("비밀번호 입력 : ");
		String pw = sc.nextLine().trim();

		if (!log.containsKey(id)) {
			System.out.println("[ID가 없습니다.]");
			id = null;

		} else {
			if (log.get(id).equals(pw)) {
			} else {
				System.out.println("[PW가 다릅니다.]");
				id = null;
			}
		}

		return id;
	}
}

public class HomeWork {
	public static void main(String[] args) {
		View v = new View();
		v.menu();
	}

}

import java.util.HashMap;
import java.util.Scanner;

/*
HashMap을 사용한 로그인 시스템
*/
public class Ex13_HashMap_Quiz {

	public static void main(String[] args) {
		// 회원 로그인 데이터 HashMap 으로 관리
		HashMap loginmap = new HashMap();
		loginmap.put("kim", "kim1004");
		loginmap.put("scott", "tiger");
		loginmap.put("lee", "kim1004");

		// 시스템에 로그인 하는 시나리오
		// ID(0) , PWD(0) >> 회원 (환영)
		// ID(0) , PWD(x) >> 실패 (비번다시 입력)
		// ID(x) , PWD(x) >> 실패 (다시 입력)
		// ID(x) , PWD(0) >> 실패

		// Scanner 사용해서 ID, PWD 입력받으세요
		// loginmap 통해서 검증 로직 처리
		// ID 또는 PWD 틀리면 다시 입력 요청
		// ID , PWD 다 맞으면 회원님 방문 환영합니다 ^^ (출력 프로그램 종료)

		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("아이디 입력 : ");
			String id = sc.nextLine().trim(); // trim() 양끝 빈문자열 제거

			System.out.print("비밀번호 입력 : ");
			String pw = sc.nextLine().trim();

			if (!loginmap.containsKey(id)) { // loginmap.containsKey(id) == false
				System.out.println("ID가 없습니다.");
			} else {
				if (loginmap.get(id).equals(pw)) {
					System.out.println("환영합니다 " + id + "님");
					break;
				} else {
					System.out.println("PW가 다릅니다.");
				}
			}
		} while (true);
	}

}

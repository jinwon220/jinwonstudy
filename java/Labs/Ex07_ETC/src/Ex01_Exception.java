//오류
//1. 에러(error) : 네트워크 장애, 메모리, 하드웨어
//2. 예외(Exception) : 개발자 코드 처리 (로직 제어 ...> 예측가능)

//예외처리 목적 : 프로그램을 정상적으로 수정하는 것이 아니고 문제가 발생시 비정상적으로 종료 못하게 하는 것

/*
문제가 발생될 수 있는 코드
try{
	문제가 될 수 있는 코드
}catch(Exception e){
	처리(문제를 인지를 하고...)
	관리자에게 메일 보낼까?
	로그 파일에 기록 할까?
}finally{
	예외가 발생하던, 발생하지 않던 (의무적)강제적으로 수행되는 구문
}
*/
public class Ex01_Exception {
	public static void main(String[] args) {
		/*
		System.out.println("Main Start");
		System.out.println("Main Logic 처리");
		System.out.println(0/0); // 비정상 종료(문제 발생 시점부터 그 이하 코드 실행 안되요)
		System.out.println("Main End");
		*/
		System.out.println("Main Start");
		System.out.println("Main Logic 처리");
		try {
			System.out.println(0/0); // 비정상 종료(문제 발생 시점부터 그 이하 코드 실행 안되요)
		}catch (Exception e){
			//처리하는 코드
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Main End");
	}
}

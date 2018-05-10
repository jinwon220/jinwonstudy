
public class Ex02_Exception {
	public static void main(String[] args) {
		int num = 100;
		int result = 0;
		/*
		try {
			for (int i = 0; i < 10; i++) {
				result = num / (int) (Math.random() * 10);// 난수 (0~9)
				System.out.println("result : " + result + " i:" + i);
			}
		} catch (Exception e) { //안좋은 방법..(가독성 DOWN)
			System.out.println("Exception...");
		}
		System.out.println("MainEND");
		*/
		/*
		try {
			for (int i = 0; i < 10; i++) {
				result = num / (int) (Math.random() * 10);// 난수 (0~9)
				System.out.println("result : " + result + " i:" + i);
			}
		} catch (Exception e) { 
			System.out.println("Exception...");
		} catch (ArithmeticException e) { //오류 Exception 에러가 모든 에러를 가져가기 때문에 할일이 없어 오류가 난다
			System.out.println("연산 예외 발생");
		}
		System.out.println("MainEND");
		*/
		
		try {
			for (int i = 0; i < 10; i++) {
				result = num / (int) (Math.random() * 10);// 난수 (0~9)
				System.out.println("result : " + result + " i:" + i);
			}
		} catch (ArithmeticException e) {
				System.out.println("연산 예외 발생");
		} catch (Exception e) {
			System.out.println("Exception...");
		}
		System.out.println("MainEND");
		
		//연산에 관련된 예외는 ArithmeticException 잡고 나머지 Exception 처리
		//하위 예외는 상위(부모) 앞에....
	}
}

//static method

class StaticClass{
	//instance variable
	int iv;
	//class varicable
	static int cv;
	
	//일반함수
	void m() {
		//일반함수에서 iv 값을 처리 : 가능
		//일반함수에서 cv 값을 처리 : HINT(생성시점) >> static 자원은 일반자원보다 먼저 memory에 올라간다.
		iv = 500;
		cv = 1000; //가능 
		//같은 클래스 내에서는 클래스 이름을 생략하기도 한다.
		StaticClass.cv = 1000;//가능 
		//(클래스이름.static자원명) 
		
		//StaticClass.sm(); 가능
		//일반함수는 모든 static 자원 사용 가능하다.
	}
	
	//static 함수
	static void sm() {
		//일반자원 iv 자원 사용(x) 불가!!!
		//why? 클래스에 있는 일반자원보다 static함수가 먼저 메모리에 올라가기 때문이다.
		//StaticClass.sm(); 코드에서 iv를 사용할려고 하면 문제가 생긴다..(iv는 메모리에 없음)
		
		//일반함수는 사용할 수 있을 까요?
		//불가. 이유는 같다.
		
		//static 끼리끼리 놀아라 그러면 error는 없을 것이다.^^
		System.out.println("static 변수 : "+cv);
	}
}

public class Ex07_Static_Method {

	public static void main(String[] args) {
		//StaticClass.cv = 5555;
		//StaticClass.sm();
		//여기까지 코드에서... 일반함수 void m() 사용할 수 없다.
		StaticClass sc = new  StaticClass();
		//StaticClass 분석 클래스 정보 + static 정보 >> class, method, static area
		//객체생성보다 static 항상 앞에 있다.
		
		sc.iv = 2222;
		
		System.out.println("main 함수");
		
	}

}

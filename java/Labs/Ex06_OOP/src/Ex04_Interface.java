/*
인터페이스(interface)
범용적 의미
1. 약속, 표준, 규격 등을 만드는 행위
ex) 나사, 신발(사이즈)... 
ex) ISO 표준을 지키는 회사라면...

---------------------------------
소프트웨어 개발
>> 인터페이스가 최상위 단계
>> 설계 표준, 약속을 정의하는 행위

Interface
1.실제 구현부가 없다 : 실행블럭이 없다 : 이동에 관련된 기능 >> void move(int x, int y); >> 추상 메서드
2.표준화 된 설계를 보장 (완벽한 강제성)
3.공통설계

JAVA API (개발자가 필요한 인터페이스는 가지고 있다 : 인터페이스 기반으로 클래스가 생성)
>Collection 클래스가 (동적배열)
>작은 인터페이스들을 여러개 모아서 사용 (재사용성)

4.생성 방법
상수(final) : public static final int NUM = 10;
         ==>[public static final] 생략 (기본적으로 있다)
         ==>int NUM = 10;
함수(method): public abstract void run();
         ==>[public abstract] 생략 (기본적으로 있다)
         ==>void run();
함수(method): String move(int x, int y);
인터페이스 구현이 없는 추상메서드만 가진다..

5.인터페이스는 객체 생성이 불가(상수를 제외한 나머지 추상함수...)
6.구현을 통해서만 사용가능 (class Test implements Ia )
7.인터페이스 다중 상속 사능(class Test implements Ia, Ib, Ic, Id)
8.인터페이스끼리 상속이 가능 (Ia extends Ib : 약속을 확장가능) 
9.인터페이스도 하나의 타입(다형성) 구현 (**POINT**)
*/
interface Ia{
	//상수 (시스템 자원 값)
	public static final int AGE=100;
	//int AGE = 100;
	//[public static final] 생략 가능 (default)
	//인터페이스 안에 있는 상수는 [public 이면서] [static 이면서] [final 인] 상수이다.
	String GENDER = "남";
	//원칙 : public static final String GENDER = "남";
	
	public abstract String print();
	//[public abstract] 생략가능
	//인터페이스 안에 있는 추상적인 함수는 [public 이면서] [abstract 인] 함수이다.
	String message(String str);
	//원칙 : public abstract String message(String str);
}

interface Ib{
	int AGE = 10;
	void info();
	String val(String s);
}


class Test extends Object implements Ia, Ib{

	@Override
	public String print() {
		return null;
	}

	@Override
	public String message(String str) {
		return null;
	}

	@Override
	public void info() {
		
	}

	@Override
	public String val(String s) {
		return null;
	}
	
}
public class Ex04_Interface {
	public static void main(String[] args) {
		Test t = new Test();
		
	}
}

package kr.or.bit;
/*
접근자(modifier)
public (공유 : 폴더(package) 구분없이 모든 자원을 공유)
private (개인 : 클래스 내부에서 공유자원 , 참조변수는 볼 수 없다(사용불가)>> 객체입장에서 접근 불가

객체지향언어 특징(캡슐화,은닉화)
1.클래스 내부 자원에 적용 >> member field (instance variable) private int age;
1_1. private 의미 : 직접할당을 막고 간접할당을 통해서 자원 보호
1_2. 설계자의 의도 (원하는 값만 처리) > private int age   > 1 ~ 200까지 정수만 넣겠다. > 별도의 함수 제어
1_3. private 변수는 별도의 기능(변수 값을 write 함수, 변수 값을 read 함수)
	캡슐화된 member field 에서 값을 write, read 기능을 가진 함수를 setter 함수(write), getter 함수(read) 이름부여
	
private int age = 100;
-setter (0) 함수
-getter (0) 함수
-setter , getter (0) 함수

2.클래스 내부 자원에 적용 >> method    private void call(){}
2_1. 함수를 private 으로 하는 이유 : 클래스 내부에서 다른 함수를 도와주는 열활을 하는 함수라면....

*/
public class Car {
	private int window;
	private int speed;
	
	//window 변수를 setter 함수, getter 함수를 통해서 write, read 기능	
	public void setWindow(int data) {
		window = data;
	}
	public int getWindow() {
		return window;
	}
	
	//자동으로 생성된 getter 함수
	public int getSpeed() {
		return speed;
	}
	//자동으로 생성된 setter 함수
	public void setSpeed(int speed) {
		//간접할당의 장점
		if(speed < 0) this.speed = 0;
		else this.speed = speed;
	}
	
	//추가 함수 만들어도 가능
	public void speedUp() {
		this.speed+=5;
	}
	public void speddDown() {
		if(this.speed >= 5) this.speed-=5;
		else this.speed = 0;
	}
}



/*
추상클래스
미완성 설계도
미완성 클래스 (완성된 코드 + 미완성 코드)
-미완성 코드 : 미완성 함수 (함수가 {실행블럭} 을 가지고 있지 않다.(없다) 
          ex) public void print();
-완성 과 미완성의 차이 (new를 통해 객체를 생성(완성), 생성하지 못하면(미완성))

1. 추상클래스는 스스로 객체 생성 불가(new 사용 불가)
2. 추상클래스는 결국 완성된 클래스를 만들어서 사용 -> [상속]을 통해서  =>상속이 없으면 추상클래스는 없다
   미완성 자원(추상함수) 완성해라(구현) -> 재정의를 통해(override)

why? 추상클래스 >> 설계자가 바라보는 진정한 의미 : 강제적 구현을 목적으로 한다.
*/
// 상속의 부모타입에 자식타입의 주소값을 넣을 수 있고
// 추상함수를 볼 수 있다 (why? 재정의 된 함수는 자식함수를 따라가기 때문에)
abstract class Abclass{
	int pos;
	void run() {
		pos++;
	}
	//여기까지의 코드는 완성 된 코드
	
	//추상자원 (추상함수)
	abstract void stop(); //{실행블럭}이 없다.
}

class Child extends Abclass{
	@Override
	void stop() { //stop이라는 함수 이름으로 재정의 코드
		this.pos = 0;
		System.out.println("stop : " + this.pos);
	}
}

public class Ex01_abstract_class {
	public static void main(String[] args) {
		// Abclass ab = new Abclass(); 불가
		Child ch = new Child();
		ch.run();
		ch.run();
		System.out.println("현재 pos : " + ch.pos);
		ch.stop();
		
		Abclass ab = ch;
		ab.run();
		System.out.println("현재 pos : " + ch.pos);
		ab.stop();
	}

}

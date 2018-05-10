//다형성(상속관계에서)
//다형성 : 여러가지 성질 (형태)를 가질 수 있는 능력
//C# : 다형성 안에 overoading, override 포함

//JAVA : [상속관계]에서 하나의 [참조변수]가 여러개의 [타입]을 가질 수 있다.
//참조변수는 부모타입을 이야기 한다.
//조상클래스 타입의 참조변수로 자식클래스의 객체를 참조 가능
//java : 자식은 부모에게 조건없이 드린다(현실세계와 반대)
class Tv2{ //부모클래스(일반화, 추상화) 공통적인 내용
	boolean power;
	int ch;
	void power() {
		this.power = !this.power;
	}
	void chUp() {
		ch++;
	}
	void chDown() {
		ch--;
	}
}

//Tv2 클래스 
class CapTv extends Tv2{ //특수화, 구체화, 고유한 내용
	String text;
	String caption() {
		return this.text = "현재 자막 처리 중....";
	}
}

public class Ex10_inherit_Poly {
	public static void main(String[] args) {
		CapTv tv = new CapTv();
		tv.power();
		System.out.println("전원 : " + tv.power);
		tv.chUp();
		System.out.println("채널 : " + tv.ch);
		System.out.println("자막 : " + tv.caption());
		//기존까지 배운내용
		
		//Tv2 tv2 = new Tv2();
		//어짜피 Tv2 타입의 객체는 heap에 있는데 굳이 또 메모리에 올릴 필요가 있을까?
		Tv2 tv2 = tv; //CapTv의 부모타입  = Tv2 로 가지고 있어야한다.
		//tv2 타입 참조변수는 Tv 객체의 자원만 접근이 가능
		//이런 방법을 다형성 이라고 한다.
		System.out.println("주소값 : " + tv.toString());
		System.out.println("주소값 : " + tv2.toString());
		
		//////////////////////////
		CapTv cc = new CapTv(); // Tv2 상속
		CapTv dd = new CapTv(); // Tv2 상속
		Tv2 tt;
		tt = cc;
		tt = dd;
		//다형성 (자신것만 접근 가능)
	}
}

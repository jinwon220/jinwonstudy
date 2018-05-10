//this
//1. 객체 자신을 가르키는 this (앞으로 생성될 객체의 주소를 담을 곳이라고 가정하고)
//2. this 객체 자신 (생성자를 호출) : 원칙은:객체 생성시 생성자 1개 호출
//예외적으로 this 사용 : 여러개 생성자 호출 가능)

/*
class Test6{
	//클래스 내부에 아무것도 입력 안할시
	//컴파일러  => Test6() {} 생성
	//default constructor
}
*/

class Test6 extends Object{ //extends Object 를 명시(표기)하지 않아도 default로 적용
	int i;
	int j;
	Test6(){ // default constructor를 명시(표기) 하면  default constructor를 강제 한 것
		
	}
	Test6(int i, int j){ //가독성 UP
		this.i = i; // 프로그램이 모호해짐.
		this.j = j;
	}
	public void t() {
		System.out.println(this);
	}
}

class SoCar{
	String color;
	String gearType;
	int door;
	
	SoCar(){
		this.color = "red";
		this.gearType = "auto";
		this.door = 2;
	}
	SoCar(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	void print() {
		System.out.println(this.color + "/"+ this.gearType + "/" + this.door);
	}
}

public class Ex15_this {
	public static void main(String[] args) {
		Test6 t = new Test6();
		
		Test6 t2 = new Test6(100, 500);
		System.out.println(t2);
		t2.t();
		
		SoCar so = new SoCar();
		so.print();
		SoCar so2 = new SoCar("yellow", "auto", 4);
		so2.print();
	}
}

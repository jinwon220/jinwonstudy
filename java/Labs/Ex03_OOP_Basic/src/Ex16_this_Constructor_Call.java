//2. this(생성자를 호출하는 this)
//원칙 : 생성자는 객체 생성시 한개만 호출 가능
//this를 사용하면 (여러개의 생성자 함수)를 호출 할 수 있다.

class Zcar{
	String color;
	String geartype;
	int door;
	
	Zcar(){
		//this.color = "red";
		//this.geartype = "auto";
		//this.door = 4;
		this("red", "auto", 4); // 자기 자신을 다시 부른다(생성자 함수 호출)
		System.out.println("default constructor");// │
	}											  // │
	Zcar(String color, String geartype, int door){//<┘
		this.color = color;
		this.geartype = geartype;
		this.door = door;
		System.out.println("overloading constructor");
	}
	void print() {
		System.out.println(this.color + ", " + this.geartype + ", " + this.door);
	}
}

class Zcar2{
	String color;
	String geartype;
	int door;
	
	Zcar2(){
		this("red", 1);
		System.out.println("dafault constrector");
	}
	Zcar2(String color, int door){
		this(color, "auto", door);
		System.out.println("overloading constructor param 2개");
	}
	Zcar2(String color, String geartype, int door){
		this.color = color;
		this.geartype = geartype;
		this.door = door;
		System.out.println("overloading constructor param 3개");
	}
	void print() {
		System.out.println(this.color + ", " + this.geartype + ", " + this.door);
	}
}

class Test7{
	int i;
	Test7(){}
	Test7(int i){
		this.i = 1;
	}
}

public class Ex16_this_Constructor_Call {
	public static void main(String[] args) {
		//원칙 적인 방법 생성자를 1개씩 호출한다.
		Test7 t = new Test7();
		Test7 t2 = new Test7(100);
		
		/*
		Zcar z = new Zcar();
		z.print();
		
		Zcar z2 = new Zcar("blue", "auto", 10);
		z2.print();
		*/
		/*
		Zcar2 z3 = new Zcar2();
		z3.print();
		
		Zcar2 z4 = new Zcar2("gold", 2);
		z4.print();
		*/
		//이런 건 이런 상황에서 활용하면 좋을 것 같아 -> 문법은 찾으면 되니까
		//자동차 영업 사원 (상품판매) : 옵션값 기본 값..
		Zcar2 z5 = new Zcar2("gole", "auto", 5);
		z5.print();
	}

}

class Parent{
	int x = 100;
	void pmethod() {
		System.out.println("parent method");
	}
}

class Child3 extends Parent{
	int x = 200; //c# 재정의 : 변수 무시하기 >> java 의미없는 코드
	void parent_x() {
		System.out.println(super.x);
	}
	//부모가 가지는 pmethod() 재정의(override)
	@Override
	void pmethod() {
		System.out.println("부모 함수 재정의");
	}
	
	void parent_method() {
		super.pmethod();
	}
}
public class Ex14_inherit_Poly_Override {

	public static void main(String[] args) {
		Child3 ch = new Child3();
		System.out.println(ch.x);
		ch.parent_x();
		ch.pmethod();
		
		//다형성
		Parent pa = ch;
		System.out.println(pa.x); 
		pa.pmethod(); //재정의 (override)
		
		ch.parent_method();
	}

}


class Vtest{
	//int iv = 10000; �ʱ�ȭ
	int iv; //�ʱ�ȭX �ʱⰪ�� ������ �ִ�. why?
	
	void print() {
		System.out.println("instance variable : " + iv);
	}
}

class Apt{
	String color;
	Apt(String color){
		this.color = color;
	}
	void aptPrint() { //Ư���� �Լ� (������ �Լ� (constructor))
		System.out.println("����:" + this.color);
	}
	
}
public class Ex02_variable {

	public static void main(String[] args) {
		Vtest t = new Vtest();
		t.print();
		Vtest t2 = new Vtest();
		t2.iv = 3000;
		t2.print();
		Vtest t3 = new Vtest();
		t3.iv = -1;
		t3.print();
		
		Apt a = new Apt("blue");
		a.aptPrint();
		
		Apt b = new Apt("red");
		b.aptPrint();
	}
}

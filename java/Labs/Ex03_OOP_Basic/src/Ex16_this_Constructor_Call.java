//2. this(�����ڸ� ȣ���ϴ� this)
//��Ģ : �����ڴ� ��ü ������ �Ѱ��� ȣ�� ����
//this�� ����ϸ� (�������� ������ �Լ�)�� ȣ�� �� �� �ִ�.

class Zcar{
	String color;
	String geartype;
	int door;
	
	Zcar(){
		//this.color = "red";
		//this.geartype = "auto";
		//this.door = 4;
		this("red", "auto", 4); // �ڱ� �ڽ��� �ٽ� �θ���(������ �Լ� ȣ��)
		System.out.println("default constructor");// ��
	}											  // ��
	Zcar(String color, String geartype, int door){//<��
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
		System.out.println("overloading constructor param 2��");
	}
	Zcar2(String color, String geartype, int door){
		this.color = color;
		this.geartype = geartype;
		this.door = door;
		System.out.println("overloading constructor param 3��");
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
		//��Ģ ���� ��� �����ڸ� 1���� ȣ���Ѵ�.
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
		//�̷� �� �̷� ��Ȳ���� Ȱ���ϸ� ���� �� ���� -> ������ ã���� �Ǵϱ�
		//�ڵ��� ���� ��� (��ǰ�Ǹ�) : �ɼǰ� �⺻ ��..
		Zcar2 z5 = new Zcar2("gole", "auto", 5);
		z5.print();
	}

}
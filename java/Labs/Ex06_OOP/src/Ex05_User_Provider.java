//User(�����) : Provider(������)

//class A{} , class B{}
//A�� B�� ����մϴ�.

//1. ��� : A extends B
//2. ���� : member field���·� : AŬ���� �ȿ� B��� Ŭ������ ������ �� (member field) class A{B b;} -> ���� 
//3. ���� : �Լ� (method parameter) : �������� -> class A{void print(B b){}}

interface Icall{
	void m();
}

class D implements Icall{
	@Override
	public void m() {
		System.out.println("D Icall �������̽��� m() ����");
	}	
}

class F implements Icall{
	@Override
	public void m() {
		System.out.println("F Icall �������̽��� m() ����");
	}	
}

// �������� ���α׷� ��� : interface
class C {
	void method(Icall ic) { //�������̽� Ÿ������ parameter : ���� (�������� : �����Ѱ�)
		ic.m();
	}
}
public class Ex05_User_Provider {
	public static void main(String[] args) {
		C c = new C();
		c.method(new D());
		c.method(new F());
	}
}

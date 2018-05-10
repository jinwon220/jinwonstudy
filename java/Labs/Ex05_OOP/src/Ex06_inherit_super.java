//�ϳ��� Ŭ����������
// this : ��ü �ڽ��� ����Ű�� this (this.name, this.age)
// this : �����ڸ� ȣ���ϴ� this (this("ȫ�浿" , 100))

//��Ӱ��迡��
//super(�θ��� �ּ�) : ��Ӱ��迡�� [�θ�]�ڿ��� ����
// this�� ��Ȱ�� ����
//1. super : ��Ӱ��迡�� �θ� �ڿ��� ����
//2. super : ��Ӱ��迡�� �θ��ڿ��� ������ ��������� ȣ��

//Tip : base()

class Base{
	String basename;
	Base(){
		System.out.println("Base Ŭ������ �⺻ ������");
	}
	Base(String basename){
		this.basename = basename;
		System.out.println("super ���ؼ� ȣ�� �� ������ : " + this.basename);
	}
	void BaseMethod() {
		System.out.println("BaseMethod()");
	}
}

class Derived extends Base{
	String dname;
	
	Derived() {
		System.out.println("Derived Ŭ������ �⺻ ������");
	}
	Derived(String dname){
		//super ���
		super(dname);
		
		this.dname = dname;
		System.out.println("dname : " + this.dname);
	}
	void derivedMethod() {
		System.out.println("derivedMethod()");
	}
	
	//�θ� ������ baseMethod() ������
	@Override
	void BaseMethod() {
		System.out.println("�θ� �Լ� ������ �Ͽ����^^");
	}
	
	//�θ� �ڿ��� �׸����� (������ �� �ڿ�)
	void p_method() {
		//super �θ� ��ü�� �ּ�
		super.BaseMethod(); //�θ��Լ� ȣ��
	}
}

public class Ex06_inherit_super {
	public static void main(String[] args) {
		/*
		Derived d = new Derived();
		d.BaseMethod();
		d.derivedMethod();
		d.p_method();
		*/
		Derived d2 = new Derived("ȫ�浿");
		//parameter ó�� �ϸ� �θ��ʿ��� ���� ó���ϰ� �;��
	}
}
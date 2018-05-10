//1. �ϳ��� �ڹ������� �������� Ŭ������ ���� �� �ִ�. (��, public �����ڴ� �Ѱ��� Ŭ������)
// �������� Ŭ������ ���� ���� ������ �� ��� ��������
// ��� �κ� : ������ ��
// ������ (������ : ���������� ���������� default ������)

//public Variable{} (x)


//cv��� ������ new�����ڸ� ��ü�� �޼ҵ忡 �ö� �������� ����

class Variable{
	int iv;
	/*
	1. mamber field, instance variable
	2. ���� : ������ ���� ���� �Ѵ�(����������, ���µ�����, ����������) >> �����Ǵ� ��ü���� �ٸ� ���� ���� ���ؼ�
	3. Ư¡ : �ʱⰪ�� ������ �ִ�. {������ Type�� �����ϴ� : int => 0, float => 0.0, boolean => false ...
											String �Ǵ� ����Ÿ���� �⺻���� : NULL
	4. ��������(memory�� ���� ����) : new ��� �����ڸ� ���ؼ� heap��ü�� ����� ���� ����
	
	*/
	static int cv;
	/*
	1. class variable, static variable(�����ڿ�)
	2. ���� : ������ ���� ���� �Ѵ�(�����Ǵ� ��� ��ü�� �����ϴ� �ڿ����μ�) : ��ü�� �����ڿ�
	3. Ư¡ : ���ٹ��  >> Ŭ�����̸�.static�ڿ�(��ü�� ��������� ���� ���¿��� ������ �����ϴ�) :  ex) Math.random()  
					�Ǵ� ��������.static�ڿ� (variable v = new variable() ... v.cv)
	4. �������� : ���α׷� ����(class loader �� ���ؼ�) Ŭ���� ������ �о class area(method area(static area))�� �ø��� ����
		�̶�, Ŭ���� static �ڿ��� ������ �ִٸ�  static �ڿ��� ���� memory�� �ø���
		>> static ��ü���� ������ memory �� �ö󰡴� �ڿ�
	*/
	void method() {
		int lv = 0;
		// local variable (��������)
		// Ư¡ : ���������� ����ϱ� �� �ݵ�� �ʱ�ȭ
		// �������� : �Լ��� ȣ��Ǹ� ��������� �Լ��� ������ �Ҹ� (stack) ������ �ö󰡴� �ڿ�
	}
}


public class Ex04_Variable_Scope {

	public static void main(String[] args) {
		Variable.cv = 100;
		Variable v = new Variable();
		v.cv = 500;
		/*
		System.out.println(Variable.cv);
		
		Variable v2 = new Variable();
		System.out.println(v2.cv);
		
		Variable v3 = new Variable();
		v3.cv = 500;
		System.out.println(v3.cv);
		
		Variable v4 = new Variable();
		System.out.println(v4.cv);
		*/
	}
}

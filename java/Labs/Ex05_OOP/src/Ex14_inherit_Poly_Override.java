class Parent{
	int x = 100;
	void pmethod() {
		System.out.println("parent method");
	}
}

class Child3 extends Parent{
	int x = 200; //c# ������ : ���� �����ϱ� >> java �ǹ̾��� �ڵ�
	void parent_x() {
		System.out.println(super.x);
	}
	//�θ� ������ pmethod() ������(override)
	@Override
	void pmethod() {
		System.out.println("�θ� �Լ� ������");
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
		
		//������
		Parent pa = ch;
		System.out.println(pa.x); 
		pa.pmethod(); //������ (override)
		
		ch.parent_method();
	}

}

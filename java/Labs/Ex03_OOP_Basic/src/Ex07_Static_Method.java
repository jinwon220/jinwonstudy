//static method

class StaticClass{
	//instance variable
	int iv;
	//class varicable
	static int cv;
	
	//�Ϲ��Լ�
	void m() {
		//�Ϲ��Լ����� iv ���� ó�� : ����
		//�Ϲ��Լ����� cv ���� ó�� : HINT(��������) >> static �ڿ��� �Ϲ��ڿ����� ���� memory�� �ö󰣴�.
		iv = 500;
		cv = 1000; //���� 
		//���� Ŭ���� �������� Ŭ���� �̸��� �����ϱ⵵ �Ѵ�.
		StaticClass.cv = 1000;//���� 
		//(Ŭ�����̸�.static�ڿ���) 
		
		//StaticClass.sm(); ����
		//�Ϲ��Լ��� ��� static �ڿ� ��� �����ϴ�.
	}
	
	//static �Լ�
	static void sm() {
		//�Ϲ��ڿ� iv �ڿ� ���(x) �Ұ�!!!
		//why? Ŭ������ �ִ� �Ϲ��ڿ����� static�Լ��� ���� �޸𸮿� �ö󰡱� �����̴�.
		//StaticClass.sm(); �ڵ忡�� iv�� ����ҷ��� �ϸ� ������ �����..(iv�� �޸𸮿� ����)
		
		//�Ϲ��Լ��� ����� �� ���� ���?
		//�Ұ�. ������ ����.
		
		//static �������� ��ƶ� �׷��� error�� ���� ���̴�.^^
		System.out.println("static ���� : "+cv);
	}
}

public class Ex07_Static_Method {

	public static void main(String[] args) {
		//StaticClass.cv = 5555;
		//StaticClass.sm();
		//������� �ڵ忡��... �Ϲ��Լ� void m() ����� �� ����.
		StaticClass sc = new  StaticClass();
		//StaticClass �м� Ŭ���� ���� + static ���� >> class, method, static area
		//��ü�������� static �׻� �տ� �ִ�.
		
		sc.iv = 2222;
		
		System.out.println("main �Լ�");
		
	}

}

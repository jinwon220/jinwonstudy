//Ŭ������ ���赵�̴�, Ŭ������ Ÿ���̴�
//Ŭ���� == ���赵 == Ÿ��
//Ŭ������ �޸� (Heap) new �����ڸ� ���� �÷��ݴϴ� (���� ���赵�� ���� �Ȱ��� ����Ʈ�� �Ǽ��Ѵ�)

//���赵 �ۼ� (class �ۼ�)
class Apt2{
	int door = 10;
	int window = 100;
}

public class Ex04_Ref_Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apt2 lgapt = new Apt2();
		//Apt Ÿ��(class type)
		//lgapt ���� (�ּҸ� ������ ���� : ��������=��ü����)
		System.out.println("lgapt ���� � ���� (������ �ּҰ�): " + lgapt); 
		
		Apt2 ssapt = lgapt; //���� Ÿ�Կ��� �Ҵ��� : �ּҰ� �Ҵ�)
		ssapt.window = 1000;
		System.out.println("lgapt.window : " + lgapt.window);
		//**���� Ÿ���� �Ҵ��� �ּҰ� �Ҵ��̴�.
	}
}

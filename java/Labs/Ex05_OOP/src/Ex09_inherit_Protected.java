import kr.or.bit.Bird;

//protected ������ ��Ӱ��迡�� ���
//������ :��Ӱ��迡 ������...
//����� �����Ǹ� �� �־����� ���ھ�(�ǵ�..)

//��Ӱ����� �����Ǹ� [����]�ϴ� ���(Protected)

//���� : ���� �� �� �ִ�, ���� ������
class Ostrich extends Bird{
	void run() {
		System.out.println("�޸��� ^^");
	}
	
	@Override
	protected void movefast() {
		run();
	}
}

class bi extends Bird{
	@Override
	protected void movefast() {
		super.movefast();
	}
}

public class Ex09_inherit_Protected {
	public static void main(String[] args) {
		Ostrich o = new Ostrich();
		o.run();
		o.movefast();
		
		bi b = new bi();
		b.movefast();
	}
}

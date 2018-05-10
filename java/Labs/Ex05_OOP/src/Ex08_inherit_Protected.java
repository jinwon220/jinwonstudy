import kr.or.bit.Pclass;

//������ (������) : private, default, protected, public
//��Ӱ��迡�� �����ϴ� protected
//��鼺 : default ��Ȱ, public ��Ȱ(��� ��)...

//���� : ����� ���� Ŭ���� �ȿ�  protected �����ڴ� default�� ���ƿ�
//why) ����� ���� ��Ȳ������ protected ������ �ǹ̰� ����(default�����ڿ� ����)

class Dclass{
	private int i;
	public int j;
	protected int k; //default ��Ȱ
	int p; //default
}

//��Ӱ��迡�� Protected
class Child2 extends Pclass{
	void method() {
		this.k = 1000; // ��Ӱ��迡���� public ó�� ó��
		//this.p =11; default�� (x)
		System.out.println(this.k);
	}
}
public class Ex08_inherit_Protected {
	public static void main(String[] args) {
		Dclass d = new Dclass();
		//d.j ok
		//d.k ok default ��Ȱ(���� ���� �������� default ó�����) �����
		//d.p ok (default������)
		
		Pclass p = new Pclass();
		//p.j ok public
		//p.i no private(x)
		//p.p no ���� ����x(x) 
		//p.k no ���� ������ �ƴϴϱ�(x)
		
		Child2 c2 = new Child2();
		c2.method();
	}

}

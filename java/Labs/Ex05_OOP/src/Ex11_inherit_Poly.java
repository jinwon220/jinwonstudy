//�ڹٿ��� �������� ��Ӱ��迡��...

class Pbase{
	int p = 100;
}

class Cbase extends Pbase{ //�����θ�
	int c = 200;
}

class Dbase extends Pbase{ //�����θ�
	
}

public class Ex11_inherit_Poly {
	public static void main(String[] args) {
		Cbase c = new Cbase();
		System.out.println(c.toString());
		//������ : �θ�Ÿ���� ���������� �ڽ�Ÿ���� �ּҰ��� ���� �� �ִ�(��Ӱ��迡��)
		//�� �׷����� �޸𸮿� ��� �ڿ��� �����ϴ� ���� �ƴ϶� �θ�Ÿ���� �ڿ��� ���� �����ϴ�.
		Pbase p = c;
		System.out.println("p �θ�Ÿ�� ���� : " + p);
		System.out.println("p ����� c Ÿ�� ���� : " + c);
		
		System.out.println(c.p + " / " + c.c);
		System.out.println("�ڽ��� �͸� �� �� �ִ�. " + p.p);
		
		Dbase d = new Dbase();
		p = d; //�ϳ��� �������� p �� c�� �ּҰ���, d�� �ּҰ��� ���� �� �ִ�    (��Ӱ���(�θ�))
		
		Dbase dd = (Dbase)p; //  �θ�� ���� Ÿ��(casting)
		//�θ�Ÿ���� ���� �ڽ�Ÿ�Կ��� ���� �Ҷ� -> �ڽ�Ÿ������ ĳ����
	}
}
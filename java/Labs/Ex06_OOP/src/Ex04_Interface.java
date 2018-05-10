/*
�������̽�(interface)
������ �ǹ�
1. ���, ǥ��, �԰� ���� ����� ����
ex) ����, �Ź�(������)... 
ex) ISO ǥ���� ��Ű�� ȸ����...

---------------------------------
����Ʈ���� ����
>> �������̽��� �ֻ��� �ܰ�
>> ���� ǥ��, ����� �����ϴ� ����

Interface
1.���� �����ΰ� ���� : ������� ���� : �̵��� ���õ� ��� >> void move(int x, int y); >> �߻� �޼���
2.ǥ��ȭ �� ���踦 ���� (�Ϻ��� ������)
3.���뼳��

JAVA API (�����ڰ� �ʿ��� �������̽��� ������ �ִ� : �������̽� ������� Ŭ������ ����)
>Collection Ŭ������ (�����迭)
>���� �������̽����� ������ ��Ƽ� ��� (���뼺)

4.���� ���
���(final) : public static final int NUM = 10;
         ==>[public static final] ���� (�⺻������ �ִ�)
         ==>int NUM = 10;
�Լ�(method): public abstract void run();
         ==>[public abstract] ���� (�⺻������ �ִ�)
         ==>void run();
�Լ�(method): String move(int x, int y);
�������̽� ������ ���� �߻�޼��常 ������..

5.�������̽��� ��ü ������ �Ұ�(����� ������ ������ �߻��Լ�...)
6.������ ���ؼ��� ��밡�� (class Test implements Ia )
7.�������̽� ���� ��� ���(class Test implements Ia, Ib, Ic, Id)
8.�������̽����� ����� ���� (Ia extends Ib : ����� Ȯ�尡��) 
9.�������̽��� �ϳ��� Ÿ��(������) ���� (**POINT**)
*/
interface Ia{
	//��� (�ý��� �ڿ� ��)
	public static final int AGE=100;
	//int AGE = 100;
	//[public static final] ���� ���� (default)
	//�������̽� �ȿ� �ִ� ����� [public �̸鼭] [static �̸鼭] [final ��] ����̴�.
	String GENDER = "��";
	//��Ģ : public static final String GENDER = "��";
	
	public abstract String print();
	//[public abstract] ��������
	//�������̽� �ȿ� �ִ� �߻����� �Լ��� [public �̸鼭] [abstract ��] �Լ��̴�.
	String message(String str);
	//��Ģ : public abstract String message(String str);
}

interface Ib{
	int AGE = 10;
	void info();
	String val(String s);
}


class Test extends Object implements Ia, Ib{

	@Override
	public String print() {
		return null;
	}

	@Override
	public String message(String str) {
		return null;
	}

	@Override
	public void info() {
		
	}

	@Override
	public String val(String s) {
		return null;
	}
	
}
public class Ex04_Interface {
	public static void main(String[] args) {
		Test t = new Test();
		
	}
}

package kr.or.bit;
/*
������(modifier)
public (���� : ����(package) ���о��� ��� �ڿ��� ����)
private (���� : Ŭ���� ���ο��� �����ڿ� , ���������� �� �� ����(���Ұ�)>> ��ü���忡�� ���� �Ұ�

��ü������ Ư¡(ĸ��ȭ,����ȭ)
1.Ŭ���� ���� �ڿ��� ���� >> member field (instance variable) private int age;
1_1. private �ǹ� : �����Ҵ��� ���� �����Ҵ��� ���ؼ� �ڿ� ��ȣ
1_2. �������� �ǵ� (���ϴ� ���� ó��) > private int age   > 1 ~ 200���� ������ �ְڴ�. > ������ �Լ� ����
1_3. private ������ ������ ���(���� ���� write �Լ�, ���� ���� read �Լ�)
	ĸ��ȭ�� member field ���� ���� write, read ����� ���� �Լ��� setter �Լ�(write), getter �Լ�(read) �̸��ο�
	
private int age = 100;
-setter (0) �Լ�
-getter (0) �Լ�
-setter , getter (0) �Լ�

2.Ŭ���� ���� �ڿ��� ���� >> method    private void call(){}
2_1. �Լ��� private ���� �ϴ� ���� : Ŭ���� ���ο��� �ٸ� �Լ��� �����ִ� ��Ȱ�� �ϴ� �Լ����....

*/
public class Car {
	private int window;
	private int speed;
	
	//window ������ setter �Լ�, getter �Լ��� ���ؼ� write, read ���	
	public void setWindow(int data) {
		window = data;
	}
	public int getWindow() {
		return window;
	}
	
	//�ڵ����� ������ getter �Լ�
	public int getSpeed() {
		return speed;
	}
	//�ڵ����� ������ setter �Լ�
	public void setSpeed(int speed) {
		//�����Ҵ��� ����
		if(speed < 0) this.speed = 0;
		else this.speed = speed;
	}
	
	//�߰� �Լ� ���� ����
	public void speedUp() {
		this.speed+=5;
	}
	public void speddDown() {
		if(this.speed >= 5) this.speed-=5;
		else this.speed = 0;
	}
}



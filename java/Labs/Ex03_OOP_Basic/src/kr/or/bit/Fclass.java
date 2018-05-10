package kr.or.bit;
/*
 �Լ� : ����� �ּҴ��� (method)
 �Լ��� ����
 
*void ����ϸ� (�����ִ� ���� ����) : return value(��)�� ����.
*return type : [8���� �⺻ Ÿ��] + String + ����(���������) + �迭 + Collection + Interface
 - return type �� ������ �ݵ�� �����ȿ��� return Ű���� ���
 
 1. void , parameter(0) : void print(String str) { �����ڵ� }
 2. void , parameter(x) : void print() { �����ڵ� }
 3. return Type , parameter(0) : int print(int data) { return 100+data; }
 4. return Type , parameter(x) : int print() { return 200; }
 
 �Լ��� �ݵ�� ȣ��(Call) �Ǿ�߸� ����ȴ� : ������ ���� �̸��� �ҷ��־�� �Ѵ�...
 
*/

public class Fclass {
	public void m() { // �Լ��� �̸��� �ǹ��ִ� �ܾ��� ����	void getChannelNumber()
		System.out.println("�Ϲ��Լ� : void , param(x)");
	}
	
	public void m2(int i) {
		System.out.println("param  value : " + i);
		System.out.println("�Ϲ��Լ� : void , param(0)");
	}
	
	public int m3() { // return type �� ������ �ݵ�� return Ű���� ���
		return 123;
	}
	
	public int m4(int data) {
		return data+1;
	}
	
	//������(������) private
	//� �ǹ��� �ڵ� : class ���ο��� ��� (�ٸ� �Լ��� �����ִ� ��Ȱ)
	//�ٸ� �������� �Լ��� ������ �������� ������ �� ���� �Լ��� ��Ƽ� ����� �����ϸ� ��������(���� ó��)�� ���ϴ�
	private int operationMethod(int data ) {
		return data * 100;
	}
	
	public int sum(int data) {
		return operationMethod(data);
	}
	
	public int sum2(int data) {
		return operationMethod(data);
	}
	
	//Ȯ���Լ� (parameter �� �ø� �� �ִ�)
	public int sum3(int i, int j) {
		return i+j;
	}
	
	//Quiz
	//a �� b ���߿� ū���� return �ϴ� �Լ��� ���弼��
	//ex) max(500, 200) �̸� return �Ǵ� ���� 500^^
	//public int max(int a, int b){}
	
	//return�� �ǵ��� �ѹ��� ����ϱ�(return �ݺ����� ����� ���� �ʴ�)
	public int max(int a, int b) {
		return (a >= b)?a:b;
	}
	
	public String concat(String s, String s2, String s3) {
		//String result =
		//return result;
		return s + "/" + s2 + "/" + s3;
	}
	
	//Ŭ������ Ÿ���̴�
	//public int call(){return 100;}
	//(Tv : Ŭ����)
	//1.public Tv call(){return Tv;(x)} 
	//2.public Tv call(){Tv t = new Tv(); return t;} (0)
	//3.public Tv call(){return new Tv();}(0)
	// ***2���� 3���� ���� ���̴� !!!!*** (�ſ� �߿�)
	
	public Tv objmethod() {
		Tv t = new Tv();
		t.brand_name = "LG";
		t.channel_up();
		return t;
	}
	
	public Tv objmethod2() {
		return new Tv();
		//�ּҰ� ����
	}
	
	
	public void objMethod3(Tv t) { //Tv Ÿ���� ���� ��ü�� �ּҸ� �ѱ�� �� �ȿ� ������ ����ϴ� �Լ�
		System.out.println("���� ���");
		System.out.println("ä�� ���� : " + t.channel);
		System.out.println("�귣�� �̸� : " + t.brand_name);
	}
}

package kr.or.bit.commons;

public class CommonClassPublic {
	public int a;
	int b; // default �� �����Ǿ� �ִ�.
	
	private int c; 	//Ŭ���� ���ο��� ��� (�ٸ� ��ü�� ��� �� �� ����.)
					//��ü���� ��� (������ ��ȣ)
					//�����Ҵ��� ���� ���� �Ҵ��� ���ؼ� ������ ��ȣ
					//���̳ʽ� ������ ������ �ȵ�
	
	//ĸ��ȭ �����Ҵ��� ���� �����Ҵ��� ����ϰ� �ϴ°�.
	public void write(int value) {
		if(value < 0) {
			c = 0;
		} else {
			c = value;
		}
	}
	
	public int read() {
		return c;
	}
}

package kr.or.bit;

/*
 �츮 ȸ��� ����⸦ �ֹ� ���� �Ǹ��ϴ� ȸ���Դϴ�.
 �츮 ȸ��� ����⸦ �����ϴ� ���赵�� �ۼ��Ϸ��� �մϴ�.
 
 �䱸����
 1.����⸦ �����ϰ� ������� �̸��� ��ȣ�� �ο��ؾ��մϴ�.
 2.����Ⱑ ����Ǹ� ������� �̸��� ��ȣ�� �°� �ο� �Ǿ����� Ȯ�� �ϴ� �۾��� �ʿ��մϴ�. (������� Ȯ��)
 3.�������� ������� ������� ����⿡ �Ѵ��(����)�� Ȯ�� �� �� �ֽ��ϴ�.
 
 ��, ���ñ��� ��� �ڵ�θ� �ۼ��Ͻÿ�
*/

// �Ʒ��� �ۼ��� �ڵ�� �����Ǿ�� �Ѵ�. > [������]�� ��� �� �����ϱ�
/*public class AirPlane {
	private int number; //��ȣ
	private String air_name; //�̸�
	
	private static int count; //������
	
	public void make(int num, String name) {
		this.number = num;
		this.air_name = name;
		this.count++;
		System.out.printf("��ȣ : %d, �̸� : %s \n", number, air_name);
	}
	public void make_count() {
		System.out.printf("�Ѵ��(����): %d�� \n",count);
	}
}*/
public class AirPlane {
	private int number; //��ȣ
	private String air_name; //�̸�
	
	private static int count; //������
	
	//public AirPlane(){} �������� ���� �ſ��� why) �������� �ʱ�ȭ int number, String air_name
	public AirPlane(int number, String air_name) {
		this.number = number;
		this.air_name = air_name;
		count++;
	}
	public void airPlaneInfo() {
		System.out.printf("��ȣ : %d, �̸� : %s \n", number, air_name);
	}
	public void make_count() {
		System.out.printf("�Ѵ��(����): %d�� \n",count);
	}
}

import kr.or.bit.Person;
import kr.or.bit.Tv;

public class Ex01_Ref_Type {

	public static void main(String[] args) {
		//���赵�� ������� Person Ÿ���� ���� ��ü�� ����(heap)
		//new ������
		
		Person person; //���� (stack 4byte ���� ��(null)
		person = new Person(); //heap �޸𸮿� Person ��ü ��������� �� �ּҰ��� person ������ �Ҵ�
		
		person.name = "ȫ�浿";
		person.age = 100;
		
		person.print();
		
		Person  my = new Person(); //����� �޸� �Ҵ��� ���ÿ�
		my.name = "���̸���";
		my.age = 10;
		my.print();
		
		int num=100;//main [�Լ�]�ȿ� ����� ���� local variable(�ݵ�� �ʱ�ȭ)
		
		Person you; //you����
		//System.out.println(you);
		//����Ÿ���� �ʱ�ȭ
		
		//1. �ʱ�ȭ(new ������)
		//you = new Person(); //����Ÿ�� �ʱ�ȭ (�ʱ�ȭ > ������ ó�� ���� ���� ��)
		
		//2. ���� ������ ������ �ּҰ� �Ҵ�
		you = my; //�ּҰ� �Ҵ�(�ʱ�ȭ) ó�� ���� ���� ����
		System.out.println(you);
		
		//you ���������� my ���������� �ּҰ��� ������ ����
		System.out.println(you == my);//== �� ��
		
		Tv t = new Tv();
		System.out.println("�⺻ ä�� : " + t.channel);
		t.brand_name = "�Ｚ";
		System.out.println("�귣��� : " + t.brand_name);
		
		t.channel_up();
		t.channel_up();
		t.channel_up();
		System.out.println("����� ä�� : " + t.channel);
		t.channel_down();
		System.out.println("����� ä�� : " + t.channel);
	}
}

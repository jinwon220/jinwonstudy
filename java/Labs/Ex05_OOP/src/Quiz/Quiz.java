package Quiz;
/*
�ó�����(�䱸����)
����� ������ǰ ���� �ַ���� �����ϴ� ������Դϴ�
A��� ������ǰ ������ ���µǸ� 
[Ŭ���̾�Ʈ �䱸����]
������ǰ��  ��ǰ�� ���� , ��ǰ�� ����Ʈ ������ ���������� ������ �ֽ��ϴ�
������ ������ǰ�� ��ǰ�� ������ �̸��� ������ �ִ�
ex)
������ ������ǰ�� �̸��� ������ �ִ�(ex: Tv , Audio , Computer)
������ ������ǰ�� �ٸ� ������ ������ �ִ�(Tv:5000, Audio:6000 ....)
��ǰ�� ����Ʈ�� ������ 10% �����Ѵ�
 
�ùķ��̼� �ó�����
������ : ��ǰ�� �����ϱ� ���� �ݾ����� , ����Ʈ ������ ������ �ִ� 
���� ��� : 10����  , ����Ʈ 0
�����ڴ� ��ǰ�� ������ �� �ִ� , ���������� �ϰԵǸ� ������ �ִ� ����  �����ϰ� ����Ʈ�� �ö󰣴�
�����ڴ� ó�� �ʱ� �ݾ��� ���� �� �ִ�
*/
class Person{ //������
	int money;//��ǰ�� �����ϱ� ���� �ݾ�����
	int point;//����Ʈ ������ ������ �ִ�
	
	Person(){
		this(10000, 0);
	}
	Person(int money, int point){
		this.money = money;
		this.point = point;
	}
	
	void buy(Product p) { //��ǰ�� ���� �� �� �ִ�.
		System.out.println("������ �ִ� �ܾ� : " + this.money);
		if(this.money < p.price) {
			System.out.println("�ܾ��� �����մϴ� :D");
			return;
		}
		System.out.println("���Ž� �����Ǵ� ����Ʈ : " + p.point);
		this.money -= p.price; //���������� �ϰԵǸ� ������ �ִ� ����  �����ϰ�
		this.point += p.point; //����Ʈ�� �ö󰣴�
		
		System.out.println("������ ��ǰ : " + p.toString());
		System.out.println("���� �ܾ� : " + this.money);
		System.out.println("���� ������ ����Ʈ : " + this.point);
		System.out.println("-------------------------");
	}
}

class Computer extends Product{
	Computer(){
		super(7000);
	}

	@Override
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product{
	Audio(){
		super(6000);
	}

	@Override
	public String toString() {
		return "audio";
	}
}

class Tv extends Product{
	Tv(){
		super(5000); //tv�� ����
	}

	@Override
	public String toString() {
		return "tv";
	}
}

class Product{
	int price; //������ ������ �ִ�
	int point; //����Ʈ�� ������ 10%
	
	private Product() {} // ������ ������ ������ �Ѵ�.
	
	Product(int price){
		this.price = price; //����
		this.point = price / 10; //������ 10%
	}
}
public class Quiz {
	public static void main(String[] args) {
		Tv tv = new Tv();
		Audio audio = new Audio();
		Computer com = new Computer();
		Person p = new Person();
		
		p.buy(com);
		p.buy(audio);
	}

}

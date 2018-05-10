/*
�䱸����
īƮ (Cart)
īƮ���� ���忡 �ִ� ��� ������ǰ�� ���� �� �ִ� 
īƮ�� ũ��� �����Ǿ� �ִ� (10��) : 1��  , 2�� ���� �� �ְ� �ִ� 10������ ���� �� �ִ�
���� ������ ���� �ϸ� ... īƮ�� ��´�

���뿡 ���� ��ü ���
������� �ʿ�
summary() ��� �߰��� �ּ���
����� ������ �����̸� �� �������� ����
�� �����ݾ� ��� ���

hint) īƮ ������ ��� ���� (Buy())
hint) summary()  main �Լ����� ����Ҷ�

�����ڴ� default �ݾ��� ������ �ְ� �ʱ�ݾ��� ������ �� �� �ִ�
 */
class Cart{ //ī��
	String[] cart_size;
	int[] arr_price;
	Cart(){
		this.cart_size = new String[10]; //ũ��
		this.arr_price = new int[10]; //ũ��
	}
	int i = 0; //īƮ�� �ʱ�迭
	void Buy(Product2 n) { //�Լ��� ��ǰ��ü�� parameter��
		//īƮ�� ���� ���
		if(i >= 10) {
			System.out.println("īƮ�� ������ �� á���ϴ�.");
			return; // ���Ǵ�� ����
		}
		cart_size[i] = n.toString(); //�迭�� ���� ���
		arr_price[i] = n.price;
		System.out.printf("[%d]��° ���� ������ : %s \n", i, cart_size[i]);
		i++; //�ٽ� ���� �� �� i+1��°�� ������Ͽ� 
	}
}

class Buyer2{ //������
	int money;
	Buyer2(){
		this(1000);
	}
	Buyer2(int money){ //�ʱ��ܾ� ����
		this.money = money;
	}
	
	void summary(Cart c) { //īƮ�� ���� ��ǰ �հ�
		int sum=0;
		
		for(int i = 0; true; i++) {
			if(c.cart_size[i] == null) {
				break;
			}
			sum += c.arr_price[i];
		}
		System.out.println("������ �ִ� �� : " + money);
		System.out.println("������ �հ� : " + sum);
		if(money < sum) {
			System.out.println("�ܾ��� �����մϴ�.");
			return;
		}
		money = money - sum;
		
		System.out.println("�����ܾ� : " + money);
	}
}

class Product2 { // ������ǰ
	int price;  // ����

	Product2(int price) {
		this.price = price;
	}
}

class KtTv2 extends Product2 {
	KtTv2() {
		super(500);
	}

	@Override
	public String toString() {
		return "KtTv";
	}
}

class Audio2 extends Product2 {
	Audio2() {
		super(100);
	}

	@Override
	public String toString() {
		return "Audio";
	}
}

class Notebook2 extends Product2 {
	Notebook2() {
		super(150);
	}

	@Override
	public String toString() {
		return "Notebook";
	}
}
public class Ex13_inherit_KeyPoint_Override_Array {
	public static void main(String[] args) {
		KtTv2 kttv = new KtTv2();
		Audio2 audio = new Audio2();
		Notebook2 notebook = new Notebook2();
		
		Cart c = new Cart();
		c.Buy(audio);
		c.Buy(kttv);
		
		Buyer2 buy = new Buyer2(610);
		buy.summary(c);
	}

}

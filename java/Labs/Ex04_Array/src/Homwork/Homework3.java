package Homwork;

import java.util.Scanner;

/*class Vending_Machine extends Drink{
	Scanner sc = new Scanner(System.in);
	private static int money; //���� ��
	
	public void start() {
		String drink;
		int money = 0;
		int i = menu(); //�޴���� & ����� ���� �Ҵ�
		switch(i) {
			case 1:
				drink = "�ݶ�";
				print_Drink(drink);
				money = minus_Money(get_DrinkPrice(drink));
				b+reak;
			case 2:
				drink = "���̴�";
				print_Drink(drink);
				money = minus_Money(get_DrinkPrice(drink));
				break;
			case 3:
				drink = "����";
				print_Drink(drink);
				money = minus_Money(get_DrinkPrice(drink));
				break;
			case 4:
				System.out.print("���� �Է��� �ּ���(1000/500/100)");
				money = money_Choice();
				money = plus_Money(money);
				System.out.println("\n �� ���� �ݾ� : " + money);
			case 5:
				System.out.println(money + "�� ��ȯ �Ǿ����ϴ�.");
				money = back_Money();
				System.out.println("\n �� ���� �ݾ� : " + money);
				break;
		}
	}
	public int money_Choice() { //���� �Ӵ�
		while(money != (1000|500|100)) {
			money = Integer.parseInt(sc.nextLine());
			System.out.println("������ �߸� �Է��ϼ̽��ϴ�.");
		}
		return money;
	}
	
	public int menu() { //�޴� ���
		System.out.println("********");
		System.out.println("1. �ݶ�");
		System.out.println("2. ���̴�");
		System.out.println("3. ����");
		System.out.println("4. �� �ֱ�");
		System.out.println("5. �� ��ȯ");
		System.out.println("********");
		int i = Integer.parseInt(sc.nextLine());
		return i;
	}
	
	public int plus_Money(int money) { //�� �Է�
		this.money += money; 
		return this.money;
	}
	public int minus_Money(int price) { //��� ���� ��
		this.money -= price;
		return this.money;
	}
	public int back_Money() { //�� ��ȯ
		int temp_money = money;
		money = 0;
		return temp_money;
	}
}*/

class Vending_Machine {
	Drink d = new Drink();
	Scanner sc = new Scanner(System.in);
	private static int money = 0; // ���� ��

	public void start() {
		String drink;
		out : while (true) {
			int i = menu(); // �޴���� & ����� ���� �Ҵ�
			switch (i) {
			case 1:
				drink = "�ݶ�";
				d.print_Drink(drink);
				money = (money >= d.get_DrinkPrice(drink))?minus_Money(d.get_DrinkPrice(drink)):money;
				System.out.println(drink + " ���Խ��ϴ�.");
				break;
			case 2:
				drink = "���̴�";
				d.print_Drink(drink);
				money = minus_Money(d.get_DrinkPrice(drink));
				System.out.println(drink + " ���Խ��ϴ�.");
				break;
			case 3:
				drink = "����";
				d.print_Drink(drink);
				money = minus_Money(d.get_DrinkPrice(drink));
				System.out.println(drink + " ���Խ��ϴ�.");
				break;
			case 4:
				System.out.print("���� �Է��� �ּ���(1000/500/100)");
				int temp_money = money_Choice();
				plus_Money(temp_money);
				System.out.println("\n �� ���� �ݾ� : " + money);
				break;
			case 5:
				System.out.println(money + "�� ��ȯ �Ǿ����ϴ�.");
				money = back_Money();
				System.out.println("\n �� ���� �ݾ� : " + money);
				break out;
			}
		}
	}

	public int money_Choice() { // ���� �Ӵ�
		int temp_money;
		while (true){
			temp_money = 0;
			temp_money = Integer.parseInt(sc.nextLine());
			//if(temp_money != (1000|500|100)){  -> �̰Ŵ� �� �ȵǳ�??
			if(temp_money == 1000||temp_money == 500||temp_money == 100) {
				System.out.println(temp_money+"���� �߰� �Ǿ����ϴ�.");
				break;
			} else System.out.println("������ �߸� �Է��ϼ̽��ϴ�.");
		}
		return temp_money;
	}

	public int menu() { // �޴� ���
		System.out.println("********");
		System.out.println("1. �ݶ�");
		System.out.println("2. ���̴�");
		System.out.println("3. ����");
		System.out.println("4. �� �ֱ�");
		System.out.println("5. �� ��ȯ");
		System.out.println("********");
		int i = Integer.parseInt(sc.nextLine());
		return i;
	}

	public void plus_Money(int money) { // �� �Է�
		this.money += money;
	}

	public int minus_Money(int price) { // ��� ���� ��
		this.money -= price;
		return this.money;
	}

	public int back_Money() { // �� ��ȯ
		int temp_money = money;
		money = 0;
		return temp_money;
	}
}

class Drink {
	private static int cola_price; // �ݶ� ����
	private static int saida_price; // ���̴� ����
	private static int sikhye_price; // ���� ����
	private static int cola; // �ݶ� ����
	private static int saida; // ���̴� ����
	private static int sikhye; // ���� ����

	public Drink() { // ������ ���ݰ� �ʱ� ����
		cola_price = 1300;
		saida_price = 1500;
		sikhye_price = 700;
		cola = 10;
		saida = 10;
		sikhye = 10;
	}

	public int get_DrinkPrice(String drink) { // ���� ���� ��������
		int price = 0;
		if (drink.equals("�ݶ�"))
			price = cola_price;
		else if (drink.equals("���̴�"))
			price = saida_price;
		else if (drink.equals("����"))
			price = sikhye_price;
		return price;
	}

	public void print_Drink(String drink) { // ���� ���
		if (drink.equals("�ݶ�")) {
			drink = "�ݶ�";
			cola--; // ���� ����
		} else if (drink.equals("���̴�")) {
			drink = "���̴�";
			saida--;
		} else if (drink.equals("����")) {
			drink = "����";
			sikhye--;
		}
	}
}

public class Homework3 {
	public static void main(String[] args) {
		Vending_Machine vm = new Vending_Machine();
		vm.start();
	}

}

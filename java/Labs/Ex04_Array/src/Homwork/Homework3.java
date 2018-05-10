package Homwork;

import java.util.Scanner;

/*class Vending_Machine extends Drink{
	Scanner sc = new Scanner(System.in);
	private static int money; //넣은 돈
	
	public void start() {
		String drink;
		int money = 0;
		int i = menu(); //메뉴출력 & 출력한 숫자 할당
		switch(i) {
			case 1:
				drink = "콜라";
				print_Drink(drink);
				money = minus_Money(get_DrinkPrice(drink));
				b+reak;
			case 2:
				drink = "사이다";
				print_Drink(drink);
				money = minus_Money(get_DrinkPrice(drink));
				break;
			case 3:
				drink = "식혜";
				print_Drink(drink);
				money = minus_Money(get_DrinkPrice(drink));
				break;
			case 4:
				System.out.print("돈을 입력해 주세요(1000/500/100)");
				money = money_Choice();
				money = plus_Money(money);
				System.out.println("\n 총 넣은 금액 : " + money);
			case 5:
				System.out.println(money + "원 반환 되었습니다.");
				money = back_Money();
				System.out.println("\n 총 넣은 금액 : " + money);
				break;
		}
	}
	public int money_Choice() { //선택 머니
		while(money != (1000|500|100)) {
			money = Integer.parseInt(sc.nextLine());
			System.out.println("단위를 잘못 입력하셨습니다.");
		}
		return money;
	}
	
	public int menu() { //메뉴 출력
		System.out.println("********");
		System.out.println("1. 콜라");
		System.out.println("2. 사이다");
		System.out.println("3. 식혜");
		System.out.println("4. 돈 넣기");
		System.out.println("5. 돈 반환");
		System.out.println("********");
		int i = Integer.parseInt(sc.nextLine());
		return i;
	}
	
	public int plus_Money(int money) { //돈 입력
		this.money += money; 
		return this.money;
	}
	public int minus_Money(int price) { //사고 남은 돈
		this.money -= price;
		return this.money;
	}
	public int back_Money() { //돈 반환
		int temp_money = money;
		money = 0;
		return temp_money;
	}
}*/

class Vending_Machine {
	Drink d = new Drink();
	Scanner sc = new Scanner(System.in);
	private static int money = 0; // 넣은 돈

	public void start() {
		String drink;
		out : while (true) {
			int i = menu(); // 메뉴출력 & 출력한 숫자 할당
			switch (i) {
			case 1:
				drink = "콜라";
				d.print_Drink(drink);
				money = (money >= d.get_DrinkPrice(drink))?minus_Money(d.get_DrinkPrice(drink)):money;
				System.out.println(drink + " 나왔습니다.");
				break;
			case 2:
				drink = "사이다";
				d.print_Drink(drink);
				money = minus_Money(d.get_DrinkPrice(drink));
				System.out.println(drink + " 나왔습니다.");
				break;
			case 3:
				drink = "식혜";
				d.print_Drink(drink);
				money = minus_Money(d.get_DrinkPrice(drink));
				System.out.println(drink + " 나왔습니다.");
				break;
			case 4:
				System.out.print("돈을 입력해 주세요(1000/500/100)");
				int temp_money = money_Choice();
				plus_Money(temp_money);
				System.out.println("\n 총 넣은 금액 : " + money);
				break;
			case 5:
				System.out.println(money + "원 반환 되었습니다.");
				money = back_Money();
				System.out.println("\n 총 넣은 금액 : " + money);
				break out;
			}
		}
	}

	public int money_Choice() { // 선택 머니
		int temp_money;
		while (true){
			temp_money = 0;
			temp_money = Integer.parseInt(sc.nextLine());
			//if(temp_money != (1000|500|100)){  -> 이거는 왜 안되나??
			if(temp_money == 1000||temp_money == 500||temp_money == 100) {
				System.out.println(temp_money+"원이 추가 되었습니다.");
				break;
			} else System.out.println("단위를 잘못 입력하셨습니다.");
		}
		return temp_money;
	}

	public int menu() { // 메뉴 출력
		System.out.println("********");
		System.out.println("1. 콜라");
		System.out.println("2. 사이다");
		System.out.println("3. 식혜");
		System.out.println("4. 돈 넣기");
		System.out.println("5. 돈 반환");
		System.out.println("********");
		int i = Integer.parseInt(sc.nextLine());
		return i;
	}

	public void plus_Money(int money) { // 돈 입력
		this.money += money;
	}

	public int minus_Money(int price) { // 사고 남은 돈
		this.money -= price;
		return this.money;
	}

	public int back_Money() { // 돈 반환
		int temp_money = money;
		money = 0;
		return temp_money;
	}
}

class Drink {
	private static int cola_price; // 콜라 가격
	private static int saida_price; // 사이다 가격
	private static int sikhye_price; // 식혜 가격
	private static int cola; // 콜라 개수
	private static int saida; // 사이다 개수
	private static int sikhye; // 식혜 개수

	public Drink() { // 음료의 가격과 초기 개수
		cola_price = 1300;
		saida_price = 1500;
		sikhye_price = 700;
		cola = 10;
		saida = 10;
		sikhye = 10;
	}

	public int get_DrinkPrice(String drink) { // 음료 가격 가져오기
		int price = 0;
		if (drink.equals("콜라"))
			price = cola_price;
		else if (drink.equals("사이다"))
			price = saida_price;
		else if (drink.equals("식혜"))
			price = sikhye_price;
		return price;
	}

	public void print_Drink(String drink) { // 음료 출력
		if (drink.equals("콜라")) {
			drink = "콜라";
			cola--; // 개수 차감
		} else if (drink.equals("사이다")) {
			drink = "사이다";
			saida--;
		} else if (drink.equals("식혜")) {
			drink = "식혜";
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

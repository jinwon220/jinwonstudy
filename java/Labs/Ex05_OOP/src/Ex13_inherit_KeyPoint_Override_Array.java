/*
요구사항
카트 (Cart)
카트에는 매장에 있는 모든 전자제품을 담을 수 있다 
카트의 크기는 고정되어 있다 (10개) : 1개  , 2개 담을 수 있고 최대 10개까지 담을 수 있다
고객이 물건을 구매 하면 ... 카트에 담는다

계산대에 가면 전체 계산
계산기능이 필요
summary() 기능 추가해 주세요
당신이 구매한 물건이름 과 가격정보 나열
총 누적금액 계산 출력

hint) 카트 물건을 담는 행위 (Buy())
hint) summary()  main 함수에서 계산할때

구매자는 default 금액을 가지고 있고 초기금액을 설정할 수 도 있다
 */
class Cart{ //카드
	String[] cart_size;
	int[] arr_price;
	Cart(){
		this.cart_size = new String[10]; //크기
		this.arr_price = new int[10]; //크기
	}
	int i = 0; //카트의 초기배열
	void Buy(Product2 n) { //함수가 제품객체를 parameter로
		//카트에 물건 담기
		if(i >= 10) {
			System.out.println("카트에 물건이 꽉 찼습니다.");
			return; // 물건담기 종료
		}
		cart_size[i] = n.toString(); //배열에 물건 담기
		arr_price[i] = n.price;
		System.out.printf("[%d]번째 담은 물건은 : %s \n", i, cart_size[i]);
		i++; //다시 실행 될 시 i+1번째에 담기위하여 
	}
}

class Buyer2{ //구매자
	int money;
	Buyer2(){
		this(1000);
	}
	Buyer2(int money){ //초기잔액 설정
		this.money = money;
	}
	
	void summary(Cart c) { //카트에 담은 물품 합계
		int sum=0;
		
		for(int i = 0; true; i++) {
			if(c.cart_size[i] == null) {
				break;
			}
			sum += c.arr_price[i];
		}
		System.out.println("가진고 있는 돈 : " + money);
		System.out.println("물건의 합계 : " + sum);
		if(money < sum) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money = money - sum;
		
		System.out.println("남은잔액 : " + money);
	}
}

class Product2 { // 전자제품
	int price;  // 가격

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

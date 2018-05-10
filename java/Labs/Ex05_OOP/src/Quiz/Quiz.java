package Quiz;
/*
시나리오(요구사항)
저희는 가전제품 매장 솔루션을 개발하는 사업팀입니다
A라는 전자제품 매장이 오픈되면 
[클라이언트 요구사항]
가전제품은  제품의 가격 , 제품의 포인트 정보를 공통적으로 가지고 있습니다
각각의 가전제품은 제품별 고유한 이름을 가지고 있다
ex)
각각의 전자제품은 이름을 가지고 있다(ex: Tv , Audio , Computer)
각각의 전자제품은 다른 가격을 가지고 있다(Tv:5000, Audio:6000 ....)
제품의 포인트는 가격의 10% 적용한다
 
시뮬레이션 시나리오
구매자 : 제품을 구매하기 위한 금액정보 , 포인트 정보를 가지고 있다 
예를 들면 : 10만원  , 포인트 0
구매자는 제품을 구매할 수 있다 , 구매행위를 하게되면 가지고 있는 돈은  감속하고 포인트는 올라간다
구매자는 처음 초기 금액을 가질 수 있다
*/
class Person{ //구매자
	int money;//제품을 구매하기 위한 금액정보
	int point;//포인트 정보를 가지고 있다
	
	Person(){
		this(10000, 0);
	}
	Person(int money, int point){
		this.money = money;
		this.point = point;
	}
	
	void buy(Product p) { //제품을 구매 할 수 있다.
		System.out.println("가지고 있는 잔액 : " + this.money);
		if(this.money < p.price) {
			System.out.println("잔액이 부족합니다 :D");
			return;
		}
		System.out.println("구매시 적립되는 포인트 : " + p.point);
		this.money -= p.price; //구매행위를 하게되면 가지고 있는 돈은  감속하고
		this.point += p.point; //포인트는 올라간다
		
		System.out.println("구입한 물품 : " + p.toString());
		System.out.println("남은 잔액 : " + this.money);
		System.out.println("나의 적립된 포인트 : " + this.point);
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
		super(5000); //tv의 가격
	}

	@Override
	public String toString() {
		return "tv";
	}
}

class Product{
	int price; //가격을 가지고 있다
	int point; //포인트는 가격의 10%
	
	private Product() {} // 무조건 가격을 가지게 한다.
	
	Product(int price){
		this.price = price; //가격
		this.point = price / 10; //가격의 10%
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

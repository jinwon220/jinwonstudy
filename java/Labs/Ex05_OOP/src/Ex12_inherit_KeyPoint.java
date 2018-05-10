/*
 * 시나리오 (요구사항)
 * 저희는 가전제품 매장 소루션을 개발하는 사업팀입니다.
 * 
 * A 전자제품 매장이 오픈되면
 * 
 * [클라이언트 요구사항]
 * 가전제품은 제품의 가격, 제품의 포인트정보를 공통적으로 가지고 있습니다.
 * 각각의 가전제품은 제품별 고유한 이름을 가지고 있다.
 * ex)
 * 각각의 전자제품은 이름을 가지고 있다.(ex: Tv, Audio, Computer)
 * 각각의 전자제품은 다른 가격을 가지고 있다(Tv:5000, Audio:6000 ....)
 * 제품의 포인트는 가격의 10% 적립된다.
 * 
 * 시뮬레이션 시나리오
 * 구매자 : 제품을 구매하기 위한 금액정보, 포인트정보 를 가지고 있다.
 * 예를 들면 : 10만원 , 포인트 0
 * 구매자는 제품을 구매 할 수 있고, 구매행위를 하게되면 가지고 있는 돈을 감소하고 포인트는 올라간다.
 * 구매자는 처음 초기 금액을 가질 수 있다.
 * 
 */
class Buyer { // 구매자
	int money = 1000;
	int bonusepoint = 0;
	
	//구매행위
	//잔액  - 제품의 가격, 포인트 정보 갱신
	//구매자는 매장에 있는 모든 제품을 구매할 수 있다.
	//구매 함수
	//매장에 있는 제품(kttv, audio, notebook)
	
	//1차 완료
	//--*--*--*--*--*--*--*--*--*--*--*--
	//매장의 제품이 1000개 다른 제품이 추가(POS등록 자동화)
	//물건이 오면 매장에 배치 자동화
	//세일 >> 고객 >> 핸드폰 구매 문제
	//다른 997개 제품에 대한 구매행위를 할 수 없다.
	//제품이 들어올 때마다 제품을 구매할 수 있는 함수를 만들어 주어야 한다.
	/*
	void kttvBuy(KtTv n) { //함수가 제품객체를 parameter로
		if(this.money < n.price) {
			System.out.println("잔액이 부족합니다 :D");
			return; //구매행위에 대한 종료
		}
		//실 구매 행위
		this.money -= n.price;
		this.bonusepoint += n.bonusepoint;
		System.out.println("구매한 물건은 : " + n.toString());
	}
	
	void audioBuy(Audio n) { //함수가 제품객체를 parameter로
		if(this.money < n.price) {
			System.out.println("잔액이 부족합니다 :D");
			return; //구매행위에 대한 종료
		}
		//실 구매 행위
		this.money -= n.price;
		this.bonusepoint += n.bonusepoint;
		System.out.println("구매한 물건은 : " + n.toString());
	}
	
	void notebookBuy(Notebook n) { //함수가 제품객체를 parameter로
		if(this.money < n.price) {
			System.out.println("잔액이 부족합니다 :D");
			return; //구매행위에 대한 종료
		}
		//실 구매 행위
		this.money -= n.price;
		this.bonusepoint += n.bonusepoint;
		System.out.println("구매한 물건은 : " + n.toString());
	}
	*/
	//2차개선
	//만약 1000개의 제품이 있다면 1000개의 다른 함수명을 호출 하여야 한다.
	//구매하는 함수명이 다르기 때문에 >> 구매하는 함수명을 하나로 동일 >> method overroad
	/*
	void Buy(KtTv n) { //함수가 제품객체를 parameter로
		if(this.money < n.price) {
			System.out.println("잔액이 부족합니다 :D");
			return; //구매행위에 대한 종료
		}
		//실 구매 행위
		this.money -= n.price;
		this.bonusepoint += n.bonusepoint;
		System.out.println("구매한 물건은 : " + n.toString());
	}
	
	void Buy(Audio n) { //함수가 제품객체를 parameter로
		if(this.money < n.price) {
			System.out.println("잔액이 부족합니다 :D");
			return; //구매행위에 대한 종료
		}
		//실 구매 행위
		this.money -= n.price;
		this.bonusepoint += n.bonusepoint;
		System.out.println("구매한 물건은 : " + n.toString());
	}
	
	void Buy(Notebook n) { //함수가 제품객체를 parameter로
		if(this.money < n.price) {
			System.out.println("잔액이 부족합니다 :D");
			return; //구매행위에 대한 종료
		}
		//실 구매 행위
		this.money -= n.price;
		this.bonusepoint += n.bonusepoint;
		System.out.println("구매한 물건은 : " + n.toString());
	}
	*/
	//3차 개선
	//제품이 계속적으로 추가 되더라도 구매행위에 대한 함수를 추가적으로 만들지 않겠다.
	//** 반복적인 코드 제거 ...
	//** 하나의 함수가 모든 물건에 대한 구매 행위가 가능
	//KEY POINT : 모든 제품은 Product 를 상속하고 있다.(모든 제품의 부모는 Product 이다)
	void Buy(Product n) { //함수가 제품객체를 parameter로
		//******	******			******		   ******	******
		//*			*************************************		 *
		//****** 예외) 상속관계에서 부모타입으로 접근하더라도 제정의 된 함수는 자식것을 사용 ******
		//*			*********오버라이딩 된 함수 재정의 된 함수**********		 *
		//******	******			******		   ******	******
		if(this.money < n.price) {
			System.out.println("잔액이 부족합니다 :D");
			return; //구매행위에 대한 종료
		}
		//실 구매 행위
		this.money -= n.price;
		this.bonusepoint += n.bonusepoint;
		System.out.println("구매한 물건은 : " + n.toString());
	}
}

class Product { // 전자제품
	int price;  // 가격
	int bonusepoint; // 포인트

	// Product(){}
	
	Product(int price) {
		this.price = price;
		this.bonusepoint = (int) (this.price / 10.0);
	}
}

// Product lgtv = new KtTv(500);
class KtTv extends Product {
	KtTv() {
		super(500);
	}

	@Override
	public String toString() {
		return "KtTv";
	}
}
// KtTv lgtv = new KtTv(500);

class Audio extends Product {
	Audio() {
		super(100);
	}

	@Override
	public String toString() {
		return "Audio";
	}
}

class Notebook extends Product {
	Notebook() {
		super(150);
	}

	@Override
	public String toString() {
		return "Notebook";
	}
}

public class Ex12_inherit_KeyPoint {
	public static void main(String[] args) {
		KtTv kttv = new KtTv();
		System.out.println(kttv.toString());
		Audio audio = new Audio();
		System.out.println(audio.toString());
		Notebook notebook = new Notebook();
		System.out.println(notebook.toString());
		
		Buyer buyer = new Buyer();
		//1차 오픈
		//구매행위
		/*
		buyer.audioBuy(audio);
		buyer.notebookBuy(notebook);
		buyer.kttvBuy(kttv);
		buyer.audioBuy(audio);
		buyer.notebookBuy(notebook);
		buyer.kttvBuy(kttv);
		*/

		buyer.Buy(audio);
		buyer.Buy(notebook);
		buyer.Buy(kttv);
		buyer.Buy(audio);
		buyer.Buy(notebook);
		buyer.Buy(kttv);

	}
}

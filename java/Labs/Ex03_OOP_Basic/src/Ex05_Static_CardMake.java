import kr.or.bit.Card;
// static 자원은 class.static자원 으로 사용할 수 있다
public class Ex05_Static_CardMake {

	public static void main(String[] args) {
	/* 잘못된 유형
	 * Card 클래스에 
	 * static이 안붙었을 때
		Card c = new Card();
		c.number = 1;
		c.kind = "heart";
		//변경사항
		c.h = 500;
		c.w = 200;
		c.cardInfor();
		//카드 1장을 만들어서 정보 확인
		
		Card c2 = new Card();
		c2.number = 10;
		c2.kind = "heart";
		c2.h = 500;
		c2.w = 200;
		c2.cardInfor();
		
		//...53장의 카드 생성
		//이때, 고객이 카드의 높이와 너비를 재요청
		//h = 500, w = 200 요구사항...
		
	*/
	/*
	 * Card 클래스에
	 * 모두 같은 값이 들어가는 변수에
	 * static이 들어있을때,
	 */
		Card c = new Card();
		c.number = 1;
		c.kind = "heart";
		//변경사항
		c.h = 500;
		c.w = 200;
		c.cardInfor();
		//카드 1장을 만들어서 정보 확인
		
		Card c2 = new Card();
		c2.number = 10;
		c2.kind = "heart";
		c2.cardInfor();
	}
}

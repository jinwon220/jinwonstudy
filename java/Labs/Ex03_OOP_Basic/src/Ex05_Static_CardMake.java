import kr.or.bit.Card;
// static �ڿ��� class.static�ڿ� ���� ����� �� �ִ�
public class Ex05_Static_CardMake {

	public static void main(String[] args) {
	/* �߸��� ����
	 * Card Ŭ������ 
	 * static�� �Ⱥپ��� ��
		Card c = new Card();
		c.number = 1;
		c.kind = "heart";
		//�������
		c.h = 500;
		c.w = 200;
		c.cardInfor();
		//ī�� 1���� ���� ���� Ȯ��
		
		Card c2 = new Card();
		c2.number = 10;
		c2.kind = "heart";
		c2.h = 500;
		c2.w = 200;
		c2.cardInfor();
		
		//...53���� ī�� ����
		//�̶�, ���� ī���� ���̿� �ʺ� ���û
		//h = 500, w = 200 �䱸����...
		
	*/
	/*
	 * Card Ŭ������
	 * ��� ���� ���� ���� ������
	 * static�� ���������,
	 */
		Card c = new Card();
		c.number = 1;
		c.kind = "heart";
		//�������
		c.h = 500;
		c.w = 200;
		c.cardInfor();
		//ī�� 1���� ���� ���� Ȯ��
		
		Card c2 = new Card();
		c2.number = 10;
		c2.kind = "heart";
		c2.cardInfor();
	}
}

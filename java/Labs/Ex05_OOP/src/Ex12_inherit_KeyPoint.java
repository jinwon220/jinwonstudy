/*
 * �ó����� (�䱸����)
 * ����� ������ǰ ���� �ҷ���� �����ϴ� ������Դϴ�.
 * 
 * A ������ǰ ������ ���µǸ�
 * 
 * [Ŭ���̾�Ʈ �䱸����]
 * ������ǰ�� ��ǰ�� ����, ��ǰ�� ����Ʈ������ ���������� ������ �ֽ��ϴ�.
 * ������ ������ǰ�� ��ǰ�� ������ �̸��� ������ �ִ�.
 * ex)
 * ������ ������ǰ�� �̸��� ������ �ִ�.(ex: Tv, Audio, Computer)
 * ������ ������ǰ�� �ٸ� ������ ������ �ִ�(Tv:5000, Audio:6000 ....)
 * ��ǰ�� ����Ʈ�� ������ 10% �����ȴ�.
 * 
 * �ùķ��̼� �ó�����
 * ������ : ��ǰ�� �����ϱ� ���� �ݾ�����, ����Ʈ���� �� ������ �ִ�.
 * ���� ��� : 10���� , ����Ʈ 0
 * �����ڴ� ��ǰ�� ���� �� �� �ְ�, ���������� �ϰԵǸ� ������ �ִ� ���� �����ϰ� ����Ʈ�� �ö󰣴�.
 * �����ڴ� ó�� �ʱ� �ݾ��� ���� �� �ִ�.
 * 
 */
class Buyer { // ������
	int money = 1000;
	int bonusepoint = 0;
	
	//��������
	//�ܾ�  - ��ǰ�� ����, ����Ʈ ���� ����
	//�����ڴ� ���忡 �ִ� ��� ��ǰ�� ������ �� �ִ�.
	//���� �Լ�
	//���忡 �ִ� ��ǰ(kttv, audio, notebook)
	
	//1�� �Ϸ�
	//--*--*--*--*--*--*--*--*--*--*--*--
	//������ ��ǰ�� 1000�� �ٸ� ��ǰ�� �߰�(POS��� �ڵ�ȭ)
	//������ ���� ���忡 ��ġ �ڵ�ȭ
	//���� >> �� >> �ڵ��� ���� ����
	//�ٸ� 997�� ��ǰ�� ���� ���������� �� �� ����.
	//��ǰ�� ���� ������ ��ǰ�� ������ �� �ִ� �Լ��� ����� �־�� �Ѵ�.
	/*
	void kttvBuy(KtTv n) { //�Լ��� ��ǰ��ü�� parameter��
		if(this.money < n.price) {
			System.out.println("�ܾ��� �����մϴ� :D");
			return; //���������� ���� ����
		}
		//�� ���� ����
		this.money -= n.price;
		this.bonusepoint += n.bonusepoint;
		System.out.println("������ ������ : " + n.toString());
	}
	
	void audioBuy(Audio n) { //�Լ��� ��ǰ��ü�� parameter��
		if(this.money < n.price) {
			System.out.println("�ܾ��� �����մϴ� :D");
			return; //���������� ���� ����
		}
		//�� ���� ����
		this.money -= n.price;
		this.bonusepoint += n.bonusepoint;
		System.out.println("������ ������ : " + n.toString());
	}
	
	void notebookBuy(Notebook n) { //�Լ��� ��ǰ��ü�� parameter��
		if(this.money < n.price) {
			System.out.println("�ܾ��� �����մϴ� :D");
			return; //���������� ���� ����
		}
		//�� ���� ����
		this.money -= n.price;
		this.bonusepoint += n.bonusepoint;
		System.out.println("������ ������ : " + n.toString());
	}
	*/
	//2������
	//���� 1000���� ��ǰ�� �ִٸ� 1000���� �ٸ� �Լ����� ȣ�� �Ͽ��� �Ѵ�.
	//�����ϴ� �Լ����� �ٸ��� ������ >> �����ϴ� �Լ����� �ϳ��� ���� >> method overroad
	/*
	void Buy(KtTv n) { //�Լ��� ��ǰ��ü�� parameter��
		if(this.money < n.price) {
			System.out.println("�ܾ��� �����մϴ� :D");
			return; //���������� ���� ����
		}
		//�� ���� ����
		this.money -= n.price;
		this.bonusepoint += n.bonusepoint;
		System.out.println("������ ������ : " + n.toString());
	}
	
	void Buy(Audio n) { //�Լ��� ��ǰ��ü�� parameter��
		if(this.money < n.price) {
			System.out.println("�ܾ��� �����մϴ� :D");
			return; //���������� ���� ����
		}
		//�� ���� ����
		this.money -= n.price;
		this.bonusepoint += n.bonusepoint;
		System.out.println("������ ������ : " + n.toString());
	}
	
	void Buy(Notebook n) { //�Լ��� ��ǰ��ü�� parameter��
		if(this.money < n.price) {
			System.out.println("�ܾ��� �����մϴ� :D");
			return; //���������� ���� ����
		}
		//�� ���� ����
		this.money -= n.price;
		this.bonusepoint += n.bonusepoint;
		System.out.println("������ ������ : " + n.toString());
	}
	*/
	//3�� ����
	//��ǰ�� ��������� �߰� �Ǵ��� ���������� ���� �Լ��� �߰������� ������ �ʰڴ�.
	//** �ݺ����� �ڵ� ���� ...
	//** �ϳ��� �Լ��� ��� ���ǿ� ���� ���� ������ ����
	//KEY POINT : ��� ��ǰ�� Product �� ����ϰ� �ִ�.(��� ��ǰ�� �θ�� Product �̴�)
	void Buy(Product n) { //�Լ��� ��ǰ��ü�� parameter��
		//******	******			******		   ******	******
		//*			*************************************		 *
		//****** ����) ��Ӱ��迡�� �θ�Ÿ������ �����ϴ��� ������ �� �Լ��� �ڽİ��� ��� ******
		//*			*********�������̵� �� �Լ� ������ �� �Լ�**********		 *
		//******	******			******		   ******	******
		if(this.money < n.price) {
			System.out.println("�ܾ��� �����մϴ� :D");
			return; //���������� ���� ����
		}
		//�� ���� ����
		this.money -= n.price;
		this.bonusepoint += n.bonusepoint;
		System.out.println("������ ������ : " + n.toString());
	}
}

class Product { // ������ǰ
	int price;  // ����
	int bonusepoint; // ����Ʈ

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
		//1�� ����
		//��������
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

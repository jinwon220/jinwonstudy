class Tv{
	boolean power; //���� on/off
	int ch; //ä��
	
	void power() {
		this.power = !this.power;
	}
	void chUp() {
		this.ch++;
	}
	void chDown() {
		this.ch--;
	}
}

class Vcr{ //���� �÷��̾�
	boolean power;
	
	void power() {
		this.power = !this.power;
	}
	void play() {
		System.out.println("����ϱ�");
	}
	void stop() {
		System.out.println("����");
	}
	void rew() {}
	void ff() {}
}
//Vcr ��ɰ� ������ Tv����� ���� ���赵�� ����ÿ�.
//���赵 �̸��� TvVcr

// class TvVcr extends Tv,Vcr{} ���߻�� �Ұ�!!

// Tv extends Vcr
// Tv Vcr extends Tv (������ ���)

// ���� : ���߿� �ϳ� ���, �ϳ��� ����
//��� ���, ��� ����
//Tv ��� (�ֱ��, ���α��), Vcr ����
//������ ���� Ŭ����  => ��Ӱ���� ������ ���� �Ϲ����̴�

// �Ѵ� ���԰��� (����)
//class TvVcr {Tv t; Vcr v; }

class TvVcr extends Tv{
	Vcr vcr;
	TvVcr(){
		vcr = new Vcr(); //vcr memory �� �����ڿ��� ...
	}
}

public class Ex03_inherit_Single {
	public static void main(String[] args) {
		TvVcr t = new TvVcr();
		t.power();
		System.out.println("Tv �������� : " + t.power);
		t.chUp();
		System.out.println("Tv ä������ : " + t.ch);
		
		//���� �Ѻ�����
		t.vcr.power(); //���ٹ��
		System.out.println("Vcr �������� : " + t.vcr.power);
		t.vcr.play();
		t.vcr.stop();
		t.vcr.power(); //���� ���� ����
		t.power(); //Tv ����
		System.out.println("Vcr �������� : " + t.vcr.power);
		System.out.println("Tv �������� : " + t.power);
	}
}

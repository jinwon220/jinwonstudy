class Tv{
	boolean power; //전원 on/off
	int ch; //채널
	
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

class Vcr{ //비디오 플레이어
	boolean power;
	
	void power() {
		this.power = !this.power;
	}
	void play() {
		System.out.println("재생하기");
	}
	void stop() {
		System.out.println("정지");
	}
	void rew() {}
	void ff() {}
}
//Vcr 기능과 가지는 Tv기능을 갖춘 설계도를 만드시오.
//설계도 이름은 TvVcr

// class TvVcr extends Tv,Vcr{} 다중상속 불가!!

// Tv extends Vcr
// Tv Vcr extends Tv (계층적 상속)

// 선택 : 둘중에 하나 상속, 하나는 포함
//어떤놈 상속, 어떤놈 포함
//Tv 상속 (주기능, 메인기능), Vcr 포함
//비중이 높은 클래스  => 상속관계로 빠지는 것이 일반적이다

// 둘다 포함관계 (가능)
//class TvVcr {Tv t; Vcr v; }

class TvVcr extends Tv{
	Vcr vcr;
	TvVcr(){
		vcr = new Vcr(); //vcr memory 는 생성자에서 ...
	}
}

public class Ex03_inherit_Single {
	public static void main(String[] args) {
		TvVcr t = new TvVcr();
		t.power();
		System.out.println("Tv 전원상태 : " + t.power);
		t.chUp();
		System.out.println("Tv 채널정보 : " + t.ch);
		
		//비디오 켜보세요
		t.vcr.power(); //접근방법
		System.out.println("Vcr 전원상태 : " + t.vcr.power);
		t.vcr.play();
		t.vcr.stop();
		t.vcr.power(); //비디오 전원 끄기
		t.power(); //Tv 전원
		System.out.println("Vcr 전원상태 : " + t.vcr.power);
		System.out.println("Tv 전원상태 : " + t.power);
	}
}

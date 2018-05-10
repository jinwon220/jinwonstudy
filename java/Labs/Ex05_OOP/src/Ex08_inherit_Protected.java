import kr.or.bit.Pclass;

//접근자 (제어자) : private, default, protected, public
//상속관계에서 존재하는 protected
//양면성 : default 역활, public 역활(상속 때)...

//증명 : 상속이 없는 클래스 안에  protected 접근자는 default와 같아요
//why) 상속이 없는 상황에서는 protected 접근자 의미가 없다(default접근자와 동일)

class Dclass{
	private int i;
	public int j;
	protected int k; //default 역활
	int p; //default
}

//상속관계에서 Protected
class Child2 extends Pclass{
	void method() {
		this.k = 1000; // 상속관계에서는 public 처럼 처리
		//this.p =11; default는 (x)
		System.out.println(this.k);
	}
}
public class Ex08_inherit_Protected {
	public static void main(String[] args) {
		Dclass d = new Dclass();
		//d.j ok
		//d.k ok default 역활(같은 폴더 내에서는 default 처럼사용) 노랑색
		//d.p ok (default접근자)
		
		Pclass p = new Pclass();
		//p.j ok public
		//p.i no private(x)
		//p.p no 같은 폴더x(x) 
		//p.k no 같은 폴더가 아니니까(x)
		
		Child2 c2 = new Child2();
		c2.method();
	}

}

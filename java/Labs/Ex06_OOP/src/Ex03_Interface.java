/*
추상 클래스와 인터페이스 공통점
1. 스스로 객체 생성 불가능 (new 연산자 사용불가)
2. 상속, 구현을 통해서만 (사용가능 -> 메모리에 올라갈 수있다)
3. [재정의]를 통해서 [강제구현]이 목적

추상 클래스와 인터페이스 다른점
1. 인터페이스는 다중 상속가능 (구현)
2. 추상클래스 단일상속이 원칙
3. 추상클래스 (완성된 코드 + 미완성된 코드)
4. 인터페이스는 상수를 제외한 나머지는 미완성 코드(추상자원)

-인터에이스 간에는 상속가능
interface Ia extends Ib, Ic, Id

-하나의 클래스가 여러개의 인터페이스는 구현 가능
class Test extends Object implements Ia, Ib, Ic
class Test implements Ia, Ib, Ic

********** 개발자 입장 **********
1. 인터페이스를 [다형성] 입장에서  접근 (인터페이스도 부모타입이다)
2. 서로연관성이 없는 클래스에 대해서 하나로 묶는 기능을 제공(부모가 동일)

3. 인터페이스는 (~able) 표현을 많이 사용 :~할 수 있는 (날 수 있는, 수리 할 수 있는)
4. 객체간의 연결 고리 (객체간의 소통의 역할)

*/
interface Irepairable {} //~할 수 있는 형태의 이름...(선호)

class Unit2{
	int hitpoint; //에너지
	final int MAX_HP;
	Unit2(int hp){
		this.MAX_HP = hp;
	}
}
//지상유닛
class GroundUnit extends Unit2{
	GroundUnit(int hp) {
		super(hp);
	}
}
//공중유닛
class AirUnit extends Unit2{
	AirUnit(int hp) {
		super(hp);
	}
}

class Tank2 extends GroundUnit implements Irepairable{
	Tank2() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Tank2";
	}	
}

class Marine2 extends GroundUnit{
	Marine2() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Marine2";
	}	
}

class CommandCenter implements Irepairable{}

class Scv extends GroundUnit implements Irepairable{
	Scv() {
		super(60);
	}
	@Override
	public String toString() {
		return "Scv";
	}	
	//Scv 구체화 특수화 고유한 기능
	//수리하다 (repair)
	/*
	void repair(Tank2 tank) {
		if(tank.hitpoint != tank.MAX_HP) {
			tank.hitpoint += 5;
		}
	}
	
	void repair(Scv scv) {
		if(scv.hitpoint != scv.MAX_HP) {
			scv.hitpoint += 5;
		}
	}
	*/
	//scv 충전 할 수 있는 unit이 증가되면 unit 개수만큼
	//repair 함수를 추가 해야 한다.
	
	//고민 : 하나의 함수로 다른 모든 유닛을 수리 할 수 없을까?
	
	//Unit2 <- GroundUnit <- Tank2, Marine2(repair (x)), Scv
	//void repair(Unit2 unit){} (x) scv가 마린을 치료하면 안되기때문에
	//상속관계에 부모타입을 가지고 노는 것은 END... GG
	
	//인터페이스
	void repair(Irepairable repairunit) {
		//1.Tank2, Scv, CommandCenter 가지고 올 수 있다.
		//Irepairable 라는 부모를 가지고 있다.
		
		//if(scv.hitpoint != scv.MAX_HP) {
		//	scv.hitpoint += 5;
		//}
		
		//repairunit >> Tank2타입으로
		//downcasting -> Tank2 t = (Tank2)repairunit (상위타입을 하위 타입으로)
		
		//repairunit >> Scv타입으로
		//downcasting -> Scv t = (Scv)repairunit (상위타입을 하위 타입으로)
		
		//repair 충전의 대상이 아닌 CommandCenter 도 올 수 있다 (unit이 아니다)
		
		//Tank2 -> GroundUnit -> Unit2
		//Scv -> GroundUnit -> Unit2
		//공통점 : Unit2 상속..
		
		//CommandCenter : Unit2 가 아니다
		//downcasting 불가
		
		//들어오는 객체의 타입을 비교 판단
		if(repairunit instanceof Unit2) {
			//(객체) instanceof (타입)
			// ()객체가 ()타입이 맞으면 true 아니면 false
			// repairunit은 Unit2 부모 는 아니지만
			// repairunit에 Tank2/Scv가 들어가면 Unit2의 부모가 된다.
			// 그러므로 true가 나옴
			Unit2 unit = (Unit2)repairunit;
			if(unit.hitpoint != unit.MAX_HP) {
				unit.hitpoint = unit.MAX_HP;
			}
		}else {
			System.out.println("Unit2 타입이 아니예요 다른 방법으로 repair 합니다.");
		}
		/* main
		Tank2 tank = new Tank2();
		scv.repair(tank); //탱크 객체 주소값
		*/
	}
}

public class Ex03_Interface {
	public static void main(String[] args) {
		Tank2 tank = new Tank2();
		Marine2 marine = new Marine2();
		Scv scv = new Scv();
		
		//전투
		tank.hitpoint -= 10;
		System.out.println("탱크전투 : " + tank.hitpoint);
		System.out.println("나 파손 당했어 수리해줘 Scv");
		scv.repair(tank);
		System.out.println("수리완료 : " + tank.hitpoint);
		
		CommandCenter center = new CommandCenter();
		scv.repair(center);
	}
}

import kr.or.bit.Car;

//접근자

//class area(method area) : static 올라가는 영역
//heap : new 연산자 객체가 올라가는 영역
//stack

//static -> 객체생성 이전에 메모리에 올라간다.

public class Ex03_Modifier {

	public static void main(String[] args) {
		Car c = new Car();
		
		c.setWindow(111);
		int result = c.getWindow();
		System.out.println(result);
		
		c.setSpeed(-100);
		System.out.println("현재 속도 : " + c.getSpeed());
		c.setSpeed(1);
		System.out.println("현재 속도 : " + c.getSpeed());
		
		c.speedUp();//6
		System.out.println("현재 속도 : " + c.getSpeed());
		c.speddDown();//1
		System.out.println("현재 속도 : " + c.getSpeed());
		c.speddDown();//0
		System.out.println("현재 속도 : " + c.getSpeed());
	}

}

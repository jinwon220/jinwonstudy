import kr.or.bit.Car;

//������

//class area(method area) : static �ö󰡴� ����
//heap : new ������ ��ü�� �ö󰡴� ����
//stack

//static -> ��ü���� ������ �޸𸮿� �ö󰣴�.

public class Ex03_Modifier {

	public static void main(String[] args) {
		Car c = new Car();
		
		c.setWindow(111);
		int result = c.getWindow();
		System.out.println(result);
		
		c.setSpeed(-100);
		System.out.println("���� �ӵ� : " + c.getSpeed());
		c.setSpeed(1);
		System.out.println("���� �ӵ� : " + c.getSpeed());
		
		c.speedUp();//6
		System.out.println("���� �ӵ� : " + c.getSpeed());
		c.speddDown();//1
		System.out.println("���� �ӵ� : " + c.getSpeed());
		c.speddDown();//0
		System.out.println("���� �ӵ� : " + c.getSpeed());
	}

}

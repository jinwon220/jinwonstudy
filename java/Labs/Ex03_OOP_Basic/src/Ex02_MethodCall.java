import kr.or.bit.Fclass;
import kr.or.bit.Tv;

public class Ex02_MethodCall {

	public static void main(String[] args) {
		Fclass fc = new Fclass();
		fc.m();
		
		fc.m2(10000);
		
		int result = fc.m3();
		System.out.println("result : " + result);
		
		result = fc.m4(1000);
		System.out.println("result : " + result);
		
		//tip m , m2 , m3 , m4 �� �Լ��� �̸��� �巡�� �� F3�� ������ �ش� �Լ� �ڵ尡 �ִ� ������ �̵�
		
		result = fc.sum3(10, 20);
		System.out.println("�� ���� �� : " + result);
		
		////////////////////////////////////////////////////////////////
		
		Tv t2 = fc.objmethod();
		System.out.println(t2.brand_name);
		System.out.println(t2.channel);//2
		System.out.println(t2.channel);//2 //�ּҰ��� �������� �ű� ������ �� ����Ǵ� ���� �ƴϴ�
		
		Tv t3 = fc.objmethod2();
		System.out.println("�ּҰ� �� :" + (t2==t3));
		
		fc.objMethod3(t2);
	}

}

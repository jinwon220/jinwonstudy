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
		
		//tip m , m2 , m3 , m4 등 함수의 이름을 드래그 후 F3을 누르면 해당 함수 코드가 있는 곳으로 이동
		
		result = fc.sum3(10, 20);
		System.out.println("두 값의 합 : " + result);
		
		////////////////////////////////////////////////////////////////
		
		Tv t2 = fc.objmethod();
		System.out.println(t2.brand_name);
		System.out.println(t2.channel);//2
		System.out.println(t2.channel);//2 //주소값을 가져오는 거기 때문에 더 실행되는 것이 아니다
		
		Tv t3 = fc.objmethod2();
		System.out.println("주소값 비교 :" + (t2==t3));
		
		fc.objMethod3(t2);
	}

}

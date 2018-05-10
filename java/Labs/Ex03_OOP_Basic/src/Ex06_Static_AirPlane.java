import kr.or.bit.AirPlane;

public class Ex06_Static_AirPlane {

	public static void main(String[] args) {
		/*AirPlane air = new AirPlane();
		air.make(1, "대한");
		air.make_count();
		
		AirPlane air2 = new AirPlane();
		air2.make(2, "아시아나");
		air2.make_count();
		
		AirPlane air3 = new AirPlane();
		air3.make(3, "제주");
		air3.make_count();*/
		
		//생성자 함수를 잘 사용하면 코드가 줄어든다.
		AirPlane air = new AirPlane(1, "대한");
		air.airPlaneInfo();
		air.make_count();
		
		AirPlane air2 = new AirPlane(2, "아시아나");
		air.airPlaneInfo();
		air2.make_count();
		
		AirPlane air3 = new AirPlane(3, "제주");
		air.airPlaneInfo();
		air3.make_count();
	}

}

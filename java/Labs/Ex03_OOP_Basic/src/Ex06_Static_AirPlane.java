import kr.or.bit.AirPlane;

public class Ex06_Static_AirPlane {

	public static void main(String[] args) {
		/*AirPlane air = new AirPlane();
		air.make(1, "����");
		air.make_count();
		
		AirPlane air2 = new AirPlane();
		air2.make(2, "�ƽþƳ�");
		air2.make_count();
		
		AirPlane air3 = new AirPlane();
		air3.make(3, "����");
		air3.make_count();*/
		
		//������ �Լ��� �� ����ϸ� �ڵ尡 �پ���.
		AirPlane air = new AirPlane(1, "����");
		air.airPlaneInfo();
		air.make_count();
		
		AirPlane air2 = new AirPlane(2, "�ƽþƳ�");
		air.airPlaneInfo();
		air2.make_count();
		
		AirPlane air3 = new AirPlane(3, "����");
		air.airPlaneInfo();
		air3.make_count();
	}

}

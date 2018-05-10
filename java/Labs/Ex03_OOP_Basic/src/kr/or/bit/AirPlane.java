package kr.or.bit;

/*
 우리 회사는 비행기를 주문 제작 판매하는 회사입니다.
 우리 회사는 비행기를 생산하는 설계도를 작성하려고 합니다.
 
 요구사항
 1.비행기를 생산하고 비행기의 이름과 번호를 부여해야합니다.
 2.비행기가 생산되면 비행기의 이름과 번호가 맞게 부여 되었는지 확인 하는 작업이 필요합니다. (출력정보 확인)
 3.공장장은 현재까지 만들어진 비행기에 총대수(누적)을 확인 할 수 있습니다.
 
 단, 오늘까지 배운 코드로만 작성하시오
*/

// 아래에 작성한 코드는 수정되어야 한다. > [생성자]를 배운 후 수정하기
/*public class AirPlane {
	private int number; //번호
	private String air_name; //이름
	
	private static int count; //생산대수
	
	public void make(int num, String name) {
		this.number = num;
		this.air_name = name;
		this.count++;
		System.out.printf("번호 : %d, 이름 : %s \n", number, air_name);
	}
	public void make_count() {
		System.out.printf("총대수(누적): %d대 \n",count);
	}
}*/
public class AirPlane {
	private int number; //번호
	private String air_name; //이름
	
	private static int count; //생산대수
	
	//public AirPlane(){} 구현하지 않을 거예요 why) 강제적인 초기화 int number, String air_name
	public AirPlane(int number, String air_name) {
		this.number = number;
		this.air_name = air_name;
		count++;
	}
	public void airPlaneInfo() {
		System.out.printf("번호 : %d, 이름 : %s \n", number, air_name);
	}
	public void make_count() {
		System.out.printf("총대수(누적): %d대 \n",count);
	}
}

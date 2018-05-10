package kr.or.bit;
/*
Tv 설계도
요구사항 정의
Tv는 채널 정보를 가지고 있다.(예를 들면 1 ~ 200)
Tv는 브랜드 이름을 가지고 있다.(예 삼성, 엘지)
Tv는 채널변환기능을 가지고 있다.
채널을 위로 올릴 수도 있고 내릴 수도 있다.(채널을 한 단계씩 변경 가능하다)  

 */
public class Tv {
	public int channel = 1; // 1을 기본값으로 설정
	//class가 가지는 변수 : field, instance_variable
	public String brand_name = "";
	
	public void channel_up() {
		channel++;
	}
	public void channel_down() {
		channel--;
	}
}


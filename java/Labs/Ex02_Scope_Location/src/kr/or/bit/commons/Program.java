package kr.or.bit.commons;

public class Program {

	public static void main(String[] args) {
		//default 접근자를 가지고 있는 CommonClass 사용시 전혀 문제가 없다.
		CommonClass c = new CommonClass();
		
		CommonClassPublic common = new CommonClassPublic();
		// common.a public
		// common.b default 접근 -> 같은 폴더라면 사용
		common.a = -100;
		System.out.println(common.a);
		
		common.write(-4444);
		System.out.println(common.read());
	}

}

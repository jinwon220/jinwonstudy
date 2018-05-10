import kr.or.bit.Singleton;

public class Ex15_Singleton_main {
	public static void main(String[] args) {
		// Singleton s = new Singleton(); (X)
		// 생성자를 private 으로 막아서 사용 불가!!
		Singleton s = Singleton.getInstance();
		// if문 성립으로 들어간서 [주소값 새로 만들어진 것!!]
		Singleton s2 = Singleton.getInstance();
		// if문 성립이 안되서 [가지고있던 주소값 리턴!!]
		System.out.println(s + " / " + s2);
		System.out.println(s == s2);
	}

}


public class Ex08_Static_Method {
	public void method() {
		System.out.println("나 일반함수야");
	}
	
	public static void smethod() {
		System.out.println("나 static 함수야");
	}
	
	public static void main(String[] args) {
		System.out.println("나 static main 함수야");
		smethod(); //같은 클래스 안에 있기 때문에 (클래스명.static변수명)에서 클래스명 생략 가능
		//Ex08_Static_Method.smethod(); 
		Ex08_Static_Method ss = new Ex08_Static_Method();
		ss.method();
	}
}

//String 클래스
//이 수업을 듣고 String 클래스다 라는 사실을 잊을 것!
//String 사용방법이 8가지 기본타입과 동일

//String str = "a길동";
//1.String 클래스 = 데이터 저장 자료구조 >> char[]배열 사용
//2.String ename = "a길동" > [a][길][동]
//3.String s = new String("ABCD");

public class Ex05_String_Class {
	public static void main(String[] args) {
		String str = "ABCD";
		System.out.println(str.length()); //String 데이터 char[]배열 이라 length()가 적용
		
		System.out.println(str); //str.toString() 결과 가 나온다.
		
		String str1 = "AAA";
		String str2 = "AAA";
		System.out.println("str1 : " + str1.toString());
		System.out.println("str2 : " + str2.toString());
		
		System.out.println(str1 == str2); //주소 비교
		//String 비교 (주소안에 있는 값을 비교)
		//POINT (문자열의 비교는 : .equals())
		System.out.println(str1.equals(str2));
		
		String str3 = new String("BBB");
		String str4 = new String("BBB");
		System.out.println(str3 == str4); //false 주소 다름
		System.out.println(str3 + " / " + str4); //String.toString String클래스에서 오버라이드 (재정의)했기때문에
		System.out.println(str3.equals(str4)); //true 값 같음
	}

}

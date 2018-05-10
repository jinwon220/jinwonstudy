import java.util.Scanner;

public class Ex07_Printf_format {
	
	public void print() {
		System.out.println("난 일반 함수야");
	}
	
	public static void main(String[] args) {
		//java.lang 아래 있는 자원은 선언(import) 없이 사용가능 (내부적 오픈(default open))
		
		System.out.println("난 static 함수야");
		
		//print() 를 사용하기 위해서는
		Ex07_Printf_format ex = new Ex07_Printf_format();
		ex.print();
		
		System.out.println();
		//오버로딩 : 함수는 같은데 파라미터의 갯수와 타입이 다른 것
		//오버로딩을 하는 이유 : 성능과는 무관! 편하게 사용하기 위함
		//ex) System.out.println(string x);
		//    System.out.println(Object x);
		//    System.out.println(int x);
		//    System.out.println(char x); . . . 등
		
		//C# : Console.WriteLine();
		//C# : Console.ReadLine();
		
		//Java : System.out.println();
		System.out.println("A");
		System.out.print("B");
		System.out.print("C");
		System.out.print("D");
		System.out.println("E"); // println 줄바꿈
		
		int num = 100;
		System.out.println(num);
		System.out.println("num 값은 : " + num + " 입니다");
		//형식 (format)
		System.out.printf("num 값은 : %d 입니다\n", num);
		//format 형식문자 (약속)
		//%d (10진수 형식의 정수) > d라는 자리에
		//%f (실수)
		//%s (문자열)
		//%c (문자)
		//특수문자 : \t (탭키), \n(줄바꿈)
		
		System.out.printf("num의 값은 [%d]입니다 그리고 [%d]도 있어요\n", num, 1000);
		
		float f = 3.14f;
		System.out.println(f);
		System.out.printf("f 변수 값 %f 입니다 \n", f);
		
		//cmd(console)에서 입력값 읽어오기
		Scanner sc = new Scanner(System.in); //ctrl + shift + o -> import 자동완성
		
		// java.util.Scanner sc = new java.util.Scanner(System.in); 가능
		// import를 사용않하고 풀네임으로 사용하면
		// 사용할 때마다, 적어줘야하는 번거러움이 있다.
		
		System.out.println("값을 입력하세요");
		//String value = sc.nextLine(); // 대기상태... String java.util.Scanner.nextLine()
		//System.out.println("입력값 : " + value);
		
		//int number = sc.nextInt(); //대기 /같은 타입만 처리한다 (nextInt)
		//System.out.println("입력값 : " + number);
		
		//float number = sc.nextFloat();
		//System.out.println("입력값 : " + number);
		
		//권장사항(그냥 문자로 받아서 변환해서 사용합시다)
		//ToDay Point
		//[[[ 문자를  -> 숫자로 ]]]
		//Integer.parseInt(s) 문자를 정수를
		//Float.parseFloat(s) 문자를 실수로 float형
		//Double.parseFloat(s) 문자를 실수로 double형
		
		System.out.println("숫자를 입력하세요");
		int number = Integer.parseInt(sc.nextLine());
		System.out.println("숫자 : " + number);
		
		//숫자를 -> 문자로 (잘 사용 않함, 숫자와 문자를 더하면 문자로 출력되기 때문에)
		//String data = String.valueOf(1000);
		//System.out.println(data);
		
		
	}
}

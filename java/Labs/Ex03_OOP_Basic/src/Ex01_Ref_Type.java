import kr.or.bit.Person;
import kr.or.bit.Tv;

public class Ex01_Ref_Type {

	public static void main(String[] args) {
		//설계도를 기반으로 Person 타입을 갖는 객체를 생성(heap)
		//new 연산자
		
		Person person; //선언 (stack 4byte 공간 빈값(null)
		person = new Person(); //heap 메모리에 Person 객체 만들어지고 그 주소값을 person 변수에 할당
		
		person.name = "홍길동";
		person.age = 100;
		
		person.print();
		
		Person  my = new Person(); //선언과 메모리 할당을 동시에
		my.name = "마이마이";
		my.age = 10;
		my.print();
		
		int num=100;//main [함수]안에 선언된 변수 local variable(반드시 초기화)
		
		Person you; //you변수
		//System.out.println(you);
		//참조타입의 초기화
		
		//1. 초기화(new 연산자)
		//you = new Person(); //참조타입 초기화 (초기화 > 변수가 처음 값을 갖는 것)
		
		//2. 참조 변수가 가지는 주소값 할당
		you = my; //주소값 할당(초기화) 처음 값을 갖는 행위
		System.out.println(you);
		
		//you 참조변수와 my 참조변수의 주소값이 같음을 증명
		System.out.println(you == my);//== 값 비교
		
		Tv t = new Tv();
		System.out.println("기본 채널 : " + t.channel);
		t.brand_name = "삼성";
		System.out.println("브랜드명 : " + t.brand_name);
		
		t.channel_up();
		t.channel_up();
		t.channel_up();
		System.out.println("변경된 채널 : " + t.channel);
		t.channel_down();
		System.out.println("변경된 채널 : " + t.channel);
	}
}

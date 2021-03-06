package kr.or.bit;
//class == 설계도 == 데이터 타입(data Type)
//설계도를 통해서 구체화 된 자원을 생성(객체, 인스턴스)
//설계도 기본 구성 요소(속성 + 행위(기능))
//class -> 속성(변수) + 행위(기능)(함수)
//**주의사항) 속성이 하나의 값으로 표현되지 않는다면 -> 클래스타입으로 또 만들어라**
//ex) class Car{ Window window = ... }
//class Window{}

public class Person {

	public String name; // instance variable
	public int age;

	public void print() { // method
		System.out.println(name + "/" + age);
	}
}

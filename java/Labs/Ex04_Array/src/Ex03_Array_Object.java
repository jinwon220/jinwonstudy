import java.util.Arrays;

class Person{
	String name;
	int age;
}

public class Ex03_Array_Object {
	public static void main(String[] args) {
		int[] intarr = new int[10];
		boolean[] barr = new boolean[5];
		// ... 등
		// 위에 Array는 값타입 배열
		// 클래스는 타입이다 (int, double 타입 올 수 있는 자리에 클래스 타입도 올수 있다)
		Person[] arrobj = new Person[3];
		System.out.println("주소값 : " + arrobj);
		System.out.println("arrobj[0] : " + arrobj[0]); //null
		
		arrobj[0] = new Person(); //생성된 방마다 new Person()을 메모리에 올려줘야 한다.
		System.out.println("arrobj[0] : " + arrobj[0]); //주소값
		
		arrobj[0].name="홍길동";
		arrobj[0].age=100;
		
		System.out.println("after : " + arrobj[0].name + ", " + arrobj[0].age);
		
		arrobj[1] = new Person();
		arrobj[2] = new Person();
		//////////////////////////
		//for문
		System.out.println("배열 : " + arrobj);
		
		for(int i = 0; i < arrobj.length; i++) {
			System.out.println(arrobj[i].name + "/" + arrobj[i].age);
		}
		
		//3가지 배열 만들기
		//1. int[] arr = new int[5]
		Person[] parray = new Person[5];
		for(int i = 0; i < parray.length; i++) {
			parray[i] = new Person(); //각각의 방에 memory생성
			System.out.println(parray[i]);
		}
		
		//2. int[] arr = new int[]{10,20,30}
		Person[] parray2 = new Person[] {new Person(), new Person(), new Person()}; //{각방에 memory생성}
		
		//3. int[] arr = {10,20,30} // 컴파일러가 알아서 new 생성..
		Person[] parray3 = {new Person(), new Person(), new Person()};
	}

}

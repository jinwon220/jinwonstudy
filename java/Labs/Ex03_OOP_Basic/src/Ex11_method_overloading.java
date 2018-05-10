import java.util.Arrays;

/*
 객체 지향 언어 특징
 캡슐화, 상속, 다형성
 
 캡슐화(은닉화) -> private
 
[ method overloading ]
하나의 이름으로 여러가지 기능을 하는 함수 

사용 : ex) println() 오버로딩 하는 대표적인 함수
특징 : 오버로딩은 성능향상에 도움을 주지 않는다. (성능과 상관없음)
	
	why) 타입에 따라 함수를 바꿀 필요 없이 편하게 사용하기 위해서
         ex)println(int i)
         	println(String s)
         	println(double d)
         	println(boolean b)
         	... 등 8가지 타입 + String 처럼  함수의 이름은 같지만 타입은 다르다  
         	
         설계시 어떤점을 생각하면 : 함수의 활용이 많은 경우 (parameter 변경)
         
문법 : 함수의 이름은 같고 parameter 의 개수와 타입을 달리하는 방법
 1. 함수의 이름은 같아야 한다.
 2. [parameter] 개수 또는 [Type]은 달라야 한다
 3. return type은 overloading의 판단기준(x)
 4. parameter 순서가 다름을 인정한다.
*/

class Human{
	String name;
	int age;
}

class OverTest{
	
	//오버로딩
	void add(Human h) {
		h.name = "홍길동";
		h.age = 100;
	}
	
	int add(int i) {
		return 100 + i;
	}
	String add(String s) {
		return "hello" + s;
	}
	
	/*
	충돌 (오버로딩 인정 X) void add(int k) {
	return k; 
	}
	*/
	int add(int i, int k) {
		return i + k;
	}
	void add(int i, String s) {
		System.out.println("오버로딩");
	}
	void add(String s, int i) {// 순서가 다름을 인정한다
		System.out.println("parameter 순서가 다름을 인정");
	}
	
	//배열을(Array) 배우고 난 후...
	//초중급 코드
	//int[] source = {1,2,3,4,5}
	int[] add(int[] param) { //int 타입 정수배열의 주소값을 param으로 받겠다.
		int[] target = new int[param.length];
		for(int i=0; i < param.length; i++) {
			target[i] = param[i]+1;
		}
		return target; //return int타입 정수배열의 주소값을 리턴 하겠다.
	}
	
	//Quiz
	int[] add(int[] so, int[] so2) {
		int[] result = new int[so.length+so2.length];
		for(int i = 0; i < so.length; i++) {
			for(int j = 0; j < so2.length; j++) {
				result[i] = so[i];
				result[i+(j+1)] = so2[j];
			}
		}
		for(int i = 0; i < result.length; i++) {
			for(int j = i; j < result.length; j++) {
				if (result[i] >= result[j]) {
					int temp = result[i];
					result[i] = result[j];
					result[j] = temp;
				}
			}
		}
		return result;
	}	
}

public class Ex11_method_overloading {
	public static void main(String[] args) {
		OverTest t = new OverTest();
		t.add(100, "AAA");
		t.add("BBB", 2000);
		//t.add("A", "B"); // (String, String)으로 만든게 없기 때문에 실행 불가 
		
		//1. ok
		Human m = new Human();
		t.add(m);
		
		//2. ok
		t.add(new Human());

		///////////////////////////////////
		int[] source = {10,20,30,40,50};
		int[] target = t.add(source); // source 배열의 주소값
		//1. source 변수 와 target 배열변수는 주소값이 : 다르다
		System.out.println(source + " / " + target);
		for(int s : source) {
			System.out.print(s+" ");
		}
		System.out.println();
		for(int s : target) {
			System.out.print(s+" ");
		}
		//////////////////////////////////
		System.out.println();
		int[] result = t.add(source, target);
		System.out.println(Arrays.toString(result));
	}

}

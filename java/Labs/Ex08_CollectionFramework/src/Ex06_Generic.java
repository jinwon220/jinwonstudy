import java.util.ArrayList;
import java.util.Stack;

import kr.or.bit.Coin;

//Today Point
//generic
//JDK 1.5 version ���� ����
//Java, C# �ʼ����

//1.Object Ÿ�� ���� -> Object Ÿ�� Ż��
//2.Ÿ�� ������ (Ÿ�� ������)
//3.����ȯ(casting) ���� �ذ� : (Car)obj;

class Person{
	int age = 100;
}

//Generic Ŭ���� ���� >> Ÿ���� �����ؼ� ��ü�� ����
//MyGen<String> m = new MyGen<String>();
class MyGen<T>{ //Type Parameter
	T obj;
	void add(T obj) {
		this.obj = obj;
	}
	T get() {
		return this.obj;
	}
}

/*
//MyGen<String> m = new MyGen<String>();
  
class MyGen<String>{ //Type Parameter
	String obj;
	void add(String obj) {
		this.obj = obj;
	}
	T get() {
		return this.obj;
	}
}
*/

public class Ex06_Generic {
	public static void main(String[] args) {
		MyGen<String> my = new MyGen<>();
		my.add("Hello");
		String result = my.get();
		System.out.println(result);
		
		//Person Ÿ���� �����ϴ�
		//MyGen Ÿ���� ��ü ����..
		MyGen<Person> myobj = new MyGen<>();
		myobj.add(new Person());
		Person p = myobj.get();
		System.out.println(p.age);
		
		//Quiz (Generic x)
		ArrayList list = new ArrayList();
		list.add(500);
		list.add(new Person());
		list.add("ȫ�浿");
		
		for(Object o : list) {
			if(o instanceof Person) {
				Person pe = (Person)o;
				System.out.println(pe.age);
			}else System.out.println(o);
		}
		
		//�� ó�� ������� ����
		//�� ó�� ������� ����
		 ArrayList<Person> alist = new ArrayList<>();
		 alist.add(new Person());
		 System.out.println(alist.get(0).age);
		 
		///////////////////////////////////
		//JAVA API �����ϴ�  Stack Ŭ����
		Stack<Coin> coinBox = new Stack<Coin>();
		
		// �������̽��� ������ ����
		// 100��, 50��, 500��, 10�� ������ �ִ´�. 
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(!coinBox.isEmpty()){
		Coin coin = coinBox.pop();
		System.out.println("������ ���� : " + coin.getValue() + "��");
		}
	}

}

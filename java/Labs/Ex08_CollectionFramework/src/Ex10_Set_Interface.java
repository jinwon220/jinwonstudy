import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

//Set 인터페이스 구현하는 클래스
//Set 순서(X), 중복(X) 이런 데이터 집합을 다룰 때
//HashSet, TreeSet
//순서 (넣은 순서를 보장하지 않아요)
public class Ex10_Set_Interface {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(100);
		hs.add(55);
		System.out.println(hs.toString());
		//중복 데이터 처리(POINT)
		boolean bo = hs.add(1);
		System.out.println(bo);
		System.out.println(hs);
		hs.add(2);
		System.out.println(hs);
		
		HashSet<String> hs2 = new HashSet<>();
		hs2.add("b");
		hs2.add("A");
		hs2.add("F");
		hs2.add("c");
		hs2.add("z");
		System.out.println(hs2);
		
		//1. 중복 허락하지 않아요
		String[] obj = {"A", "B", "A", "C", "D", "B", "A"};
		HashSet<String> hs3 = new HashSet<>();
		for(int i = 0; i < obj.length; i++) {
			hs3.add(obj[i]);
		}
		System.out.println(hs3.toString());
		
		//Quiz
		//HashSet을 사용해서 1~45까지의 난수 6개 넣으세요
		//단, 중복값 X
		Set<Integer> set = new HashSet<>();
		while(set.size() < 6) {
			set.add((int)((Math.random()*45)+1));
		}
		System.out.println(set);
		Set<Integer> set2 = new HashSet<>();
		for(;set2.size() < 6;) {
			set2.add((int)((Math.random()*45)+1));
		}
		System.out.println(set2);
		
		
		Set<String> set3 = new HashSet<>();
		set3.add("AA");
		set3.add("DD");
		set3.add("ABC");
		set3.add("FFFF");
		System.out.println(set3);
		//순서 (add 한 순서) 보장 하지 않는다(배열이 아니예요)
		
		Iterator<String> s= set3.iterator();
		while(s.hasNext()) {
			System.out.println(s.next());
		}
		
		//Collections.sort(list); //List 인터페이스 구현한 객체
		//Collections.reverse(list); // 내림차순
		
		//Set 인터페이스 구현 자원 : sort의 의미가 없음(순서가 없기 때문에) => 수의 집합
		//굳이 sort를 하고 싶으면 방법은 있다. 
		List list = new ArrayList(set3);
		//new ArrayList(Collection<> c)
		System.out.println("before 무작위 : " + list);
		Collections.sort(list);
		System.out.println("after 정렬 : " + list);
		
	}

}









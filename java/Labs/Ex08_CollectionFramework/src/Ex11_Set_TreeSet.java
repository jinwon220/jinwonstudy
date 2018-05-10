import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*

*/
public class Ex11_Set_TreeSet {
	public static void main(String[] args) {
		//순서유지(x) , 중복(x)
		Set<String> hs = new HashSet<>();
		hs.add("B");
		hs.add("A");
		hs.add("F");
		hs.add("K");
		hs.add("G");
		hs.add("D");
		hs.add("P");
		hs.add("A");
		System.out.println(hs.toString());
		
		//HashSet 확장 > LinkedHashSet (내부적으로 순서 유지) : Linked(객체가 주소를 가지고 있다) >> node
		//										LinkedList, LinkedHashSet
		Set<String> hs2 = new LinkedHashSet<>();
		hs2.add("B");
		hs2.add("A");
		hs2.add("F");
		hs2.add("K");
		hs2.add("G");
		hs2.add("D");
		hs2.add("P");
		hs2.add("A");
		//Array(배열) X!!!! 주소값들을 연결한 것!!!
		System.out.println(hs2.toString());
		
		//자료구조 (순서(x), 중복(x), 정렬(o))
		//검색 하거나, 정렬을 필요로 하는 자료구조 (알고리즘)
		//TreeSet
		//데이터 트리(이진트리) : 정렬되고 많은 양의 데이터 저장 효율적
		//검색 속도
		//TreeSet을 사용 해서 로또 를 구현하세요
		//1~45난수 >> 6개 >> 중복값(x) >> 정렬(o)
		//결과 출력  (Iterator)
		System.out.println("--------------");
		
		
		Set<Integer> lottos = new TreeSet<>();
		while(lottos.size() < 6) {
			lottos.add((int)((Math.random()*45)+1));
		}
		System.out.println(lottos);
		
		Iterator<Integer> readline = lottos.iterator();
		int i = 1;
		while(readline.hasNext()) {
			System.out.println(i++ +"번째 수 : " + readline.next());
		}
		
		
	}

}










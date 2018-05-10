import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

//ToDay KeyPoint (ArrayList)
//ArrayList 통해서 객체 다루기

public class Ex02_ArrayList {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add(100);
		arrayList.add(200);
		arrayList.add(300);
		
		System.out.println(arrayList.toString());
		for(int i=0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		/*
		for(Object object : arrayList) {
			System.out.println(object);
		}
		*/
		System.out.println("현재[0]" + arrayList.get(0));
		arrayList.add(0, 1111); //들여쓰기 (밀어내서 쓰기)
		//비순차적인 데이터 추가 삭제 (:<) -> 중간 이나 첫부분에 추가 삭제
		//순차적인 데이터 추가 삭제 (:D) -> 마지막쪽 추가 삭제
		System.out.println("현재[0]" + arrayList.get(0));
		System.out.println(arrayList.toString());
		
		//데이터 삽입 (add) : 중간에 -> 데이터 이동
		//처음, 중간 (비순차적인) 데이터 추가, 삭제 하는 작업은 성능상 좋지 않다
		//순차적인 데이터 추가 , 삭제  좋아요
		
		//ArrayList 함수 활용
		System.out.println(arrayList.contains(200));
		System.out.println(arrayList.contains(333));
		
		System.out.println(arrayList.isEmpty()); //너 비어 있니(true, false)
		arrayList.clear();
		System.out.println(arrayList.isEmpty()); //clear >> size == 0 >> true
		
		arrayList.add(101);
		arrayList.add(102);
		arrayList.add(103);
		System.out.println(arrayList.toString());
		
		//0번째 방에 있는 데이터 삭제
		Object value = arrayList.remove(0); //필요하다면 지우는 값을 돌려 받을 수 있다.
		System.out.println("value : " + value);
		System.out.println(arrayList.toString());
		
		ArrayList list = new ArrayList();
		list.add("가");
		list.add("나");
		list.add("다");
		list.add("가");
		
		System.out.println("ArrayList:순서유지 : " + list);
		list.remove("가"); // 값을 주면 앞에서 찾아서 삭제
		System.out.println("ArrayList 삭제  : " + list);
		
		//집중
		//List 인터페이스를 부모 타입으로
		List li = new ArrayList();
		li = new Vector();
		//void move(List li){}
		
		li.add("가");
		li.add("나");
		li.add("다");
		li.add("라");
		
		List li4 = li.subList(0, 2); // new ArrayList() >> add("가"), add("나")
		System.out.println(li);
		System.out.println(li4);
		
		ArrayList alist = new ArrayList();
		alist.add(50);
		alist.add(1);
		alist.add(7);
		alist.add(40);
		alist.add(7);
		alist.add(15);
		
		System.out.println("before : " + alist);
		//Arrays.sort(); 보조클래스
		Collections.sort(alist);
		
		System.out.println("after : " + alist);
	}

}

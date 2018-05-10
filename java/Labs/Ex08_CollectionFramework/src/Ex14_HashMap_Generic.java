import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Today Point
//HashMap generic 사용
//HashMap<K, V>
//HashMap<String, String>
//HashMap<String, Integer>
//HashMap<String, Emp>  => value 값으로 객체(클래스)를 사용

//IO, Network, Thread => ArrayList<Emp>, HashMap<String, Emp> 많이 사용 됨

//그냥 외우기 매우 중요~!~!~!
//Map.Entry m 리턴을 받으면
//m.getKey() , m.getValue()

class Student{
	int kor = 100;
	int math = 80;
	int eng = 20;
	String name;
	Student(String name){
		this.name = name;
	}
}

public class Ex14_HashMap_Generic {
	public static void main(String[] args) {
		Map<String, Student> students = new HashMap<>();
		students.put("hong", new Student("홍길동"));
		students.put("kim", new Student("김유신"));
		
		Student std = students.get("hong");
		System.out.println(std.name);
		System.out.println(std.eng);
		
		//예외적인 사례
		Set set = students.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-----------");
		//예외적인 CASE : value 가 객체(Object) 일때
		//Map.Entry m 리턴을 받으면
		//m.getKey() , m.getValue()
		for(Map.Entry m : students.entrySet()) {
			System.out.println(m.getKey() + " / "
							+ ((Student)m.getValue()).name + " / "
							+ ((Student)m.getValue()).kor + " / "
							+ ((Student)m.getValue()).math);
		}
		
		/* 일반적인 사례
		Map map = new HashMap();
		map.put("Tiger", "1004");
		map.put("scott", "1004");
		map.put("superman", "1007");
		Set set2 = map.entrySet();
		Iterator it = set2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		*/
	}

}

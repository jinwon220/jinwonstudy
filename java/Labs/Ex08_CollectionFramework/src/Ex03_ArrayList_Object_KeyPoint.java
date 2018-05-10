import java.util.ArrayList;

import kr.or.bit.Emp;

public class Ex03_ArrayList_Object_KeyPoint {
	public static void main(String[] args) {
		//정적배열(Array)
		//사원 1명을 만드세요
		Emp e = new Emp(100, "김유신", "군인");
		System.out.println(e);
		
		//정적배열(Array)
		//사원 2명을 만드세요
		Emp[] e2 = {new Emp(101, "김씨", "IT"),
					new Emp(102, "박씨", "SALES")};
		
		for(Emp em : e2) {
			System.out.println(em);
		}
		///////////////기존 배열(정적) 복습///////////////
		
		//ArrayList 를 사용해서
		//사원 2명을 만드세요
		ArrayList e3 = new ArrayList(2);
		e3.add(new Emp(103, "이씨", "GG"));
		e3.add(new Emp(104, "정씨", "Good"));
		System.out.println(e3);
		
		//for문을 사용해서 사원데이터 정보를 출력하는 toString() 사용 금지
		//for문을 개선된 for문 X 일반 for문을 통해서 출력
		for(int i = 0; i < e3.size(); i++) {
			//System.out.println(e3.get(i).toString());
			//System.out.println(((Emp)e3.get(i)).toString());
			Emp m = (Emp)e3.get(i);
			System.out.println(m.getEmpno()+" / " + m.getEname() + " / " + m.getJob());
		}
		//개선된 for문
		for(Object obj : e3) {
			Emp m = (Emp)obj;
			System.out.println(m.getEmpno());
		}
		//Object 불편
		//generic (100%사용)
		ArrayList<Emp> e4 = new ArrayList<>();
		e4.add(new Emp(105, "A", "IT"));
		e4.add(new Emp(106, "B", "SALES"));
		
		for(Emp em : e4) {
			System.out.println(em.getEmpno() + " / " + em.getEname() + " / " + em.getJob());
		}
	}

}

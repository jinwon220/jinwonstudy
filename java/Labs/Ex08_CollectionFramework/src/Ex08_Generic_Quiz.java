import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import kr.or.bit.CopyEmp;
import kr.or.bit.Emp;

public class Ex08_Generic_Quiz {

	public static void main(String[] args) {
		//1. Emp 클래스를 사용해서 사원 3명을 생성하세요
		//단 ArrayList<T> 제너릴을 사용하세요
		List<Emp> emps = new ArrayList<>();
		emps.add(new Emp(1, "A", "IT"));
		emps.add(new Emp(2, "B", "Programer"));
		emps.add(new Emp(3, "C", "PRO"));
		//2. 사원의 정보(사번, 이름, 직종)을 개선된 for문으로 출력하시오
		//단, toString() 사용 금지
		for(Emp e : emps) {
			System.out.println(e.getEmpno()+" / "+e.getEname()+" / "+ e.getJob());
		}
		//3. 사원의 정보(사번, 이름, 직종)을 일반 for문으로 출력하시오
		//단, toString() 사용 금지
		System.out.println("---------------");
		for(int i = 0; i < emps.size(); i++) {
			System.out.println(emps.get(i).getEmpno()+" / "+emps.get(i).getEname()+" / "+ emps.get(i).getJob());
		}
		
		// 4.CopyEmp 라는 클래스를 만드세요(Emp 와 같은데)
		// job member field 대신에 >>
		// private int sal; 로 바꾸어서 만드세요(getter ,setter 구현)
		// kr.or.bit.CopyEmp 로 하세요
		// ArrayList<> 제너릭 사용해서 사원 3명 만드세요
		// 아래 데이터 사용
		// 100,"김",1000
		// 200,"이",2000
		// 300,"박",3000
		List<CopyEmp> copyEmps = new ArrayList<>();
		copyEmps.add(new CopyEmp(100, "김", 1000));
		copyEmps.add(new CopyEmp(200, "이", 2000));
		copyEmps.add(new CopyEmp(300, "박", 3000));
		
		// 5.200번 사원의 급여를 5000으로 수정해서 출력하세요(일반 for문 안에서 ....)
		for(int i =0; i < copyEmps.size(); i++) {
			if(copyEmps.get(i).getEmpno() == 200) {
				copyEmps.get(i).setSal(5000);
			}
			System.out.println(copyEmps.get(i).getEmpno()+" / "
							   +copyEmps.get(i).getEname()+" / "
							   +copyEmps.get(i).getSal());
		}
		
		// 6.300번 사원의 이름을 "궁금해" 로 수정해서 출력하세요(일반 for문 안에서 ....)
		System.out.println("--------------------");
		for(CopyEmp co : copyEmps) {
			if(co.getEmpno() == 300) {
				co.setEname("궁금해");
			}
			System.out.println(co.getEmpno()+" / "+co.getEname()+" / "+ co.getSal());
		}

		// 7. 사원정보를 Iterator를 이용하여 출력하시오
		System.out.println("--------------------");
		Iterator<CopyEmp> it = copyEmps.iterator();
		while(it.hasNext()) {
			//next() 이동 값을 return
//			System.out.println(it.next().getEmpno());
//			System.out.println(it.next().getEname());
//			System.out.println(it.next().getSal());
			CopyEmp e = it.next();
			System.out.println(e.getEmpno());
			System.out.println(e.getEname());
			System.out.println(e.getSal());
		}
	}

}

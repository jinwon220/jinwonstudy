package kr.or.bit;

//DTO (VO, DMAIN) 클래스
public class Emp { // public class Emp extends Object (default)
	private int empno;
	private String ename;
	
	//Constructor
	public Emp(int empno, String ename) {
		super();
		this.empno = empno;
		this.ename = ename;
	}
	
	//getter , setter
	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	//Object 가지고 있는 toString()함수는 주소값을 return 함수
	//재정의(override)
	//주로 member field 값 출력용으로 사용...
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + "]";
	}
}

package kr.or.bit;
//사원은 사번, 이름, 직종(job)을 가지고 있다 => 원칙(캡슐화) => read, write 지원 setter, getter
//사원 생성시 default 로 사번은 9999, 이름=아무개, 직종=인턴
//Employee e = new Employee();
//별도의 사번, 이름, 직종을 통해 사원 생성도 가능하다
//사원이 가지는 사번, 이름, 직종 생성 후 각각 수정이 가능하다.
//사원정보는 사번, 이름, 직종을 한번에 확인 할 수 있고(각각의 정보는 확인 불가 하다)
public class Employee {
	private int empno;
	private String ename;
	private String job;
	
	//dafault constructor
	public Employee() {
		empno = 9999;
		ename = "아무개";
		job = "인턴";
	}
	//overloading constructor
	public Employee(int empno, String ename, String job) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
	}
	
	public void empInfo() {
		System.out.printf("사원번호 : [%d], 사원이름 : [%s], 직종 : [%s]\n", empno, ename, job);
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setJob(String job) {
		this.job = job;
	}
}

package kr.or.bit;

public class Emp {
	private int empno;
	private String ename;
		
	// 생성자를 만드는 코드(오버로딩 constructor)
	// 생성자 함수 (member field 초기화 : 객체생성과 동시에 처리)
	// 함수의 이름은 클래스의 이름과 동일 해야함
	public Emp() {
		//default
	}
	public Emp(int empno, String ename) {
		this.empno = empno;
		this.ename = ename;
	}
	
	
	public void InsertEmp(int data, String data2) {
		empno = data;
		ename = data2;
	}
	public void setEmpno(int data) {
		empno = data;
	}
	public int getEmpno() {
		return empno;
	}
	
	//자동생성
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public void empInfo() {
		System.out.println(empno + " / " + ename);
	}
}

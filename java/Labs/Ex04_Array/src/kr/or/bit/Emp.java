package kr.or.bit;

public class Emp {
	private int empno;
	private String ename;
		
	// �����ڸ� ����� �ڵ�(�����ε� constructor)
	// ������ �Լ� (member field �ʱ�ȭ : ��ü������ ���ÿ� ó��)
	// �Լ��� �̸��� Ŭ������ �̸��� ���� �ؾ���
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
	
	//�ڵ�����
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

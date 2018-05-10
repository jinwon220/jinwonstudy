package kr.or.bit;
//����� ���, �̸�, ����(job)�� ������ �ִ� => ��Ģ(ĸ��ȭ) => read, write ���� setter, getter
//��� ������ default �� ����� 9999, �̸�=�ƹ���, ����=����
//Employee e = new Employee();
//������ ���, �̸�, ������ ���� ��� ������ �����ϴ�
//����� ������ ���, �̸�, ���� ���� �� ���� ������ �����ϴ�.
//��������� ���, �̸�, ������ �ѹ��� Ȯ�� �� �� �ְ�(������ ������ Ȯ�� �Ұ� �ϴ�)
public class Employee {
	private int empno;
	private String ename;
	private String job;
	
	//dafault constructor
	public Employee() {
		empno = 9999;
		ename = "�ƹ���";
		job = "����";
	}
	//overloading constructor
	public Employee(int empno, String ename, String job) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
	}
	
	public void empInfo() {
		System.out.printf("�����ȣ : [%d], ����̸� : [%s], ���� : [%s]\n", empno, ename, job);
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

package kr.or.bit;
/*
������ : ȫ�浿
��¥ : 2018-01-23
���� : Emp.java (�������)

* class ���赵�̴�
���赵�� �⺻���� �������(��������(�Ӽ�):���� + ��������(���):�Լ�)

*/

//��ü���� 3�� Ư¡ ĸ��ȭ ��� ������
//���赵�� ���� �Լ��� ���� �ʴ´�.
public class Emp {
	public int empno; //��� (���� > �������� > member field > instance variable)
	public String ename; //�̸�
	private String job; //����
	
	//��������(���) > �Լ�(main�� �Լ�)
	//�Լ��� (ȣ��) > ����
	public String getEmpInfo() {
		return this.empno + "/" + this.ename + "/" + this.job;
	}
	
	//�Լ� 2�� ����
	//ĸ��ȭ (����ȭ)
	//�����Ҵ��� ���� �����Ҵ��� ���ؼ� ���ϴ� ���� �Է� �Ǵ� ���� ����
	//setter �Լ�, getter �Լ�
	//private �����ڸ� ������ ����
	//�б� ����(read)
	public String getJob() {
		return job + "�Դϴ�.";
	}
	//���� ����(write)
	public void setJob(String job) {
		this.job = job;
	}
}

import kr.or.bit.Emp;

//�迭���� ���� �߿��� �ڵ�� : ��ü�迭
//[�ǹ����� ���� ���� ���]
public class Ex04_Array_Object {
	public static void main(String[] args) {
		//��� 3���� ���弼��
		/* 
		 * �迭 ���x
		Emp e = new Emp();
		Emp e2 = new Emp();
		Emp e3 = new Emp();
		*/
		Emp[] emplist = new Emp[3];
		
		emplist[0] = new Emp();
		emplist[0].setEmpno(1000);
		emplist[0].setEname("ȫ�浿");
		
		emplist[1] = new Emp();
		emplist[1].InsertEmp(2000, "������");
		emplist[2] = new Emp();
		emplist[2].InsertEmp(3000, "������");
		
		//�����ȣ�� ����̸��� ����ϼ���(for)
		for(int i = 0; i < emplist.length; i++) {
			emplist[i].empInfo();
		}
		
		//int[] arr = new int[]{10, 20, 30} ������ ��� 3�� ���� ���� ���
		Emp[] emplist2 = {new Emp(1, "�̾�"), new Emp(2, "�ھ�"), new Emp(3, "�达")};
		for(int i = 0; i < emplist2.length; i++) {
			emplist2[i].empInfo();
		}
		
		//int[] arr = {10, 20, 30} ������ ��� 3�� ���� ���� ���
		Emp[] emplist3 = {new Emp(111, "A"), new Emp(222, "B"), new Emp(333, "C")};
		for(int i = 0; i < emplist3.length; i++) {
			emplist3[i].empInfo();
		}
	}

}

import java.util.ArrayList;

import kr.or.bit.Emp;

public class Ex03_ArrayList_Object_KeyPoint {
	public static void main(String[] args) {
		//�����迭(Array)
		//��� 1���� ���弼��
		Emp e = new Emp(100, "������", "����");
		System.out.println(e);
		
		//�����迭(Array)
		//��� 2���� ���弼��
		Emp[] e2 = {new Emp(101, "�达", "IT"),
					new Emp(102, "�ھ�", "SALES")};
		
		for(Emp em : e2) {
			System.out.println(em);
		}
		///////////////���� �迭(����) ����///////////////
		
		//ArrayList �� ����ؼ�
		//��� 2���� ���弼��
		ArrayList e3 = new ArrayList(2);
		e3.add(new Emp(103, "�̾�", "GG"));
		e3.add(new Emp(104, "����", "Good"));
		System.out.println(e3);
		
		//for���� ����ؼ� ��������� ������ ����ϴ� toString() ��� ����
		//for���� ������ for�� X �Ϲ� for���� ���ؼ� ���
		for(int i = 0; i < e3.size(); i++) {
			//System.out.println(e3.get(i).toString());
			//System.out.println(((Emp)e3.get(i)).toString());
			Emp m = (Emp)e3.get(i);
			System.out.println(m.getEmpno()+" / " + m.getEname() + " / " + m.getJob());
		}
		//������ for��
		for(Object obj : e3) {
			Emp m = (Emp)obj;
			System.out.println(m.getEmpno());
		}
		//Object ����
		//generic (100%���)
		ArrayList<Emp> e4 = new ArrayList<>();
		e4.add(new Emp(105, "A", "IT"));
		e4.add(new Emp(106, "B", "SALES"));
		
		for(Emp em : e4) {
			System.out.println(em.getEmpno() + " / " + em.getEname() + " / " + em.getJob());
		}
	}

}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import kr.or.bit.CopyEmp;
import kr.or.bit.Emp;

public class Ex08_Generic_Quiz {

	public static void main(String[] args) {
		//1. Emp Ŭ������ ����ؼ� ��� 3���� �����ϼ���
		//�� ArrayList<T> ���ʸ��� ����ϼ���
		List<Emp> emps = new ArrayList<>();
		emps.add(new Emp(1, "A", "IT"));
		emps.add(new Emp(2, "B", "Programer"));
		emps.add(new Emp(3, "C", "PRO"));
		//2. ����� ����(���, �̸�, ����)�� ������ for������ ����Ͻÿ�
		//��, toString() ��� ����
		for(Emp e : emps) {
			System.out.println(e.getEmpno()+" / "+e.getEname()+" / "+ e.getJob());
		}
		//3. ����� ����(���, �̸�, ����)�� �Ϲ� for������ ����Ͻÿ�
		//��, toString() ��� ����
		System.out.println("---------------");
		for(int i = 0; i < emps.size(); i++) {
			System.out.println(emps.get(i).getEmpno()+" / "+emps.get(i).getEname()+" / "+ emps.get(i).getJob());
		}
		
		// 4.CopyEmp ��� Ŭ������ ���弼��(Emp �� ������)
		// job member field ��ſ� >>
		// private int sal; �� �ٲپ ���弼��(getter ,setter ����)
		// kr.or.bit.CopyEmp �� �ϼ���
		// ArrayList<> ���ʸ� ����ؼ� ��� 3�� ���弼��
		// �Ʒ� ������ ���
		// 100,"��",1000
		// 200,"��",2000
		// 300,"��",3000
		List<CopyEmp> copyEmps = new ArrayList<>();
		copyEmps.add(new CopyEmp(100, "��", 1000));
		copyEmps.add(new CopyEmp(200, "��", 2000));
		copyEmps.add(new CopyEmp(300, "��", 3000));
		
		// 5.200�� ����� �޿��� 5000���� �����ؼ� ����ϼ���(�Ϲ� for�� �ȿ��� ....)
		for(int i =0; i < copyEmps.size(); i++) {
			if(copyEmps.get(i).getEmpno() == 200) {
				copyEmps.get(i).setSal(5000);
			}
			System.out.println(copyEmps.get(i).getEmpno()+" / "
							   +copyEmps.get(i).getEname()+" / "
							   +copyEmps.get(i).getSal());
		}
		
		// 6.300�� ����� �̸��� "�ñ���" �� �����ؼ� ����ϼ���(�Ϲ� for�� �ȿ��� ....)
		System.out.println("--------------------");
		for(CopyEmp co : copyEmps) {
			if(co.getEmpno() == 300) {
				co.setEname("�ñ���");
			}
			System.out.println(co.getEmpno()+" / "+co.getEname()+" / "+ co.getSal());
		}

		// 7. ��������� Iterator�� �̿��Ͽ� ����Ͻÿ�
		System.out.println("--------------------");
		Iterator<CopyEmp> it = copyEmps.iterator();
		while(it.hasNext()) {
			//next() �̵� ���� return
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

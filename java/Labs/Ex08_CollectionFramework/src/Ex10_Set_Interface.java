import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

//Set �������̽� �����ϴ� Ŭ����
//Set ����(X), �ߺ�(X) �̷� ������ ������ �ٷ� ��
//HashSet, TreeSet
//���� (���� ������ �������� �ʾƿ�)
public class Ex10_Set_Interface {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(100);
		hs.add(55);
		System.out.println(hs.toString());
		//�ߺ� ������ ó��(POINT)
		boolean bo = hs.add(1);
		System.out.println(bo);
		System.out.println(hs);
		hs.add(2);
		System.out.println(hs);
		
		HashSet<String> hs2 = new HashSet<>();
		hs2.add("b");
		hs2.add("A");
		hs2.add("F");
		hs2.add("c");
		hs2.add("z");
		System.out.println(hs2);
		
		//1. �ߺ� ������� �ʾƿ�
		String[] obj = {"A", "B", "A", "C", "D", "B", "A"};
		HashSet<String> hs3 = new HashSet<>();
		for(int i = 0; i < obj.length; i++) {
			hs3.add(obj[i]);
		}
		System.out.println(hs3.toString());
		
		//Quiz
		//HashSet�� ����ؼ� 1~45������ ���� 6�� ��������
		//��, �ߺ��� X
		Set<Integer> set = new HashSet<>();
		while(set.size() < 6) {
			set.add((int)((Math.random()*45)+1));
		}
		System.out.println(set);
		Set<Integer> set2 = new HashSet<>();
		for(;set2.size() < 6;) {
			set2.add((int)((Math.random()*45)+1));
		}
		System.out.println(set2);
		
		
		Set<String> set3 = new HashSet<>();
		set3.add("AA");
		set3.add("DD");
		set3.add("ABC");
		set3.add("FFFF");
		System.out.println(set3);
		//���� (add �� ����) ���� ���� �ʴ´�(�迭�� �ƴϿ���)
		
		Iterator<String> s= set3.iterator();
		while(s.hasNext()) {
			System.out.println(s.next());
		}
		
		//Collections.sort(list); //List �������̽� ������ ��ü
		//Collections.reverse(list); // ��������
		
		//Set �������̽� ���� �ڿ� : sort�� �ǹ̰� ����(������ ���� ������) => ���� ����
		//���� sort�� �ϰ� ������ ����� �ִ�. 
		List list = new ArrayList(set3);
		//new ArrayList(Collection<> c)
		System.out.println("before ������ : " + list);
		Collections.sort(list);
		System.out.println("after ���� : " + list);
		
	}

}









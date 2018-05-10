import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

//ToDay KeyPoint (ArrayList)
//ArrayList ���ؼ� ��ü �ٷ��

public class Ex02_ArrayList {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add(100);
		arrayList.add(200);
		arrayList.add(300);
		
		System.out.println(arrayList.toString());
		for(int i=0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		/*
		for(Object object : arrayList) {
			System.out.println(object);
		}
		*/
		System.out.println("����[0]" + arrayList.get(0));
		arrayList.add(0, 1111); //�鿩���� (�о�� ����)
		//��������� ������ �߰� ���� (:<) -> �߰� �̳� ù�κп� �߰� ����
		//�������� ������ �߰� ���� (:D) -> �������� �߰� ����
		System.out.println("����[0]" + arrayList.get(0));
		System.out.println(arrayList.toString());
		
		//������ ���� (add) : �߰��� -> ������ �̵�
		//ó��, �߰� (���������) ������ �߰�, ���� �ϴ� �۾��� ���ɻ� ���� �ʴ�
		//�������� ������ �߰� , ����  ���ƿ�
		
		//ArrayList �Լ� Ȱ��
		System.out.println(arrayList.contains(200));
		System.out.println(arrayList.contains(333));
		
		System.out.println(arrayList.isEmpty()); //�� ��� �ִ�(true, false)
		arrayList.clear();
		System.out.println(arrayList.isEmpty()); //clear >> size == 0 >> true
		
		arrayList.add(101);
		arrayList.add(102);
		arrayList.add(103);
		System.out.println(arrayList.toString());
		
		//0��° �濡 �ִ� ������ ����
		Object value = arrayList.remove(0); //�ʿ��ϴٸ� ����� ���� ���� ���� �� �ִ�.
		System.out.println("value : " + value);
		System.out.println(arrayList.toString());
		
		ArrayList list = new ArrayList();
		list.add("��");
		list.add("��");
		list.add("��");
		list.add("��");
		
		System.out.println("ArrayList:�������� : " + list);
		list.remove("��"); // ���� �ָ� �տ��� ã�Ƽ� ����
		System.out.println("ArrayList ����  : " + list);
		
		//����
		//List �������̽��� �θ� Ÿ������
		List li = new ArrayList();
		li = new Vector();
		//void move(List li){}
		
		li.add("��");
		li.add("��");
		li.add("��");
		li.add("��");
		
		List li4 = li.subList(0, 2); // new ArrayList() >> add("��"), add("��")
		System.out.println(li);
		System.out.println(li4);
		
		ArrayList alist = new ArrayList();
		alist.add(50);
		alist.add(1);
		alist.add(7);
		alist.add(40);
		alist.add(7);
		alist.add(15);
		
		System.out.println("before : " + alist);
		//Arrays.sort(); ����Ŭ����
		Collections.sort(alist);
		
		System.out.println("after : " + alist);
	}

}

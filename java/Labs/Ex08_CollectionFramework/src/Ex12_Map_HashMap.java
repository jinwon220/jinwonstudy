import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
Map �������̽� ������ Ŭ����
Map -> (Ű, ��) �ֱ��� �迭
ex) ������ȣ(02, ����) (031, ��⵵)
key : �ߺ� x
value : �ߺ� o

Generic ���� ��

HashTable(������) : ����ȭ ����   -> (�� ������� ����)
HashMap(�Ź���) : ����ȭ ���� ���� �ʾƿ� (�ʿ��ϸ� ��밡��) ���� ���...

(����ȭ)����� �ǹ� ����  >> ���� ���� ���μ����� ���� Thread >> stack �ϳ��� ������  >> 
*/
public class Ex12_Map_HashMap {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("Tiger", "1004");
		map.put("scott", "1004");
		map.put("superman", "1007");
		
		//Collection -> �ڷᱸ��(������ ���� �� �ִ�) >> ���α׷� ���� �Ǵ� ���� ����
		// >> �޸�(�ֹ߼�) >> ���α׷� ���� >> ������ �����ϱ� ���ؼ� (���ϱ��) ������.txt(����, ����)
		// >> RDBMS (������ DB) ������Ʈ >> json ������ 
		//Ȱ�� : ȸ��ID, ȸ��PW
		
		System.out.println(map.containsKey("tiger")); //false => key ���� ��ҹ��� ���� 
		System.out.println(map.containsKey("scott"));
		System.out.println(map.containsValue("1004"));
		
		//(key, value)
		//key ���� ������ value �� ����ϴ� ���� ����
		System.out.println(map.get("Tiger")); //key�� ������ value �˻�
		System.out.println(map.get("hong")); //key�� ������ null���� ����
		
		//put
		map.put("Tiger", 1008); //���� (key�� ���� ��� put�� �ϰ� �Ǹ� value�� : overwrite)
		System.out.println(map.get("Tiger"));
		
		//remove ���� -> ���� value
		Object returnvalue = map.remove("superman");
		System.out.println(returnvalue); // value �� return
		System.out.println("size : " + map.size());
		System.out.println(map.toString());
		
		//keyset (key ���� ����)
		Set set = map.keySet(); //�ߺ�(x) , ����(x)
		//Set �������̽��� �����ϰ� �ִ� ��ü�� new�ؼ� key�� ��� �׸��� �ּҰ��� return
		//���
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//����ؼ� ���
		Collection vlist = map.values();
		Iterator it2 = vlist.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
	}

}

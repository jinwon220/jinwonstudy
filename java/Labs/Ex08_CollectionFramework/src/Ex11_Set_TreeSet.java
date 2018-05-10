import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*

*/
public class Ex11_Set_TreeSet {
	public static void main(String[] args) {
		//��������(x) , �ߺ�(x)
		Set<String> hs = new HashSet<>();
		hs.add("B");
		hs.add("A");
		hs.add("F");
		hs.add("K");
		hs.add("G");
		hs.add("D");
		hs.add("P");
		hs.add("A");
		System.out.println(hs.toString());
		
		//HashSet Ȯ�� > LinkedHashSet (���������� ���� ����) : Linked(��ü�� �ּҸ� ������ �ִ�) >> node
		//										LinkedList, LinkedHashSet
		Set<String> hs2 = new LinkedHashSet<>();
		hs2.add("B");
		hs2.add("A");
		hs2.add("F");
		hs2.add("K");
		hs2.add("G");
		hs2.add("D");
		hs2.add("P");
		hs2.add("A");
		//Array(�迭) X!!!! �ּҰ����� ������ ��!!!
		System.out.println(hs2.toString());
		
		//�ڷᱸ�� (����(x), �ߺ�(x), ����(o))
		//�˻� �ϰų�, ������ �ʿ�� �ϴ� �ڷᱸ�� (�˰���)
		//TreeSet
		//������ Ʈ��(����Ʈ��) : ���ĵǰ� ���� ���� ������ ���� ȿ����
		//�˻� �ӵ�
		//TreeSet�� ��� �ؼ� �ζ� �� �����ϼ���
		//1~45���� >> 6�� >> �ߺ���(x) >> ����(o)
		//��� ���  (Iterator)
		System.out.println("--------------");
		
		
		Set<Integer> lottos = new TreeSet<>();
		while(lottos.size() < 6) {
			lottos.add((int)((Math.random()*45)+1));
		}
		System.out.println(lottos);
		
		Iterator<Integer> readline = lottos.iterator();
		int i = 1;
		while(readline.hasNext()) {
			System.out.println(i++ +"��° �� : " + readline.next());
		}
		
		
	}

}










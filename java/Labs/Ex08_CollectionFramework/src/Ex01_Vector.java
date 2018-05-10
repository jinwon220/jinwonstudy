import java.util.Vector;

/*
Collection FrameWork
[�ټ��� �����͸� �ٷ�� ǥ��ȭ�� �������̽��� �����ϰ� �ִ� Ŭ������ ����]

Collection �������̽� -> List �������̽�(���) -> ����(ArrayList...)
				 -> Set �������̽�(���) -> ����(HashSet , TreeSet...)

Map �������̽� -> ����(HashMap...)
---------------------------------------------------------------
--List
������ �ִ� ������ ����
--Set
������ ���� ������ ����

----List----
--
List Interface (���� ���ÿ�)
: ����(O), �ߺ�(O) -> ���������� ������(�ڷ�, ��ü) -> Array(�迭) [0][1][2][3]

1.Vector(������) (�� ������� ����) -> ����ȭ(��Ƽ ������) -> ����(Lock) default -> ��ȣ (������ ������)
2.ArrayList(�Ź���) (���� �����) -> ����ȭ(��Ƽ ������) -> ����(Lock)x -> �ʿ信 ���� (Lock) ��� -> �� �� ���� ����

ex) ����ȭ����� 1�� (100���� ���ÿ�) -> ȭ��ǿ� �Ѹ��� ���� ��ٷȴٰ� ������� ������
ex) ����� ����(100�κ�/���뿡) (100���� ���ÿ�) -> ���뿡 ����ִ� ������� 100���� ���ÿ� �ͼ� ���� �� ����

--
Array (�迭)
���� ������ ����(�ѹ� ���� ũ�⸦ �����ϸ� ���� X(�Ұ�))
int[] arr =new int[10]; -> 10��  �ʿ信 ���� 11���� �ø� �� ����!! 
int[] arr =[10, 20, 30];-> 3��  �ʿ信 ���� 4���� �ø� �� ����!!

Array (����, ����)
1. �迭�� ũ�� ���� : Car[] cars = {new Car(), new Car()}; �� 2�� ����
2. �迭�� ���� : index(÷��) ���� >> cars[0], cars[0].name
3. �ʱ⿡ ������ ũ��� ���� �Ұ� 
--
List (����) �������̽��� ������ Ŭ����
1. �迭�� ũ�⸦ ���� Ȯ��, ��Ұ� ����  => �迭�� ���Ҵ�(�迭�� ���� ���� �ּҸ� �ű�)
2. ������ ����(Array)���, ����->index�� ������, �ߺ� �� ���
3. ������ ���� ����(Array)���
4. List �������̽��� �����ϴ� ��� �ڿ� Ŭ����(new �� ���� ��ü ����)
5. ���� Ŭ������ default Type(�ڷᱸ��) : ObjectŸ��  >> ����(�ڷ�ֱ�) >> int, Car .. 
   >> ����(�����뿡 Ÿ�� üũ -> ����� casting)
   >> casting(x) >> Object obj = .... ������ ������ �ʹ� ���� �ڵ��ʿ� (������ ���)
   
6. �� Object Ÿ�� ������ �غ��ϰ��� ->  ���ʸ�<> (Ÿ���� ����)

*/
public class Ex01_Vector {
	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("�ʱ� default �뷮 : "+v.capacity()); //10���� default
		v.add("AA");
		v.add("BB");
		v.add("AA"); //�ߺ�����
		v.add(100); //�渶�� ��� Ÿ�� ����(Object Ÿ��)
		
		System.out.println(v); // v.toString() default
		System.out.println(v.toString()); //toString()�� ������ �Ѱ��̴�. toString()�� ���� �ּҰ�
		
		//Array >> length() >> Car[index]
		
		//List �迭 : size() ������ ����
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));//get return Type >> Object
		}
		//������ for��
		for (Object o : v) {
			System.out.println(o);
		}
		//���ʸ�(Object ����..>> Ÿ���� ����)
		Vector<String> v2 = new Vector<String>(); // new Vector<>(); <>�� String �տ� ���� �ߴٸ� ��������
		v2.add("Hello");
		v2.add("World");
		v2.add("King");
		for(String str : v2) {
			System.out.println(str);
		}
		
		System.out.println(v2.toString()); //v2 = v2.toString()
		System.out.println(v2.get(2));
		System.out.println("size : " + v.size());
		System.out.println("capacity : " + v.capacity());
		
		Vector v3 = new Vector();
		System.out.println(v3.capacity());
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		System.out.println(v3.capacity());
		v3.add("A");
		System.out.println("size : " + v3.size());
		System.out.println("11��°  : " + v3.capacity());
		
	}
}

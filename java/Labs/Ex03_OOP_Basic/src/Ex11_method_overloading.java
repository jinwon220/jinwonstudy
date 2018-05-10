import java.util.Arrays;

/*
 ��ü ���� ��� Ư¡
 ĸ��ȭ, ���, ������
 
 ĸ��ȭ(����ȭ) -> private
 
[ method overloading ]
�ϳ��� �̸����� �������� ����� �ϴ� �Լ� 

��� : ex) println() �����ε� �ϴ� ��ǥ���� �Լ�
Ư¡ : �����ε��� ������� ������ ���� �ʴ´�. (���ɰ� �������)
	
	why) Ÿ�Կ� ���� �Լ��� �ٲ� �ʿ� ���� ���ϰ� ����ϱ� ���ؼ�
         ex)println(int i)
         	println(String s)
         	println(double d)
         	println(boolean b)
         	... �� 8���� Ÿ�� + String ó��  �Լ��� �̸��� ������ Ÿ���� �ٸ���  
         	
         ����� ����� �����ϸ� : �Լ��� Ȱ���� ���� ��� (parameter ����)
         
���� : �Լ��� �̸��� ���� parameter �� ������ Ÿ���� �޸��ϴ� ���
 1. �Լ��� �̸��� ���ƾ� �Ѵ�.
 2. [parameter] ���� �Ǵ� [Type]�� �޶�� �Ѵ�
 3. return type�� overloading�� �Ǵܱ���(x)
 4. parameter ������ �ٸ��� �����Ѵ�.
*/

class Human{
	String name;
	int age;
}

class OverTest{
	
	//�����ε�
	void add(Human h) {
		h.name = "ȫ�浿";
		h.age = 100;
	}
	
	int add(int i) {
		return 100 + i;
	}
	String add(String s) {
		return "hello" + s;
	}
	
	/*
	�浹 (�����ε� ���� X) void add(int k) {
	return k; 
	}
	*/
	int add(int i, int k) {
		return i + k;
	}
	void add(int i, String s) {
		System.out.println("�����ε�");
	}
	void add(String s, int i) {// ������ �ٸ��� �����Ѵ�
		System.out.println("parameter ������ �ٸ��� ����");
	}
	
	//�迭��(Array) ���� �� ��...
	//���߱� �ڵ�
	//int[] source = {1,2,3,4,5}
	int[] add(int[] param) { //int Ÿ�� �����迭�� �ּҰ��� param���� �ްڴ�.
		int[] target = new int[param.length];
		for(int i=0; i < param.length; i++) {
			target[i] = param[i]+1;
		}
		return target; //return intŸ�� �����迭�� �ּҰ��� ���� �ϰڴ�.
	}
	
	//Quiz
	int[] add(int[] so, int[] so2) {
		int[] result = new int[so.length+so2.length];
		for(int i = 0; i < so.length; i++) {
			for(int j = 0; j < so2.length; j++) {
				result[i] = so[i];
				result[i+(j+1)] = so2[j];
			}
		}
		for(int i = 0; i < result.length; i++) {
			for(int j = i; j < result.length; j++) {
				if (result[i] >= result[j]) {
					int temp = result[i];
					result[i] = result[j];
					result[j] = temp;
				}
			}
		}
		return result;
	}	
}

public class Ex11_method_overloading {
	public static void main(String[] args) {
		OverTest t = new OverTest();
		t.add(100, "AAA");
		t.add("BBB", 2000);
		//t.add("A", "B"); // (String, String)���� ����� ���� ������ ���� �Ұ� 
		
		//1. ok
		Human m = new Human();
		t.add(m);
		
		//2. ok
		t.add(new Human());

		///////////////////////////////////
		int[] source = {10,20,30,40,50};
		int[] target = t.add(source); // source �迭�� �ּҰ�
		//1. source ���� �� target �迭������ �ּҰ��� : �ٸ���
		System.out.println(source + " / " + target);
		for(int s : source) {
			System.out.print(s+" ");
		}
		System.out.println();
		for(int s : target) {
			System.out.print(s+" ");
		}
		//////////////////////////////////
		System.out.println();
		int[] result = t.add(source, target);
		System.out.println(Arrays.toString(result));
	}

}

import java.util.Arrays;

class Person{
	String name;
	int age;
}

public class Ex03_Array_Object {
	public static void main(String[] args) {
		int[] intarr = new int[10];
		boolean[] barr = new boolean[5];
		// ... ��
		// ���� Array�� ��Ÿ�� �迭
		// Ŭ������ Ÿ���̴� (int, double Ÿ�� �� �� �ִ� �ڸ��� Ŭ���� Ÿ�Ե� �ü� �ִ�)
		Person[] arrobj = new Person[3];
		System.out.println("�ּҰ� : " + arrobj);
		System.out.println("arrobj[0] : " + arrobj[0]); //null
		
		arrobj[0] = new Person(); //������ �渶�� new Person()�� �޸𸮿� �÷���� �Ѵ�.
		System.out.println("arrobj[0] : " + arrobj[0]); //�ּҰ�
		
		arrobj[0].name="ȫ�浿";
		arrobj[0].age=100;
		
		System.out.println("after : " + arrobj[0].name + ", " + arrobj[0].age);
		
		arrobj[1] = new Person();
		arrobj[2] = new Person();
		//////////////////////////
		//for��
		System.out.println("�迭 : " + arrobj);
		
		for(int i = 0; i < arrobj.length; i++) {
			System.out.println(arrobj[i].name + "/" + arrobj[i].age);
		}
		
		//3���� �迭 �����
		//1. int[] arr = new int[5]
		Person[] parray = new Person[5];
		for(int i = 0; i < parray.length; i++) {
			parray[i] = new Person(); //������ �濡 memory����
			System.out.println(parray[i]);
		}
		
		//2. int[] arr = new int[]{10,20,30}
		Person[] parray2 = new Person[] {new Person(), new Person(), new Person()}; //{���濡 memory����}
		
		//3. int[] arr = {10,20,30} // �����Ϸ��� �˾Ƽ� new ����..
		Person[] parray3 = {new Person(), new Person(), new Person()};
	}

}

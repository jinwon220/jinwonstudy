//String Ŭ����
//�� ������ ��� String Ŭ������ ��� ����� ���� ��!
//String ������� 8���� �⺻Ÿ�԰� ����

//String str = "a�浿";
//1.String Ŭ���� = ������ ���� �ڷᱸ�� >> char[]�迭 ���
//2.String ename = "a�浿" > [a][��][��]
//3.String s = new String("ABCD");

public class Ex05_String_Class {
	public static void main(String[] args) {
		String str = "ABCD";
		System.out.println(str.length()); //String ������ char[]�迭 �̶� length()�� ����
		
		System.out.println(str); //str.toString() ��� �� ���´�.
		
		String str1 = "AAA";
		String str2 = "AAA";
		System.out.println("str1 : " + str1.toString());
		System.out.println("str2 : " + str2.toString());
		
		System.out.println(str1 == str2); //�ּ� ��
		//String �� (�ּҾȿ� �ִ� ���� ��)
		//POINT (���ڿ��� �񱳴� : .equals())
		System.out.println(str1.equals(str2));
		
		String str3 = new String("BBB");
		String str4 = new String("BBB");
		System.out.println(str3 == str4); //false �ּ� �ٸ�
		System.out.println(str3 + " / " + str4); //String.toString StringŬ�������� �������̵� (������)�߱⶧����
		System.out.println(str3.equals(str4)); //true �� ����
	}

}

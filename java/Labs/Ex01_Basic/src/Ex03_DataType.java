/*
�ڹٴ� �ý��ۿ��� 8���� �⺻Ÿ�� ����(�ڷ���) + (����Ÿ�� String)
8���� �⺻ Ÿ�� (���� �����ϴ� Ÿ��)
����->���� (��������, 0, ��������) -> byte(-128~127)
						  -> char(�� ���ڸ� ǥ���ϴ� �ڷ��� : �� ����(2byte), unicode ����)
						  -> short
						  -> int(-21�� ~ 21��) : **Java ������ ���� �⺻ Ÿ�� (4byte)**
						  -> long(8byte) : int���� ū ���� long ���  
           
           �Ǽ� (�ε��Ҽ���) -> float(4byte), double(8byte) : **���е��� ���� (double) : java �Ǽ� ������ �⺻**
           
��->boolean (true, false) : ���α׷��� ������

--
�ñ����� : ���ڿ� ǥ�� ����� ???? : ȫ�浿, �ȳ��ϼ��� ���� Ÿ��.....
string �� Ŭ���� (���赵) > String s = new String("�ȳ��ϼ���"); -> �����ζ�� �̷��� ����ϴ°� ����
������ �� ������ ���캸�� : String s = "�ȳ��ϼ���";

**String�� �ڷ���ó�� ����Ѵ�.(�ƽ�Ű�ڵ� �̿�)**

��Ÿ�� -> ����, ��
����Ÿ�� -> Ŭ����, �迭

class == ���赵�̴� == Type
class ���� Ÿ���� ��� ���� ū Ÿ���̴�.
>class �ݵ�� �޸𸮿� �����ϰ� (�÷�����) ���
>new �����ڸ� ����ϸ�...

 */
class Car { // Car��� Type ���� : Type ������ : Car c;
	String color;
	int data;
}

public class Ex03_DataType {
	public static void main(String[] args) {
		Car c = new Car();
		System.out.println("c��� ������ �� : " + c); //����Ÿ��

		Car c2;
		c2 = new Car();
		
		System.out.println("c2��� ������ �� : "+ c2);
		
		Car c3 = c; // ����Ÿ���� �Ҵ��� : �ּҰ� �Ҵ�
		System.out.println(c + " : " + c3);
		System.out.println(c3 == c);
		c3.data = 3333;
		System.out.println(c.data);
		c.data = 4444;
		System.out.println(c3.data);
		// c3.data , c.data (�ٶ󺸴� �ּҰ� ����)
		
		int i = 200; // ����� �Ҵ�
		System.out.println("i��� ������ �� : " + i); //��Ÿ��
		
		int j; // ����
		j = 1000; // �Ҵ�(�ʱ�ȭ)
		
		int a, b; // ���� : ���� �ʱ�ȭ
		a = 10;
		b = 11;
		
		System.out.println(a + " : " + b);
		
		int k = 1111;
		int k2  = k; // k2 �ʱ�ȭ
		k2 = 2222; // k2 �ʱ�ȭ
		//�̶� k���� ����ϸ�?? 2222
		
		//int (-21 ~ 21��)
		long number = 1000000000; // ���� ����
		//long number2 = 10000000000;  error
		long number2 = 10000000000L; // error
		//10000000000 ������ 100�� (int ���� ������ ���)
		//**������ ���ͷ� �� (�⺻ Ÿ��) : int**
		//int ������ ����� �������ͷ� ���� ������ ���̻縦 ���ؼ� ���� ������ ����ؾ� ��. 
		System.out.println(number + "/" + number2);
		
		//char : �������� ������ �ִ�(2byte)
		//���ڸ� ǥ���ϴ� �ڷ���
		//1. [�ѹ���] > 2byte
		//2. �ѱ� �� ��: 2byte
		//3. ������, Ư������, ���� : 1byte
		//�ѱ� �� ��, ���� �� �� ǥ�� 2byte�� ǥ�� (unicode)
		
		//java ���ڿ� : "��" : String s = "��";
		//java ���� : '��' : Char c = '��'; �ƽ�Ű �ڵ�� ���� ����
		
	    char single = '��';
	    System.out.println(single);
	    char ch = 'A';
	    System.out.println(ch);
	    System.out.println((int)ch); //Ÿ�Ժ�ȯ(casting) �ƽ�Ű�ڵ�ǥ 10���� �� : 65
	                    //����� ����ȯ
	    char ch2 = 'a';
	    System.out.println(ch2);
	    System.out.println((int)ch2); // �ƽ�Ű�ڵ�ǥ 10���� �� : 97
	    
	    int ch3 = 65;
	    char ch4 = (char)ch3; //���� : 'A' ����� ����ȯ
	    System.out.println(ch4);
	    
	    //ch4 : char Ÿ��
	    //cint2 : int Ÿ��
	    int cint2 = ch4; // �Ͻ���(������) ����ȯ
	    System.out.println(cint2);
	    //Today Point
	    //������ ������ �ִ� [���� ��������] [����Ÿ��]�� ������
	    //Ÿ���� ũ�⸦ ����
	    //[ū Ÿ��]���� [���� Ÿ��] ���� ���� �� �ִ�.
	    //[���� Ÿ��]���� [ū Ÿ��] ���� ���� �� ����.
	    //char <- int > char <- (char)int
	    //int  <- char ����  | ����������  int <- (int)char
	    
	    
	    // �ս� �Ǵ� ����ȯ
	    int intValue = 103029770;
		byte byteValue = (byte)intValue;
		
		System.out.println(byteValue);// ����ȯ�� ���� ��
		// ū Ÿ���� ���� ���� Ÿ���� ���ǹ����� �ʰ� �Ͽ��� ������
		// ���� �ٸ� ���� ���� ( ������ �� )
	    
	    
		//String (���ڿ�) Ÿ��
		//String �� Ÿ���� �ƴϰ� Ŭ���� Ÿ��(new ���ؼ� �޸� �ø��� ���)
		//��Ģ : String str = new String("ȫ�浿");
		//POINT : String �Ϲ� ��Ÿ�� ����ص� ���� X (int, double Ÿ�� ó�� ���)
		
		String str = "hellow world";
		System.out.println(str);
		
		String str2 = str + "������"; //DB(����Ŭ : ��� + , ���� ||)
		System.out.println(str2);
		
		//Tip) java Ư������ ����ϱ�
		//���ڸ� �����ϱ� ���ؼ� : \(��������) �� ���
		char sing ='\'';
		System.out.println(sing);
		
		//ȫ"��"�� �̶�� ���ڿ��� ���
		String name = "ȫ\"��\"��";
		System.out.println(name);
		
		String str3 = "1000";
		String str4 = "10";
		String result = str3 + str4;
		System.out.println(result);
		
		//c:\Temp ��� ���ڿ� ���(Ư�������� Ȱ��)
		String path = "c:\\Temp";
		System.out.println(path);
		
		//�Ǽ�(�ε��Ҽ���)
		//float(4byte)
		//double(8byte) : **�Ǽ��� �⺻ ���ͳ��� double (���е��� ����(�Ҽ����� �ڸ��� �� ���� ǥ��))
		
		//float f = 3.14; ����
		float f = 3.14F; //���̻� (F, f) ���ͳ� ���� ����
		float f2 = 1.123456789f; //**�ݿø� ó��
		System.out.println("f2 : " + f2); // 1.1234568
		// �뷫 7��° �ڸ����� ǥ�� 8��° �ڸ����� �ݿø�
		
		double d = 1.123456789123456789;
		System.out.println("d :" + d);
		// �뷫 16��° �ڸ����� ǥ�� 17��° �ڸ����� �ݿø�
		
		//Test
		//double d2 = 100; //�Ͻ��� ����ȯ (int -> double)
		// == double d2 = 100.0;
		double d2 = (double)100;
		
		
		//Quiz
		double d3 = 100;
		int i5 = 100;
		
		//int result2 = d3 + i5; Error ���ĺ���
		
		//1. int result2 = (int)d3 + i5; // (���� Ŀ����) ������ �ս��� ���� �� �ִ�.
		//2. double result2 = d3 + i5;
		//3. int result2 = (int)(d3 + i5); // (���� Ŀ����) ������ �ս��� ���� �� �ִ�.
		
		//Today Point
		//���� Ÿ�� + ū Ÿ�� => ū Ÿ��
		//Ÿ�� �� ����ȯ > ������ ������ ���� ���� ���� ������ Ÿ������ �Ǵ�����
		//����� ����ȯ(casting)
		
		int i6 = 100;
		byte b2 = (byte)i6;
		System.out.println(i6);
		
		byte b3 = 20;
		int i7 = b3; // �Ͻ��� ����ȯ (���������� (int)b3)
		
		
		
	}
}

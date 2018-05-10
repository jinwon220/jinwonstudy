import java.util.Scanner;

public class Ex07_Printf_format {
	
	public void print() {
		System.out.println("�� �Ϲ� �Լ���");
	}
	
	public static void main(String[] args) {
		//java.lang �Ʒ� �ִ� �ڿ��� ����(import) ���� ��밡�� (������ ����(default open))
		
		System.out.println("�� static �Լ���");
		
		//print() �� ����ϱ� ���ؼ���
		Ex07_Printf_format ex = new Ex07_Printf_format();
		ex.print();
		
		System.out.println();
		//�����ε� : �Լ��� ������ �Ķ������ ������ Ÿ���� �ٸ� ��
		//�����ε��� �ϴ� ���� : ���ɰ��� ����! ���ϰ� ����ϱ� ����
		//ex) System.out.println(string x);
		//    System.out.println(Object x);
		//    System.out.println(int x);
		//    System.out.println(char x); . . . ��
		
		//C# : Console.WriteLine();
		//C# : Console.ReadLine();
		
		//Java : System.out.println();
		System.out.println("A");
		System.out.print("B");
		System.out.print("C");
		System.out.print("D");
		System.out.println("E"); // println �ٹٲ�
		
		int num = 100;
		System.out.println(num);
		System.out.println("num ���� : " + num + " �Դϴ�");
		//���� (format)
		System.out.printf("num ���� : %d �Դϴ�\n", num);
		//format ���Ĺ��� (���)
		//%d (10���� ������ ����) > d��� �ڸ���
		//%f (�Ǽ�)
		//%s (���ڿ�)
		//%c (����)
		//Ư������ : \t (��Ű), \n(�ٹٲ�)
		
		System.out.printf("num�� ���� [%d]�Դϴ� �׸��� [%d]�� �־��\n", num, 1000);
		
		float f = 3.14f;
		System.out.println(f);
		System.out.printf("f ���� �� %f �Դϴ� \n", f);
		
		//cmd(console)���� �Է°� �о����
		Scanner sc = new Scanner(System.in); //ctrl + shift + o -> import �ڵ��ϼ�
		
		// java.util.Scanner sc = new java.util.Scanner(System.in); ����
		// import�� �����ϰ� Ǯ�������� ����ϸ�
		// ����� ������, ��������ϴ� ���ŷ����� �ִ�.
		
		System.out.println("���� �Է��ϼ���");
		//String value = sc.nextLine(); // ������... String java.util.Scanner.nextLine()
		//System.out.println("�Է°� : " + value);
		
		//int number = sc.nextInt(); //��� /���� Ÿ�Ը� ó���Ѵ� (nextInt)
		//System.out.println("�Է°� : " + number);
		
		//float number = sc.nextFloat();
		//System.out.println("�Է°� : " + number);
		
		//�������(�׳� ���ڷ� �޾Ƽ� ��ȯ�ؼ� ����սô�)
		//ToDay Point
		//[[[ ���ڸ�  -> ���ڷ� ]]]
		//Integer.parseInt(s) ���ڸ� ������
		//Float.parseFloat(s) ���ڸ� �Ǽ��� float��
		//Double.parseFloat(s) ���ڸ� �Ǽ��� double��
		
		System.out.println("���ڸ� �Է��ϼ���");
		int number = Integer.parseInt(sc.nextLine());
		System.out.println("���� : " + number);
		
		//���ڸ� -> ���ڷ� (�� ��� ����, ���ڿ� ���ڸ� ���ϸ� ���ڷ� ��µǱ� ������)
		//String data = String.valueOf(1000);
		//System.out.println(data);
		
		
	}
}

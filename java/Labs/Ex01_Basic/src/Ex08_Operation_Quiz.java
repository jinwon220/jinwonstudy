import java.util.Scanner;

/*
������ ��Ģ ����� (+, -, *, /)
�Է°� 3�� (�Է°��� nextLine() ���� �޾Ƽ� �ʿ��ϴٸ� ���ڷ� ��ȯ)

ȭ��
>�Է°�:����
>�Է°�(��ȣ):+
>�Է°�:����
>������ : ��Ģ������ ���

hint) if(){} else if(){}
hint) if(opr == "+"){���ϱ� �����Ҳ���} -> �̷��� ��� ���� �ʱ� (����!!)
Today Point
���ڿ��� ���� �񱳴� == �ƴϰ� (equals() �Լ��� ����Ѵ�)
hint) if(opr.equals("+")) {���ϱ� ����}
*/

public class Ex08_Operation_Quiz {

	public static void main(String[] args) {
		int su1 = 0;  // ù��° �Է°�
		int su2 = 0;  // �ι�° �Է°�
		String opr = "";  // ��Ģ���� ��ȣ
		int result = 0; // ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է� : ");
		su1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("��Ģ���� ��ȣ(+,-,*,/)  : ");
		opr = sc.nextLine();
		
		System.out.print("�ι�° ���� �Է� : ");
		su2 = Integer.parseInt(sc.nextLine());
		
		if(opr.equals("+"))
			result = su1 + su2;
		else if(opr.equals("-"))
			result = su1 - su2;
		else if(opr.equals("*"))
			result = su1 * su2;
		else if(opr.equals("/"))
			result = su1 / su2;
		else {
			System.out.println("�������� �ʴ� ������ �Դϴ�.");
			//key point
			//return Ű���� : **[�Լ�����]�� ������** > main �Լ� Ż�� > ����
			return;
		}
		
		System.out.println("�� ���� ���� ���  : " + result);
		System.out.printf("[%d %s %d = %d]", su1, opr, su2, result);

	}

}

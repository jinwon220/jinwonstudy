import java.util.Scanner;

//�ݺ��� (while, do~while)

public class Ex10_Statement {

	public static void main(String[] args) {
		int i = 10;
		while(i>=10) { //���� true ������ ���� ����
			System.out.println(i); //10
			i--; //�ݵ�� ������� ������
			System.out.println(i); //9
		}
		
		//1~100������ ��
		int sum=0;
		int j = 1;
		while(j<=100) {
			//j++; (���ǻ���^^ ���� j�� 0���� ������ ���Ⱑ ����)
			sum += j;
			j++; // ������� ������
		}
		System.out.println("1~100������ �� : " + sum);
		
		//while ����ؼ� ������
		
		int k = 2;
		int p = 1;
		
		while (k<=9) {
			p = 1;
			while(p<=9) {
				System.out.printf("[%d]*[%d]=[%d]\t", k, p, k*p);
				p++;
			}
			k++;
		}
		System.out.println();
		
		//do~while() : ������ ���� ����(������ �ѹ��� ����)
		//do{���๮} while(���ǽ�)
		//�޴� ����
		//1. �λ�޴�
		//2. �޿��޴�
		
		Scanner sc = new Scanner(System.in);
		int inputdata =0;
		do {
			System.out.println("���ڸ� �Է��Ͻÿ�(0~10)");
			inputdata = Integer.parseInt(sc.nextLine()); // ���ڸ� ���ڷ�
		}while(0 >= inputdata || inputdata > 10);
		// 10���� ū ���� ���� true �ٽ� do���� �����Ű�ڴ�.
		// 0~10������ ���� �ԷµǸ� false -> do~while�� Ż��
		System.out.println("����� �Է��� ���ڴ� : " + inputdata);
		
	}

}

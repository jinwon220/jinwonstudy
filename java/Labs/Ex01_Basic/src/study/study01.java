package study;

public class study01 {

	public static void main(String[] args) {
		// [ù��° ����] ������ ���� ������ ��� ���س����� �� ����� ���ؾ� ������ 1+(-2)+3+(-4)+... , 100�̻��� �Ǵ��� ���Ͻÿ�.
		int sum = 0;
		int i = 1;
		for(i = 1; true; i++) {
			if(i%2 == 0)sum += -i; 
			else sum += i;
			if (sum >= 100)
				break;
		}
		System.out.println("sum = " + sum + "\ni(n��°) =" + i);
		//�� : 199��°
		
		
		// �ι�° ����
		int answer = (int)(Math.random()*100)+1; //1~100������ ������ ��
		int input = 0; //������Է��� ������ ����
		int count = 0; //�õ�Ƚ��
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.print("1�� 100������ ���� �Է��ϼ��� : ");
			input = s.nextInt(); //�Է¹��� ���� ���� input�� �����Ѵ�.
			
			if(answer > input)System.out.println("\n �� ū���� �Է��ϼ���");
			else if (answer < input)System.out.println("\n �� ���� ���� �Է��ϼ���");
			else if (answer == input) {
				System.out.println("\n ������ϴ�  " + count + "�� ���� ���߼̽��ϴ�.");	
				
				break;
			}
		} while(true); //���� �ݺ�
	}

}

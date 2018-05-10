package study;

public class study04 {
	public static void main(String[] args) {
		//������ ������ �߰��� ���α׷�
		//Ŀ�ǵ�������� ���� �Ž��� �� �ݾ��� �Է¹޾� ���
		//������ ������ ������ �Ž������� ������ �� ������ '�Ž��� ���� �����մϴ�'
		//������ ���� ����ϸ�  �Ž������� ���� �� ��ŭ ���� ������ ���� ���� ������ ������ ���
		if(args.length !=1) {
			System.out.println("USAGE: java Exercise5_8 3120");
			System.exit(0);
		}
		
		//���ڿ��� ���ڷ� ��ȯ�Ѵ�. �Է��� ���� ���ڰ� �ƴ� ��� ���ܰ� �߻��Ѵ�.
		int money = Integer.parseInt(args[0]);
		
		System.out.println("money="+money);
		
		int[] coinUnit = {500, 100, 50, 10}; //������ ����
		int[] coin = {5,5,5,5}; //������ ������ ����
		
		for(int i =0; i<coinUnit.length; i++) {
			int coinNum = 0;
			
			//1.�ݾ�(money)�� ���������� ������ �ʿ��� ������ ����(coinNum)�� ���Ѵ�
			//2.�迭 coin���� coinNum��ŭ�� ������ ����.
			//  (���� ����� ������ ���ٸ� �迭 coin�� �ִ� ��ŭ�� ����.)
			//3.�ݾ׿��� ������ ����(coinNum)�� ���������� ���� ���� ����.

			do {
				if(coin[i] > 0) {
					money -= coinUnit[i];
					coin[i] -= 1;
					coinNum++;
				}else if(coin[i] == 0) break;
			}
			while( money>=coinUnit[i]);
			
			System.out.println(coinUnit[i] + "��: " + coinNum);
		}
		
		if(money > 0) {
			System.out.println("�Ž������� �����մϴ�.");
			System.exit(0); //���α׷��� �����Ѵ�.
		}
		
		System.out.println("=���� ������ ���� =");
		
		for(int i =0; i<coinUnit.length; i++) {
			System.out.println(coinUnit[i]+"��:" + coin[i]);
		}
	}
}

package study;

public class S0125 {
	public static void main(String[] args) {

		int intValue = 103029770;
		byte byteValue = (byte)intValue;
		
		System.out.println(byteValue);// ����ȯ�� ���� ��
		// ū Ÿ���� ���� ���� Ÿ���� ���ǹ����� �ʰ� �Ͽ��� ������
		// ���� �ٸ� ���� ���� ( ������ �� )
		
		//�� ���� ����
		for(int i = 1; i <= 5 ; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("");
		
		//�����
		//syso > ctrl + space => System.out.println();
		//�ڵ� �����ϱ� : ���ϴ� ��� ���(��ü��� ctrl + a) -> ctrl + shift + f (�ڵ� �鿩���� ����)
		
		//***
		//**
		//*
		for(int i = 5; i >= 1; i--) { // 5�� �ݺ� ��Ų��
			for(int j = 1; j <= i; j++) // i�� ���ں��� Ŀ�� �� ���� �ݺ� ��Ų��
				System.out.print("*"); // *�Է�
			System.out.println(); //�ٹٲ�
		}
		
		System.out.println("------------");
		
		//  *
		// **
		//***
		for(int i = 0; i < 5; i++) { // 5�� �ݺ� ��Ų��
			for(int j = 4; j > i; j--) // i���� �۾��� �� ���� �ݺ� ��Ų��
				System.out.print(" "); // ����
			for(int j = 0; j < i+1; j++) //i+1���� �۾��� �� ���� �ݺ� ��Ų�� 
				System.out.print("*");  //
			System.out.println();
		}
		
		for(int i = 1; i <= 5; i++) { // 5�� �ݺ�
			for(int j = 5; j > i - 1; j--) // �ݺ��Ǵ� ��ŭ ��ĭ�� ����ش�
				// i�� �ݺ� �� ���� ��ĭ�� �þ� ����
				System.out.print(" ");     
			for(int j = 1; j < i + 1; j++) // i+1���� Ŀ�� �� ���� *����
				// i�� �ݺ� �� ���� �ﰢ���� ���� �Ǵµ� ��ĭ ���� ����������
				// ������ y������ ��������.
				System.out.print("*");     
			for(int j = 1; j < i; j++)     // i���� Ŀ�� �� ���� *����
				System.out.print("*");
			System.out.println();
		}
		
		
		
		
	}
}

package study;

public class homework {

	public static void main(String[] args) {
		
		// ���� �������� �����ﰢ��
        for (int i = 1; i <= 5; i++) { // i=1���� �����ϸ� 5�� �ݺ�
            for (int j = 1; j <= i; j++) // j=1���� i���� Ŀ�� �� ���� �����ϸ� �ݺ�
                System.out.print("*");
            System.out.println();
        }
 
        System.out.println("\n\n\n");
 
        // �Ʒ��� �������� �����ﰢ��
        for (int i = 1; i <= 5; i++) { // i=1���� �����ϸ� 5�� �ݺ�
            for (int j = 5; j >= i; j--) // j=1���� i���� �۾��� �� ���� �����ϸ� �ݺ�
                System.out.print("*");
            System.out.println();
        }
        
        System.out.println("\n\n\n");
 
        // ���� �޹��� �����ﰢ��        
        for (int i = 1; i <= 5; i++) { // i=1���� �����ϸ� 5�� �ݺ�
            // ��ĭ���� �Ʒ��� �������� �����ﰢ���� �����
            for (int j = 5; j >= i + 1; j--) // j=5���� i+1���� �۾��� �� ���� �����ϸ� �ݺ�
                System.out.print(" "); // ��ĭ
            // ��ĭ ������ *�� ����ָ� i�� Ŀ�� ���� *��� ������ ����
            for (int j = 1; j <= i; j++) // j=1���� i���� Ŀ�� �� ���� �����ϸ� �ݺ�
                System.out.print("*");
            System.out.println();
        }
        
        System.out.println("\n\n\n");
        
        // �Ʒ��� �޹��� �����ﰢ��
        for (int i = 1; i <= 5; i++) { // i=1���� �����ϸ� 5�� �ݺ�
            // ��ĭ���� ���� �������� �����ﰢ���� �����
            for (int j = 1; j <= i-1; j++) // j=1���� i-1���� Ŀ�� �� ���� �����ϸ� �ݺ�
                System.out.print(" ");
            // ��ĭ ������ *�� ����ָ� i�� Ŀ�� ���� *��� ���� ����
            for (int j = 5; j >= i; j--) // j=5���� i���� �۾��� �� ���� �����ϸ� �ݺ�
                System.out.print("*");
            System.out.println();
        }

        System.out.println("\n\n\n");
		
     // ���� �ﰢ��
        for (int i = 1; i <= 4; i++) {
            //��ĭ���� �簢�� ����
            for (int j = 4; j > 0; j--)
                System.out.print(" ");
            //���� �޹��� �����ﰢ��
            for (int j = 4; j >= i + 1; j--)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            //���� �������� �����ﰢ��
            for (int j = 2; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
        // ���� �ﰢ�� & ������ �ﰢ��
        for (int i = 1; i <= 4; i++) {
            //���� �޹��� �����ﰢ��
            for (int j = 4; j >= i + 1; j--)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            //��ĭ���� �簢�� ����
            for (int j = 7; j > 0; j--)
                System.out.print(" ");
            //���� �������� �����ﰢ��
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = 1; i <= 3; i++) {
            //�Ʒ��� �޹��� �����ﰢ��
            for (int j = 1; j <= i; j++)
                System.out.print(" ");
            for (int j = 3; j >= i; j--)
                System.out.print("*");
            //��ĭ���� �簢�� ����
            for (int j = 7; j > 0; j--)
                System.out.print(" ");
            //�Ʒ��� �������� �����ﰢ��
            for (int j = 3; j >= i; j--)
                System.out.print("*");
            System.out.println();
        }
        // �Ʒ��� �ﰢ��
        for (int i = 1; i <= 4; i++) {
            //�Ʒ��� �޹��� �����ﰢ��
            for (int j = -2; j <= i; j++)
                System.out.print(" ");
            for (int j = 3; j >= i; j--)
                System.out.print("*");
            //�Ʒ��� �������� �����ﰢ��
            for (int j = 4; j >= i; j--)
                System.out.print("*");
            System.out.println();
        }
	}
}


public class Ex02_Exception {
	public static void main(String[] args) {
		int num = 100;
		int result = 0;
		/*
		try {
			for (int i = 0; i < 10; i++) {
				result = num / (int) (Math.random() * 10);// ���� (0~9)
				System.out.println("result : " + result + " i:" + i);
			}
		} catch (Exception e) { //������ ���..(������ DOWN)
			System.out.println("Exception...");
		}
		System.out.println("MainEND");
		*/
		/*
		try {
			for (int i = 0; i < 10; i++) {
				result = num / (int) (Math.random() * 10);// ���� (0~9)
				System.out.println("result : " + result + " i:" + i);
			}
		} catch (Exception e) { 
			System.out.println("Exception...");
		} catch (ArithmeticException e) { //���� Exception ������ ��� ������ �������� ������ ������ ���� ������ ����
			System.out.println("���� ���� �߻�");
		}
		System.out.println("MainEND");
		*/
		
		try {
			for (int i = 0; i < 10; i++) {
				result = num / (int) (Math.random() * 10);// ���� (0~9)
				System.out.println("result : " + result + " i:" + i);
			}
		} catch (ArithmeticException e) {
				System.out.println("���� ���� �߻�");
		} catch (Exception e) {
			System.out.println("Exception...");
		}
		System.out.println("MainEND");
		
		//���꿡 ���õ� ���ܴ� ArithmeticException ��� ������ Exception ó��
		//���� ���ܴ� ����(�θ�) �տ�....
	}
}

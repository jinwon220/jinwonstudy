//�켱���� : CPU �������� ���̰ڴ�
//default : 5 (Max : 10, Min : 1)

class Pth extends Thread{
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("--------");
		}
	}
}
class Pth2 extends Thread{
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("||||||||");
		}
	}
}
class Pth3 extends Thread{
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("********");
		}
	}
}
public class Ex06_priority {
	public static void main(String[] args) {
		Pth pth = new Pth();
		Pth2 pth2 = new Pth2();
		Pth3 pth3 = new Pth3();
		
		System.out.println(pth.getPriority()); //�⺻�� 5
		System.out.println(pth2.getPriority()); //�⺻�� 5
		System.out.println(pth3.getPriority()); //�⺻�� 5
		
		//���ڰ� ���� �������� cpu�������� ������
		//������ ���� �Ϸ� �� ���ɼ��� ����
		pth.setPriority(10);  
		pth2.setPriority(3);
		pth3.setPriority(1);
		
		pth.start();
		pth2.start();
		pth3.start();
		
		System.out.println("Main END.........");
	}

}

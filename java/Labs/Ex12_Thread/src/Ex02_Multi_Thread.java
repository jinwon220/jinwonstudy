//Thread : ���μ������� �ϳ��� �ּ� ������� (method)

//Thread �������
//1. Thread Ŭ������ ��� -> class Test extends Thread{}
//�ݵ�� Thread ����� ��� run()�Լ� ������

//2. implements Runnable ���� -> class Test implements Runnable
//�ݵ�� run() �߻��Լ� ������

//POINT : Thread_2 implements Runnable -> Thread(X) (Thread�� �� �� �ִ� ��Ǹ� ������ �ִ�.)

//�� 2���� ����
//class Test extends Car implements Runnable : Test�� �ٸ� Ŭ������ ����� �� �ֱ� ������ ���� ����� �ִ�.

//Thread �߻� Ŭ������ �ƴ� �Ϲ� Ŭ����
//�߻�Ŭ���� : new (x)
//�������̽��� ������ ���� new�� �� ���� ������

class Thread_1 extends Thread{
	
	@Override
	public void run() { //���ο� static�� ó�� �ö󰡴� �Լ�
		for(int i = 0; i < 1000; i++) {
			System.out.println("Thread_1 : " + i + this.getName());
		}
		System.out.println("Thread_1 run() END");
	}
}
class Thread_2 implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("Thread_2 : " + i);//+ this.getName()�Ұ�
		}
		System.out.println("Thread_2 run() END");
	}
}

public class Ex02_Multi_Thread {
	public static void main(String[] args) {
		System.out.println("Main Start");
		
		//1��
		Thread_1 th = new Thread_1();
		th.start(); //POINT > stack �����ϰ� stack run()�� �÷����� ���� -->> start()
		
		//2��
		Thread_2 th2 = new Thread_2();
		Thread thread = new Thread(th2); //�Ϲ� Ŭ����
		thread.start();
		
		for(int i = 0; i < 1000; i++) {
			System.out.println("main : " + i);//+ this.getName()�Ұ�
		}
		System.out.println("main END");
	}

}

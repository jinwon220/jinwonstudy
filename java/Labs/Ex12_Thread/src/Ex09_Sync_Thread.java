/*
����ȭ��� �ܾ ����ҷ��� Thread�� ������ 
Thread�� ������ ����ȭ�� �ƴ� �������� �����̴�
����ȭ
�Ѱ� ȭ���(���� �ڿ�) : �������� ����ڰ� (10���� ����� : Thread 10��)
lock -> synchronized
�Լ����� lock

�Ѱ� ����� ����(�����ڿ�) �������� ó��

*/

class Wroom{
	public synchronized void openDoor(String name) {
		System.out.println(name + "�� ȭ��� ����^^");
		for(int i = 0; i < 100; i++) {
			System.out.println(name + "�����" + i);
			if(i == 10) {
				System.out.println(name + "�� ��!!");
			}
		}
		System.out.println("�ÿ��ϴ�...");
	}
}

class User extends Thread{
	private Wroom wr;
	private String who;
	
	public User(String name, Wroom w) {
		this.who = name;
		this.wr = w;
	}

	@Override
	public void run() {
		wr.openDoor(this.who);
	}
}

public class Ex09_Sync_Thread {
	public static void main(String[] args) {
		//�Ѱ���ġ
		Wroom w = new Wroom();
		
		//�����
		User kim = new User("�达", w);
		User lee = new User("�̾�", w);
		User park = new User("�ھ�", w);
		/*System.out.println(kim.getPriority()); 
		System.out.println(lee.getPriority()); 
		System.out.println(park.getPriority()); 
		kim.setPriority(1);
		lee.setPriority(2);
		park.setPriority(10);*/
		kim.start(); //stack �Ҵ� �ް� run �Լ� �÷�����
		lee.start();
		park.start();
		
	}

}

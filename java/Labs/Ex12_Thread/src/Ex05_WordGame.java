import javax.swing.JOptionPane;

/*
  ����
 main �Լ��� ������ Thread �� �� �߰�
 1. �ð�(time) �����ϴ� Thread
 2. �ܾ��Է��� ó���ϴ� Thread
 
 main �Լ� 2�� ����
 
 ��, �ܾ �ϳ��� �Է��ؼ� Ȯ�� ��ư�� ������ �ð��� ���߰� �ϼ���
 HINT. �����ڿ����
*/
class Word extends Thread{
	static String inputdata;

	@Override
	public void run() {
		inputdata = JOptionPane.showInputDialog("���� �Է��ϼ���");
	}
}
class Time extends Thread{
	@Override
	public void run() {
		for(int i = 10; i > 0; i--) {
			if(Word.inputdata != null) return;
			System.out.println("�����ð� :" + i +"��");
			try {
				Thread.sleep(1000); //1000 = 1��
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

public class Ex05_WordGame {
	public static void main(String[] args) {
		Time t = new Time();
		Word w = new Word();
		w.start();
		t.start();
		try {
			w.join();
			t.join();
		} catch (Exception e) {}
		System.out.println("����");
		System.out.println("�Է°� : " + Word.inputdata);
	}

}
/*
4. join() : �ٸ� �������� ���Ḧ ��ٸ�

��� �۾��� �ϴ� �����尡 ��� ��� �۾��� ������ ��, ��� ������� �޾� �̿��ϴ� ��� ����Ѵ�. 

ThreadA�� ThreadB�� join() �޼ҵ带 ȣ���ϸ� ThreadA�� ThreadB�� ������ ������ �Ͻ� ���� ���°� �ȴ�.
ThreadB�� run() �޼ҵ尡 ����Ǹ� ThreadA�� �Ͻ� �������� Ǯ�� �����ִ� �ڵ带 �����Ѵ�.
*/
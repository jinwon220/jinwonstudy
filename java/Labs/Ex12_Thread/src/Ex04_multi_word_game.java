import javax.swing.JOptionPane;

class WordTime extends Thread{

	@Override
	public void run() {
		for(int i = 10; i > 0; i--) {
			System.out.println("�����ð� :" + i);
			try {
				Thread.sleep(1000); //1000 = 1��
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

public class Ex04_multi_word_game {
	public static void main(String[] args) {
		WordTime wt = new WordTime();
		wt.start();
		
		String inputdata = JOptionPane.showInputDialog("���� �Է��Ͻÿ�");
		System.out.println("�Է°� : " + inputdata);
	}

}

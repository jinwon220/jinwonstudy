import javax.swing.JOptionPane;

class WordTime extends Thread{

	@Override
	public void run() {
		for(int i = 10; i > 0; i--) {
			System.out.println("남은시간 :" + i);
			try {
				Thread.sleep(1000); //1000 = 1초
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
		
		String inputdata = JOptionPane.showInputDialog("값을 입력하시오");
		System.out.println("입력값 : " + inputdata);
	}

}

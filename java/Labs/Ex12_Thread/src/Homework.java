import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.JOptionPane;

class Game extends Thread{
	static String result = "";
	static int qNum = 0;
	
	@Override
	public void run() {
		Map<String, String> quiz = new HashMap<>();
	    quiz.put("����", "��");
	    quiz.put("����", "����");
	    quiz.put("��", "����");
	    String answer =""; 
	    while(true) {
	        Set set =quiz.keySet();
	        Object[] obj= set.toArray();
	        int i = (int)(Math.random()*3);
	        answer = JOptionPane.showInputDialog("��ǻ�� : "+obj[i]+" (����/����/�� �Է�)");
	        System.out.println();
	        if(answer.equals(quiz.get(quiz.keySet().toArray()[i]))&&GameTime.t>0) {
	            result ="����";
	            qNum++;
	        } else {
	            result = "����";
	            break;
	        }
	    }
	}
}

class GameTime extends Thread{
	static int t;
	@Override
	public void run() {
		for(t = 3; t > 0; t--) {
			if(Game.result.equals("����")) {
				t = 4;
				Game.result = "";
			}
			else if(Game.result.equals("����")) return;
			Object print = (t>3)?"�ð�����":t;
			System.out.println(print);
			try {
				if(!print.equals("�ð�����")) {
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("�ð��ʰ�");
		System.out.println("������ Ƚ�� : " + Game.qNum);
		System.exit(0);
	}
	
}
public class Homework {

	public static void main(String[] args) {
		Game game = new Game();
		GameTime gameTime = new GameTime();
		game.start();
		gameTime.start();
		try {
			game.join();
			gameTime.join();
		} catch (Exception e) {}
		System.out.println("������ Ƚ�� : " + Game.qNum);
	}
}
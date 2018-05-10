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
	    quiz.put("가위", "보");
	    quiz.put("바위", "가위");
	    quiz.put("보", "바위");
	    String answer =""; 
	    while(true) {
	        Set set =quiz.keySet();
	        Object[] obj= set.toArray();
	        int i = (int)(Math.random()*3);
	        answer = JOptionPane.showInputDialog("컴퓨터 : "+obj[i]+" (가위/바위/보 입력)");
	        System.out.println();
	        if(answer.equals(quiz.get(quiz.keySet().toArray()[i]))&&GameTime.t>0) {
	            result ="성공";
	            qNum++;
	        } else {
	            result = "실패";
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
			if(Game.result.equals("성공")) {
				t = 4;
				Game.result = "";
			}
			else if(Game.result.equals("실패")) return;
			Object print = (t>3)?"시간리셋":t;
			System.out.println(print);
			try {
				if(!print.equals("시간리셋")) {
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("시간초과");
		System.out.println("성공한 횟수 : " + Game.qNum);
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
		System.out.println("성공한 횟수 : " + Game.qNum);
	}
}
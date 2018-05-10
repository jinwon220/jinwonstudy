import javax.swing.JOptionPane;

/*
  문제
 main 함수를 제외한 Thread 두 개 추가
 1. 시간(time) 제어하는 Thread
 2. 단어입력을 처리하는 Thread
 
 main 함수 2개 실행
 
 단, 단어를 하나라도 입력해서 확인 버튼을 누르면 시간을 멈추게 하세요
 HINT. 공유자원사용
*/
class Word extends Thread{
	static String inputdata;

	@Override
	public void run() {
		inputdata = JOptionPane.showInputDialog("값을 입력하세요");
	}
}
class Time extends Thread{
	@Override
	public void run() {
		for(int i = 10; i > 0; i--) {
			if(Word.inputdata != null) return;
			System.out.println("남은시간 :" + i +"초");
			try {
				Thread.sleep(1000); //1000 = 1초
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
		System.out.println("종료");
		System.out.println("입력값 : " + Word.inputdata);
	}

}
/*
4. join() : 다른 스레드의 종료를 기다림

계산 작업을 하는 스레드가 모든 계산 작업을 마쳤을 때, 계산 결과값을 받아 이용하는 경우 사용한다. 

ThreadA가 ThreadB의 join() 메소드를 호출하면 ThreadA는 ThreadB가 종료할 때까지 일시 정지 상태가 된다.
ThreadB의 run() 메소드가 종료되면 ThreadA는 일시 정지에서 풀려 남아있는 코드를 실행한다.
*/
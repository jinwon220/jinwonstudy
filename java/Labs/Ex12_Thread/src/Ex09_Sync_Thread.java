/*
동기화라는 단어를 사용할려면 Thread가 들어가야함 
Thread가 없으면 동기화가 아닌 순차적인 접근이다
동기화
한강 화장실(공유 자원) : 여러명의 사용자가 (10명의 사용자 : Thread 10개)
lock -> synchronized
함수단위 lock

한강 비빔밥 축제(공유자원) 동시접근 처리

*/

class Wroom{
	public synchronized void openDoor(String name) {
		System.out.println(name + "님 화장실 입장^^");
		for(int i = 0; i < 100; i++) {
			System.out.println(name + "사용중" + i);
			if(i == 10) {
				System.out.println(name + "님 끙!!");
			}
		}
		System.out.println("시원하다...");
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
		//한강둔치
		Wroom w = new Wroom();
		
		//사람들
		User kim = new User("김씨", w);
		User lee = new User("이씨", w);
		User park = new User("박씨", w);
		/*System.out.println(kim.getPriority()); 
		System.out.println(lee.getPriority()); 
		System.out.println(park.getPriority()); 
		kim.setPriority(1);
		lee.setPriority(2);
		park.setPriority(10);*/
		kim.start(); //stack 할당 받고 run 함수 올려놓기
		lee.start();
		park.start();
		
	}

}

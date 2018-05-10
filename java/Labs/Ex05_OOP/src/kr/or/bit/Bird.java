package kr.or.bit;

public class Bird {
	public void fly() {
		System.out.println("i am flying...");
	}
	//재정의를 해 주었으면 좋겠어(99%)
	//재정의 해
	protected void movefast() {
		fly();
	}
}

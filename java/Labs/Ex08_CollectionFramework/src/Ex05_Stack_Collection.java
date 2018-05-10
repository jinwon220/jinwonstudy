import java.util.Stack;

import kr.or.bit.Coin;
import kr.or.bit.Mystack;

public class Ex05_Stack_Collection {
	public static void main(String[] args) {
		// LIFO
		// Stack stack = new Stack();
		// stack.push("A");
		// stack.push("B");
		// System.out.println(stack.pop());
		//
		// System.out.println(stack.pop());
		// System.out.println(stack.pop()); ���� ���̻� pop�Ұ� ����

		Mystack my = new Mystack(1);
		int top = my.top();
		System.out.println(top);
		my.push(1);
		top = my.top();
		///////////////////////////////////
		
		// JAVA API �����ϴ� Stack Ŭ����
		Stack<Coin> coinBox = new Stack<Coin>();

		// �������̽��� ������ ����
		// 100��, 50��, 500��, 10�� ������ �ִ´�.
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));

		while (!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("������ ���� : " + coin.getValue() + "��");
		}
	}
}

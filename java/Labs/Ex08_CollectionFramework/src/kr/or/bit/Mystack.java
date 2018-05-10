package kr.or.bit;
//내가 만드는 stack 자료 구조
public class Mystack {
	private Object[] stackarr;
	
	public Mystack(int maxsize) {
		stackarr = new Object[maxsize];
	}
	
	public boolean empty() { //스택 비어 있니?
		boolean emp;
		if(stackarr[0] == null) {
			emp = true;
		}else emp = false;
		return emp;
	}
	
	public int top() { //값이 들어있는 스텍 중 가장 위 (배열의 번호)
		int top = -1;
		for(int i=0; i<stackarr.length; i++) {
			top = stackarr.length - 1;
			if(stackarr[i] == null) {
				top = i-1;
			}
		}
		return top;
	}
	
	public void push(Object i) { //값 넣기
		if(top()+1 < stackarr.length) {
			stackarr[top()+1] = i;
		}else {
			System.out.println("스택의 공간이 없습니다");
		}
	}
	
	public void pop() { //값 빼기
		Object temp = stackarr[top()];
		stackarr[top()] = null;
		System.out.println(temp);
	}
}

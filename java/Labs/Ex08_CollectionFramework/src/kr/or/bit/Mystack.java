package kr.or.bit;
//���� ����� stack �ڷ� ����
public class Mystack {
	private Object[] stackarr;
	
	public Mystack(int maxsize) {
		stackarr = new Object[maxsize];
	}
	
	public boolean empty() { //���� ��� �ִ�?
		boolean emp;
		if(stackarr[0] == null) {
			emp = true;
		}else emp = false;
		return emp;
	}
	
	public int top() { //���� ����ִ� ���� �� ���� �� (�迭�� ��ȣ)
		int top = -1;
		for(int i=0; i<stackarr.length; i++) {
			top = stackarr.length - 1;
			if(stackarr[i] == null) {
				top = i-1;
			}
		}
		return top;
	}
	
	public void push(Object i) { //�� �ֱ�
		if(top()+1 < stackarr.length) {
			stackarr[top()+1] = i;
		}else {
			System.out.println("������ ������ �����ϴ�");
		}
	}
	
	public void pop() { //�� ����
		Object temp = stackarr[top()];
		stackarr[top()] = null;
		System.out.println(temp);
	}
}

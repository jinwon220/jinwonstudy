package kr.or.bit.commons;

public class Program {

	public static void main(String[] args) {
		//default �����ڸ� ������ �ִ� CommonClass ���� ���� ������ ����.
		CommonClass c = new CommonClass();
		
		CommonClassPublic common = new CommonClassPublic();
		// common.a public
		// common.b default ���� -> ���� ������� ���
		common.a = -100;
		System.out.println(common.a);
		
		common.write(-4444);
		System.out.println(common.read());
	}

}

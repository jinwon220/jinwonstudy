import kr.or.bit.commons.CommonClassPublic;

/*
class = ���赵 == ������ Ÿ��(Data Type)
        (new) -> �޸𸮿� �ø� �� ����ϴ� �޼ҵ�
��ü = class(���赵) �� ������ ��üȭ �� ��.(�޸𸮿� ���� ��)
class�� ��üȭ �Ǵ� ���� : instanceȭ (�ν��Ͻ�ȭ)
 
Ŭ������ ������� : �ʵ�(����, ����, ����) , ������(�ʵ��� �ʱ�ȭ�� �������� �ϴ� ���) , �Լ�
������(������) : public, private, default, protected(��Ӱ��迡���� ����)

1.
public class Test{}

2.
class Test{} >> default �����ڰ� �����Ǿ� �ִ�.
(default �����ڴ� ���� ��ġ : ���� ���� �ȿ� �ִ���, �ٸ� ������ �ִ���, �� ���� �ڿ� ��뿩�� �Ǵ�)

3. default class ���� ����ϴ°�? (���� ���� ��)���� (�ٸ� Ŭ����)�� ���� �������� ���


4. �ϳ��� �ڹ� ������ �������� Ŭ������ ���� �� �ִ�. (Test.java)
       (��, true)
       
       	Ex01_main.java ��� ������ public class Ex01_main �̶�� Ŭ������ ������ �ִ�.
		
		class TTT{} �� class PPP{} �� Ŭ������ �� ���� �� �ִ�.
*/
class TTT{ // default class TTT (���� ������ ���� class ���� ���� �� �� ����.)
	int a; //default
	
	void print() { //default
		System.out.println(a);
	}
} 
class PPP{}

public class Ex01_main {

	public static void main(String[] args) {
		//1.kr.or.bit.common ���� �ȿ� �ִ� Ŭ������ ����ϰ� ���� ��
		//�Ǵ� import kr.or.bit.common.CommonClass
		//��, class �����ڰ� public�� ���
		//kr.or.bit.common.CommonClass c = new kr.or.bit.common.CommonClass();
		// public 
		
		CommonClassPublic common = new CommonClassPublic();
		// common.a  a��� ���� : public
		// common.b  default ����  -> ���� ������� ����  ���� ���� ���� x ��� �Ұ�
		// common.c  private

	}

}

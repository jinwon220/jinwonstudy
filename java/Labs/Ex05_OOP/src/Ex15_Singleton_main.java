import kr.or.bit.Singleton;

public class Ex15_Singleton_main {
	public static void main(String[] args) {
		// Singleton s = new Singleton(); (X)
		// �����ڸ� private ���� ���Ƽ� ��� �Ұ�!!
		Singleton s = Singleton.getInstance();
		// if�� �������� ���� [�ּҰ� ���� ������� ��!!]
		Singleton s2 = Singleton.getInstance();
		// if�� ������ �ȵǼ� [�������ִ� �ּҰ� ����!!]
		System.out.println(s + " / " + s2);
		System.out.println(s == s2);
	}

}

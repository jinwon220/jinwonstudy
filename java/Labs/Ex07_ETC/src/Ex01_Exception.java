//����
//1. ����(error) : ��Ʈ��ũ ���, �޸�, �ϵ����
//2. ����(Exception) : ������ �ڵ� ó�� (���� ���� ...> ��������)

//����ó�� ���� : ���α׷��� ���������� �����ϴ� ���� �ƴϰ� ������ �߻��� ������������ ���� ���ϰ� �ϴ� ��

/*
������ �߻��� �� �ִ� �ڵ�
try{
	������ �� �� �ִ� �ڵ�
}catch(Exception e){
	ó��(������ ������ �ϰ�...)
	�����ڿ��� ���� ������?
	�α� ���Ͽ� ��� �ұ�?
}finally{
	���ܰ� �߻��ϴ�, �߻����� �ʴ� (�ǹ���)���������� ����Ǵ� ����
}
*/
public class Ex01_Exception {
	public static void main(String[] args) {
		/*
		System.out.println("Main Start");
		System.out.println("Main Logic ó��");
		System.out.println(0/0); // ������ ����(���� �߻� �������� �� ���� �ڵ� ���� �ȵǿ�)
		System.out.println("Main End");
		*/
		System.out.println("Main Start");
		System.out.println("Main Logic ó��");
		try {
			System.out.println(0/0); // ������ ����(���� �߻� �������� �� ���� �ڵ� ���� �ȵǿ�)
		}catch (Exception e){
			//ó���ϴ� �ڵ�
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Main End");
	}
}

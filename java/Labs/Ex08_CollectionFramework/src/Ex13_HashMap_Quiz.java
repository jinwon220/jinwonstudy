import java.util.HashMap;
import java.util.Scanner;

/*
HashMap�� ����� �α��� �ý���
*/
public class Ex13_HashMap_Quiz {

	public static void main(String[] args) {
		// ȸ�� �α��� ������ HashMap ���� ����
		HashMap loginmap = new HashMap();
		loginmap.put("kim", "kim1004");
		loginmap.put("scott", "tiger");
		loginmap.put("lee", "kim1004");

		// �ý��ۿ� �α��� �ϴ� �ó�����
		// ID(0) , PWD(0) >> ȸ�� (ȯ��)
		// ID(0) , PWD(x) >> ���� (����ٽ� �Է�)
		// ID(x) , PWD(x) >> ���� (�ٽ� �Է�)
		// ID(x) , PWD(0) >> ����

		// Scanner ����ؼ� ID, PWD �Է¹�������
		// loginmap ���ؼ� ���� ���� ó��
		// ID �Ǵ� PWD Ʋ���� �ٽ� �Է� ��û
		// ID , PWD �� ������ ȸ���� �湮 ȯ���մϴ� ^^ (��� ���α׷� ����)

		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("���̵� �Է� : ");
			String id = sc.nextLine().trim(); // trim() �糡 ���ڿ� ����

			System.out.print("��й�ȣ �Է� : ");
			String pw = sc.nextLine().trim();

			if (!loginmap.containsKey(id)) { // loginmap.containsKey(id) == false
				System.out.println("ID�� �����ϴ�.");
			} else {
				if (loginmap.get(id).equals(pw)) {
					System.out.println("ȯ���մϴ� " + id + "��");
					break;
				} else {
					System.out.println("PW�� �ٸ��ϴ�.");
				}
			}
		} while (true);
	}

}

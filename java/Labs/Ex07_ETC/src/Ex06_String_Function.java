import java.util.StringTokenizer;

//String Ŭ���� (�پ��� �Լ�)
//���߿��� ���� ���(������ ��κ� ���ڿ� ������ : ���� ó��)
//String Ŭ���� static �Լ��� �����Ѵ�(public)
//String Ŭ���� new �� ���ؼ� ��밡���� �Ϲ��Լ��� ������ �ִ�(public)
public class Ex06_String_Function {
	public static void main(String[] args) {
		String str = ""; // ���ڿ��� �ʱ�ȭ

		String[] strarr = { "aaa", "bbb", "ccc" };
		for (String s : strarr) {
			System.out.println(s);
		}
		// String Ŭ���� �Լ�

		// concat ����+���� �Լ�
		String ss = "hello";
		String concatstr = ss.concat(" world");
		System.out.println(concatstr);

		// contains ���ڿ� �ش� ���ڰ� ��� �ִ°�
		// boolean bo = ss.contains("el"); //true
		boolean bo = ss.contains("elo"); // false
		System.out.println(bo);

		// length ����
		String ss2 = "a b c d"; // [a][ ][b][ ][c][ ][d]
		System.out.println(ss2.length()); // 7

		// indexOf �ش� ���ڰ� ������ ���� ��ġ ��°
		String filename = "hello java, world";
		System.out.println(filename.indexOf(",")); // ���� ��ġ(index)
		System.out.println(filename.indexOf("java"));
		// Ȱ�� (���� ���ϴ� �ܾ ����� ������ ���忡 ���� �Ǿ� �ִٸ� 0���� ū ��)

		System.out.println(filename.lastIndexOf("a")); // �ش� ������ ���� �ڿ� �ִ� ������ ���� ��ġ
		System.out.println(filename.lastIndexOf("javb")); // �迭(-1 ���ٴ� ǥ��)
		// return -1 (���� ����)

		// length(), indextOf(), substring(), replace() split()....

		// substring ������ �ڸ� - �Է��� �ڸ�
		String result = "superman";
		System.out.println(result.substring(0));
		System.out.println(result.substring(2));
		System.out.println(result.substring(0, 0));
		System.out.println(result.substring(0, 1));
		System.out.println(result.substring(2, 8));

		// Quiz
		String filename2 = "bit.png";
		// aaaaa.hwp, bbbbbb.mpeg �� ���� �ִ�.
		// ���⼭ ���ϸ�� Ȯ����� �и��ؼ� ����ϼ���
		System.out.println(filename2.substring(0, filename2.indexOf(".")));
		System.out.println(filename2.substring(filename2.length() - filename2.indexOf(".")));
		System.out.println(filename2.substring(filename2.indexOf(".") + 1));

		// replace ġȯ
		String s4 = "ABCD";
		String result4 = s4.replace("A", "�ȳ�");
		System.out.println(result4);

		// charAt �ش� �ڸ��� �ִ� ��
		System.out.println("charAt :" + s4.charAt(0));

		// endsWith ������ �����ϴ� ���ڰ� �����Ѱ�?
		System.out.println(s4.endsWith("CD")); // true
		System.out.println(s4.endsWith("BC")); // false ���� D���� �����Ѵ�

		// equalsIgnoreCase ��ҹ��� ���� X
		System.out.println(s4.equalsIgnoreCase("abcd"));

		// POINT : split
		String s6 = "���۸�,��Ƽ,�����,������,������";
		String[] namearry = s6.split(",");
		for (String a : namearry) {
			System.out.println(a);
		}
		String filename3 = "bit.hwp";

		// String[] farr = filename3.split("."); //����ǥ���� �̱� ������
		// System.out.println(farr.length); //0
		String[] farr = filename3.split("\\.");
		System.out.println(farr.length);

		// Java, JavaScript, DB... �� ����
		// 010-{\d4}-0000
		// 010-000-0000 ���ڰ� ����ǥ�� ���Ŀ� ��ġ�ϴ°�?(false -> {\d4} ������ 4�ڸ�)

		String s7 = "a/b,c.d-f";
		StringTokenizer sto = new StringTokenizer(s7, ",/.-");
		while (sto.hasMoreTokens()) {
			System.out.println(sto.nextToken());
		}

		// �ͼ��� Quiz
		String s8 = "ȫ                                    ��                                          ��";
		// ���� �� ���� > ȫ�浿 ���� ���� ����

		System.out.println(s8.replace(" ", ""));

		String[] sarry = s8.split(" ");
		for (String b : sarry) {
			System.out.print(b);
		}
		System.out.println();

		String s9 = "          ȫ�浿                ";
		System.out.println(">" + s9 + "<");
		System.out.println(">" + s9.trim() + "<");// �糡 ���� ����

		String s10 = "     ȫ   ��              ��         ";
		String re = s10.trim();
		String re2 = re.replace(" ", "");
		System.out.println(re2); // ����

		// �������� �Լ��� ���� �� ����
		// method chain ���
		System.out.println(s10.trim().replace(" ", ""));

		// Quiz_1
		// String snumstr = "";
		int sum = 0;
		String[] numarr = { "1", "2", "3", "4", "5" };
		// ���� : �迭�� �ִ� ���ڰ����� ���� sum�� ��� ���

		for (String a : numarr) {
			sum += Integer.parseInt(a);
		}
		System.out.println(sum);

		// Quiz_2
		String jumin = "123456-1234567";
		// ���� : �ֹι�ȣ�� ���� ���ϼ���
		String[] juarr = jumin.split("-");
		int sum2 = 0;
		String[] juarr2 = new String[juarr[0].length() + juarr[1].length()];
		for (int i = 0; i < juarr[0].length(); i++) {
			juarr2[i] = juarr[0].substring(i, i + 1);
		}
		for (int i = 0; i < juarr[1].length(); i++) {
			juarr2[juarr[1].length() - 1 + i] = juarr[1].substring(i, i + 1);
		}
		for (String a : juarr2) {
			sum2 += Integer.parseInt(a);
		}
		System.out.println(sum2);
		////////////////////////////////
		String[] juarr3 = jumin.replace("-", "").split("");
		int sum3 = 0;

		for (String i : juarr3) {
			sum3 += Integer.parseInt(i);
		}
		System.out.println("�ֹι�ȣ��2 : " + sum3);
	}

}

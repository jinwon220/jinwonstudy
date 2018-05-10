import java.util.StringTokenizer;

//String 클래스 (다양한 함수)
//개발에서 많이 사용(데이터 대부분 문자열 데이터 : 조합 처리)
//String 클래스 static 함수도 제공한다(public)
//String 클래스 new 를 통해서 사용가능한 일반함수도 가지고 있다(public)
public class Ex06_String_Function {
	public static void main(String[] args) {
		String str = ""; // 문자열의 초기화

		String[] strarr = { "aaa", "bbb", "ccc" };
		for (String s : strarr) {
			System.out.println(s);
		}
		// String 클래스 함수

		// concat 기존+결합 함수
		String ss = "hello";
		String concatstr = ss.concat(" world");
		System.out.println(concatstr);

		// contains 문자에 해당 문자가 들어 있는가
		// boolean bo = ss.contains("el"); //true
		boolean bo = ss.contains("elo"); // false
		System.out.println(bo);

		// length 길이
		String ss2 = "a b c d"; // [a][ ][b][ ][c][ ][d]
		System.out.println(ss2.length()); // 7

		// indexOf 해당 글자가 나오는 시작 위치 번째
		String filename = "hello java, world";
		System.out.println(filename.indexOf(",")); // 시작 위치(index)
		System.out.println(filename.indexOf("java"));
		// 활용 (내가 원하는 단어가 당신이 제시한 문장에 포함 되어 있다면 0보다 큰 값)

		System.out.println(filename.lastIndexOf("a")); // 해당 문자의 가장 뒤에 있는 문자의 시작 위치
		System.out.println(filename.lastIndexOf("javb")); // 배열(-1 없다는 표현)
		// return -1 (값이 없다)

		// length(), indextOf(), substring(), replace() split()....

		// substring 마지막 자리 - 입력한 자리
		String result = "superman";
		System.out.println(result.substring(0));
		System.out.println(result.substring(2));
		System.out.println(result.substring(0, 0));
		System.out.println(result.substring(0, 1));
		System.out.println(result.substring(2, 8));

		// Quiz
		String filename2 = "bit.png";
		// aaaaa.hwp, bbbbbb.mpeg 일 수도 있다.
		// 여기서 파일명과 확장명을 분리해서 출력하세요
		System.out.println(filename2.substring(0, filename2.indexOf(".")));
		System.out.println(filename2.substring(filename2.length() - filename2.indexOf(".")));
		System.out.println(filename2.substring(filename2.indexOf(".") + 1));

		// replace 치환
		String s4 = "ABCD";
		String result4 = s4.replace("A", "안녕");
		System.out.println(result4);

		// charAt 해당 자리에 있는 값
		System.out.println("charAt :" + s4.charAt(0));

		// endsWith 끝에서 시작하는 문자가 동일한가?
		System.out.println(s4.endsWith("CD")); // true
		System.out.println(s4.endsWith("BC")); // false 끝은 D부터 시작한다

		// equalsIgnoreCase 대소문자 구별 X
		System.out.println(s4.equalsIgnoreCase("abcd"));

		// POINT : split
		String s6 = "슈퍼맨,팬티,노란색,우하하,우하하";
		String[] namearry = s6.split(",");
		for (String a : namearry) {
			System.out.println(a);
		}
		String filename3 = "bit.hwp";

		// String[] farr = filename3.split("."); //정규표현식 이기 때문에
		// System.out.println(farr.length); //0
		String[] farr = filename3.split("\\.");
		System.out.println(farr.length);

		// Java, JavaScript, DB... 다 쓰임
		// 010-{\d4}-0000
		// 010-000-0000 문자가 정규표현 형식에 일치하는가?(false -> {\d4} 십진수 4자리)

		String s7 = "a/b,c.d-f";
		StringTokenizer sto = new StringTokenizer(s7, ",/.-");
		while (sto.hasMoreTokens()) {
			System.out.println(sto.nextToken());
		}

		// 넌센스 Quiz
		String s8 = "홍                                    길                                          동";
		// 저장 할 때는 > 홍길동 공백 제거 저장

		System.out.println(s8.replace(" ", ""));

		String[] sarry = s8.split(" ");
		for (String b : sarry) {
			System.out.print(b);
		}
		System.out.println();

		String s9 = "          홍길동                ";
		System.out.println(">" + s9 + "<");
		System.out.println(">" + s9.trim() + "<");// 양끝 공백 제거

		String s10 = "     홍   길              동         ";
		String re = s10.trim();
		String re2 = re.replace(" ", "");
		System.out.println(re2); // 무식

		// 여러개의 함수를 적용 할 때는
		// method chain 기법
		System.out.println(s10.trim().replace(" ", ""));

		// Quiz_1
		// String snumstr = "";
		int sum = 0;
		String[] numarr = { "1", "2", "3", "4", "5" };
		// 문제 : 배열에 있는 문자값들의 합을 sum에 담아 출력

		for (String a : numarr) {
			sum += Integer.parseInt(a);
		}
		System.out.println(sum);

		// Quiz_2
		String jumin = "123456-1234567";
		// 문제 : 주민번호의 합을 구하세요
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
		System.out.println("주민번호합2 : " + sum3);
	}

}

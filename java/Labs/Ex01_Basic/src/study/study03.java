package study;

import java.util.Arrays;

public class study03 {
	public static void main(String[] args) {
		//�Ž������� �� ���� �������� ������ �� �ִ����� ����ϴ� ����
		//���� money�� �ݾ��� �������� �ٲپ��� �� ���� �� ���� ������ �ʿ����� ����ؼ� ���
		//��, ������ �� ���� ���� �������� �Ž��� �־�� �Ѵ�.
		
		int[] coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		System.out.println("money="+money);
		
		for(int i = 0; i<coinUnit.length;i++) {
			int cnt = 0;
			while( money>=coinUnit[i]) {
				money -= coinUnit[i];
				cnt++;
			}
			coinUnit[i] = cnt;
		}
		System.out.println(Arrays.toString(coinUnit));
	}

}

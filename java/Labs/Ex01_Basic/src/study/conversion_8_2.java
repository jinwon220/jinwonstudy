package study;

import java.util.Scanner;

public class conversion_8_2 {

	public static void main(String[] args) {

		int bin[] = new int[100]; //2���� ���� �迭
		int cnt = 0; // �迭�� ��ġ
		int mok; // 8������  10���� ���� ��
		int nmg; // 8������ 10���� ���� ������
		int mok2; // �������� 2�� ���� �� (2���� ����)
		int nmg2; // �������� 2�� ���� ������ (2���� ����)
		int a; // nmg�� a�� ��ü �� ��迭
		
		
		Scanner sc = new Scanner(System.in);
		
		int pal = Integer.parseInt(sc.nextLine());
		
		do {
			mok = pal/10;
			nmg = pal - mok*10;
			a = nmg;
			
			for(int i =1; i <= 3; i++) {
				mok2 = a / 2;
				nmg2 = a - mok2*2;
				cnt = cnt +1;
				bin[cnt] = nmg2;
				a = mok2;
			}
			
			pal = mok;
		} while(mok != 0); {
			for (int i = cnt; i>=1; i--) {
				System.out.print(bin[i]);
			}
		}
		
		
	}

}

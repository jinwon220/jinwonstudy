import java.util.Arrays;

/*
 1. 1~45������ ������ �߻����� 6���� �迭�� ��������
 2. �迭�� ��� 6���� �迭���� �ߺ����� ������ �ȵǿ�
 3. �迭�� �ִ� 6���� ���� ���� ������ ���� ��Ű����
 4. �� ����� ��� �ִ� �迭�� ����ϼ���
*/
public class Ex02_Lotto_Main {
	public static void main(String[] args) {
		
		//1���� 2��
		int[] lotto_number = new int[6]; //�ζ� ��ȣ 6��
		
		do {
			for(int i = 0; i < lotto_number.length; i++) {
				lotto_number[i] = (int)(Math.random()*45)+1; //1~45������ ����
				for(int j = 0; j < i; j++) {
					if(i != j) { // ���� �迭 �� �ƴ϶�� [0] != [0]
						if(lotto_number[i] == lotto_number[j])
							i--; // lotto_number[n] = [n+1]�� ���ٸ� i--�� �����
					}
				}
			}
			break;
		}while(true);
		
		System.out.println(Arrays.toString(lotto_number));
		//3�� 4��
		int small = lotto_number[0]; //���� ���� �迭�ϱ����� ����� ����
		int temp = lotto_number[0]; //�ӽ�����
		for(int i = 0; i < lotto_number.length-1; i++) {
			for(int j = i; j < lotto_number.length; j++) {
				if(lotto_number[i] > lotto_number[j]) {
					temp = lotto_number[i];
					lotto_number[i] = lotto_number[j];
					lotto_number[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(lotto_number));

	}
}

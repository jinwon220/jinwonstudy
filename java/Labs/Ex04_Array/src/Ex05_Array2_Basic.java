
class Car{
	int door;
	String color;
}

public class Ex05_Array2_Basic {
	public static void main(String[] args) {
		//2����(��� ��)
		//[��],[��]
		int[][] score = new int[3][2];
		System.out.println(score[0][0]);
		System.out.println(score[2][1]);
		//System.out.println(score[2][2]); // Error 2�࿡�� [2]���� ���� / 2���� [1]
		score[0][0] = 100;
		score[0][1] = 200;
		
		score[1][0] = 300;
		score[1][1] = 400;
		
		score[2][0] = 500;
		score[2][1] = 600;
		
		System.out.println(score.length); // ���� �� (1���� �迭�� ��)
		//���� ���� : �迭�̸�.lengh -> score.length
		//���� ���� : �迭�̸�[i] -> score[0].length
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.printf("score[%d][%d] = %d\n", i, j, score[i][j]);
			}
			System.out.println();
		}
		
		// �����迭
		int[][] score2 = new int[5][];
		// ���� ���� �Ǿ������� ���� ����ϰ� ���� ��ŭ ���� �ٶ� ���� ���̰� �þ��.

		
		//TODAY POINT(Array >> Collection(�߿�!!!)
		//TODAY for�� >> ������ for�� (�迭 ���� for��)
		//C# : for(Type������ in �迭 or �÷���){��±���} => javascript�� ������ ����
		//JAVA : for(Type������ : �迭 or �÷���){��±���}
		int[] arr3 = {5, 6, 7, 8, 9, 10};
		/*
		for(int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		*/
		for(int v : arr3){
			System.out.println(v);
		}
		
		String[] sarr = {"A", "B", "C", "D", "FFFF"};
		for(String s : sarr) {
			System.out.println(s);
		}
		//���� ����
		//3�� 2��
		int[][] score3 = new int[][] {
										{11, 13},
										{13, 14},
										{15, 16}
									 };
		//������ for���� ����ؼ� ���� ����ϼ���
		for(int[] i : score3) {
			for(int j : i) {
				System.out.println("�� : " + j);
			}
		}
		
		//��ü �迭
		Car[] cararr = new Car[2];
		cararr[0] = new Car();
		cararr[0].color = "red";
		cararr[0].door = 4;
		
		cararr[1] = new Car();
		cararr[1].color = "blue";
		cararr[1].door = 2;
		
		//�Ϲ� for�� �ڵ��� �����, ���� ����
		for(int i = 0; i<cararr.length; i++) {
			System.out.println("�� �� : " + cararr[i].color + "\t�� ���� : " + cararr[i].door);
		}
		//������ for��
		for(Car i : cararr) {
			System.out.println("�� �� : " + i.color + "\t�� ���� : " + i.door);
		}
	}
}

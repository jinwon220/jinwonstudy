//������, ��� 

public class Ex06_Operation {
	public static void main(String[] args) {
		int sum = 0;

		// ���� ������ (+=, -=, *= ...)
		sum += 1; // sum = sum + 1;
		sum -= 1; // sum = sum - 1;
		System.out.println("sum :" + sum);

		// if���� ���� ������
		// ������ ���� ����
		// ������ ���ؼ� A+ , B-
		// 94��
		// 95�� ���� ũ�� A+
		// �׿ܴ� A-

		int score = 97;
		String grade = ""; // ���ڿ� �ʱ�ȭ ""
		System.out.println("����� ������ : " + score);

		if (score >= 90) {
			grade = "A";
			if (score >= 95)
				grade += "+";
			else
				grade += "-";
		} else if (score >= 80) {
			grade = "B";
			if (score >= 85)
				grade += "+";
			else
				grade += "-";
		} else if (score >= 70) {
			grade = "C";
			if (score >= 75)
				grade += "+";
			else
				grade += "-";
		} else
			grade = "F";

		/* ���׿����ڷ� ����� ���
		if (score >= 90) 
			grade = (score >= 95) ? "A+" : "A-";
		else if (score >= 80)
			grade = (score >= 95) ? "B+" : "B-";
		else if (score >= 70) 
			grade = (score >= 95) ? "C+" : "C-";
		else
			grade = "F";
		*/
		
		System.out.println("����� ������ : " + grade + "�Դϴ�");

		// �����
		// syso > ctrl + space => System.out.println();
		// �ڵ� �����ϱ� : ���ϴ� ��� ���(��ü��� ctrl + a) -> ctrl + shift + f (�ڵ� �鿩���� ����)

		// switch��
		int data = 100;
		switch (data) {
		case 100:
			System.out.println("100�Դϴ�.");
			break;
		case 90:
			System.out.println("90�Դϴ�.");
			break;
		case 80:
			System.out.println("80�Դϴ�.");
			break;
		default:
			System.out.println("default");
		}

		// break ������ ��� �ȴ�.
		// �ٸ�, ���������� �ʰ� ���� �����Ѵ�.
		switch (data) {
		case 100:
			System.out.println("100�Դϴ�^^");
		case 90:
			System.out.println("90�Դϴ�^^");
		case 80:
			System.out.println("80�Դϴ�^^");
		default:
			System.out.println("default^^");
		}

		//////////////////////////////////////
		
		// break ������ ������� �ʰ�
		// ���� �������� ��, ��� Ȱ�� ���
		int month = 3;
		String res;

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			res = "31";
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			res = "30";
			break;
		case 2:
			res = "29";
			break;
		default:
			res = "���� �ƴմϴ�.";
		}
		System.out.println(month + "���� " + res + "�ϱ��� �Դϴ�.");

		//���� (������ : ������ ���� ��)
		//import java.lang.Math (Math Ŭ����)
		//default > java.lang > import ����������...
		//java.lang �ȿ� �ִ� �ڿ��� java���� �⺻������ ����� (import ���� ��밡���ϴ�.)
		//Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0
		//Math.Random() �ڿ��� Random() �Լ��� static �̱� ������ ��ü ���� ���̵� ��� �����ϴ�
		//��� : 0.0 <= random < 1.0 �� double Ÿ���� �� �� ����
		
		System.out.println("Math.random() : " + Math.random());
		System.out.println("Math.random() *10 : " + Math.random()*10);
		//0~9������ ����
		System.out.println("(int)(Math.random()*10) :" + (int)(Math.random()*10));
		//1~10������ ����
		System.out.println("1 ~ 10 ���� ���� :" + ((int)(Math.random()*10)+1));
		
		/*
		���� Quiz
		������� �ϴ� �ý����� ��ȭ�� ��ǰ ��÷ �ý����Դϴ�.
		��ǰ ��÷�� 1000���� ������
		��ǰ���� TV, NoteBook, �����, �ѿ켼Ʈ, ����
		��ǰ ��÷�� 900���� ������
		��ǰ���� NoteBook, �����, �ѿ켼Ʈ, ����
		��ǰ ��÷�� 800���� ������
		��ǰ���� �����, �ѿ켼Ʈ, ����
		��ǰ ��÷�� 700���� ������
		��ǰ���� �ѿ켼Ʈ, ����
		��ǰ ��÷�� 600���� ������
		��ǰ���� ����
		�׿� 100 ~ 500 ������ ĩ��
		
		����ڰ� �ͼ� ��ǰ�ý����� ����ϰ� �Ǹ� �����ϰ� 100 ~ 1000 ������ ������ ���´�.
		
		*/
		
		/*
		100~1000 �� 100���� ���� ���ϴ� ���
		
		jumsu = (int)(Math.random()*1000);
		
		if(jumsu > 900) 	
			jumsu = 1000;
		else if(jumsu > 800)
			jumsu = 900;
		else if(jumsu > 700)
			jumsu = 800;
		else if(jumsu > 600)
			jumsu = 700;
		else if(jumsu > 500)
			jumsu = 600;
		else if(jumsu > 400)
			jumsu = 500;
		else if(jumsu > 300)
			jumsu = 400;
		else if(jumsu > 200)
			jumsu = 300;
		else if(jumsu > 100)
			jumsu = 200;
		else
			jumsu = 100;
		*/
		
		int jumsu;
		String giveaway = "";
		
		
		jumsu = (int)((Math.random()*10) + 1)*100;

		System.out.println(jumsu);
		switch(jumsu) {
			case 1000:
				giveaway += "TV";
			case 900:
				giveaway += " NoteBook";
			case 800:
				giveaway += " �����";
			case 700:
				giveaway += " �ѿ켼Ʈ";
			case 600:
				giveaway += " ����";
				break;
			default :
				giveaway = "ĩ��";
		}
		System.out.println("������ " + jumsu +"�̰�, ��ǰ�� " + giveaway + " �Դϴ�");
		
		
	}
}

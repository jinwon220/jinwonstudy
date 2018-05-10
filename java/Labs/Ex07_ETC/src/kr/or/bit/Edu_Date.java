package kr.or.bit;

import java.util.Calendar;

//�츮 ���� �ý��ۿ� ���Ǵ� ��¥ ���� �Ǵ� �Լ�..
//�� �Լ��� ���� ���ȴٸ� >> new ��ü ���� (x) >> Ŭ�����̸�.�Լ��̸�() static ����
//�پ��� ��¥ ���°� �ʿ��ϴٸ� >> �Լ��߰�(�����ε�)
public class Edu_Date {
	public static String DateString(Calendar date) {
		return date.get(Calendar.YEAR) + "�� "
			+ (date.get(Calendar.MONTH)+1) + "�� " 
			+ date.get(Calendar.DATE) +"��";
	}
	
	public static String DateString(Calendar date, String opr) {
		return date.get(Calendar.YEAR) + opr
				+ (date.get(Calendar.MONTH)+1) + opr 
				+ date.get(Calendar.DATE);
	}
	
	//����� (1~9) ���ڸ�, 10,11,12(���ڸ�)
	//1�� ~9�� ���ڸ� , 10~31 ���ڸ�
	
	//��� 2�ڸ� ǥ�� : 2018-02-12
	//2018-01-01
	//2019-12-12
	public static String monthFormet_DateString(Calendar date) {
		String month = ((date.get(Calendar.MONTH)+1)<10)?
				"0"+(date.get(Calendar.MONTH)+1):String.valueOf((date.get(Calendar.MONTH)+1));
		String date2 = ((date.get(Calendar.DATE))<10)?
				"0"+(date.get(Calendar.DATE)):String.valueOf(date.get(Calendar.DATE));
		return date.get(Calendar.YEAR) + "�� "
				+ month + "�� " 
				+ date2 +"��";
	}
}

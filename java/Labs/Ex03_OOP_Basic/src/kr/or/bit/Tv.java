package kr.or.bit;
/*
Tv ���赵
�䱸���� ����
Tv�� ä�� ������ ������ �ִ�.(���� ��� 1 ~ 200)
Tv�� �귣�� �̸��� ������ �ִ�.(�� �Ｚ, ����)
Tv�� ä�κ�ȯ����� ������ �ִ�.
ä���� ���� �ø� ���� �ְ� ���� ���� �ִ�.(ä���� �� �ܰ辿 ���� �����ϴ�)  

 */
public class Tv {
	public int channel = 1; // 1�� �⺻������ ����
	//class�� ������ ���� : field, instance_variable
	public String brand_name = "";
	
	public void channel_up() {
		channel++;
	}
	public void channel_down() {
		channel--;
	}
}


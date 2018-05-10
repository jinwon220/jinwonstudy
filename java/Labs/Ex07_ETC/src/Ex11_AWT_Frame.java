import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//�޸���, ���� ���� �� �ֵ���  java �����ϴ� �ڿ�
//AWT, SWING

class MyFrame extends Frame{
	public MyFrame(String title) {
		super(title);
	}
}

//�̺�Ʈ ���� (�̺�Ʈ �ڵ鷯 Ŭ����)
class BtnClick_Handler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		//�ڵ� ����������������
		//������ ���������������
		System.out.println("���ϴ� ����");
	}
	
}
public class Ex11_AWT_Frame {
	public static void main(String[] args) {
		MyFrame my = new MyFrame("Loing");
		my.setSize(350, 300);
		my.setVisible(true);
		my.setLayout(new FlowLayout());
		
		Button btn = new Button("�� ��ư");
		Button btn2 = new Button("two button");
		Button btn3 = new Button("three button");
		
		//��ư�� Ŭ���ϸ�  >> ����
		//�޼��带 ã�´� : actionPerformed (button �� Ŭ���ϸ� ȣ�� �Ǵ� �Լ�) API
		//ActionListener �������̽��� actionPerformed �� ������ �ִ�.
		//�̺�Ʈ �ڵ鷯�� ����� : ActionListener �� �����ϴ� Ŭ����
		//actionPerformed �Լ��� ���� ���� >> override
		//Buttom ���̱� (Listener���)

		
		//�͸�Ŭ���� ��ȸ�� �ڵ�
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�������̽� �͸�Ÿ������ ��������");
			}
		});
		
		BtnClick_Handler handler = new BtnClick_Handler();
		
		//Ŭ���� �̺�Ʈ �ڵ鷯�� ����� (������) >> ���� ����
		btn2.addActionListener(handler);
		btn3.addActionListener(handler);
		
		my.add(btn);
		my.add(btn2);
		my.add(btn3);
		
	}

}

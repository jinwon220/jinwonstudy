import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class LoginForm2 extends Frame{
	Label lbl_id;
	Label lbl_pw;
	TextField txt_id;
	TextField txt_pw;
	Button btn_ok;
	
	public LoginForm2(String title) {
		super(title);
		lbl_id = new Label("ID : ", Label.RIGHT);
		lbl_pw = new Label("PW : ", Label.RIGHT);
		
		txt_id = new TextField(10);
		txt_pw = new TextField(10);
		txt_pw.setEchoChar('*');
		btn_ok = new Button("Login");
		
		this.setLayout(new FlowLayout()); //���� (add)
		this.setSize(500, 100);
		this.setVisible(true);
		
		this.add(lbl_id);
		this.add(txt_id);
		
		this.add(lbl_pw);
		this.add(txt_pw);
		
		this.add(btn_ok);
		
		class Btn_Handler2 implements ActionListener{
			//��ư�� Ŭ���ϸ� actionPerformedȣ��
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent �߻��� ��ü�� �ּ� : " + e.getSource());
				if(txt_id.getText().trim().equals("hong")) {
					System.out.println("�氡�氡 : " + txt_pw.getText().trim());
				}else {
					System.out.println("hong�� �Է���");
				}
			}
		}
		
		btn_ok.addActionListener(new Btn_Handler2());
		
		//���� ���� �ʴ°͵� �� �����ȴ�.
		//1ȸ�� : windowListener �������̽� ����(�����ϴ� Ŭ������ ���� �͸�Ÿ��)
		this.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				//â�ݱ�...
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}

public class Ex13_Button_Event_InnerClass {
	public static void main(String[] args) {
		LoginForm2 login = new LoginForm2("�α���");
	}

}

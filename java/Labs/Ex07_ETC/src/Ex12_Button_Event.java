import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Btn_Handler implements ActionListener{
	private TextField txtid;
	private TextField txtpw;
	
	public Btn_Handler(TextField txtid, TextField txtpw) {
		this.txtid = txtid; //주소값(textfield)
		this.txtpw = txtpw;
	}
	
	//버튼을 클릭하면 actionPerformed호출
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent 발생지 객체의 주소 : " + e.getSource());
		if(txtid.getText().equals("hong")) {
			System.out.println("방가방가 : " + txtpw.getText());
		}else {
			System.out.println("hong을 입력해");
		}
	}
}

class LoginForm extends Frame{
	Label lbl_id;
	Label lbl_pw;
	TextField txt_id;
	TextField txt_pw;
	Button btn_ok;
	
	public LoginForm(String title) {
		super(title);
		lbl_id = new Label("ID : ", Label.RIGHT);
		lbl_pw = new Label("PW : ", Label.RIGHT);
		
		txt_id = new TextField(10);
		txt_pw = new TextField(10);
		txt_pw.setEchoChar('*');
		btn_ok = new Button("Login");
		
		this.setLayout(new FlowLayout()); //순서 (add)
		this.setSize(500, 100);
		this.setVisible(true);
		
		this.add(lbl_id);
		this.add(txt_id);
		
		this.add(lbl_pw);
		this.add(txt_pw);
		
		this.add(btn_ok);
		btn_ok.addActionListener(new Btn_Handler(txt_id, txt_pw));
	}
}

public class Ex12_Button_Event {

	public static void main(String[] args) {
		LoginForm login = new LoginForm("로그인");
	}

}

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//��� : file(read, write) : �������� ����
//FileInputStream , FileOutputStream

//txt ��� �۾� : C:\\Temp\\a.tet >> HELLO
public class Ex02_POINT_file_Read_Write {
	public static void main(String[] args) {
		//1�ܰ�
		//POINT : I/O �۾��� ��κ� ������ �÷����� ����� �ƴϴ�
		//��������� �ڿ��� ���� �۾��� �Ѵ� (�Լ� : close() -> �Ҹ��� �Լ� ȣ��....)
		FileInputStream fs =null;
		FileOutputStream fos = null;
		String path = "C:\\Temp\\a.txt";
		
		try {
			fs = new FileInputStream(path); //read
			fos = new FileOutputStream("C:\\Temp\\new.txt", true); //write
			//FileOutputStream Ŭ������ Temp �����ȿ� new.txt�� �������� �ʴ´ٸ�
			//���� ������ �մϴ�. >> ������ ���Ͽ� write �۾��� �մϴ�.
			
			//new FileOutputStream("C:\\Temp\\new.txt", true);
			//������ �ι�° ���� : true
			//���� ������ : append
			
			//new FileOutputStream("C:\\Temp\\new.txt");
			//new FileOutputStream("C:\\Temp\\new.txt", false);
			//default or false
			//���� ������ : overwrite 
			
			int data = 0;
			while((data = fs.read()) != -1) {
				fos.write(data);
			}
			fs.close();
			
			/* �б��ɸ��� �Ѱ�
			while((data = fs.read()) != -1) {
				System.out.println("����(����) : " + data);
				//H read �������� ��ȯ(�ƽ�Ű �ڵ�ǥ)
				char c = (char)data;
				System.out.println(c);
			}*/
			//fs.close(); //�������� �ڿ���ü
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			//�ڿ���ü (fs ������ scope try { �ȿ��� �� }
			try {
				fs.close();
				fos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//한글 2byte -> Stream 을 통한 통신 불가(byte단위)
//2byte 문자 -> Reader , Writer 추상 클래스

public class Ex05_Reader_Writer_kor {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("Ex01_Stream.java");
			fw = new FileWriter("copy_ex01.txt"); //파일 생성기능
			
			int data=0;
			while((data = fr.read()) != -1) {
				//System.out.println(data + " : "	+ (char)data);
				//fw.write(data);
				if(data != '\n' && data != '\r' && data != '\t' && data != ' ') {
					fw.write(data);
				}
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				fw.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

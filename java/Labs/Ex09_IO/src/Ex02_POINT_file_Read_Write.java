import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//대상 : file(read, write) : 물리적인 파일
//FileInputStream , FileOutputStream

//txt 기반 작업 : C:\\Temp\\a.tet >> HELLO
public class Ex02_POINT_file_Read_Write {
	public static void main(String[] args) {
		//1단계
		//POINT : I/O 작업은 대부분 가비지 컬렉터의 대상이 아니다
		//명시적으로 자원을 해제 작업을 한다 (함수 : close() -> 소멸자 함수 호출....)
		FileInputStream fs =null;
		FileOutputStream fos = null;
		String path = "C:\\Temp\\a.txt";
		
		try {
			fs = new FileInputStream(path); //read
			fos = new FileOutputStream("C:\\Temp\\new.txt", true); //write
			//FileOutputStream 클래스는 Temp 폴더안에 new.txt가 존재하지 않는다면
			//파일 생성을 합니다. >> 생성된 파일에 write 작업도 합니다.
			
			//new FileOutputStream("C:\\Temp\\new.txt", true);
			//생성자 두번째 인자 : true
			//기존 데이터 : append
			
			//new FileOutputStream("C:\\Temp\\new.txt");
			//new FileOutputStream("C:\\Temp\\new.txt", false);
			//default or false
			//기존 데이터 : overwrite 
			
			int data = 0;
			while((data = fs.read()) != -1) {
				fos.write(data);
			}
			fs.close();
			
			/* 읽기기능만을 한것
			while((data = fs.read()) != -1) {
				System.out.println("정수(숫자) : " + data);
				//H read 정수값을 반환(아스키 코드표)
				char c = (char)data;
				System.out.println(c);
			}*/
			//fs.close(); //정상적인 자원해체
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			//자원해체 (fs 변수의 scope try { 안에서 만 }
			try {
				fs.close();
				fos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}

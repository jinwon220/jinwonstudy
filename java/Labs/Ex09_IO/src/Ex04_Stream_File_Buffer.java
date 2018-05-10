import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//컴퓨터 느린 작업(DISK 파일 read , write)
//1.File 작업(DISK) (read , write) byte 단위
//위 같은 문제를 해결하기 위해서
//Buffer 메모리(작업 해 둔것을)
//무조건 : file 작업할 때 중간에 Buffer 사용

//File I/O 성능 개선
//Line 단위 처리

//JAVA API
//보조 스트림(input , output 추상클래스를 상속한 클래스가 객체로 존재 해야지만 사용가능)
//BufferedInputStream
//BufferedOutputStream

public class Ex04_Stream_File_Buffer {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("data.txt"); // 파일 생성 기능 가지고 있다.
			bos = new BufferedOutputStream(fos);
			
			for(int i = 0; i < 10; i++) {
				bos.write('A');
			}
			/*
				java buffer 크기 : 8킬로 바이트 -> 8192byte 
				1.buffer 안에 내용이 8kbyte 채우면 자동으로 비운다(요청한 곳에 보낸다)
				2.buffer 강제로 비우는 방법 : flush()강제 호출
				3.bos.close(); 내부에서 flush() 호출
				 -> flush()로 할 필요 없이 close()를 사용한다
			*/
			//bos.flush();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			try {
				bos.close(); //buffer close(flush() 포함)
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

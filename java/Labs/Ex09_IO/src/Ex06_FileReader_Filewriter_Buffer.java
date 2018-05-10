import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//문자 처리시 에도 Buffer 사용 I/O 성능 향상
//Buffer 장점 : Line 단위 read, writer

public class Ex06_FileReader_Filewriter_Buffer {
	public static void main(String[] args) {
		/*
		FileWriter fw = new FileWriter("a.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("로또");
		bw.newLine();
		bw.write("1,2,3,4,5");
		bw.flush();
		*/
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("Ex01_Stream.java");
			br = new BufferedReader(fr);
			
			String line = "";
			//br.readLine() 한줄 씩 읽을 때 읽을게 없으면 null이다
			for(int i = 0; (line = br.readLine()) != null; i++) {
				//System.out.println(line);
				
				//한 라인에 ;이 있다면 출력
				if(line.indexOf(";") != -1) {
					System.out.println(line);
				}
			}
		}catch(Exception e) {
			
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

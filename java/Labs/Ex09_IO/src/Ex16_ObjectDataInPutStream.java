import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import kr.or.bit.UserInfo;

//UserData.txt 파일에서 질렬화된 객체를 read (역직렬화) 다시 조립

public class Ex16_ObjectDataInPutStream {
	public static void main(String[] args) {
		String filename = "UserData.txt";
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream in = null;
		
		try {
			fis = new FileInputStream(filename);
			bis = new BufferedInputStream(fis);
			in = new ObjectInputStream(bis);
			
			//역직렬화 readObject()의 return type은 Object(다운캐스팅해주자!!)
			//UserInfo r1 = (UserInfo)in.readObject(); //역직렬화 : 복원
			//UserInfo r2 = (UserInfo)in.readObject(); //역직렬화 : 복원
			
			//System.out.println(r1.toString());
			//System.out.println(r2.toString());
			
			//객체 단위 read 객체가 없으면 null 값 반환
			Object users = null;
			int count = 0;
			while((users = in.readObject()) != null) {
				System.out.println(users);
				System.out.println(++count);
			}
		} catch (Exception e) {
			
		} finally {
			try {
				in.close();
				bis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

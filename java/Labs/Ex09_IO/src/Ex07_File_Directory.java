import java.io.File;

/*
File 클래스

파일(a.txt) 생성, 수정, 삭제
디렉토리 (폴더) 생성, 삭제

주로사용 : 파일정보, 폴더정보 확인을 위해 사용

C# : File, Directory 클래스

절대경로 : C:\\ , D:\\ , C:\\Temp\\a.txt

상대경로 : 나(file)를 중심으로
*/
public class Ex07_File_Directory {
	public static void main(String[] args) {
		// 기존에 만들어진 파일의 정보 확인
		
		String path = "C:\\Temp\\file.txt";
		File f = new File(path);
		//f.createNewFile(); 파일 만드는 방법
		String filename = f.getName();
		System.out.println("파일명 : " + filename);
		
		System.out.println("전체경로 : " + f.getPath());
		System.out.println("절대경로 : " + f.getAbsolutePath());
		System.out.println("너 폴더니? : " + f.isDirectory());
		System.out.println("너 파일이니? : " + f.isFile());
		System.out.println("파일 크기 : " + f.length()); // Hello안녕 ->5+4
		System.out.println("부모경로 : " + f.getParent());
		System.out.println("파일 존재 여부 : " + f.exists());
		
		//f.delete() >> return type >> true 지워짐, false 삭제실패
		//f.canRead() 사용가능 여부(읽을 수 있니?)
		
	}

}

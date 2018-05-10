package Grade;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradeCheck {
	static Map<Integer, Grade> map = new HashMap<>();
	static int cnt = 1;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		GradeCheck gc = new GradeCheck();
		while(true) {
			gc.menu();
			
			switch(sc.nextInt()){
			case 1:
				gc.add();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4 :
				gc.save();
				break;
			case 5:
				break;
			case 6:
				break;
			}
		}
	}

	private void menu() {
		System.out.println("성적관리!!!");
		System.out.print("<1>추가<2>삭제<3>출력<4>저장<5>로드<6>종료 : ");
	}
	private void add() {
		Grade g = new Grade();
		map.put(cnt, g.input(g));
	}
	
	private void save() {
		cnt++;
		String filename = "Grade.txt";
		//stream을 받아줘야 하기 때문에.. (한글은 안되는지?? 질문)
		//FileWriter fw = null;
		//BufferedWriter bw = null; 
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(filename);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			oos.writeObject(map);
			
		} catch (Exception e) {
			
		} finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (IOException e) {
				System.out.println("저장 실패!!");
				e.printStackTrace();
			}
		}
		System.out.println("저장 완료");
	}
}

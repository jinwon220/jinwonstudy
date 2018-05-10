package Homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyDos {
	static void Type(String[] args) {
		if (args.length != 1) {
			System.out.println("사용법 : java Type [경로명]");
			System.out.println("예시   : java Type D:\\Temp\\a.txt");
			System.exit(0);
		}
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(args[1]);
			br = new BufferedReader(fr);
			String line = "";

			for (int i = 0; (line = br.readLine()) != null; i++) {
				System.out.println(line);

			}
		} catch (Exception e) {

		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e) {

			}
		}

	}
	static void RENAME(String[] args) {
		if (args.length != 3) {
			System.out.println("[드라이브:][경로] RENAME 파일이름1 파일이름2.");
			System.exit(0);
		}

		if (args[1].equals("RENAME")) {

			File file = new File(args[0] + "\\" + args[2]);
			File newfile = new File(args[0] + "\\" + args[3]);

			System.out.println(file.getPath());
			System.out.println(newfile.getPath());

			if (file.renameTo(newfile)) {
				System.out.println("renamed");
			} else {
				System.out.println("error");
			}

		}

	}

	static void help(String[] dos) {
		if(dos.length >= 2 && dos[0].equals("help")) {
			//2개 이상 입력됬을 경우 사용법이 아님 , help 이면
			System.out.println("MyDos 명령어에 관한 도움말을 제공합니다.");
		    System.out.println("HELP [명령어]");
		    System.out.println("   명령어  - 해당 명령어에 대한 도움말 정보를 표시합니다.");
		    System.exit(0);
		}
		
		if(dos.length == 0) {//help만 입력 했을 시
			//모든 명령어 설명
			System.out.println("CD\t현재 디렉터리 이름을 보여주거나 바꿉니다.");
			System.out.println("FIND\t파일에서 텍스트 문자열을 찾습니다.");
			System.out.println("HLEP\tMyDos 명령어에 관한 도움말을 제공합니다.");
			System.out.println("MD\t디렉터리를 만듭니다.");
			System.out.println("RD\t디렉터리를 지웁니다.");
			System.out.println("RENAME\t파일 이름을 바꿉니다.");
			System.out.println("TYPE\t텍스트 파일의 내용을 보여줍니다.");
			System.out.println();
			System.exit(0);
		}
		
		//파라미터 없는 함수는 실행 가능
		//파라미터 있는 함수불가.. 수정중..
		//dos[0]이 입력했을 시
		try {
			//해당 클래스의 인스턴스 생성
			MyDos mydos = new MyDos();

			//java.lang.Class의 forName()메소드를 통해 클래스를 찾음
			Class c = Class.forName("Homework.MyDos"); //c변수에 해당 클래스 대입
			
			//getDeclaredMethods()를 통해 해당 클래스의 메소드들을 찾음
			Method methods[] = c.getDeclaredMethods();
			
			for(int i=0;i<methods.length;i++) {
				//method의 이름 찾기
                String findMethod = methods[i].getName(); 
                System.out.println(findMethod);
                
                //dos[0]와 같은 이름의 메소드 찾아서 실행
                if(findMethod.equals(dos[0])) {
                	try {
                		//invoke()를 통해 메소드 호출 가능
                        methods[i].invoke(mydos, new String[] {});
                        //첫번째 파라미터는 해당 메소드를 가진 인스턴스, 두번쨰 파라미터는 해당 메소드의 파라미터
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                        e.printStackTrace();
                    } /*catch(Exception e) {
                    	System.out.println(e.getMessage());
                    }*/
                }else {
                	System.out.println("해당 명령어가 없습니다.");
                }
            }
		} catch (ClassNotFoundException e) {
            System.out.println("클래스를 찾을 수 없습니다.");
        }
	}
}
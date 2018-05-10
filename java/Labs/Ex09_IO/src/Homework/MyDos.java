package Homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyDos {
	static void Type(String[] args) {
		if (args.length != 1) {
			System.out.println("���� : java Type [��θ�]");
			System.out.println("����   : java Type D:\\Temp\\a.txt");
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
			System.out.println("[����̺�:][���] RENAME �����̸�1 �����̸�2.");
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
			//2�� �̻� �Է��� ��� ������ �ƴ� , help �̸�
			System.out.println("MyDos ��ɾ ���� ������ �����մϴ�.");
		    System.out.println("HELP [��ɾ�]");
		    System.out.println("   ��ɾ�  - �ش� ��ɾ ���� ���� ������ ǥ���մϴ�.");
		    System.exit(0);
		}
		
		if(dos.length == 0) {//help�� �Է� ���� ��
			//��� ��ɾ� ����
			System.out.println("CD\t���� ���͸� �̸��� �����ְų� �ٲߴϴ�.");
			System.out.println("FIND\t���Ͽ��� �ؽ�Ʈ ���ڿ��� ã���ϴ�.");
			System.out.println("HLEP\tMyDos ��ɾ ���� ������ �����մϴ�.");
			System.out.println("MD\t���͸��� ����ϴ�.");
			System.out.println("RD\t���͸��� ����ϴ�.");
			System.out.println("RENAME\t���� �̸��� �ٲߴϴ�.");
			System.out.println("TYPE\t�ؽ�Ʈ ������ ������ �����ݴϴ�.");
			System.out.println();
			System.exit(0);
		}
		
		//�Ķ���� ���� �Լ��� ���� ����
		//�Ķ���� �ִ� �Լ��Ұ�.. ������..
		//dos[0]�� �Է����� ��
		try {
			//�ش� Ŭ������ �ν��Ͻ� ����
			MyDos mydos = new MyDos();

			//java.lang.Class�� forName()�޼ҵ带 ���� Ŭ������ ã��
			Class c = Class.forName("Homework.MyDos"); //c������ �ش� Ŭ���� ����
			
			//getDeclaredMethods()�� ���� �ش� Ŭ������ �޼ҵ���� ã��
			Method methods[] = c.getDeclaredMethods();
			
			for(int i=0;i<methods.length;i++) {
				//method�� �̸� ã��
                String findMethod = methods[i].getName(); 
                System.out.println(findMethod);
                
                //dos[0]�� ���� �̸��� �޼ҵ� ã�Ƽ� ����
                if(findMethod.equals(dos[0])) {
                	try {
                		//invoke()�� ���� �޼ҵ� ȣ�� ����
                        methods[i].invoke(mydos, new String[] {});
                        //ù��° �Ķ���ʹ� �ش� �޼ҵ带 ���� �ν��Ͻ�, �ι��� �Ķ���ʹ� �ش� �޼ҵ��� �Ķ����
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                        e.printStackTrace();
                    } /*catch(Exception e) {
                    	System.out.println(e.getMessage());
                    }*/
                }else {
                	System.out.println("�ش� ��ɾ �����ϴ�.");
                }
            }
		} catch (ClassNotFoundException e) {
            System.out.println("Ŭ������ ã�� �� �����ϴ�.");
        }
	}
}
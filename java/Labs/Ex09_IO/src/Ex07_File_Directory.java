import java.io.File;

/*
File Ŭ����

����(a.txt) ����, ����, ����
���丮 (����) ����, ����

�ַλ�� : ��������, �������� Ȯ���� ���� ���

C# : File, Directory Ŭ����

������ : C:\\ , D:\\ , C:\\Temp\\a.txt

����� : ��(file)�� �߽�����
*/
public class Ex07_File_Directory {
	public static void main(String[] args) {
		// ������ ������� ������ ���� Ȯ��
		
		String path = "C:\\Temp\\file.txt";
		File f = new File(path);
		//f.createNewFile(); ���� ����� ���
		String filename = f.getName();
		System.out.println("���ϸ� : " + filename);
		
		System.out.println("��ü��� : " + f.getPath());
		System.out.println("������ : " + f.getAbsolutePath());
		System.out.println("�� ������? : " + f.isDirectory());
		System.out.println("�� �����̴�? : " + f.isFile());
		System.out.println("���� ũ�� : " + f.length()); // Hello�ȳ� ->5+4
		System.out.println("�θ��� : " + f.getParent());
		System.out.println("���� ���� ���� : " + f.exists());
		
		//f.delete() >> return type >> true ������, false ��������
		//f.canRead() ��밡�� ����(���� �� �ִ�?)
		
	}

}

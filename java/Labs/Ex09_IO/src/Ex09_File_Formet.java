import java.io.File;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex09_File_Formet {
	public static void main(String[] args) {
		/*
		Format Ŭ����
		
		ȭ����� ó��
		DecimalFormat df = new DecimalFormat("#,###.0");
		String result = df.format(1234567.89);
		System.out.println(result);
		
		��¥���� ó��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		String strDate = sdf.format(new Date());
		System.out.println(strDate);
		*/
		
		File dir = new File("C:\\Temp");
		File[] files = dir.listFiles(); //����ڿ�(���� �Ǵ� ����)
		
		for(int i = 0; i < files.length; i++) {
			File file = files[i];
			String name = file.getName(); //������, ���ϸ�
			
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH-mma");
			String attribute = "";
			String size = "";
			
			if(files[i].isDirectory()) {
				attribute="<DIR>";
			}else { //�������� ����(a.txt , copy.jpg ...)
				size = file.length() + "byte";
				attribute=file.canRead()?"R":"";
				attribute+=file.canWrite()?"W":"";
				attribute+=file.isHidden()?"H":"";
			}
			System.out.printf("%s  %3s  %10s  %s \n",
							df.format(new Date(file.lastModified()))
							,attribute
							,size
							,name);
		}
	}

}

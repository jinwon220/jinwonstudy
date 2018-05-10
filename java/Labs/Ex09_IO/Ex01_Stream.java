import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
I/O

1.stream (�������, ��������, �߰��Ű�ü)
2.stream ������� ũ��(���ỡ�� : �⺻������ 1byte) >> byte ����� >> byte �迭

3.Java API �����ϴ� Ŭ����

I/O �۾�
byte ó��
InputStream(�߻�), OutputStream(�߻�)
�ΰ��� �߻�Ŭ���� ��� (������) Ŭ������

���(momery)
ByteArrayInputStream, ByteArrayOutStream

���(file)
FileInputStream, FileOutputStream

�߰������� ���� Ŭ����
Buffer (I/O)�� ������ ���Ã���
... BufferedInputStream, BufferedOutputStream


*/
public class Ex01_Stream {
	public static void main(String[] args) {
		//Memory (�迭)
		//byte (-128 ~ 127) : ������
		byte[] inSrc =  {0,1,2,3,4,5,6,7,8,9};
		//System.out.println(inSrc[5]);
		byte[] outSrc = null; //outsrc �޸𸮸� ������ ���� �ʴ�
		
		ByteArrayInputStream input = null; //�迭 ������ read
		ByteArrayOutputStream output = null; //�迭 ������ wrtie
		
		input = new ByteArrayInputStream(inSrc);
		//������ insrc �迭�ּ� read�� �� ����.
		output = new ByteArrayOutputStream(); //write�ϴ� ���(memory)
		
		System.out.println("output befor : " + Arrays.toString(outSrc));
		
		//���İ��� ����(�ϱ�)
		int data = 0;
		while((data = input.read())!= -1) { //���̻� read()�� �ڿ��� ���ٸ� return -1
			System.out.println("data :"+ data);
			//System.out.println("input.read()" + input.read());
			//input.read() �� ���������� next() ����� ������ �ִ�.
			
			output.write(data);
			//write ��� : ByteArrayOutputStream��ü read() >> write
		}
		outSrc = output.toByteArray(); 
		//�ڽ��� ������ �մ� ���� �迭�� ����
		//byte[] outSrc = null; ���� �ּҰ� �Ҵ�
		System.out.println("outSrc : After >> " + Arrays.toString(outSrc));
	}
}

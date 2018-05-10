import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
I/O

1.stream (연결통로, 입출력통로, 중간매개체)
2.stream 입출력의 크기(음료빨대 : 기본적으로 1byte) >> byte 입출력 >> byte 배열

3.Java API 제공하는 클래스

I/O 작업
byte 처리
InputStream(추상), OutputStream(추상)
두개의 추상클래스 상속 (재정의) 클래스는

대상(momery)
ByteArrayInputStream, ByteArrayOutStream

대당(file)
FileInputStream, FileOutputStream

추가적으로 보조 클래스
Buffer (I/O)의 성늘을 향상시깉다
... BufferedInputStream, BufferedOutputStream


*/
public class Ex01_Stream {
	public static void main(String[] args) {
		//Memory (배열)
		//byte (-128 ~ 127) : 정수값
		byte[] inSrc =  {0,1,2,3,4,5,6,7,8,9};
		//System.out.println(inSrc[5]);
		byte[] outSrc = null; //outsrc 메모리를 가지고 있지 않다
		
		ByteArrayInputStream input = null; //배열 데이터 read
		ByteArrayOutputStream output = null; //배열 데이터 wrtie
		
		input = new ByteArrayInputStream(inSrc);
		//생성자 insrc 배열주소 read할 수 없다.
		output = new ByteArrayOutputStream(); //write하는 대상(memory)
		
		System.out.println("output befor : " + Arrays.toString(outSrc));
		
		//공식같은 로직(암기)
		int data = 0;
		while((data = input.read())!= -1) { //더이상 read()할 자원이 없다면 return -1
			System.out.println("data :"+ data);
			//System.out.println("input.read()" + input.read());
			//input.read() 가 내부적으로 next() 기능을 가지고 있다.
			
			output.write(data);
			//write 대상 : ByteArrayOutputStream객체 read() >> write
		}
		outSrc = output.toByteArray(); 
		//자신이 가지고 잇는 값을 배열로 만들어서
		//byte[] outSrc = null; 에게 주소값 할당
		System.out.println("outSrc : After >> " + Arrays.toString(outSrc));
	}
}

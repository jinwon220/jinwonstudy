//class = ���赵, ��ü = ���赵�� ������� �޸𸮿� ���� ���� ��ü�̴�.
/*
1. ���赵 �뵵 ����� Ŭ����  kr.or.bit.Emp
2. ������ ���ؼ� ����� Ŭ���� (������: main() �Լ�) : Ex01_variable
3. �Լ� : public static void main(String[] args){} : ���α׷� ������, ������
TIP) C# > void Main()
class Ex01_variable 


���� : variable
���� Scope (��ȿ����) : ����Ǵ� ��ġ�� ����
1. instance variable : ��ü���� (���赵�� ������ �ִ� ����) class Test{����Ǵ� ��ġ}
2. local variable     : �������� (�Լ��ȿ� �ִ� ����) class Test{void run(){����Ǵ� ��ġ}}
3. static variable    : ��������
*/

//���赵 == class
class Test{
  int iv = 500;
  //instance variable : ��ü����(���赵�� ������ �ִ� ����)
  //�� ������ �ʱ�ȭ�� ���� �ʾƵ� �ȴ�(�⺻�� : default)�� ������ �ִ�
  //why �ʱ�ȭ�� ���� �ʾƵ� ��밡�� �ұ��
  //��) 
  String sv; // ��ü����
  
  void print() {
    int lv = 100; // local variable
  } 
  void write() {
    System.out.println("iv:�������� : " + iv);

    //Error
    //lv ������ print(){���ο� �ִ� ����}
    //System.out.println("lv:�������� : " + lv);
  }
}

public class Ex01_variable{
  public static void main(String[] args){
	  
    int lv = 500; //local variable
                  //�Լ��� ȣ��Ǹ� �׶� �޸𸮿� �����ǰ� �Լ��� ����Ǹ� �޸𸮿� �������.
    System.out.println("lv������ : " + lv);
    
    //int number; //����
    //System.out.println(number);
    //���� �ϰ� ������� �ʾ��� ���� Error �ȳ�.
    //number�� �ʱ�ȭ�� ���� �ʾҽ��ϴ�. (��� ����) Error
    
    int number = 100;
    System.out.println("�ʱ�ȭ : " + number);
    //1.���������� �ݵ�� �ʱ�ȭ �ϰ� ����Ͽ��� �Ѵ�. (ó�� ���� �Է��ϴ� ���� �ʱ�ȭ)
    //2.��� : �Լ��ȿ� ��������(local variable) �ݵ�� �ʱ�ȭ����
    
    
    
    /*
    // Test() = �Լ� ()�� ������ �Լ���
    Test t = new Test();
    t.write();
    //.=�ּҰ� 
    */  
    }
}
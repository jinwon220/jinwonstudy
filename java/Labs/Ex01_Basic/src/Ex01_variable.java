//class = 설계도, 객체 = 설계도를 기반으로 메모리에 오른 것이 객체이다.
/*
1. 설계도 용도 만드는 클래스  kr.or.bit.Emp
2. 실행을 위해서 만드는 클래스 (실행점: main() 함수) : Ex01_variable
3. 함수 : public static void main(String[] args){} : 프로그램 시작점, 진입점
TIP) C# > void Main()
class Ex01_variable 


변수 : variable
변수 Scope (유효범위) : 선언되는 위치에 따라서
1. instance variable : 객체변수 (설계도가 가지고 있는 변수) class Test{선언되는 위치}
2. local variable     : 지역변수 (함수안에 있는 변수) class Test{void run(){선언되는 위치}}
3. static variable    : 공유변수
*/

//설계도 == class
class Test{
  int iv = 500;
  //instance variable : 객체변수(설계도가 가지고 있는 변수)
  //이 변수는 초기화를 하지 않아도 된다(기본값 : default)를 가지고 있다
  //why 초기화를 하지 않아도 사용가능 할까요
  //답) 
  String sv; // 객체변수
  
  void print() {
    int lv = 100; // local variable
  } 
  void write() {
    System.out.println("iv:전역변수 : " + iv);

    //Error
    //lv 변수는 print(){내부에 있는 변수}
    //System.out.println("lv:지역변수 : " + lv);
  }
}

public class Ex01_variable{
  public static void main(String[] args){
	  
    int lv = 500; //local variable
                  //함수가 호출되면 그때 메모리에 생성되고 함수가 종료되면 메모리에 사라진다.
    System.out.println("lv변수값 : " + lv);
    
    //int number; //선언
    //System.out.println(number);
    //선언만 하고 사용하지 않았을 때는 Error 안남.
    //number가 초기화가 되지 않았습니다. (사용 못함) Error
    
    int number = 100;
    System.out.println("초기화 : " + number);
    //1.지역변수는 반드시 초기화 하고 사용하여야 한다. (처음 값을 입력하는 것을 초기화)
    //2.약속 : 함수안에 지역변수(local variable) 반드시 초기화하자
    
    
    
    /*
    // Test() = 함수 ()가 있으면 함수다
    Test t = new Test();
    t.write();
    //.=주소값 
    */  
    }
}
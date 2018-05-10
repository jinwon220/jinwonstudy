package kr.or.bit;
/*
만든이 : 홍길동
날짜 : 2018-01-23
파일 : Emp.java (사원정보)

* class 설계도이다
설계도는 기본적인 구성요소(상태정보(속성):변수 + 행위정보(기능):함수)

*/

//객체지향 3대 특징 캡슐화 상속 다형성
//설계도는 메인 함수를 갖지 않는다.
public class Emp {
	public int empno; //사번 (변수 > 상태정보 > member field > instance variable)
	public String ename; //이름
	private String job; //직종
	
	//행위정보(기능) > 함수(main도 함수)
	//함수는 (호출) > 동작
	public String getEmpInfo() {
		return this.empno + "/" + this.ename + "/" + this.job;
	}
	
	//함수 2개 생성
	//캡슐화 (은닉화)
	//직접할당을 막고 간접할당을 통해서 원하는 값만 입력 또는 리턴 가능
	//setter 함수, getter 함수
	//private 접근자를 가지는 변수
	//읽기 전용(read)
	public String getJob() {
		return job + "입니다.";
	}
	//쓰기 전용(write)
	public void setJob(String job) {
		this.job = job;
	}
}

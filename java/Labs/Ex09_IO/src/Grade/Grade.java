package Grade;

import java.io.Serializable;
import java.util.Scanner;

public class Grade implements Serializable{
	private int math = 0;
	private int eng = 0;
	private int kor = 0;
	private double avg = 0.0;
	private String grd = null;
	public Grade input(Grade grade) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수학점수 : ");
		this.math = sc.nextInt();
		System.out.print("영어점수 : ");
		this.eng = sc.nextInt();
		System.out.print("국어점수 : ");
		this.kor = sc.nextInt();
		this.avg = (this.math+this.eng+this.kor)/3;
		if(this.avg > 90) this.grd = "A";
		else if(80 < this.avg && this.avg <= 90)
			this.grd = "B";
		else if(70 < this.avg && this.avg <= 80)
			this.grd = "C";
		else this.grd = "F";
		return grade;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getGrd() {
		return grd;
	}
	public void setGrd(String grd) {
		this.grd = grd;
	}
	@Override
	public String toString() {
		return "Grade [math=" + math + ", eng=" + eng + ", kor=" + kor + ", avg=" + avg + ", grd=" + grd + "]";
	}
}

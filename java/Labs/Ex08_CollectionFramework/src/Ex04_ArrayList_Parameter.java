import java.util.ArrayList;

class EmpData{
	private ArrayList elist;
	private int[] numbers;
	
	EmpData(){
		this.elist = new ArrayList();
		this.numbers = new int[10];
	}
	
	//getter
	public ArrayList getElist() {
		return this.elist;
	}
	//setter
	public void setElist(ArrayList elist) {
		this.elist = elist;
	}
	public int[] getNumbers(){
		return this.numbers;
	}
	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}
}

public class Ex04_ArrayList_Parameter {
	public static void main(String[] args) {
		EmpData empData = new EmpData();
		System.out.println(empData);
		System.out.println(empData.getElist().toString());
		
		ArrayList li = new ArrayList();
		li.add(100);
		li.add(200);
		li.add(300);
		
		empData.setElist(li);
		System.out.println(empData.getElist().toString());
	}

}

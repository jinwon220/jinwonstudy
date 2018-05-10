import kr.or.bit.Book;
import kr.or.bit.Employee;

public class Ex14_Constructor {

	public static void main(String[] args) {
		Book b = new Book("홍길동전", 10000);
		b.bookInfo();
		System.out.printf("책이름 : %s / 가격 : %d \n", b.getBook_name(), b.getPrice());
		
		////////////////////////////////////////////////////
		Employee e1 = new Employee();
		e1.empInfo();
		
		e1.setEmpno(201801);
		e1.setJob("IT");
		e1.empInfo();
		
		//Array 배열을 사용해서 3명의 사원을 만들어 보세요(int[] arr = {10,20,30})
		//그 정보를 출력해 보세요
		Employee[] e2 = {new Employee(1, "A", "IT"),
						 new Employee(2, "B", "IT"),
						 new Employee(3, "C", "IT")};
		for(Employee E : e2) {
			E.empInfo();
		}
	}
}
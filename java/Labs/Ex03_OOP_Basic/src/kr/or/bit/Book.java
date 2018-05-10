package kr.or.bit;
/*
 책은 책이름을 가지고 있고 가격
 책이 출판되면 반드시 책이름과 책의 가격을 가지고 있어야한다.
 책의 이름과 가격 정보는 특정 기능을 통해서만 볼 수 있고, 출판된 이후에는 수정 할 수 없다. 
 책이름과 가격정보는 각각 확인 할 수 있다.
 */
public class Book {
	private String book_name;
	private int price;
	
	public Book(String book_name, int price) {
		this.book_name = book_name;
		this.price = price;
	}

	public void bookInfo() {
		System.out.printf("책이름 : %s / 가격 : %d \n", book_name, price);
	}
	
	public String getBook_name() {
		return book_name;
	}

	public int getPrice() {
		return price;
	}
}

package kr.or.bit;
/*
 å�� å�̸��� ������ �ְ� ����
 å�� ���ǵǸ� �ݵ�� å�̸��� å�� ������ ������ �־���Ѵ�.
 å�� �̸��� ���� ������ Ư�� ����� ���ؼ��� �� �� �ְ�, ���ǵ� ���Ŀ��� ���� �� �� ����. 
 å�̸��� ���������� ���� Ȯ�� �� �� �ִ�.
 */
public class Book {
	private String book_name;
	private int price;
	
	public Book(String book_name, int price) {
		this.book_name = book_name;
		this.price = price;
	}

	public void bookInfo() {
		System.out.printf("å�̸� : %s / ���� : %d \n", book_name, price);
	}
	
	public String getBook_name() {
		return book_name;
	}

	public int getPrice() {
		return price;
	}
}

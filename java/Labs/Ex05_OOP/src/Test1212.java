class Shape1 {
	String color = "gold";
}

class Point1 {
	int x;
	int y;

	Point1() {
		this(1, 2);

	}

	Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Triangle2 {
	Point1[] arr;

	Triangle2() {
		/*
		arr[0] = new Point1(1,2);
		arr[1] = new Point1(3,4);
		arr[2] = new Point1(5,6);
		 */
		this(new Point1[] { new Point1(1, 2), new Point1(3, 4), new Point1(5, 6) });
	}

	Triangle2(Point1[] arr) {
		this.arr = arr;
	}

	void print() {
		for (Point1 p : arr) {
			System.out.println(p.x + "/" + p.y);
		}
	}
}

public class Test1212 {
	public static void main(String[] args) {
		Triangle2 t = new Triangle2(new Point1[] { new Point1(3, 4), new Point1(5, 6), new Point1(7, 8) });
		t.print();

		for (Point1 p : t.arr) {
			System.out.println(p.x + ":" + p.y);
		}
	}
}

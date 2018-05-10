import java.util.Arrays;

/*
���赵 �� 1���� ���� �� �ִ�.
�������� ���赵 �ۼ���

*������
��Ӱ���( is ~ a : ���) �� ~�̴�

���԰���( has ~ a : ����) ��  ~ ������ �ִ�
-----------------------------------
��Ŭ����, ����Ŭ����
���� �����̴�  (��Ӱ���)
>> �� extends ����

���� ���̴� (x)
���� ���� -> (x,y)
���� ���� �������ִ�(has ~ a) (���԰���)
>> ��{ �� ������; }

���� ������ ������ �ִ�(x)


���� , ��
������ ���̴�(x)
������ ���� ������ �ִ�(has ~ a) (���԰���)


------------------------------------------

���� ���
�� , �ﰢ�� , �簢���� ����� ���赵�� �ۼ��Ѵٸ�

���� �����̴�
�ﰢ���� �����̴�
�簢���� �����̴�

���⼭ ����(�Ϲ�ȭ ,�߻�ȭ)�� ���� : ���� , �׸��� 
���� (��üȭ ,Ư��ȭ) -> (�� , ������)

���� ��ǥ�� (x,y)
���� ���� ������ �ִ�
�ﰢ���� ���� ������ �ִ�
�簢���� ���� ������ �ִ� 

�Ϲ�ȭ(����, �߻�) : shape (����, �׸���) , point(��)
class Shape{} , class Point{}

��üȭ Ư��ȭ : circle , triangle

*/
//�߻�ȭ, �Ϲ�ȭ
class Shape{
	String color = "gold";
	void draw() {
		System.out.println("�׸���");
		
	}
}

class Point{
	int x;
	int y;
	
	Point(){
		//this.x = 1;
		//this.y = 1;
		this(1, 1);
	}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

//���� ���弼�� (���� : ������ �������� ������ �ֽ��ϴ�.)
//���� �����̴� (is ~ a) : extends
//���� ���� ������ �ִ�.(has ~ a) : ��������
//���� Ư������ ������(r)
class Circle extends Shape{
	int r; //������
	Point center; //���԰���
	
	Circle(){
		//this.r=10;
		//this.center = new Point(10, 12);
		this(10, new Point(10,12));
	}
	/*
	 Circle c = new Circle();
	 Circle c2 = new Circle(4,new Point(5,8));
	*/
	Circle(int r, Point center){
		this.r = r;
		this.center = center;
	}
}
//����1)
//�ﰢ�� Ŭ������ ���弼��
//����) �ﰢ���� 3���� ���� ���� �׸��� �׸��ٶ�� ����� ������ �ִ�
//Shape, point ���� �޾ƿ�
//hint) (x,y)(x,y)(x,y) 3���� ��ǥ��
class Triangle extends Shape{
	// int[] i = new int[]{1, 2, 3} =>����
	// int[] i = {1, 2, 3} =>����
	//--------------------------------
	// int[] i;
	// i = int[]{1, 2, 3} =>����
	// i = {1, 2, 3} => Error �Ұ���!!!!
	
	Point[] point_three;
	
	Triangle(){
		//point_three = new Point[]{new Point(1,1), new Point(2,2), new Point(3,3)};
		this(new Point[]{new Point(1,1), new Point(2,2), new Point(3,3)});
		//point_three = {new Point(1,1), new Point(2,2), new Point(3,3)};            �Ұ�!!
		//this({new Point(1,1), new Point(2,2), new Point(3,3), new Point(4,4)});    �Ұ�!!
	}
	
	Triangle(Point[] point_three){
		this.point_three = point_three;
	}
	
	void print() {
		int n = 0;
		for(Point point : point_three) {
			n++;
			System.out.println("��ǥ" +n +" : " + point.x + ", " + point.y);
		}
	}
}

public class Ex02_inherit_composite {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		System.out.println(c.color);
		System.out.println(c.r);
		System.out.println(c.center.x); //������ �ٽ��ڵ� ����.�ּҰ�.��
		System.out.println(c.center.y);
		
		//���� ���� �������ϰ� ������ �����ؼ� ���� �׸��� �;��
		//Point point = new Point(20, 45);
		//Circle c2 = new Circle(50, point);
		Circle c2 = new Circle(50, new Point(20,45));
		
		System.out.println(c2.r);
		System.out.println(c2.center.x);
		System.out.println(c2.center.y);
		
		Point[] p = new Point[3];
		Triangle t = new Triangle(new Point[]
								  { new Point(20,45),
									new Point(20,55),
									new Point(30,45)
								  });
		t.print();
	}
}

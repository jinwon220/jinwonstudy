/*
��Ÿũ����Ʈ
����(umit)

unit ������ (�̵���ǥ, �̵�, �����)
unit �̵� ��� �ٸ���(unit ���� ������ �̵������ �ٸ���)
abstract class �̸� {abstract method ���� ����}

*/
abstract class Unit{
	int x, y;
	void stop() {
		System.out.println("Unit Stop");
	}
	
	//�̵�
	abstract void move(int x, int y); //{���ư���} , {�ɾ��}
}

//move �߻�ȭ -> ��üȭ (Ư��ȭ)
class Tank extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Tank �̵� : " + this.x + ", " + this.y);
	}
	
	//Tank �� ������ ��üȭ(Ư��ȭ) ������ ���
	void changeMode() {
		System.out.println("��ũ ��ȯ ���");
	}
	//�ʿ��ϴٸ� ����
}

class Marine extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Marine �̵�  : " + this.x + ", " + this.y);
	}
	
	void stimpack() {
		System.out.println("�����ѱ��");
	}
}

class DropShip extends Unit{
	
	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("���� �̵�  : " + this.x + ", " + this.y);
	}
	void load() {
		System.out.println("Unit load");
	}
	void unloa() {
		System.out.println("Unit unload");
	}
}

public class Ex02_abstract_class {
	public static void main(String[] args) {
		Tank t = new Tank();
		t.move(100, 200);
		t.stop();
		t.changeMode();
		
		Marine m = new Marine();
		m.move(300, 200);
		m.stop();
		m.stimpack();
		
		//1.Quiz ��ũ 3�븦 ����� [���� ��ǥ]�� �̵�
		System.out.println("----------");
		int i = 0;
		Tank[] t1 = {new Tank(), new Tank(), new Tank()}; 
		for(Tank a : t1) {
			System.out.printf("[%d]��° ��ũ\n", i++);
			a.move(10, 50);
		}
		//2.�������� Unit (Tank, Marine, DropShip) ���� ��ǥ�� �̵�
		System.out.println("----------");
		i = 0;
		Unit[] unit = {new Tank(), new Marine(), new DropShip()};
		for(Unit u : unit) {
			System.out.printf("[%d]��° ����\n", i++);
			u.move(20, 70);
		}
	}
}

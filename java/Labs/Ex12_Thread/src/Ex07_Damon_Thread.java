//�ѱ� �۾� (�� �۾�) ... ���������� (����) >> Damon ...
//Damon ��  (�� Thread) �� ������ ���� �� (�� Thread�� ������ Damon�� ����)

public class Ex07_Damon_Thread implements Runnable{
	static boolean autosave = false;
	
	public static void main(String[] args) {
		//Ex07_Damon_Thread ex = new Ex07_Damon_Thread();
		//Thread th = new Thread(ex);
		Thread th = new Thread(new Ex07_Damon_Thread());
		th.setDaemon(true);
		th.start();
		//main �� �ϳ��� Thread (non-damon)
		//main �� ������ th (th�� main�� damon������)
		//th�� main�� ����� �����Ѵ�.
		for(int i = 0; i <= 30; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Main Thread : " + i);
			if(i == 5) {
				System.out.println(i);
				autosave = true;
			}
		}
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				
			}
			if(autosave) { //true���
				autoSave();
			}
		}
	}
	public void autoSave() {
		System.out.println("������ 3�� �������� �ڵ� ���� �Ǿ����ϴ�.");
	}

}

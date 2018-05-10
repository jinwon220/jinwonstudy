package project;

import java.util.List;

public class Start {
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.addAccount("110-****-****", "������"); //����
		bank.addAccount("110-1111-1111", "������"); //����
		bank.addAccount("110-2222-2222", "�̸�"); //����
		
		System.out.println("\n���¹�ȣ�� ���� Ȯ��");
		Account account = bank.getAccount("110-****-****"); //���¹�ȣ�� ���� Ȯ��
		System.out.println(account);
		
		System.out.println("\n�����ڸ� ���� Ȯ��");
		List<Account> accounts = bank.findAccounts("������"); //�����ڸ� ���� Ȯ��
		bank.print(accounts);

		System.out.println("\n��� ������ ���");
		accounts = bank.getAccounts(); //��� ������ ���
		bank.print(accounts);
		
		System.out.println("\n������ �� ����");
		int cnt = bank.getTotalAccount(); //������ �� ����
		System.out.println(cnt);
		
		Account ac = new Account(account);
		ac.deposit(1000L); //�Ա�
		ac.withdraw(200L); //���
		
		System.out.println("\n�ܰ� Ȯ��");
		System.out.println(ac.getBalance()); //�ܰ� Ȯ��
		System.out.println("\n��� �ŷ����� Ȯ��");
		List<Transaction> trans = ac.getTransactions(); //��� �ŷ� ����
		ac.print(trans); 
	}

}

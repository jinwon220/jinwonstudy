package project;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Account {
	Calendar cal = Calendar.getInstance();
	private String accountNo; // ���¹�ȣ
	private String name; // �����ڸ�
	private long balance; // �ܰ�
	private Map<Transaction, String> transactions = new HashMap<>(); // �ŷ�����(0���̻�)
				// �ŷ����� , ���¹�ȣ
	public Account(String accountNo, String name){
		this.accountNo = accountNo;
		this.name = name;		
	}
	
	public Account(Account ac){
		this.accountNo = ac.accountNo;
		this.name = ac.name;		
	}
	
	public String getAccountNo() {
		return accountNo;
	}

	public String getName() {
		return name;
	}
	
	// �Ա��Ѵ�
	public void deposit(long amount) {
		Transaction tran = new Transaction(cal.get(Calendar.YEAR) + "/" + cal.get(Calendar.MONTH) +"/" + cal.get(Calendar.DATE),
											(cal.get(Calendar.HOUR)+1)+":"+cal.get(Calendar.MINUTE),
											"�Ա�",
											amount,
											balance + amount );
		balance = tran.getBalance();
		transactions.put(tran, accountNo);
	}
	
	//����Ѵ�
	public void withdraw(long amount) {
		Transaction tran = new Transaction(cal.get(Calendar.YEAR) + "/" + cal.get(Calendar.MONTH) +"/" + cal.get(Calendar.DATE),
											(cal.get(Calendar.HOUR)+1)+":"+cal.get(Calendar.MINUTE),
											"���",
											amount,
											balance - amount );
		balance = tran.getBalance();
		transactions.put(tran, accountNo);
	}
	
	// �ܰ� Ȯ���Ѵ�
	public long getBalance() { 
		return balance;
	}
	
	// �ŷ������� ����
	public List getTransactions() {
		List<Transaction> tranlist = new ArrayList<>();
		for(Map.Entry m : transactions.entrySet()) {
			if(accountNo.equals(m.getValue())) {
				tranlist.add((Transaction)m.getKey()); // �ŷ������� �־��ش�
			}
		}
		return tranlist;
	}
	
	public void print(List list) {
		Iterator<Account> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	@Override
	public String toString() {
		return "���¹�ȣ=" + accountNo + ", �����ڸ�=" + name + ", �ܰ�=" + balance
				+ "��, �ŷ�����=" + transactions.size() + "��\n";
	}
}

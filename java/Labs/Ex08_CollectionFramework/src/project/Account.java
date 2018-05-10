package project;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Account {
	Calendar cal = Calendar.getInstance();
	private String accountNo; // 계좌번호
	private String name; // 소유자명
	private long balance; // 잔고
	private Map<Transaction, String> transactions = new HashMap<>(); // 거래내역(0개이상)
				// 거래내역 , 계좌번호
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
	
	// 입금한다
	public void deposit(long amount) {
		Transaction tran = new Transaction(cal.get(Calendar.YEAR) + "/" + cal.get(Calendar.MONTH) +"/" + cal.get(Calendar.DATE),
											(cal.get(Calendar.HOUR)+1)+":"+cal.get(Calendar.MINUTE),
											"입금",
											amount,
											balance + amount );
		balance = tran.getBalance();
		transactions.put(tran, accountNo);
	}
	
	//출금한다
	public void withdraw(long amount) {
		Transaction tran = new Transaction(cal.get(Calendar.YEAR) + "/" + cal.get(Calendar.MONTH) +"/" + cal.get(Calendar.DATE),
											(cal.get(Calendar.HOUR)+1)+":"+cal.get(Calendar.MINUTE),
											"출금",
											amount,
											balance - amount );
		balance = tran.getBalance();
		transactions.put(tran, accountNo);
	}
	
	// 잔고를 확인한다
	public long getBalance() { 
		return balance;
	}
	
	// 거래내역을 본다
	public List getTransactions() {
		List<Transaction> tranlist = new ArrayList<>();
		for(Map.Entry m : transactions.entrySet()) {
			if(accountNo.equals(m.getValue())) {
				tranlist.add((Transaction)m.getKey()); // 거래내역을 넣어준다
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
		return "계좌번호=" + accountNo + ", 소유자명=" + name + ", 잔고=" + balance
				+ "원, 거래내역=" + transactions.size() + "건\n";
	}
}

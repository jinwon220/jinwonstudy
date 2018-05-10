package project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Bank {
	private Map<String, Account> accounts = new HashMap<>(); //계좌(0개 이상)
	private int totalAccount; //총계좌수

	//계좌생성
	public void addAccount(String accountNo, String name) {
		accounts.put(accountNo, new Account(accountNo, name));
	}
	
	//계좌를 찾는다(계좌번호로)
	public Account getAccount(String accountNo) { 
		Account account;
		if(!accounts.containsKey(accountNo)) {
			account = null; //해당 계좌번호가 없다면 null
		}else {
			account = accounts.get(accountNo); //있다면 계좌 주소값
		}
		return account;
	}
	
	//계좌를 찾는다(소유자명으로)
	public List findAccounts(String name) {
		List<Account> accountlist = new ArrayList<>();
		for(Map.Entry m : accounts.entrySet()) {
			if(name.equals(((Account)m.getValue()).getName())) {
				accountlist.add((Account)m.getValue()); //같은 이름이 있다면 add
			}
		}
		return accountlist;
	}
	
	//계좌목록을 본다
	public List getAccounts() {
		List<Account> accountlist = new ArrayList<>();
		if(accounts.size() == 0) { //계좌가 한개도 없다면
			accountlist = null;
		}else {
			for(Map.Entry m : accounts.entrySet()) {
				accountlist.add((Account)m.getValue()); //List에 계좌를 한개씩 넣어준다.
			}
		}
		return accountlist;
	}
	
	//총계좌수를 반환한다
	public int getTotalAccount() {
		return accounts.size();
	}
	
	public void print(List list) {
		Iterator<Account> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

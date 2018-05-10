package project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Bank {
	private Map<String, Account> accounts = new HashMap<>(); //����(0�� �̻�)
	private int totalAccount; //�Ѱ��¼�

	//���»���
	public void addAccount(String accountNo, String name) {
		accounts.put(accountNo, new Account(accountNo, name));
	}
	
	//���¸� ã�´�(���¹�ȣ��)
	public Account getAccount(String accountNo) { 
		Account account;
		if(!accounts.containsKey(accountNo)) {
			account = null; //�ش� ���¹�ȣ�� ���ٸ� null
		}else {
			account = accounts.get(accountNo); //�ִٸ� ���� �ּҰ�
		}
		return account;
	}
	
	//���¸� ã�´�(�����ڸ�����)
	public List findAccounts(String name) {
		List<Account> accountlist = new ArrayList<>();
		for(Map.Entry m : accounts.entrySet()) {
			if(name.equals(((Account)m.getValue()).getName())) {
				accountlist.add((Account)m.getValue()); //���� �̸��� �ִٸ� add
			}
		}
		return accountlist;
	}
	
	//���¸���� ����
	public List getAccounts() {
		List<Account> accountlist = new ArrayList<>();
		if(accounts.size() == 0) { //���°� �Ѱ��� ���ٸ�
			accountlist = null;
		}else {
			for(Map.Entry m : accounts.entrySet()) {
				accountlist.add((Account)m.getValue()); //List�� ���¸� �Ѱ��� �־��ش�.
			}
		}
		return accountlist;
	}
	
	//�Ѱ��¼��� ��ȯ�Ѵ�
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

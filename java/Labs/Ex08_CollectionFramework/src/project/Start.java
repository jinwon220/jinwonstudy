package project;

import java.util.List;

public class Start {
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.addAccount("110-****-****", "김진원"); //생성
		bank.addAccount("110-1111-1111", "김진원"); //생성
		bank.addAccount("110-2222-2222", "이름"); //생성
		
		System.out.println("\n계좌번호로 계좌 확인");
		Account account = bank.getAccount("110-****-****"); //계좌번호로 계좌 확인
		System.out.println(account);
		
		System.out.println("\n소유자명 계좌 확인");
		List<Account> accounts = bank.findAccounts("김진원"); //소유자명 계좌 확인
		bank.print(accounts);

		System.out.println("\n모든 계좌의 목록");
		accounts = bank.getAccounts(); //모든 계좌의 목록
		bank.print(accounts);
		
		System.out.println("\n계좌의 총 개수");
		int cnt = bank.getTotalAccount(); //계좌의 총 개수
		System.out.println(cnt);
		
		Account ac = new Account(account);
		ac.deposit(1000L); //입금
		ac.withdraw(200L); //출금
		
		System.out.println("\n잔고 확인");
		System.out.println(ac.getBalance()); //잔고 확인
		System.out.println("\n모든 거래내역 확인");
		List<Transaction> trans = ac.getTransactions(); //모든 거래 내역
		ac.print(trans); 
	}

}

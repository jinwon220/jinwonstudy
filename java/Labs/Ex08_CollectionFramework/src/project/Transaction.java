package project;

public class Transaction {
	private String transactionDate; // 거래일
	private String transactionTime; // 거래시간
	private String kind; // 구분(입급 or 출금)
	private long amount; // 거래금액
	private long balance; // 잔고
	
	public Transaction(String transactionDate, String transactionTime, String kind, long amount, long balance) {
		this.transactionDate = transactionDate;
		this.transactionTime = transactionTime;
		this.kind = kind;
		this.amount = amount;
		this.balance = balance;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public String getTransactionTime() {
		return transactionTime;
	}
	public String getKind() {
		return kind;
	}
	public long getAmount() {
		return amount;
	}
	public long getBalance() {
		return balance;
	}
	@Override
	public String toString() {
		return "거래일=" + transactionDate + ", 시간=" + transactionTime + ", 구분="
				+ kind + ", 거래금액=" + amount + ", 잔고=" + balance + "\n";
	}
}

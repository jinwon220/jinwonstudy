package project;

public class Transaction {
	private String transactionDate; // �ŷ���
	private String transactionTime; // �ŷ��ð�
	private String kind; // ����(�Ա� or ���)
	private long amount; // �ŷ��ݾ�
	private long balance; // �ܰ�
	
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
		return "�ŷ���=" + transactionDate + ", �ð�=" + transactionTime + ", ����="
				+ kind + ", �ŷ��ݾ�=" + amount + ", �ܰ�=" + balance + "\n";
	}
}

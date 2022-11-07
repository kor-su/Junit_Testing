package project;

public class Account {
	private String accountId;
	private long balance;

	public Account(String accountId, long initialBalance) {
		this.accountId = accountId;
		this.balance = initialBalance;
	}

	// 출금
	public void debit(long amount) {
		this.balance -= amount;
	}

	// 입금
	public void credit(long amount) {
		this.balance += amount;
	}

	public String getAccountId() {
		return this.accountId;
	}

	public long getBalance() {
		return this.balance;
	}
}

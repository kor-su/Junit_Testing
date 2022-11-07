package project;

public class AccountService {
	private AccountManager accountManager;
	
	public void setAccountManager(AccountManager manager) {
		this.accountManager = manager;
	}
	
	
	public void transfer(String senderId, String receiverId, long amount) {
		Account sender = this.accountManager.findAccountForUser(senderId);
		Account receiver = this.accountManager.findAccountForUser(receiverId);

		sender.debit(amount);
		receiver.credit(amount);
		this.accountManager.updateAccount(sender);
		this.accountManager.updateAccount(receiver);
	}
}

package project;

import java.util.HashMap;
import java.util.Map;

public class MockAccountManager implements AccountManager {
	
	public Map<String, Account> accounts = new HashMap<String, Account>();

	public void addAccont(String userId, Account account) {
		this.accounts.put(userId, account);
	}
	
	public Account findAccountForUser(String userId) {
		return this.accounts.get(userId);
	}
	
	public void updateAccount(Account account) {
		// TODO Auto-generated method stub
	}

}
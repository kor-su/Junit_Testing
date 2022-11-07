package project;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.testng.annotations.Test;

public class TestAccountService{
	MockAccountManager mockAccountManager = new MockAccountManager();
	
	
	Account senderAccount = new Account("1", 200);
	Account receiverAccount = new Account("2", 100);
	
	@Test
	public void testIsNotNull() 
	{
	mockAccountManager.addAccont("1", senderAccount);
	mockAccountManager.addAccont("2", receiverAccount);
	
	assertNotNull(senderAccount.getBalance());
	assertNotNull(receiverAccount.getBalance());
	}
	
	@Test
	public void testIsRightCreditSender() 
	{
	mockAccountManager.addAccont("1", senderAccount);
	assertEquals(200,senderAccount.getBalance());
	}
	@Test
	public void testIsRightCreditReceiver() 
	{
	mockAccountManager.addAccont("2", receiverAccount);
	assertEquals(200, receiverAccount.getBalance());
	}
	
	@Test
	public void testTransferOk() {
		//MockAccountManager mockAccountManager = new MockAccountManager();
		//Account senderAccount = new Account("1", 200);
		//Account receiverAccount = new Account("2", 100);

		mockAccountManager.addAccont("1", senderAccount);
		mockAccountManager.addAccont("2", receiverAccount);

		AccountService accountService = new AccountService();
		accountService.setAccountManager(mockAccountManager);

		// 테스트
		accountService.transfer("1", "2", 20);

		// 결과 검증
		assertEquals(180, senderAccount.getBalance()); // 200 - 50 = 150
		assertEquals(120, receiverAccount.getBalance()); // 100 + 50 = 150
	}
}
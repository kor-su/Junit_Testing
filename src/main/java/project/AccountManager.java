package project;

public interface AccountManager {
	// id로 계좌 계정 찾기
	Account findAccountForUser(String userId);

	// 계좌 계정 업데이트
	void updateAccount(Account account);

}
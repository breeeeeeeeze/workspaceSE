package connection;

public class AccountServiceTransationMain {

	public static void main(String[] args) throws Exception {
		AccountService accountService = new AccountService();
		
		/*
		 * 모든 잔고 update 트랜젝션
		 */
		
		accountService.updateBalance(3333);
		
		
	}

}

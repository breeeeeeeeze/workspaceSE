
public class AccountEncapsulation {

	public static void main(String[] args) {
		Account account1 = new Account();
		account1.setAccountData(1111, "KIM", 89000, 1.5);
		
		/*
		 * account1 8,000원 입금
		 */
		account1.deposit(8000);
		account1.print();

		/*
		 * account1 400원 출금
		 */
		account1.withDraw(400);
		account1.print();
		
		/*
		 * account1 이율 변경
		 */
		//account1.iyul=3.6;
		account1.setIyul(3.6);
		/*
		 * account1 잔고 얻기
		 */
		//int account1Balance=account1.balance;
		int account1Balance=account1.getBalance();
		System.out.println("account1잔고:"+account1Balance);
		account1.headerPrint();
		account1.print();
		
		Account acc1 = new Account();
		Account acc2 = new Account();
		Account acc3 = new Account();
		
		acc1.setAccountData(1000, "KIM", 89000, 3.5);
		acc2.setAccountData(2000, "LEE", 45000, 2.5);
		acc3.setAccountData(3000, "PARK", 12000, 1.5);
		
		/*
		 * 모든 계좌 잔고 50원 증가
		 */
		acc1.deposit(50);
		acc2.deposit(50);
		acc3.deposit(50);
		
		/*
		 * 불가능하다		
		 * for(int i = 1; i <= 3; i++) {
			acc1.deposit(50);
		}
		*/
		acc1.headerPrint();
		acc1.print();
		acc2.print();
		acc3.print();
		
		/*
		 * 은행 총 잔고
		 */
		// int totBalance = acc1.balance + acc2.balance + acc3.balance;
		
		int totBalance = acc1.getBalance() + acc2.getBalance() + acc3.getBalance();
		System.out.println("은행 총 잔고 : " + totBalance);
	}

}



















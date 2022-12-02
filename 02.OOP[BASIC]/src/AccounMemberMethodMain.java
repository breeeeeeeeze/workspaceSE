
public class AccounMemberMethodMain {

	public static void main(String[] args) {
		/*
		 * 계좌객체생성
		 */
		Account account1 = new Account();
		/*
		 * 계좌 데이터 대입
		 */
		account1.setAccountData(1111, "KIM", 70000, 3.4);
		/*
		 * 8000원 입금
		 */
		System.out.println("--------- 입금 전 ---------");
		account1.print();
		account1.deposit(8000);
		System.out.println("--------- 입금 후 ---------");
		account1.print();
		/*
		 * 300원 출금
		 */
		
		account1.withDraw(300);
		
		account1.print();
		
	//*****************Case2******************//
		/*
		 * 1. 은행 모든 계좌에 잔고 50원 증가 
		 */

		/*
		 * 1-1. 전체 계좌의 생성
		 * 1-2. 계좌 데이터 대입
		 */
		Account acc1 = new Account();
		acc1.setAccountData(1000, "KANG", 89000, 5.6);
		Account acc2 = new Account();
		acc2.setAccountData(2000, "SIM", 85000, 3.2);
		Account acc3 = new Account();
		acc3.setAccountData(3000, "HONG", 36000, 2.5);
		
		/*
		 * 1-2. 모든 계좌 잔고 50원 증가
		 */
		acc1.deposit(50);
		acc2.deposit(50);
		acc3.deposit(50);
		
		/*
		 *  2. 은행계좌 전체정보출력
		 */
		acc1.headerPrint();
		acc1.print();
		acc2.print();
		acc3.print();

	}

}

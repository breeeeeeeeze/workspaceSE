
public class AccountMemberField {

	public static void main(String[] args) {
		//*****************Case1******************//
		/*
		 *  1.1111 번호 계좌 8000 입금
		 */
		/*
		 * 1-1. 계좌객체 생성
		 * 1-2. 계좌 데이터 대입
		 */
		Account acc1 = new Account();
		acc1.no = 1111;
		acc1.owner = "KIM";
		acc1.balance = 10000;
		acc1.iyul = 3.0;
		/*
		 * 1-3. 계좌잔고 8000 증가
		 */
		acc1.balance = acc1.balance+8000;
		/*
		 *  2.1111 계좌 정보 출력
		 */
		System.out.println("=======================");
		System.out.printf("%s %s %s %s \n", "번호", "이름", "잔고", "이율");
		System.out.println("=======================");
		System.out.printf("%d %s %d %.1f",acc1.no, acc1.owner, acc1.balance, acc1.iyul);
	
		
		//*****************Case2******************//
		/*
		 * 1. 은행 모든 계좌에 잔고 50원 증가 
		 */
		/*
		 * 1-1. 전체 계좌의 생성
		 * 1-2. 계좌 데이터 대입
		 */
		
		Account a1 = new Account();
		a1.no = 1000;
		a1.owner = "LEE";
		a1.balance = 70000;
		a1.iyul = 2.0;

		Account a2 = new Account();
		a2.no = 2000;
		a2.owner = "PARK";
		a2.balance = 10000;
		a2.iyul = 1.5;
		
		Account a3 = new Account();
		a3.no = 3000;
		a3.owner = "KO";
		a3.balance = 35000;
		a3.iyul = 1.0;
		
		/*
		 * 1-2. 모든 계좌 잔고 50원 증가
		 */
		a1.balance += 50;
		a2.balance += 50;
		a3.balance += 50;
		
		/*
		 *  2. 은행계좌 전체정보출력
		 */
		System.out.println();
		System.out.println("=======================");
		System.out.printf("%s %s %s %s \n", "번호", "이름", "잔고", "이율");
		System.out.println("=======================");
		System.out.printf("%d %-4s %5d %.1f \n",a1.no, a1.owner, a1.balance, a1.iyul);
		System.out.printf("%d %-4s %5d %.1f \n",a2.no, a2.owner, a2.balance, a2.iyul);
		System.out.printf("%d %-4s %5d %.1f \n",a3.no, a3.owner, a3.balance, a3.iyul);

	}

}


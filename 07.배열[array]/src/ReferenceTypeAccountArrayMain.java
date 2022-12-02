
public class ReferenceTypeAccountArrayMain {

	public static void main(String[] args) {
		System.out.println("---------------값 목록으로 배열 생성------------------");
		Account acc1 = new Account(1111, "JOO", 4580, 4.0);
		Account[] accounts = { acc1, 
				new Account(2222, "MIN", 55000, 5.0), 
				new Account(3333, "KIM", 12000, 2.8),
				new Account(4444, "SIM", 50000, 0.7), 
				new Account(5555, "YANG", 80000, 4.2),
				new Account(6666, "PARK", 90000, 3.6), 
				new Account(7777, "JUNG", 10000, 1.9),
				new Account(8888, "JANG", 30000, 2.7), 
				new Account(9999, "LEE", 28000, 3.2) };

		System.out.println("1. 은행 총 계좌수 : " + accounts.length);
		System.out.println("2. 은행 계좌 전체 출력");
		Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			/*
			 * Account tempAccount=accounts[i]; tempAccount.print();
			 */
			accounts[i].print();
			;
		}

		System.out.println("3.은행계좌들 총잔고");
		int totBalance = 0;
		for (int i = 0; i < accounts.length; i++) {
			// totBalance=totBalance + accounts[i].getBalance();
			totBalance += accounts[i].getBalance();
		}
		System.out.println(">> " + totBalance);

		System.out.println("4.은행 계좌들중에서 계좌번호 3333번계좌 한개 찾아서 출력(계좌번호는 중복되지않는다)");
		for (int i = 0; i < accounts.length; i++) {
			Account account = accounts[i];
			if (account.getNo() == 3333) {
				account.print();
				break;
			}
		}

		System.out.println("5.은행 계좌들중에서 계좌잔고 50000원이상인 VIP계좌 여러개 찾아서 출력[enhanced for]");
		for (Account tempAccount : accounts) {
			if (tempAccount.getBalance() >= 50000) {
				tempAccount.print();
			}
		}

		System.out.println("6.은행 계좌들중에서 계좌이율 2.0 이상인 계좌 여러개 찾아서 출력[Quiz]");
		for (Account account : accounts) {
			if(account.getIyul() >= 2.0) {
				account.print();
			}
		}

		System.out.println("6.은행 계좌들중에서 이름이 KIM인 계좌 여러개 찾아서 출력(String 객체 배우고난 후에)");
		
		
		System.out.println("7.6666번계좌 3000원입금");
		for (Account account : accounts) {
			if (account.getNo() == 6666) {
				System.out.println(">> 입금전");
				account.print();
				account.deposit(3000);
				System.out.println(">> 입금후");
				account.print();
				break;
			}
		}

		System.out.println("8.9999번계좌 3000원출금[Quiz]");
		for (Account account : accounts) {
			if (account.getNo() == 9999) {
				System.out.println(">> 출금 전");
				account.print();
				System.out.println(">> 출금 후");
				account.withDraw(3000);
				account.print();
				
			}
		}
		
		System.out.println("9.계좌잔고순으로 오름차순정렬");
		System.out.println("################ 정렬전 ################");
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		// 1,2,3,4,5,6,7,8회
		for (int i = 0; i < accounts.length; i++) {
			for (int j = 0; j < accounts.length - 1; j++) {
				if (accounts[j].getBalance() > accounts[j + 1].getBalance()) {
					/*
					 * 주소값 교환
					 */
					Account tempAccount = accounts[j];
					accounts[j] = accounts[j + 1];
					accounts[j + 1] = tempAccount;
				} // 동일 금액있으면 2차 기준 만들어서 정렬 가능함(else if로 조건 설정)
			}
		}
		System.out.println("################ 정렬후 ################");
		for(int i=0;i<accounts.length;i++) {
			accounts[i].print();
		}

		System.out.println();
		System.out.println("9.계좌잔고순으로 내림차순정렬[Quiz] ");
		for (int i = 0; i < accounts.length; i++) {
			for (int j = 0; j < accounts.length-1; j++) {
				if (accounts[j].getBalance() < accounts[j+1].getBalance()) {
					Account temp = accounts[j];
					accounts[j] = accounts[j+1];
					accounts[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}

		System.out.println();
		System.out.println("9.계좌번호순으로 오름(내림)차순정렬[Quiz]");
		for (int i = 0; i < accounts.length; i++) {
			for (int j = 0; j < accounts.length-1; j++) {
				if (accounts[j].getNo() < accounts[j+1].getNo()) {
					Account temp = accounts[j];
					accounts[j] = accounts[j+1];
					accounts[j+1] = temp;
				}
			}
		}
		
		for (Account account : accounts) {
			account.print();
		}

		System.out.println("9.계좌이름순으로 오름(내림)차순정렬(String 클래스 배우고난 후에)");
		/*
		 * for (int i = 0; i < accounts.length; i++) { for (int j = 0; j <
		 * accounts.length; j++) { if (accounts[j].getOwner().compareTo() >
		 * accounts[j+1].getOwner().compareTo()) {
		 * 
		 * } } }
		 */

		System.out.println("10.5555계좌한개 이율을 3.6으로변경");
		for (Account account : accounts) {
			if(account.getNo() == 5555) {
				account.print();
				account.setIyul(3.6);
				account.print();
				
				break;
			}
		}
		
		System.out.println("11.VIP계좌(잔고50000원이상)여러개 잔고 50원 증가");
		for (Account account : accounts) {
			if (account.getBalance() >= 50000) {
				account.deposit(50);
				account.print();
			}
		}
		
		System.out.println("------ Account에 재정의된toString메쏘드 -----");      // 11-24 object-toString()설명 중 추가 내용임
		for(Account account:accounts) 
			System.out.println(account);
		
		System.out.println();
		System.out.println();
		System.out.println(accounts[accounts.length-1]);

		System.out.println("----------------------------Account객체추가[OPTION]----------------------------");
		System.out.println("----------------------------Account객체삭제[OPTION]----------------------------");
		/********************OPTION***********************
		  1. accounts배열 객체에 새로생성한계좌객체 추가 
		  		A. accounts.length+1 개짜리 임시배열생성
		 		B. accounts의 모든계좌객체 임시배열로 이동
				C. 임시배열에 새로운  Account객체추가
		 		D. accounts에 임시배열주소대입
		 
		  2. accounts배열 객체에서 계좌번호 4444번계좌객체삭제
		  	 	A. accounts 에서 8888계좌찾아서 null대입
			 	B. accounts.length-1 개짜리 임시배열생성
			 	C. accounts null이아닌 모든계좌 임시배열로이동
			  	D. accounts 에 임시배열대입 
		****************************************************/	
		System.out.println("----------------------------Account객체추가----------------------------");
		/*
		 * 이게 맞나............................................
		accounts[] tempAccounts = accounts[5];
		accounts[5] = accounts[6];
		accounts[6] = tmepAccounts;
		*/
		Account[] tempPlus = new Account[accounts.length +1];
		tempPlus = accounts;
		for (int i = 0; i < tempPlus.length; i++) {			
			tempPlus[i].print();
		}

		System.out.println("----------------------------Account객체삭제----------------------------");
		for (int i = 0; i < tempPlus.length; i++) {
			if (tempPlus[i].getNo() == 8888) {
				tempPlus[i].setAccountData(0, null, 0, 0);
				tempPlus[i].print();
			}
		}
		
		}

	}


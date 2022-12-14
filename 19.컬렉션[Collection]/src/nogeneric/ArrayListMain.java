package nogeneric;

import java.util.ArrayList;

public class ArrayListMain {

	public static void main(String[] args) {

		Account acc1 = new Account(1111, "BING", 33000, 0.5);
		Account acc2 = new Account(2222, "KING", 12000, 0.1);
		Account acc3 = new Account(3333, "KING", 89000, 0.8);
		Account acc4 = new Account(4444, "YONG", 45000, 1.2);
		Account acc5 = new Account(5555, "SANG", 99000, 0.9);

		ArrayList accountList = new ArrayList();
		int size = accountList.size();
		System.out.println("#size:" + size);
		System.out.println("************* 1.add[맨마지막 index에객체저장]*******");
		accountList.add(acc1);
		accountList.add(acc2);
		accountList.add(acc3);
		System.out.println("#size:" + accountList.size());
		System.out.println(accountList);
		accountList.add(acc4);
		accountList.add(acc5);
		System.out.println("#size:" + accountList.size());
		System.out.println(accountList);
		System.out.println("************* 2.add(index,element)[지정된 index에객체저장]*******");
		accountList.add(2, new Account(3332, "KING", 33000, 3.3));
		System.out.println("#size:" + accountList.size());
		System.out.println(accountList);
		System.out.println("************* 3.set(index,element)[지정된 index에객체저장]*******");
		accountList.set(5, new Account(9999, "LAST", 88888, 8.8));
		System.out.println("#size:" + accountList.size());
		System.out.println(accountList);
		System.out.println("***************4.get(index)**************************************");
		Account getAccount = (Account) accountList.get(1);
		System.out.println(getAccount);
		System.out.println("***************5.remove(index)***********************************");
		Account removeAccount = (Account) accountList.remove(accountList.size() - 1);
		removeAccount.print();
		System.out.println("#size:" + accountList.size());
		System.out.println(accountList);

		System.out.println("%%%%%%%%%%%%%%%업무실행%%%%%%%%%%%%%");
		System.out.println("**************1.계좌전체출력**********");
		Account.headerPrint();
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account) accountList.get(i);
			tempAccount.print();
		}

		// 향상된 for문 사용가능하지만 불편
		Account.headerPrint();
		for (Object objectAccount : accountList) {
			/*
			 * Account tempAccount=(Account)objectAccount; tempAccount.print();
			 */
			((Account) objectAccount).print();
		}

		System.out.println("**************2.계좌번호3333번 한개찾기*****************");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account) accountList.get(i);
			if (tempAccount.getNo() == 3333) {
				tempAccount.print();
				break;
			}
		}

		System.out.println("**************3.계좌주이름 KING인계좌 여러개찾기********");
		for (int i = 0; i < accountList.size(); i++) {
			if (((Account) accountList.get(i)).getOwner().equals("KING")) {
				((Account) accountList.get(i)).print();
			}
		}

		System.out.println("**************4.계좌번호 4444번 계좌한개삭제************");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account) accountList.get(i);
			if (tempAccount.getNo() == 4444) {
				System.out.println(">> remove전 size : " + accountList.size());
				// accountList.remove(i);
				Account rAccount = (Account) accountList.remove(i);
				rAccount.print();
				System.out.println(">> remove후 size : " + accountList.size());
				break;
			}
		}
		System.out.println(accountList);
		System.out.println("**************5.계좌주이름 KING인계좌 여러개삭제[QUIZ]********");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account) accountList.get(i);
			if (tempAccount.getOwner().equals("KING")) {
				Account rAccount = (Account) accountList.remove(i);
				rAccount.print();
			}
		}
		// [0]BING [1]KING (--> 삭제되면서 바로 순서 재정렬된다.) [2]KING [3]KING
		// [2]KING이 [1]KING이 되면서 건너띄게된다. 다음 [3]KING이 [2]KING의 index를 가지면서 얘도 삭제된다. 이래서
		// generic을 써야한다?

		System.out.println("**************6.계좌전체출력**********");
		Account.headerPrint();
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account) accountList.get(i);
			tempAccount.print();
		}

	}

}

/*
 * package nogeneric;
 * 
 * import java.util.ArrayList;
 * 
 * public class ArrayListMain {
 * 
 * public static void main(String[] args) {
 * 
 * Account acc1 = new Account(1111, "BING", 33000, 0.5); Account acc2 = new
 * Account(2222, "KING", 12000, 0.1); Account acc3 = new Account(3333, "KING",
 * 89000, 0.8); Account acc4 = new Account(4444, "YONG", 45000, 1.2); Account
 * acc5 = new Account(5555, "SANG", 99000, 0.9);
 * 
 * ArrayList accountList = new ArrayList(); int size = accountList.size();
 * System.out.println("#size:" + size);
 * System.out.println("************* 1.add[맨마지막 index에객체저장]*******");
 * accountList.add(acc1); accountList.add(acc2); accountList.add(acc3);
 * System.out.println("#size:" + accountList.size());
 * System.out.println(accountList); accountList.add(acc4);
 * accountList.add(acc5); System.out.println("#size:" + accountList.size());
 * System.out.println(accountList); System.out.
 * println("************* 2.add(index,element)[지정된 index에객체저장]*******");
 * accountList.add(2,new Account(3332,"KING", 33000,3.3));
 * System.out.println("#size:" + accountList.size());
 * System.out.println(accountList); System.out.
 * println("************* 3.set(index,element)[지정된 index에객체저장]*******");
 * accountList.set(5, new Account(9999, "LAST",88888, 8.8));
 * System.out.println("#size:" + accountList.size());
 * System.out.println(accountList); System.out.println(
 * "***************4.get(index)**************************************"); Account
 * getAccount =(Account)accountList.get(1); System.out.println(getAccount);
 * System.out.println(
 * "***************5.remove(index)***********************************"); Account
 * removeAccount =(Account)accountList.remove(accountList.size()-1);
 * removeAccount.print(); System.out.println("#size:" + accountList.size());
 * System.out.println(accountList);
 * 
 * System.out.println("%%%%%%%%%%%%%%%업무실행%%%%%%%%%%%%%");
 * System.out.println("**************1.계좌전체출력**********");
 * Account.headerPrint(); for(int i=0;i<accountList.size();i++) { Account
 * tempAccount=(Account)accountList.get(i); tempAccount.print(); }
 * Account.headerPrint(); for (Object objectAccount : accountList) {
 * 
 * Account tempAccount=(Account)objectAccount; tempAccount.print();
 * 
 * ((Account)objectAccount).print(); }
 * System.out.println("**************2.계좌번호3333번 한개찾기*****************");
 * for(int i=0;i<accountList.size();i++) { Account
 * tempAccount=(Account)accountList.get(i); if(tempAccount.getNo()==3333) {
 * tempAccount.print(); break; } }
 * System.out.println("**************3.계좌주이름 KING인계좌 여러개찾기********"); for(int
 * i=0;i<accountList.size();i++) {
 * if(((Account)accountList.get(i)).getOwner().equals("KING")) {
 * ((Account)accountList.get(i)).print(); } }
 * System.out.println("**************4.계좌번호 4444번 계좌한개삭제************"); for(int
 * i=0;i<accountList.size();i++) { Account
 * tempAccount=(Account)accountList.get(i); if(tempAccount.getNo()==4444) {
 * System.out.println(">> remove전 size:"+accountList.size()); Account
 * rAccount=(Account)accountList.remove(i); rAccount.print();
 * System.out.println(">> remove후 size:"+accountList.size()); break; } }
 * System.out.println(accountList);
 * System.out.println("**************5.계좌주이름 KING인계좌 여러개삭제[QUIZ]********");
 * for(int i=0;i<accountList.size();i++) { Account
 * tempAccount=(Account)accountList.get(i);
 * if(tempAccount.getOwner().equals("KING")) { Account rAccount =
 * (Account)accountList.remove(i); rAccount.print(); } }
 * System.out.println("**************6.계좌전체출력**********");
 * Account.headerPrint(); for(int i=0;i<accountList.size();i++) { Account
 * tempAccount=(Account)accountList.get(i); tempAccount.print(); }
 * 
 * }
 * 
 * }
 */

package com.itwill06.service.collection.account;



import java.util.ArrayList;


/*
 * 1.ArrayList<Account>(���°�ü��) ����������ΰ�����.
 * 2.Account��ü��ü�����õ� ������ ������Ŭ����
 */
public class AccountServiceArrayList {
	private ArrayList<Account> accountList;

	public AccountServiceArrayList() {
		accountList = new ArrayList<Account>();
		accountList.add(new Account(1111, "KIM", 89000, 1.3));
		accountList.add(new Account(2222, "AIM", 45000, 2.7));
		accountList.add(new Account(3333, "FIM", 23000, 4.7));
		accountList.add(new Account(4444, "XIM", 34000, 6.7));
		accountList.add(new Account(5555, "HIM", 78000, 3.7));
		accountList.add(new Account(6666, "AIM", 99000, 5.7));
		accountList.add(new Account(7777, "PIM", 89000, 4.7));
		accountList.add(new Account(8888, "QIM", 91000, 1.7));
		accountList.add(new Account(9999, "MIM", 12000, 0.7));
	}
	/*
	private Account[] accounts= {
			new Account(1111, "KIM", 89000, 1.3),
			new Account(2222, "AIM", 45000, 2.7),
			new Account(3333, "FIM", 89000, 4.7),
			new Account(4444, "XIM", 34000, 6.7),
			new Account(5555, "hIM", 78000, 3.7),
			new Account(6666, "KIM", 89000, 5.7),
			new Account(7777, "KIM", 89000, 4.7),
			new Account(8888, "qIM", 91000, 1.7),
			new Account(9999, "mIM", 12000, 0.7),
	};
	*/
	/*
	 * ������ü��ȯ
	 */
	public ArrayList<Account> getAccountList() {
		return accountList;
	}

	/*
	 * �����߰�
	 */
	public boolean addAccount(Account account) {
		/*
		 * ��ȣ�ߺ�üũ�� 
		 * �ߺ��̸�      ȣ����Ŭ�������� false
		 * �ߺ��� �ƴϸ� accountList�� add�ϰ�  ȣ����Ŭ�������� true �� ��ȯ����[OPTION]
		 */
		//accountList.add(account);
		
		return true;
	}

	/*
	 * 1.������µ� �Ѱ��¼���ȯ�޽������
	 */

	public int totAccountNumber() {
		return accountList.size();

	}

	/*
	 * 2.������µ� ��ü��¸޽������
	 */
	public void print() {
		Account.headerPrint();

		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = accountList.get(i);
			tempAccount.print();
		}

		/*
		 * // enhanced for�� 
		 * for(Account tempAccount:accountList) { 
		 * 	tempAccount.print();
		 * }
		 */

	}

	/*
	 * 3.������µ� ���ܰ� ��ȯ�޽�� ����
	 */
	public int totBalance() {
		int totBalance = 0;

		return totBalance;
	}

	/*
	 * 4.���¹�ȣ ���ڷι޾Ƽ� ��ȣ����ġ�ϴ� �����Ѱ���ȯ�޽������
	 */
	public Account findByNo(int no) {
		Account findAccount = null;

		return findAccount;
	}

	/*
	 * 5.�����ܰ� ���ڷ� �޾Ƽ� �ܰ��̻��� ���µ��ȯ
	 */
	public ArrayList<Account> findByBalance(int balance) {
		ArrayList<Account> findAccountList = new ArrayList<Account>();

		return findAccountList;
	}

	/*
	 * 8.6666������ 4000�� �Ա����� �Աݰ��� ����������ȯ
	 */
	public  Account ipGum(int no, int m) {
		return null;
	}

	/*
	 * 9.1111������ 5000�� ������� ��ݰ��� ����������ȯ
	 */
	public Account chulGum(int no, int m) {
		return null;
	}

	/*
	 * 7.������µ� �߿� �������̸��� AIM�� ���µ��ȯ
	 */
	public ArrayList<Account> findByName(String owner) {
		ArrayList<Account> findAccountList = new ArrayList<Account>();

		return findAccountList;
	}

	/*
	 * 9.VIP����(�ܰ� 70000���̻�)�� ��ȯ
	 */
	public ArrayList<Account> findByVip(int balance) {
		ArrayList<Account> findAccountList = new ArrayList<Account>();

		return findAccountList;
	}

	/*
	 * 10.���¸� �ܰ������ ������������
	 *  	Collections.sort();
	 */
	public void sortByBalanceAsc() {
		
	}

	/*
	 * 11.���¸� �ܰ������ ������������
	 * 		Collections.sort();
	 */
	public void sortByBalanceDesc() {

	}

	/*
	 * 12.6666�������� �̸�,�ܰ�,���� ����(update)�� �����Ȱ�ü ��ȯ
	 */
	public Account updateAccount(Account updateAccount) {
		return null;
	}

	/*
	 * 13.��ȣ�� ���»����� �����Ȱ�ü��ȯ
	 */
	public Account deleteByNo(int no) {
		Account deleteAccount = null;

		return deleteAccount;
	}

}
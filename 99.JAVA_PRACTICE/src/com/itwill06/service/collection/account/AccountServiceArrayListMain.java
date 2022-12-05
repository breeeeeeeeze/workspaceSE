package com.itwill06.service.collection.account;

import java.util.ArrayList;

public class AccountServiceArrayListMain {

	public static void main(String[] args) {

		AccountServiceArrayList accountServiceArrayList = new AccountServiceArrayList();
		System.out.println("0.AccountServiceArrayList�� ��������߰�����");
		Account addAccount = new Account(1000, "��ҿ�", 89000, 0.5);
		
		boolean isAdd = accountServiceArrayList.addAccount(addAccount);
		if(isAdd) {
			System.out.println("account�߰�����");
		}else {
			System.out.println("�ߺ������Դϴ�");
		}
		accountServiceArrayList.addAccount(new Account(1001, "�̼Ҷ�", 30000, 3.3));
		System.out.println("1.AccountServiceArrayList�� ������µ� �Ѱ��¼���ȯ����");
		int accountCount = accountServiceArrayList.totAccountNumber();
		System.out.println("�Ѱ��¼�[main]:" + accountCount);
		System.out.println("2.AccountServiceArrayList�� ������µ� ��ü�������");
		accountServiceArrayList.print();
		
		System.out.println("3.AccountServiceArrayList��������µ� ���ܰ� ��ȯ����");
		int totBalance = accountServiceArrayList.totBalance();
		System.out.println("���ܰ�[main]:" + totBalance);
		System.out.println("4.AccountServiceArrayList�� ���¹�ȣ�ٲ� �����Ѱ���ȯ����");
		Account findAccount = accountServiceArrayList.findByNo(5555);
		System.out.println("�����Ѱ�[main]");
		findAccount.print();
		System.out.println("5.AccountServiceArrayList�� �����ܰ��ٲ� �ܰ��̻��� ���µ��ȯ����[OPTION]");
		ArrayList<Account> findAccounts = accountServiceArrayList.findByBalance(50000);
		System.out.println(" ��ȯ���¼�:" + findAccounts.size());
		
		System.out.println("7.AccountServiceArrayList��������µ� �߿� �������̸��� AIM�� ���µ��ȯ����");
		findAccounts=accountServiceArrayList.findByName("AIM");
		/*
		 * 8.6666������ 4000�� �Ա�����
		 */
		System.out.println("8.AccountServiceArrayList��1111������ 50000�� ������Ŀ� Account��ü��ȯ����");
		Account chulGumAccount=
				accountServiceArrayList.chulGum(1111, 50000);
		chulGumAccount.print();
		System.out.println(" 8.6666������ 4000�� �Ա����� Account��ü��ȯ����");
		Account ipGumAccount=
				accountServiceArrayList.ipGum(6666, 4000);
		ipGumAccount.print();
		System.out.println("9.VIP����(�ܰ� 70000���̻�)�� ��ȯ����");
		findAccounts=accountServiceArrayList.findByBalance(70000);
		System.out.println("10.���¸� �ܰ������ ����������������");
		accountServiceArrayList.sortByBalanceAsc();
		accountServiceArrayList.print();
		System.out.println("11.���¸� �ܰ������ ����������������");
		accountServiceArrayList.sortByBalanceDesc();
		accountServiceArrayList.print();
		
		System.out.println(" 12.6666�������� �̸�,�ܰ�,���� ����(update)�� Account��ü��ȯ����");
		Account updateAccount1 = new Account(6666, "YYY", 900000000, 0.4);
		Account updateAccount2 = accountServiceArrayList.updateAccount(updateAccount1);
		updateAccount2.print();
		System.out.println(" 12.8888�����»����� Account��ü��ȯ����");
		Account deleteAccount = accountServiceArrayList.deleteByNo(8888);
		deleteAccount.print();
		System.out.println("-----------��ü���� ���-------------");
		accountServiceArrayList.print();
	}

}
package generic;

import java.util.HashSet;

public class HashSetMain {

	public static void main(String[] args) {
		Account acc1 = new Account(1111, "BING", 33000, 0.5);
		Account acc2 = new Account(2222, "KING", 12000, 0.1);
		Account acc3 = new Account(3333, "KING", 89000, 0.8);
		Account acc4 = new Account(4444, "YONG", 45000, 1.2);
		Account acc5 = new Account(5555, "SANG", 99000, 0.9);
		
		HashSet<Account> accounSet=new HashSet<Account>();
		System.out.println("# set size : " + accounSet.size());
		System.out.println("--------------1.add--------------");
		accounSet.add(acc1);
		accounSet.add(acc2);
		accounSet.add(acc3);
		accounSet.add(acc4);
		accounSet.add(acc5);
		System.out.println("# set size : " + accounSet.size());
		System.out.println(accounSet);
		boolean isAdd = accounSet.add(acc5);
		System.out.println("추가여부 : " + isAdd);
		System.out.println("# set size : " + accounSet.size());
		System.out.println(accounSet);
		System.out.println("--------------2.remove--------------");
		boolean isRemove = accounSet.remove(acc5);
		System.out.println("삭제여부 : " + isRemove);
		System.out.println("# set size : " + accounSet.size());
		System.out.println(accounSet);
		
		System.out.println("%%%%%%%%%%%%%%%%% 전체출력 %%%%%%%%%%%%%%%%%");
		Account.headerPrint();
		for (Account account : accounSet) {
			account.print();
		}

	}

}

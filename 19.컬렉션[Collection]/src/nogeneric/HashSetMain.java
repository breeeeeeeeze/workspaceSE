package nogeneric;

import java.io.InputStreamReader;
import java.util.HashSet;

public class HashSetMain {

	public static void main(String[] args) {
		// 아주 알맞은 예는 아님 로또문제가 더 적당하긴 함.
		Account acc1 = new Account(1111, "BING", 33000, 0.5);
		Account acc2 = new Account(2222, "KING", 12000, 0.1);
		Account acc3 = new Account(3333, "KING", 89000, 0.8);
		Account acc4 = new Account(4444, "YONG", 45000, 1.2);
		Account acc5 = new Account(5555, "SANG", 99000, 0.9);
		HashSet accountSet = new HashSet();
		System.out.println("# set size : " + accountSet.size());
		System.out.println(accountSet);
		System.out.println("---------------1.add-------------------------");
		// boolean isAdd = accountSet.add(acc1); <--------- set은 중복을 허용하지 않으므로 boolean으로 체크
		accountSet.add(acc1);
		accountSet.add(acc2);
		accountSet.add(acc3);
		accountSet.add(acc4);
		accountSet.add(acc5);
		System.out.println("# set size : " + accountSet.size());
		System.out.println(accountSet);
		System.out.println("--------------3. add[중복객체]---------------");
		/*
		 *  Element의 equals메쏘드를 사용해서 중복체크를한다.
		 */
		boolean isAdd = accountSet.add(acc1);
		System.out.println("추가 여부 : " + isAdd);
		System.out.println("# set size : " + accountSet.size());
		System.out.println(accountSet);
		
		System.out.println("--------------4. remove(객체)---------------");
		boolean isRemove = accountSet.remove(new Account());
		System.out.println("삭제여부:"+isRemove);
		System.out.println("# set size:"+accountSet.size());
		isRemove = accountSet.remove(acc5);
		System.out.println("삭제여부:"+isRemove);
		System.out.println("# set size:"+accountSet.size());
		System.out.println("------------------전체출력-------------------");	// iteration 아님
		for (Object objectAccount : accountSet) {
			Account account = (Account)objectAccount;
			account.print();
		}
		System.out.println("-----------------Object[]---------------------");
		Object[] accountArray = accountSet.toArray();
		for (int i = 0; i < accountArray.length; i++) {
			Account account = (Account)accountArray[i];
			account.print();
		}
		System.out.println("#####################전체출력[iteration]####################");
		
	}

}



















import java.util.Arrays;

public class ArraysMain {

	public static void main(String[] args) {
		int[] intArray1= {1,3,5,7,9};
		int[] intArray2= {1,3,5,7,9};
		String[] strArray1= {"one","two","three"};
		String[] strArray2= {"one","two","three"};

		System.out.println("1.배열내용비교(equals)");
		boolean isSame = Arrays.equals(intArray1, intArray2);
		System.out.println(isSame);
		isSame = Arrays.equals(strArray1, strArray2);
		System.out.println(isSame);
		System.out.println("2.배열원소채우기(fill)");
		Arrays.fill(intArray1, 1);
		for (int e : intArray1) {
			System.out.print(e+" ");
		}
		System.out.println();
		System.out.println("3.배열복사(기본형)");
		int[] intArray3=Arrays.copyOf(intArray2,intArray2.length+1);
		for(int e:intArray3) {
			System.out.print(e+" ");
		}
		System.out.println();
		
	
		Account[] accountArray= {
				new Account(1111, "LEE", 56000, 0.9),
				new Account(2222, "KIM", 58900, 1.3),
				new Account(3333, "PARK", 90000, 3.3),
				new Account(4444, "CHOI", 90000, 5.3),
				new Account(5555, "SIM", 56000, 4.3),
				new Account(6666, "SOO", 23000, 2.3),
				new Account(7777, "SONG", 12900, 7.3),
				new Account(8888, "MIN", 23400, 6.3),
				new Account(9999, "JANG", 87200, 0.3)
		};
		
		System.out.println("3.배열복사(참조형)");
		Account[] newAccountArray = 
				Arrays.copyOf(accountArray, accountArray.length+1);
		for (Account account : newAccountArray) {
			System.out.println(account);
		}
		System.out.println("--------------------");
		/*
		void java.lang.System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		 */
		Account[] descAccounts=new Account[accountArray.length+1];
		System.arraycopy(accountArray, 0, descAccounts, 0, accountArray.length);
		
		for (Account account : descAccounts) {
			System.out.println(account);
		}
		
		System.out.println("4.sort[기본타입,String]");
		int[] scoreArray= {90,67,88,23,56,12,34};
		String[] nameArray= {"공경호","홍경호","JAMES","김경호","김경호"};
		
		/*
		Account[] accountArray= {
				new Account(1111, "LEE", 56000, 0.9),
				new Account(2222, "KIM", 58900, 1.3),
				new Account(3333, "PARK", 90000, 3.3),
				new Account(4444, "CHOI", 90000, 5.3),
				new Account(5555, "SIM", 56000, 4.3),
				new Account(6666, "SOO", 23000, 2.3),
				new Account(7777, "SONG", 12900, 7.3),
				new Account(8888, "MIN", 23400, 6.3),
				new Account(9999, "JANG", 87200, 0.3)
		};
		*/
		Arrays.sort(scoreArray);
		for(int score:scoreArray) {
			System.out.print(score+" ");
		}
		System.out.println();
		Arrays.sort(nameArray);
		for (String name : nameArray) {
			System.out.print(name+" ");
		}
		System.out.println("5.sort[Account]");
		Arrays.sort(accountArray);
		
		
	}

}









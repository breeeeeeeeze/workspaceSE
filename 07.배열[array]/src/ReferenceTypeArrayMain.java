
public class ReferenceTypeArrayMain {

	public static void main(String[] args) {
		/*
		int a = 345;
		Account acc = new Account(8989, "SIM", 56000, 3.2);
		int[] ia = new int[5];
		ia[0] = 23;
		*/
		
		Account[] accArray = new Account[5];
		accArray[0] = new Account(1, "KIM", 15000, 0.8);
		accArray[1] = new Account(2, "LEE", 20000, 1.5);
		accArray[2] = new Account(3, "PARK", 9000, 2.0);
		accArray[3] = new Account(4, "JOO", 35000, 3.8);
		accArray[4] = new Account(5, "MIN", 55000, 4.8);
		
		Account.headerPrint();
		for(int i = 0; i < accArray.length; i++) {
			accArray[i].print();
		}
		
	}

}

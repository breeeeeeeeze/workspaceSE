
public class AccountManyMain {

	public static void main(String[] args) {
		AccountMany accountMany = new AccountMany();
		accountMany.acc0 = new Account(1, "KIM", 3000, 0.5);
		accountMany.acc1 = new Account(2, "KIM", 2000, 0.7);
		accountMany.acc2 = new Account(3, "KIM", 9000, 0.9);
		accountMany.acc3 = new Account(4, "KIM", 6500, 1.0);
		accountMany.acc4 = new Account(5, "KIM", 5000, 1.2);
		
		Account.headerPrint();
		accountMany.acc0.print();
		accountMany.acc1.print();
		accountMany.acc2.print();
		accountMany.acc3.print();
		accountMany.acc4.print();
		
	}

}

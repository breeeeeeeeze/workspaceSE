/*
 *  계좌객체를 생성하기 위한 클래스(틀, 타입)
 */
/**
 * 계좌 객체 생성 클래스
 * @author KIMSEYEON
 * @version 1.0
 *
 */
public class Account {
	/*
	 * 1. 속성[멤버필드(변수)]
	 */
	/**
	 * 계좌번호
	 */
	private int no;       //계좌번호
	private String owner; //계좌주 이름
	private int balance;  //계좌 잔고
	private double iyul;  //이율
	
	public Account() {

	}
	
	public Account(int no, String owner, int balance, double iyul) {

		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}

	/*
	 * 2. 기능[멤버매쏘드] - 계좌 객체가 가지고 있는 기능
	 */
	

	/*
	 * 계좌 데이터를 초기값으로 대입하는 메소드
	 */
	public void setAccountData(int no, String owner, int balance, double iyul) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
		
		System.out.println();
		
	}
	/*
	 * 입금
	 */
	/**
	 * 입금
	 * @param money 입금할 돈
	 */
	public void deposit(int money) {
		this.balance += money;
	}
	
	/*
	 * 출금
	 */
	/**
	 * 출금
	 * @param money 출금할 돈
	 */
	public void withDraw(int money) {
		this.balance -= money;
	}
	
	/*
	 * 계좌 헤더 출력
	 */
	public void headerPrint() {
		System.out.println("=======================");
		System.out.printf("%s %s %s %s \n", "번호", "이름", "잔고", "이율");
		System.out.println("=======================");
	}
	
	/*
	 * 계좌 객체 정보 출력
	 */
	public void print( ) {
		System.out.printf("%d %s %d %.1f \n",this.no, this.owner, this.balance, this.iyul);
	}
	public int getNo() {
		return no;
	}
	/**
	 * 
	 * @return 계좌주 이름
	 */
	public String getOwner() {
		return owner;
	}
	public int getBalance() {
		return balance;
	}
	public double getIyul() {
		return iyul;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void setIyul(double iyul) {
		this.iyul = iyul;
	}
	
	// getters and setters
	
	
}

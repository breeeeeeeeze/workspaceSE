/*
 * 1. 주차장에서 차객체를 생성할 클래스(틀)
 * 2. Car 객체의 주소를 저장할 수 있는 타입
 */
/**
 * 주차장에서 차객체를 생성할클래스
 * @author KIM
 * @version 0.2
 */
public class Car {
	/*
	 * 클래스의 구성요소
	 * 1. 멤버필드(변수)[속성]
	 * 2. 멤버매쏘드[기능]
	 */
	/*
	 * 멤버필드[속성]
	 */
	private String no;   // car number
	private int inTime;  // 입차 시간
	private int outTime; // 출차 시간
	private int fee;     // 주차 요금
	/*
	 * 멤버매쏘드[기능]
	 */
	/*
	 * 입차시 데이터(번호, 시간) 대입
	 */
	public void setIpChaData(String no, int inTime) {
		this.no = no;
		this.inTime = inTime;
		
		System.out.println();
	}
	/*
	 * 출차시간 멤버필드 outTime에 출차시간 데이터 대입(set)
	 */
	public void setOutTime(int outTime) {
		this.outTime = outTime;
	}
	/*
	 * 주차요금 계산
	 */
	public void calculateFee() {
		this.fee = (this.outTime - this.inTime)*1000;
	}
	
	/*
	 * 차량정보출력
	 */
	public void print() {
		System.out.println("-------------------------------------------------");
		System.out.printf("%s %s %s %s\n", "차량번호", "입차시간", "출차시간", "주차요금");
		System.out.println("-------------------------------------------------");
		System.out.printf("%6s %6d시 %7d시 %9d\n", this.no, this.inTime, this.outTime, this.fee);
	}
	// setter, getter
	public String getNo() {
		return no;
	}
	public int getInTime() {
		return inTime;
	}
	public int getOutTime() {
		return outTime;
	}
	public int getFee() {
		return fee;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public void setInTime(int inTime) {
		this.inTime = inTime;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}

}

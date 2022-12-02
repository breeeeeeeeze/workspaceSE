/*
 * 1. 주차장에서 차객체를 생성할 클래스(틀)
 * 2. Car 객체의 주소를 저장할 수 있는 타입
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
	String no;   // car number
	int inTime;  // 입차 시간
	int outTime; // 출차 시간
	int fee;     // 주차 요금
	/*
	 * 멤버매쏘드[기능]
	 */
	/*
	 * 입차시 데이터(번호, 시간) 대입
	 */
	void setIpChaData(String no, int inTime) {
		this.no = no;
		this.inTime = inTime;
		
		System.out.println();
	}
	/*
	 * 출차시간 멤버필드 outTime에 출차시간 데이터 대입(set)
	 */
	void setOutTime(int outTime) {
		this.outTime = outTime;
	}
	/*
	 * 주차요금 계산
	 */
	void calculateFee() {
		this.fee = (this.outTime - this.inTime)*1000;
	}
	
	
	/*
	 * 차량정보출력
	 */
	void print() {
		System.out.println("-------------------------------------------------");
		System.out.printf("%s %s %s %s\n", "차량번호", "입차시간", "출차시간", "주차요금");
		System.out.println("-------------------------------------------------");
		System.out.printf("%6s %6d시 %7d시 %9d", this.no, this.inTime, this.outTime, this.fee);
	}

}


public class CarMemberMethodMain {

	public static void main(String[] args) {
		/*
		 * 1. 차량번호 1234차량이 12시 입차
		 */
		Car car1 = new Car();
		/*
		 * 입차시 데이터(번호, 시간) 대입 메쏘드 호출
		 */
		car1.setIpChaData("1234", 12);
		
		/*
		 * 2-1. car1차량 출차시간 대입 메쏘드 호출
		 */
		car1.setOutTime(16);
		/*
		 *  2-2. 주차요금 계산 메소드 호출
		 */
		car1.calculateFee();	
		/*
		 *  2-3. 주차요금 영수증 출력 메소드 호출
		 */
		car1.print();

	}

}

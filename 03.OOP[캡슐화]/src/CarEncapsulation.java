
public class CarEncapsulation {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.setIpChaData("1234", 12);
		
		car1.setOutTime(16);
		car1.calculateFee();
		car1.print();
		
		/*
		 * car1 오브젝트의 주차요금
		 */
		
		// System.out.println(car1.fee);
		System.out.println("\n car1의 주차요금 : " + car1.getFee());

	}

}

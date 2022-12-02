
public class CarConstructorMain {

	public static void main(String[] args) {
		System.out.println("**************  car1  ***************");
		Car car1 = new Car();
		car1.setIpChaData("1234", 12);
		car1.setOutTime(14);
		car1.calculateFee();
		car1.print();
		System.out.println("**************  car2  ***************");
		Car car2 = new Car("3456", 15);
		car2.setOutTime(17);
		car2.calculateFee();
		car2.print();
		
		/*
		 * 엑셀에서 차량 정보를 불러온다고 가정했을 때 이용차량 출력해보기
		 */
		System.out.println("*********  오늘의 주차장 이용차량 출력  *********");
		Car cara = new Car("1212", 1, 2, 1000);
		Car carb = new Car("4564", 12, 17, 5000);
		Car carc = new Car("9723", 6, 9, 3000);
		
		cara.headerprint();
		cara.print();
		carb.print();
		carc.print();
	}
}

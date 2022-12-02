
public class CarFactoryStaticMain {

	public static void main(String[] args) {
		// Car.count = 0; <- 클래스에서 생성되니까 작성해줄 필요X(Car.java line16)
		Car c1 = new Car(1, "K3", "RED");
		Car c2 = new Car(2, "K5", "BLUE");
		Car c3 = new Car(3, "K7", "BLACK");
		
		System.out.println("차량 총 생산 대수 : " + Car.count);
		Car.headerPrint();
		c1.print();
		c2.print();
		c3.print();

	}

}

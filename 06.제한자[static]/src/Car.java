
public class Car {
	/*
	 * 차량의 전체생산 대수를 저장할 static(공용)변수
	 */
	/**
	 * 차량 전체 생산 대수
	 */
	public static int count = 0;
	
	private int no; // car number
	private String model; // car model
	private String color; // car color
	
	public Car(int no, String model, String color) {
		this.no = no;
		this.model = model;
		this.color = color;
		count = Car.count+1;
	}
	
	public static void headerPrint() {
		System.out.println("-------------------------");
		System.out.println("번호 \t 모델 \t 색상");
		System.out.println("--------------------------");
	}
	
	public void print() {
		System.out.println(no + "\t" + model + "\t" + color);
	}

	public static int getCount() {
		return count;
	}

	public int getNo() {
		return no;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public static void setCount(int count) {
		Car.count = count;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setColor(String color) {
		this.color = color;
	}

}

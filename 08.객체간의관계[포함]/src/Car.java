/*
 * 객체간의 관계
 * 
 *   Car has a no(int)
 *   Car has a model(String)
 *   Car has a Engine(Engine) // 엔진은 클래스니까
 */
public class Car {
	// 캡슐화는 나중에
	private int no;		    // 차량 번호
	private String model;	// 차량 모델명

	private Engine engine; // 차량 엔진 객체의 주소를 저장할 멤버필드
						   // 타입은 엔진 타입은 엔진(=포함관계)
	public Car() {
		
	}
	public Car(int no, String model, Engine engine) {
		this.no = no;
		this.model = model;
		this.engine = engine;
	}
	
	public void print() {
		System.out.print(this.no + "\t" + this.model + "\t");
		/*
		 * 아래처럼 하지X
		 * car에서 engine 직접 접근하기(main 통하지 않고 메소드로) -> engine을 반드시 캡슐화 해주기
		 * 포함관계건 아니건 캡슐화를 통해 접근
		System.out.println(this.engine.type);
		System.out.println(this.engine.cc);
		*/
		this.engine.print();
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Engine getEngine() {		// void아니고 Engine
		return this.engine;
	}
	
	//getter setter -> no, model만 엔진은X
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

}

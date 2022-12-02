
package com.itwill04.array.car;

public class CarArrayMain {

	public static void main(String[] args) {
		//Car[] carArray=new Car[30];
		//차는 6대
		
		Car[] carArray= {
				null,null,new Car("5654", 8),null,null,
				new Car("3422", 12),null,null,null,null,
				null,null,null,null,new Car("7789", 11),
				new Car("1120", 10),null,null,null,null,
				null,new Car("2389", 9),null,null,null,
				null,null,null,null,new Car("5555", 6)
		};
		/*
		null.메쏘드() --> NullPointerException
		 */
		// null과 null이 아닌 것 구분...... 참조변수...
		System.out.println("1.전체 차량출력");
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i] != null) {
				carArray[i].print();
			}
		}
			
		System.out.println();
		System.out.println("2.전체 주차구획 수");
		System.out.println(carArray.length);
		
		System.out.println();
		System.out.println("3.남은 주차구획 수");
		// null인 것 세기
		int emptyspace = 0;
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] == null) {
				emptyspace++;
			}
		}
		System.out.println(emptyspace);

		System.out.println();
		System.out.println("4.입차");
		/*
		 * 1.차량객체생성
		 * 2.빈자리찾아서대입
		 */
		
		Car.headerPrint();
		Car c1 = new Car("8977", 9);
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] == null) {
				carArray[i] = c1;
				carArray[i].print();
				break;
			}
		}
		
		System.out.println();
		System.out.println("5.차량번호 7789번  차한대 정보출력");
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null && carArray[i].getNo().equals("7789"))
				carArray[i].print();
		}
		
		System.out.println();
		System.out.println("6.입차시간 10시 이후 차량 여러 대 찾아서 정보출력");
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i] != null && carArray[i].getInTime() >= 10) {
				carArray[i].print();
			}
		}
		
		System.out.println();
		System.out.println("7.2389번 차량 12시 출차");
		/*
		 * 1. 2389번차량찾기
		 * 2. 출차
		 * 3. 영수증출력
		 * 4. 2389번차량 주차장에서 차량삭제  // null 넣기
		 */
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null && carArray[i].getNo().equals("2389")) {
				carArray[i].setOutTime(12);
				carArray[i].calculateFee();
				carArray[i].print();
				carArray[i] = null;
			}
		}
		//carArray[21]=null;
		
		System.out.println();
		System.out.println("99. 2389번 차량 출차 후 전체 차량 출력");
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null) {
				carArray[i].print();
			}
		}
		
	}

}



package com.itwill03.포함;

public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		DvdMember member = new DvdMember(1, "KIM", "010-1234-1234", null);
		
		/*
		 * Dvd객체생성
		 */
		Dvd dvd1 = new Dvd(5089, "니모를 찾아서", "모험");
		
		/*
		 * 회원이Dvd을 대여
		 * 
		 * Dvd객체참조변수를 회원의 멤버변수에대입
		 */
		member.setRentDvd(dvd1);
		/*
		 * 회원정보출력(회원이빌린Dvd정보출력)
		 */
		member.headerPrint();
		member.print();
	}

}
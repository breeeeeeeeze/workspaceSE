package com.itwill03.포함.배열포함;

public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		DvdMember m1 = new DvdMember(1561, "김김김", "010-1561-4616", null);
		/*
		 * Dvd들객체생성
		 */
//		Dvd dvd1=new Dvd(123,"영화1","전쟁");
//		Dvd dvd2=new Dvd(343,"영화2","전쟁");
//		Dvd dvd3=new Dvd(566,"영화3","전쟁");
//		Dvd dvd4=new Dvd(889,"영화4","전쟁");
		Dvd dvd1 = new Dvd(1023, "영화1", "전쟁");
		Dvd dvd2 = new Dvd(2625, "영화2", "드라마");
		Dvd dvd3 = new Dvd(3458, "영화3", "SF");
		Dvd dvd4 = new Dvd(8875, "영화4", "코미디");

		Dvd[] dvds = new Dvd[3];
		dvds[0] = dvd1;
		dvds[1] = dvd3;
		dvds[2] = dvd4;

		/*
		 * 회원이Dvd들을 대여
		 * - Dvd를 3개까지 대여할수있다.
		 * 
		 * Dvd객체배열 참조변수를 회원의 멤버변수에대입
		 */
		m1.setDvds(dvds);
		
		/*
		 * 회원정보출력(회원이빌린Dvd들정보출력)
		 */
		m1.print();
		
	}

}
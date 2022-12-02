package com.itwill03.포함;

public class DvdMember {
	/*
	- 캡슐화
	<<속성>>
	회원번호
	회원이름
	전화번호
	빌린dvd
	 */
	private int no;
	private String name;
	private String contact;
	private Dvd rentDvd; //빌린 dvd

	public DvdMember() {

	}
	
	public DvdMember(int no, String name, String contact, Dvd rentDvd) {
		this.no = no;
		this.name = name;
		this.contact = contact;
		this.rentDvd = rentDvd;
	}
	
	/*
	<<기능>>
	  회원정보출력 
	 */
	public void headerPrint() {
		System.out.println("회원번호" + " " + "회원이름" +  "   " + "전화번호" + "\t" + "**** 빌린 DVD 정보****");
	}

	public void print() {
		System.out.printf("%5s %8s   %6s", no, name, contact);
		this.rentDvd.print();
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	
	public void setRentDvd(Dvd rentDvd) {
		this.rentDvd = rentDvd;
	}
	
	public Dvd getRentDvd() {
		return rentDvd;
	}
	
}
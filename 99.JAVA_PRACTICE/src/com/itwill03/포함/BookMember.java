package com.itwill03.포함;

//bookmember has a book
	/*
	- 캡슐화
	
	<<속성>>
	 회원번호
	 회원이름
	 전화번호
	 빌린책
	*/
	/*
		<<기능>>
		  회원정보출력 
	 */
public class BookMember {
	private int memberNo;
	private String memberName;
	private String memberContact;
	private Book rentBook;
	
	public BookMember() {
		
	}
	public BookMember(int memberNo, String memberName, String memberContact, Book rentBook) {
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.memberContact = memberContact;
		this.rentBook = rentBook;
	}
	public void headerPrint() {
		System.out.println("-------------------- 회원 정보 및 대여한 책 정보 출력 -----------------------");
	}
	public void print() {
		System.out.print(this.memberNo + "\t" + this.memberName + "\t" + this.memberContact + "\t");
		this.rentBook.print();
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberContact() {
		return memberContact;
	}
	public void setMemberContact(String memberContact) {
		this.memberContact = memberContact;
	}
	public void setRentBook(Book rentBook) {
		this.rentBook = rentBook;
	}
	public Book getRentBook() {
		return this.rentBook;
	}
	
}
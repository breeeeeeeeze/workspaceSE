package com.itwill03.포함.배열포함;

public class BookMember {
	// field
	// 회원번호
	private int no;
	// 회원이름
	private String name;
	// 전화번호
	private String phoneNumber;
	// 빌린책들
	// private Book[] books;
	private Book[] books;

	// constructor
	public BookMember() {
	}

	public BookMember(int no, String name, String phoneNumber, Book[] books) {
		super();
		this.no = no;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.books = books;
	}

	// getters and setters
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setbooks(Book[] books) {
		this.books = books;
	}

	public Book getbooks() {
		return getbooks();
	}

	// print method
	public void print() {
		System.out.println("\t" + no + "\t" + name + "\t" + phoneNumber + "\t");
		for (Book book : books) {
			book.print();
		}
	}
}
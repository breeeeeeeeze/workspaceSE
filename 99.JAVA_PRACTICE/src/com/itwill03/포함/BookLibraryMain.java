package com.itwill03.포함;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		/*
		 * 책객체생성
		 */
		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체참조변수를 회원의 멤버변수에대입
		 */
		/*
		 * 회원정보출력(회원정보와 회원이 빌린책 정보출력)
		 */
		
		Book b1 = new Book(9934, "동화", "문학", "책 내용 설명");
		BookMember m1 = new BookMember(13491, "KIM", "010-2341-1233", null);
		
		m1.setRentBook(b1);
		
		// memberinfo.getbook().print();
		m1.headerPrint();
		m1.print();
	}
}
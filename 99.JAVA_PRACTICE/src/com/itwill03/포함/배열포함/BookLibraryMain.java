package com.itwill03.포함.배열포함;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		BookMember bookMember = new BookMember(99915, "KIM", "010-1234-1567", null);
		/*
		 * 책객체들생성
		 */
		// Book book1 = new Book(46372, "책제목1", "문학", "좋은책1");
		// Book book2 = new Book(46372, "책제목2", "문학", "좋은책2");

		Book book1 = new Book(1651, "구름", "문학", "구름의 종류");
		Book book2 = new Book(4468, "과학", "비문학", "과학에 관한");
		Book[] books = new Book[2];
		books[0] = book1;
		books[1] = book2;

		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체들 참조변수를 회원의 멤버변수에대입
		 */
		bookMember.setbooks(books);

		/*
		 * 회원정보출력(회원정보와 회원이빌린들책정보출력)
		 */
		bookMember.print();

	}
}
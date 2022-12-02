package com.itwill03.포함;

	/*
	 * - 캡슐화하세요
	 * - 생성자를 정의하세요
	 * 
	 * <<속성>>
	 *  책번호
	 *  책제목
	 *  책분류
	 *  책설명
	 * 
	 * <<기능>>
	 *   책정보출력
	 *   
	 */
public class Book {
	private int no;
	private String title;
	private String category;
	private String details;
	
	public Book() {
		
	}
	public Book(int no, String title, String category, String details) {
		this.no = no;
		this.title = title;
		this.category = category;
		this.details = details;
	}
	
	public void print( ) {
		System.out.println(this.no + "\t" + this.title + "\t" + this.category + "\t" + this.details);
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
}
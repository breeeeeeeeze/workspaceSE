package com.itwill03.포함;

public class Dvd {
	/*
	 * - 캡슐화하세요
	 * - 생성자를 정의하세요
	 * 
	 * <<속성>>
	 *  번호
		타이틀
		쟝르
	 */

	private int dvdNo;
	private String dvdTitle;
	private String dvdCategory;
	
	public Dvd() {
		
	}
	
	public Dvd(int dvdNo, String dvdTitle, String dvdCategory) {
		super();
		this.dvdNo = dvdNo;
		this.dvdTitle = dvdTitle;
		this.dvdCategory = dvdCategory;
	}

	/*
	 * <<기능>>
	 *   Dvd정보출력
	 */
	public void print() {
		System.out.printf("%6d %s %s", dvdNo, dvdTitle, dvdCategory);
	}

	public int getDvdNo() {
		return dvdNo;
	}

	public void setDvdNo(int dvdNo) {
		this.dvdNo = dvdNo;
	}

	public String getDvdTitle() {
		return dvdTitle;
	}

	public void setDvdTitle(String dvdTitle) {
		this.dvdTitle = dvdTitle;
	}

	public String getDvdCategory() {
		return dvdCategory;
	}

	public void setDvdCategory(String dvdCategory) {
		this.dvdCategory = dvdCategory;
	}
	
}
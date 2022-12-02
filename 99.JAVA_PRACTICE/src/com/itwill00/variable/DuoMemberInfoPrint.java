package com.itwill00.variable;

public class DuoMemberInfoPrint {

	public static void main(String[] args) {

		int memberNo;
		String name;
		String no;
		String gender;
		int marrige;
		boolean smoking = true;
		double height = 178.3;
		char grade = 'A';
		String look;
				
		memberNo = 236514;
		name = "홍길동";
		no = "201212 - 3495039";
		gender = "남";
		marrige = 0;
		look = "상(중)";		
		
		System.out.println("**************************");
		System.out.println("회원정보 : "+ memberNo);
		System.out.println("이    름 : " + name);
		System.out.println("주민번호 : " + no);
		System.out.println("성    별 : " + gender);
		System.out.println("결혼횟수 : " + marrige);
		System.out.println("흡연여부 : " + smoking);
		System.out.println("키       : " + height);
		System.out.println("학    점 : " + grade);
		System.out.println("용    모 : " + look);
		System.out.println("**************************");
	}

}
package com.itwill00.variable;

public class StudentPrint {

	public static void main(String[] args) {
		
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언
		 * 	- 번호(int), 이름(String), 국어, 영어, 수학, 총점, 평균(double), 평점(A,B,C)(char), 석차(int)
		 */
		int num1, num2;
		String name1, name2;
		int kor1, kor2, eng1, eng2, math1, math2, total1, total2;
		double avg1, avg2;
		char grade1, grade2;
		int rank1, rank2;
		
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력 
		 */
		num1 = 1;
		num2 = 2;
		name1 = "김이름";
		name2 = "이이름";
		kor1 = 42;
		kor2 = 44;
		eng1 = 56;
		eng2 = 53;
		math1 = 78;
		math2 = 45;
		
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		 * 총점, 평균 계산 후 대입 (평점은 F , 석차는 0을 대입)
		 */
		total1 = kor1 + eng1 + math1;
		total2 = kor2 + eng2 + math2;
		avg1 = total1/3;
		avg2 = total2/3;
		
		grade1 = 'F';
		grade2 = 'F';
		rank1 = 0;
		rank2 = 0;
		
		/*
		- 출력포맷
 		- 평균은 소수점이하 자리수를 잘라버리세요[or 반올림하세요].
 		- 석차,평점은 구하지마세요
		*/
		System.out.println("--------------- 학생 성적출력 ---------------");
		System.out.println("학번  이름  국어  영어  수학  총점  평균  평점  석차");
		System.out.println("------------------------------------------");
		System.out.printf(" %d  %s  %d  %d   %d   %d   %.0f   %s   %d\n", num1, name1, kor1, eng1, math1, total1, avg1, grade1, rank1);
		System.out.printf(" %d  %s  %d  %d   %d   %d   %.0f   %s   %d\n", num2, name2, kor2, eng2, math2, total2, avg2, grade2, rank2);
		System.out.println("------------------------------------------");
		
	}

}
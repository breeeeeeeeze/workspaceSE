package com.itwill00.variable;

public class StudentScorePrint {
	public static void main(String[] args) {
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언
		 * 	- 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점(A(90~100),B(80~89),C(70~79),D(60~69),F(0~59)), 석차
		 */
		int num1, num2;
		String name1, name2;
		int kor1, kor2, eng1, eng2, math1, math2, total1, total2;
		double avg1, avg2;
		char score1, score2;
		int rank;
		
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력 
		 */
		num1 = 1;
		num2 = 2;
		name1 = "김이름";
		name2 = "이이름";
		kor1 = 90;
		kor2 = 62;
		eng1 = 72;
		eng2 = 78;
		math1 = 36;
		math2 = 89;
		
		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크
		 *   - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */
		
		// 국어 유효성 체크
		if(kor1 > 0 || kor1 <= 100) {
		}else {
			System.out.println(kor1 + "은(는) 유효하지 않은 점수입니다.");
			return;
		}
		if(kor2 > 0 || kor2 <= 100) {
		}else {
			System.out.println(kor2 + "은(는) 유효하지 않은 점수입니다.");
			return;
		}
		
		//영어 유효성 체크
		if(eng1 > 0 || eng1 <= 100) {
		}else {
			System.out.println(eng1 + "은(는) 유효하지 않은 점수입니다.");
			return;
		}
		if(eng2 > 0 || eng2 <= 100) {
		}else {
			System.out.println(eng2 + "은(는) 유효하지 않은 점수입니다.");
			return;
		}
		
		//수학 유효성 체크
		if(math1 > 0 || math1 <= 100) {
		}else {
			System.out.println(math1 + "은(는) 유효하지 않은 점수입니다.");
			return;
		}
		if(math2 > 0 || math2 <= 100) {
		}else {
			System.out.println(math2 + "은(는) 유효하지 않은 점수입니다.");
			return;
		}
		
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		 * 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 */
		total1 = kor1 + eng1 + math1;
		total2 = kor2 + eng2 + math2;
		avg1 = (double)total1/3;
		avg2 = (double)total2/3;
		rank = 0;		
		
		score1 = 'X';
		score2 = 'X';
		
		if(avg1 >= 90) {
			score1 = 'A';
		}else if(avg1 >= 80) {
			score1 = 'B';
		}else if(avg1 >= 70) {
			score1 = 'C';
		}else if(avg1 >= 60) {
			score1 = 'D';
		}else {
			score1 = 'F';
		}
		
		if(avg2 >= 90) {
			score2 = 'A';
		}else if(avg2 >= 80) {
			score2 = 'B';
		}else if(avg2 >= 70) {
			score2 = 'C';
		}else if(avg2 >= 60) {
			score2 = 'D';
		}else {
			score2 = 'F';
		}
		
		/*
		- 출력포맷
 		- 평균은 소수점이하 첫째자리까지출력(반올림)
 		- 석차는 구하지마세요
		--------------학생 성적출력-------------------
		학번  이름   국어 영어 수학 총점 평균 평점 석차
		-----------------------------------------------
		 1   김경호   42   56   78   334  34.8  A   3  
		 2   김경수   45   53   76   334  34.8  A   2  
		-----------------------------------------------
		*/
		
		System.out.printf("------------------학생 성적출력-------------------%n");
		System.out.printf("%s %3s %4s %3s %3s %3s %3s %3s %s%n"," 학번","이름","국어", "영어","수학","총점","평균","평점", "석차");
		System.out.printf("-----------------------------------------------%n");
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %3d%n",num1,name1, kor1,eng1,math1,total1,avg1,score1,rank);
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %3d%n",num2,name2, kor2,eng2,math2,total2,avg2,score2,rank);

	}
}

package com.itwill01.field;

public class StudentMemberFieldMain {
	public static void main(String[] args) {
		
		/*
		 * 학생객체 2명생성
		 */
		Student stu1, stu2;
		stu1 = new Student();
		stu2 = new Student();
		
		/*
		 * 학생객체의 기본데이타(번호,이름,국어,영어,수학)대입(2명)
		 */
		stu1.num = 1;
		stu2.num = 2;
		stu1.name = "김이름";
		stu2.name = "이이름";
		stu1.kor = 90;
		stu2.kor = 62;
		stu1.eng = 72;
		stu2.eng = 78;
		stu1.math = 36;
		stu2.math = 89;
		
		/*
		 * 학생의 기본데이타를사용해서 총점,평균,평점 계산후 대입(2명)
		 */
		
		stu1.total = stu1.kor + stu1.eng + stu1.math;
		stu2.total = stu2.kor + stu2.eng + stu2.math;
		stu1.avg = (double)stu1.total/3;
		stu2.avg = (double)stu2.total/3;
		stu1.rank = 0;
		stu2.rank = 0;
		
		stu1.score = 'X';
		stu2.score = 'X';
		
		if(stu1.avg >= 90) {
			stu1.score = 'A';
		}else if(stu1.avg >= 80) {
			stu1.score = 'B';
		}else if(stu1.avg >= 70) {
			stu1.score = 'C';
		}else if(stu1.avg >= 60) {
			stu1.score = 'D';
		}else {
			stu1.score = 'F';
		}
		
		if(stu2.avg >= 90) {
			stu2.score = 'A';
		}else if(stu2.avg >= 80) {
			stu2.score = 'B';
		}else if(stu2.avg >= 70) {
			stu2.score = 'C';
		}else if(stu2.avg >= 60) {
			stu2.score = 'D';
		}else {
			stu2.score = 'F';
		}
		
		/*
		 * 학생 데이타를 출력 2명
		 */
		System.out.printf("------------------학생 성적출력-------------------%n");
		System.out.printf("%s %3s %4s %3s %3s %3s %3s %3s %s%n"," 학번","이름","국어", "영어","수학","총점","평균","평점", "석차");
		System.out.printf("-----------------------------------------------%n");
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %3d%n",stu1.num, stu1.name,stu1.kor,stu1.eng,stu1.math,stu1.total,stu1.avg,stu1.score,stu1.rank);
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %3d%n",stu2.num, stu2.name,stu2.kor,stu2.eng,stu2.math,stu2.total,stu2.avg,stu2.score,stu2.rank);
		
	}
}
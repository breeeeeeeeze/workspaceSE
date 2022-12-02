package com.itwill01.method;

public class StudentMemberMethodMain {
	public static void main(String[] args) {
		/*
		학생객체생성(3명)
		*/
		Student stu1 = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student();

		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
		 */
		stu1.setData(1, "김이름", 90, 72, 36);
		stu2.setData(2, "이이름", 62, 78, 89);
		stu3.setData(3, "박이름", 99, 88, 95);
		
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		
		//총점 계산 메소드 호출
		stu1.tot();
		stu2.tot();
		stu3.tot();
		
		//평균 계산 메소드 호출
		stu1.avg();
		stu2.avg();
		stu3.avg();
		
		//평점 계산 메소드 호출
		stu1.grade();
		stu2.grade();
		stu3.grade();
		
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		stu1.headerprint();
		stu1.print();
		stu2.print();
		stu3.print();
	}
}
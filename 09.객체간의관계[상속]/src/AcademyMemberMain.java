
public class AcademyMemberMain {

	public static void main(String[] args) {
		/*****************존재하지않는 객체생성***********
		AcademyMember academyMember=new AcademyMember(0,"누구게");
		academyMember.print();
		*************************************************/
		System.out.println();
		
		AcademyStudent st1 = new AcademyStudent(1, "KIM", "LINUX");
		AcademyStudent st2 = new AcademyStudent(2, "PARK", "JAVA");
		
		AcademyTeacher t1 = new AcademyTeacher(3, "SIM", "자바");
		AcademyTeacher t2 = new AcademyTeacher(4, "MIN", "오피스");
		
		AcademyStaff sf1 = new AcademyStaff(5, "LEE", "Sales");
		AcademyStaff sf2 = new AcademyStaff(6, "LAA", "Accounting");
					
		
		System.out.println("---------------------Student--------------------");
		/* ****호출되면 안되는 메소드 호출********
		// st1.pirnt();      < not good, 1 and KIM만 나올 것임
		 */
		st1.studentPrint();
		st2.studentPrint();
		System.out.println("---------------------Teacer--------------------");
		t1.teacherPrint();
		t2.teacherPrint();
		System.out.println("---------------------Staff--------------------");
		sf1.staffPrint();
		sf2.staffPrint();
	}
}

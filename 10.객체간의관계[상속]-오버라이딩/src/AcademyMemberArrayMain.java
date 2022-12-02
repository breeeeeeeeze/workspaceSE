
public class AcademyMemberArrayMain {

	public static void main(String[] args) {
		
		AcademyStudent[] students = new AcademyStudent[3];
		AcademyGangsa[] gangsas = new AcademyGangsa[2];
		AcademyStaff[] staffs = new AcademyStaff[2];
		
		students[0] = new AcademyStudent(1, "KIM", "JAVA");
		students[1] = new AcademyStudent(2, "LEE", "ANDROID");
		students[2] = new AcademyStudent(3, "SIM", "IOS");
		
		gangsas[0] = new AcademyGangsa(3, "PARK", "Manage");
		gangsas[1] = new AcademyGangsa(4, "JANG", "Design");
		
		staffs[0] = new AcademyStaff(5, "KANG", "Marketing");
		staffs[1] = new AcademyStaff(6, "CHOI", "Sales");
		
		System.out.println("-------------AcademyMember 전체출력------------");
//		System.out.println("-----------------Student--------------");
//		for (int i = 0; i < students.length; i++) {
//			students[i].studentPrint();
//		}
		System.out.println("-----------Student[for]----------");
		for(int i=0;i<students.length;i++) {
			AcademyStudent academyStudent = students[i];
			academyStudent.print();
		}
		System.out.println("-----------Student[enhanced for]----------");
		for(AcademyStudent academyStudent:students) {
			academyStudent.print();
			
		}
		
		
		System.out.println("-----------------Gangsa--------------");
		for (AcademyGangsa academyGangsa : gangsas) {
			academyGangsa.print();
		}
		System.out.println("-----------------Staff--------------");
		for (AcademyStaff academyStaff : staffs) {
			academyStaff.print();
			
			
		}
	}

}

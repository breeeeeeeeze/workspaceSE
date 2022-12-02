
public class AcademyMemberArrayMain {

	public static void main(String[] args) {
		
		AcademyStudent[] students = new AcademyStudent[3];
		AcademyTeacher[] teachers = new AcademyTeacher[2];
		AcademyStaff[] staffs = new AcademyStaff[2];
		
		students[0] = new AcademyStudent(1, "KIM", "JAVA");
		students[1] = new AcademyStudent(2, "LEE", "ANDROID");
		students[2] = new AcademyStudent(3, "SIM", "IOS");
		
		teachers[0] = new AcademyTeacher(3, "PARK", "Manage");
		teachers[1] = new AcademyTeacher(4, "JANG", "Design");
		
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
			academyStudent.studentPrint();
		}
		System.out.println("-----------Student[enhanced for]----------");
		for(AcademyStudent academyStudent:students) {
			academyStudent.studentPrint();
			
		}
		
		
		
		System.out.println("-----------------Teacehr--------------");
		for (AcademyTeacher academyTeacher : teachers) {
			academyTeacher.teacherPrint();
		}
		System.out.println("-----------------Staff--------------");
		for (AcademyStaff academyStaff : staffs) {
			academyStaff.staffPrint();
			
			
		}
	}

}

public class AcademyTeacher extends AcademyMember {
	private String subject; // 과목
	public AcademyTeacher() {
	}
	
	public AcademyTeacher(int no,String name,String subject) {
		this.no=no;
		this.name=name;
		this.subject=subject;
	}
	
	public void teacherPrint() {
		this.pirnt();
		System.out.println(this.subject);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
	
	

}

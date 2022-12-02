public class AcademyStaff extends AcademyMember {
	private String depart; //부
	public AcademyStaff() {
		
	}
	public AcademyStaff(int no, String name, String depart) {
		this.no = no;
		this.name = name;
		this.depart = depart;
	}
	
	public void staffPrint() {
		this.pirnt();
		System.out.println(this.depart);
	}
	
	
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	
}

/*
 * AcademyMember들이 가져야 할 공통 멤버를 가짐
 */
public class AcademyMember {
    public int no;
    public String name;

    public AcademyMember() {
	}
	public AcademyMember(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public void pirnt() {
		System.out.print(this.no + "\t" + this.name + "\t");
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
    

}

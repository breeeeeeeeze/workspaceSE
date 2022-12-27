package com.itwill05.service.array.academy;

/*
 * AcademyMember들의 업무처리클래스
 *  Create
 *  Read
 *  Update
 *  Delete
 */
public class AcademyMemberService {

	private AcademyMember[] members;

	public AcademyMemberService() {
		members = new AcademyMember[9];
		members[0] = new AcademyStudent(1, "KIM", "자바");
		members[1] = new AcademyStudent(2, "LEE", "리눅스");
		members[2] = new AcademyStudent(3, "KIM", "자바");
		members[3] = new AcademyStudent(4, "LEE", "IOT");
		members[4] = new AcademyGangsa(5, "CHOI", "프로그래밍");
		members[5] = new AcademyGangsa(6, "KIM", "DB");
		members[6] = new AcademyGangsa(7, "DIM", "OS");
		members[7] = new AcademyStaff(8, "AIM", "영업");
		members[8] = new AcademyStaff(9, "QIM", "생산");

	}

	/*
	 * 1.AcademyMember 전체출력
	 */
	public void print() {
		for (AcademyMember academyMember : members) {
			academyMember.print();
		}
	}

	/*
	 * 2-1.번호 1 번 AcademyMember 객체 참조변수반환해줘
	 */
	public AcademyMember findByNo(int no) {
		AcademyMember temp = null;
		for (AcademyMember academyMember : members) {
			if (academyMember.getNo() == no) {
				temp = academyMember;
				System.out.println(temp);
				break;
			}
		}
		return temp;
	}
	
	/*
	 * 2-2.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘
	 */
	public AcademyMember findByName(String name) {
		AcademyMember temp = null;
		for (AcademyMember academyMember : members) {
			if (academyMember.getName().equals(name)) {
				temp = academyMember;
				System.out.println(temp);
				break;
			}
		}
		return temp;
	}

	/*
	 * 3.AcademyMember 중에서 AcademyStudent객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 * 3.AcademyMember 중에서 AcademyStaff객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 * 3.AcademyMember 중에서 AcademyGangsa객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 */
	public AcademyMember returnStudent() {
		AcademyMember temp = null;
		for (AcademyMember academyMember : members) {
			if ( academyMember instanceof AcademyStudent) {
				temp = academyMember;
				System.out.println(temp);
			}
		}
		return temp;
	}
	
	public AcademyMember returnStaff() {
		AcademyMember temp = null;
		for (AcademyMember academyMember : members) {
			if ( academyMember instanceof AcademyStaff) {
				temp = academyMember;
				System.out.println(temp);
			}
		}
		return temp;
	}
	
	public AcademyMember returnGangsa() {
		AcademyMember temp = null;
		for (AcademyMember academyMember : members) {
			if ( academyMember instanceof AcademyGangsa) {
				temp = academyMember;
				System.out.println(temp);
			}
		}
		return temp;
	}
	
	// sort처럼 상수 만들어서 하위 클래스가 형성되어도 메소드가 추후에 수정되지 않도록d(삭제할 것)
	/*
	 * 4.AcademyMember 중에서 자바반인   AcademyStudent 객체들 배열참조변수반환해줘 
	 * 4.AcademyMember 중에서 영업부서인 AcademyStaff   객체들 배열참조변수반환해줘 
	 * 4.AcademyMember 중에서 자바과목인 AcademyGangsa  객체들 배열참조변수반환해줘
	 */
	public AcademyMember[] findByClass(String ban) {
		int index = 0;
		AcademyMember[] temp = null;
		for (AcademyMember academyMember : members) {
			if (academyMember.getClass().equals(ban)) {
				temp = new AcademyMember[index];
				index++;
				System.out.println(temp);
			}
		}
		return temp;
	}
	

	/*
	 * 5.AcademyMember 중에서 자바반인   AcademyStudent 객체들 배열참조변수반환해줘[OPTION]
	 * 5.AcademyMember 중에서 영업부서인 AcademyStaff   객체들 배열참조변수반환해줘[OPTION] 
	 * 5.AcademyMember 중에서 자바과목인 AcademyGangsa  객체들 배열참조변수반환해줘[OPTION]
	 */

}





/*
package com.itwill05.service.array.academy;


 * AcademyMember들의 업무처리클래스
 *  Create
 *  Read
 *  Update
 *  Delete
 
public class AcademyMemberService {

	private AcademyMember[] members;

	public AcademyMemberService() {
		members = new AcademyMember[9];
		members[0] = new AcademyStudent(1, "KIM", "자바");
		members[1] = new AcademyStudent(2, "LEE", "리눅스");
		members[2] = new AcademyStudent(3, "KIM", "자바");
		members[3] = new AcademyStudent(4, "LEE", "IOT");
		members[4] = new AcademyGangsa(5, "CHOI", "프로그래밍");
		members[5] = new AcademyGangsa(6, "KIM", "DB");
		members[6] = new AcademyGangsa(7, "DIM", "OS");
		members[7] = new AcademyStaff(8, "AIM", "영업");
		members[8] = new AcademyStaff(9, "QIM", "생산");

	}

	
	 * 1.AcademyMember 전체출력
	 
	public void print() {
		for (AcademyMember academyMember : members) {
			academyMember.print();
		}
	}

	
	 * 2-1.번호 1 번 AcademyMember 객체 참조변수반환해줘
	 
	public AcademyMember findByNo(int no) {
		AcademyMember temp = null;
		for (int i = 0; i < members.length; i++) {
			if (members[i].getNo() == no) {
				temp = members[i];
				// 확인용 출력
				System.out.println(temp);
				break;
			}
		}
		return temp;
	}

	
	 * public AcademyMember member(int no) { AcademyMember findMember = null;
	 * for(int i = 0; i < members.length; i++) { if(members[i].getNo() == no) {
	 * findMember = members[i]; break; } } return findMember; }
	 

	
	 * 2-2.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘
	 
	public AcademyMember findByName(String name) {
		AcademyMember temp = null;
		for (int i = 0; i < members.length; i++) {
			if (members[i].getName().equals(name)) {
				temp = members[i];
				// 확인용 출력
				System.out.println(temp);
			}
		}
		return temp;
	}

	
	 * 3.AcademyMember 중에서 AcademyStudent객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 * 3.AcademyMember 중에서 AcademyStaff객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 * 3.AcademyMember 중에서 AcademyGangsa객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 
	public AcademyMember findStudent() {
		AcademyMember temp = null;
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStudent) {
				temp = members[i];
				System.out.println(temp);
			}
		}
		return temp;
	}

	public void findStaff() {
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStaff) {
				members[i].print();
			}
		}
	}

	public void findGangsa() {
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyGangsa) {
				members[i].print();
			}
		}
	}

	
	 * 4.AcademyMember 중에서 자바반인 AcademyStudent 객체들 배열참조변수반환해줘 4.AcademyMember 중에서
	 * 영업부서인 AcademyStaff 객체들 배열참조변수반환해줘 4.AcademyMember 중에서 자바과목인 AcademyGangsa 객체들
	 * 배열참조변수반환해줘
	 

	public void findJavaStudent() {
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStudent && members[i].getClass().equals("자바")) {
				members[i].print();
			}

		}
	}

	
	 * 5.AcademyMember 중에서 자바반인 AcademyStudent 객체들 배열참조변수반환해줘[OPTION]
	 * 5.AcademyMember 중에서 영업부서인 AcademyStaff 객체들 배열참조변수반환해줘[OPTION] 5.AcademyMember
	 * 중에서 자바과목인 AcademyGangsa 객체들 배열참조변수반환해줘[OPTION]
	 
}

*/
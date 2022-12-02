
public class MemberMethodThis {
	/*
	 * 멤버필드[속성]
	 */
	int memberField1;
	char memberField2;
	double memberField3;
	
	/*	
	 * 멤버메쏘드[기능]
	 */
	
	/*
	 * 1. 객체의 맴버필드에 데이터를 대입
	 */
	void setMemberField(int memberField1, char memberField2, double memberField3) {
		this.memberField1 = memberField1; //여기서는 this 생략하면 안된다.
		this.memberField2 = memberField2; //여기서는 this 생략하면 안된다.
		this.memberField3 = memberField3; //여기서는 this 생략하면 안된다.
	}
	
	/*
	 * 2. 객체의 멤버필드의 내용을 출력하는 메쏘드
	 */
	void print() {
		/*
		 * this;
		 * 	 - self 참조변수
		 *   - void print()메쏘드가 실행될 때 호출주체 객체의 주소값
		 *   					(를 가지고 있는)
		 *   - this는 생략이 가능(유일)
		 */
		System.out.println("mmt1.print()메쏘드 안에서 this : " + this);
		System.out.println(this.memberField1 + "\t" + 
						   this.memberField2 + "\t" + 
						   this.memberField3);
	}
}


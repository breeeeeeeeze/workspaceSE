
public class MemberMethodThisMain {

	public static void main(String[] args) {
		
		MemberMethodThis mmt1 = new MemberMethodThis();
		/*
		mmt1.memberField1 = 1;
		mmt1.memberField2 = 'A';
		mmt1.memberField3 = 95.4;
		*/
		mmt1.setMemberField(1, 'A', 95.4);
		
		/* ******************** Case1 **********************
		 * MemberMethodThis 객체 내용출력
		System.out.println(
					mmt1.memberField1 + "\t" + 
					mmt1.memberField2 + "\t" + 
					mmt1.memberField3);
		 */
		
		/* ******************** Case2 **********************
		 * MemberMethodThis 객체 내용출력 메쏘드 호출
		 */
		System.out.println("main block ----> mmt1의 주소값 : " + mmt1);
		mmt1.print();
		
		/*
		 * 접근방법이 case1, case2가 있으나 이후에 case1은 쓰지 않음.
		 */
		
		MemberMethodThis mmt2 = new MemberMethodThis();
		/*
		 * mmt2.memberField1 = 2;
		 * mmt2.memberField2 = 'F';
		 * mmt2.memberField3 = 23.1;
		 */
		mmt2.setMemberField(2, 'F', 23.1);
		mmt2.print();
		mmt2.print();
		mmt2.print();
	}

}

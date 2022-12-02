
public class MemberFieldMain {

	public static void main(String[] args) {
		System.out.println("-----main start-----");
		/*
		 * MemberField 사용자정의 타입 객체를 저장할 변수 선언
		 */
		MemberField mf1; //8바이트
		/*
		 * MemberField클래스(틀)로 객체생성한 후에 mf에 객체의 값이 대입
		 */
		mf1 = new MemberField(); //ctrl 누르면서 MemberField 건드리면 ..
		
		
		/*
		 * mf1(#100)주소에 있는 객체의 int    타입의 멤버변수에 member1에 77       값을 대입
		 * mf1(#100)주소에 있는 객체의 double 타입의 멤버변수에 member2에 3.14159  값을 대입
		 * mf1(#100)주소에 있는 객체의 char   타입의 멤버변수에 member3에 'A'      값을 대입
		 * mf1(#100)주소에 있는 객체의 String 타입의 멤버변수에 member4에 "거북이" 값을 대입
		 * 
		 * - 객체의 참조(주소)변수가 가지고 있는 객체의 주소값 #100을 사용해서 멤버필드에 테이타 대입
		 * - 객체의 멤버필드 접근방법
		 * 		- 참조(주소)변수.멤버필드이름 = 값(리터럴);
		 * 		- mf1.member1 = 77;
		 */
		mf1.member1 = 77;
		mf1.member2 = 3.14159;
		mf1.member3 = 'A';
		mf1.member4 = "거북이";
		
		
		/*
		 * mf1객체의 int    타입 멤버변수 member1의 값을 출력
		 * mf1객체의 double 타입 멤버변수 member2의 값을 출력
		 * mf1객체의 char   타입 멤버변수 member3의 값을 출력
		 * mf1객체의 String 타입 멤버변수 member4의 값을 출력
		 * 
		 * - 객체의 참조(주소)변수가 가지고 있는 객체의 주소값 #100을 사용해서 멤버필드의 값 출력
		 * - 객체의 멤버필드 접근방법
		 * 		1. System.out.println(mf1.member1);
		 * 		2.
		 *		   int tempMember1 = mf1.member1;
		 *		   System.out.println(tmepMember1);
		 * 
		 */
		System.out.println("mf1의 주소값 : " + mf1); // 구분하는 유일한 값. 실제 주소값은 아님. 클래스타입(?) + 고유숫자
		System.out.println(mf1.member1);
		System.out.println(mf1.member2);
		System.out.println(mf1.member3);
		System.out.println(mf1.member4);
		
		
		MemberField mf2 = new MemberField(); // mf2 : 객체의? 주소값을 저장할 필드 8바이트
		mf2.member1 = 88;
		mf2.member2 = 1.1324;
		mf2.member3 = 'B';
		mf2.member4 = "강아지";
		System.out.println(mf2.member1);
		System.out.println(mf2.member2);
		System.out.println(mf2.member3);
		System.out.println(mf2.member4);
		
		System.out.println("------main end------");

	}

}

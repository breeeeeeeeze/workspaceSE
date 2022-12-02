
public class MemberFieldInitializationMain {

	public static void main(String[] args) {
		MemberField mf = new MemberField();
		System.out.println("1-1. 인스턴스 멤버필드는 객체 생성시 기본값으로 자동 초기화");
		System.out.println(mf.member1);
		System.out.println(mf.member2);
		System.out.println(mf.member3);
		System.out.println(mf.member4);
		System.out.println(mf.member5);
		System.out.println(mf.member6);

		System.out.println("1-2. 인스턴스 멤버필드는 객체 생성시 초기값으로 초기화할 수 있다.");
		System.out.println(mf.member11);
		System.out.println(mf.member22);
		System.out.println(mf.member33);
		System.out.println(mf.member44);
		System.out.println(mf.member55);
		System.out.println(mf.member66);
		
		DuoMember paramMember = new DuoMember(1, "일번님");
		MemberField mf2 = new MemberField(333, 3.2, '가', true, null, null);
	}

}

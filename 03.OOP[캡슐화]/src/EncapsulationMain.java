
public class EncapsulationMain {

	public static void main(String[] args) {
		Encapsulation encapsulation = new Encapsulation();
		/*
		 * encapsulation 객체멤버 데이터 대입
		 * The field Encapsulation.memberFieldis no visible.
		 */
		/*
		encapsulation.memberField1 = 11;
		encapsulation.memberField2 = true;
		encapsulation.memberField3 = 'A';
		encapsulation.memberField4 = 2.34;
		 */
		encapsulation.setMemberField1(11);
		encapsulation.setMemberField2(true);
		encapsulation.setMemberField3('A');
		encapsulation.setMemberField4(2.34);
		/*
		 * encapsulation 객체멤버 데이터 출력
		 * The field Encapsulation.memberFieldis no visible.
		 * private는 추천기능에 뜨지 않음. 수동입력하면 위의 에러 발생.
		 * ===> getter가 필요
		 */
		System.out.println(encapsulation.getMemberField1());
		System.out.println(encapsulation.getMemberField2()); 
		System.out.println(encapsulation.getMemberField3());
		System.out.println(encapsulation.getMemberField4());
		
	}

}

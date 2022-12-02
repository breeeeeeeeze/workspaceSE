
public class MemberMethodReturn {
	/*
	 * 멤버 필드
	 *   - 멤버필드 선언 시 값을 대입 할 수 있다.(선언 시 초기화 기본적으로 자동 초기화 값이 있으며 특정 값을 넣으려면 초기ssSS화 할 것)
	 */
	int memberField1 = 10;
	int memberField2 = 20;
	int memberField3 = 30;
	
	/*
	 * setter method
	 */
	void setMemberField1(int memberField1) {
		this.memberField1 = memberField1;
	}
	void setMemberField2(int memberField2) {
		this.memberField2 = memberField2;
	}
	void setMemberField3(int memberField3) {
		this.memberField3 = memberField3;
	}
	
	/*
	 * getter method(외부로부터 get.....) +) setter method
	 */
	// get 이하 카멜 케이스로 작성(관례이고 지키지 않으면 이후에 문제 생김)
	int getMemberField1() {
		return memberField1;
	}
	int getMemberField2() {
		return memberField2;
	}
	int getMemberField3() {
		return memberField3;
	}
		
	/*
	 * 멤버 메소드
	 */
	int method1() {
		System.out.println("\t---int method1()실행---");
		int result = 234 + 23432;
		System.out.println("\t---int method1()실행 종료 후 int 데이터 반환---");
		/*
		 return <<호출한 클래스(객체)에게 반환할 값>(변수, 리터럴, 연산의 결과>>;
		  	- 호출한 곳으로 실행흐름 반환
		  	- 호출한 곳으로 데이터 반환
		  	- 반환할 데이터가 없는 경우에는(void) return문 생략이 가능하다.
		  	- 반환할 데이터가 있는 경우에는(int, ...) return문 반드시 기술하여야한다. 
		 */
		return result; // void 자리의 타입과 return 다음 타입이 일치해야 함 아니면 오류
				  // 데이터 반환 + 실행문 반환
	}
	
	boolean method2() {
		System.out.println("\t---boolean method2()실행---");
		boolean isMarried = false;
		System.out.println("\t---boolean method2()종료 후 boolean 데이터 반환---");
		return isMarried;
	}
	
	/*
	 * 두 개의 정수를 파라메타로 받아서 더한 결과(정수)를 반환하는 메소드
	 */
	int add(int a, int b) {
		System.out.println("\t---int add(int a, int b)---실행");
		int result = a + b;
		System.out.println("\t---int add(int a, int b)---종료 후 데이터 반환---");
		return result;
	}
	
	/*
	 * 이름을 매개변수로입력받아서  인사말을만들어서 문자열로반환
	 */
	String hello(String name) {
		System.out.println(
				"\t---String hello(String name)실행---");
		String msg="";
		msg=name+"님 안녕하세요!";
		System.out.println(
				"\t---String hello(String name)종료후 String(문자열)데이타 반환---");
		return msg;
	}
	
}













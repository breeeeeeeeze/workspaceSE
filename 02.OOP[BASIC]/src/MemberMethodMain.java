
public class MemberMethodMain {

	public static void main(String[] args) {
		System.out.println("main stmt1");
		MemberMethod mm1 = new MemberMethod();
		/*
		 * member method 실행(호출)
		 * 		- 형식 : 참조변수.메쏘드이름();
		 * 		- main실행흐름을 mm1주소에 있는 객체의
		 *		  method1이라는 이름의 메쏘드(실행코드블록)로 보낸다.
		 */
		mm1.method1();
		System.out.println("main stmt2");
		mm1.method2();
		System.out.println("main stmt3");
		System.out.println("*****************매개변수(parameter)가 있는 메쏘드 호출************");
		mm1.method3(3);
		System.out.println("main stmt4");
		mm1.method3(5);
		System.out.println("main stmt5");
		mm1.method4("안녕하세요!!", 3);
		System.out.println("main stmt6");
		mm1.method4("수업끝~~~~~~~", 10);
		System.out.println("main stmt7");
		
		/*
		 * Quiz:
		 *   김경호 님 누구세요!
		 *   김경호 님 누구세요!
		 *   김경호 님 누구세요!
		 */
		//mm1.method5("김경호","누구세요",3);
		
		mm1.method5("김경호", "누구세요!", 3);
		System.out.println("main stmt8");
		
		System.out.println("main block end");
		return;
	}

}

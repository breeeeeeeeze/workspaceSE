/*
 * 클래스의 구성요소
 *   1.멤버필드(변수)[속성]:객체생성시 속성데이타를 저장할변수
 *   2.멤버메쏘드
 */
public class MemberMethod {
	int member1;
	
	void method1(){
		System.out.println("\t-----void method1()실행 시작-----");
		System.out.println("\t method stmt1");
		System.out.println("\t method stmt2");
		System.out.println("\t-----void method1()실행 끝-----");
		 /* 
		  * << return >>
		   	- 모든 메쏘드블록의 마지막에는 항상 실행흐름을 호출한곳으로 반환하여야한다.
		   	- 실행흐름을 반환하는 문장이 return문이다.
		   	- return 문을 만나면 실행흐름이 호출한곳으로 반환된다.
		   	- return type이 void 인경우에는 생략이 가능하다.
		   	- return문이 생략된경우에는 컴파일러가 자동으로 return문을 삽입하여준다.
		 */
		return;
	}
	void method2() {
		System.out.println("\t-----void method2()-----실행");
		System.out.println("\t method stmt1");
		System.out.println("\t method stmt2");
		System.out.println("\t-----void method2()-----실행종료");
		return;
	}
	/* ************매개변수가 있는 매쏘드 정의 ************** */
	void method3(int count) {   // (,를 이용해서 여러 매개변수 가능) 
								// 외부에서 호출될 때... 사용하는 통로...? !!!디버깅하면서 대입되는 숫자, 흐름 파악 잘 하기!!!
		System.out.println("\t-----void method3()-----실행");
		int localVar = 111;
		System.out.println("\t method3 메쏘드 블록 안에서 선언된 로컬 변수 : " + localVar);
		for(int i = 0; i < count; i++) {
			System.out.println("\t void method3(int count)실행 : 파라메타(매개변수) count 값 -> " + count);
		}
		System.out.println("\t-----void method3(int count)-----실행 종료 후 반환");
		return;
	}
	
	/*
	 * 아래 method4 부분 다시 이해하기.
	 */
	public void method4(String msg, int count) {
		System.out.println("\t void method4(String msg, int count)-- 실행");
		for(int i = 0; i < count; i++) {
			System.out.println("\t\t" + msg);
		}
		System.out.println("\t void method4(String msg, int count)-- 종료 후 실행 흐름 반환");
		return;
	}
		
	public void method5(String msg, int count) {
		System.out.println("\t void method5(String msg, int count)-- 실행");
		for(int i = 0; i < count; i++) {
			System.out.println("\t\t" + msg);
		}
		System.out.println("\t void method5(String msg, int count)-- 종료 후 실행 흐름 반환");
		return;		
	}
	
	void method5(String name, String msg, int count) {
		for(int i = 0; i < count; i++) {
			System.out.printf("%s님 %s ! \n" + name, msg, count);
		}
	}
}


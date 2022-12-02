
public class DefaultConstructor {
	/*
	 생성자를 하나도정의하지 않는경우 컴파일러는 
	 디폴트생성자를 자동으로 추가한다.
	 */
	
	/* 디폴트 생성자 없으면 DefaultConstructorMain.java의 
	 * DefaultConstructor dc = new DefaultConstructor();에서
	 * new DefaultConstructor(); <------ 에러뜸
	 */
	public DefaultConstructor() {
		System.out.println("public DefaultConstructor() 기본 생성자 호출");
	}
	
	public DefaultConstructor(int a) {
		System.out.println("" + "public DefaultConstructor(int a) 생성자 호출");
	}

}

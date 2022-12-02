package lang;

public class StringCompareMain {

	public static void main(String[] args) {
		/*
		 * String 객체의 생성
		 *    1. 생성자 호출(명시적 생성자)
		 *    2. ""로 생성(암시적 생성자)
		 */
		String name1 = new String("KIM");
		String name2 = new String("KIM");
		String name3 = "KIM";
		String name4 = "KIM";
		
		/*
		if(name1 != name3 ) {
			System.out.println("name1 != name3");
		}
		 */

		System.out.println("-------------String객체내용비교는  equals메쏘드를 사용하여야합니다.--------------");          //아니면 가끔 문제가 발생하니까 equals메소드 사용해주기
		/*
		<< public boolean equals(String otherString) >>
		 */
		if(name1.equals(name2));{
			System.out.println("name1 객체의 문자열과 name2 객체의 문자열이 동일하다.");
		}
		if(name1.equals(name3));{
			System.out.println("name1 객체의 문자열과 name3 객체의 문자열이 동일하다.");
		}
		if(name3.equals(name4));{
			System.out.println("name3 객체의 문자열과 name4 객체의 문자열이 동일하다.");
		}
		if(name1.equals("KIM")) {                  // if(name1.new String("KIM"))이랑 같다. "KIM". 찍으면 주르륵 나옴
			System.out.println("name1객체의 문자열과  \"KIM\" 객체의 문자열이 동일하다");
		}
		if("KIM".equals("KIM")) {
			System.out.println("\"KIM\"객체의 문자열과  \"KIM\" 객체의 문자열이 동일하다");
		}
		
		/*
		 *  public int compareTo(String anotherString)
		 *   - the value 0 if the argument string is equal to this string; 
		 *   - a value less than 0 if this string is lexicographically less than the string argument; 
		 *   - and a value greater than 0 if this string is lexicographically greater than the string argument
		 *   
		 *   - (앞쪽문자열유니코드숫자- 뒤쪽문자열유니코드숫자) 의 결과를 반환한다.
		 *   
		 */
		int uniCodeGap = "aaa".compareTo("aaa");
		 System.out.println(uniCodeGap);
		 uniCodeGap = "aaa".compareTo("aab");
		 System.out.println(uniCodeGap);
		 uniCodeGap = "aab".compareTo("aaa");
		 System.out.println(uniCodeGap);
		 String irum1="aab";
		 String irum2="aaa";
		 if(irum1.compareTo(irum2) > 0) {
			 System.out.println("irum1,irum2 교환[오름차순]");
		 }
		
		
		
	}

}


public class IfUSe {

	public static void main(String[] args) {
		/*
		 * 짝수, 홀수 판별
		 */
		int no1 = 51;
		
		if(no1%2 == 0) {
			System.out.printf("%d은(는) %s입니다.\n" , no1, "짝수");
		}else {
			System.out.printf("%d은(는) %s입니다.\n" , no1, "홀수");
		}
		/*
		 * 4의 배수 판별
		 */
		int no2 = 4000;
		if(no1%4 == 0) {
			System.out.printf("%d은(는) 4의 배수\n" , no2);
		}else {
			System.out.printf("%d은(는) 4의 배수 아님\n" , no2);
		}
		/*
		 * 점수의 유효성 체크
		 */
		int kor = -90;
		if(kor >= 0 && kor <= 100) {
			System.out.printf("%d은(는) 유효한 점수입니다. \n", kor);
		}else {
			System.out.printf("%d은(는) 유효한 점수가 아닙니다. \n", kor);			
		}
		/*
		 * 윤년여부 출력
		 */
		int year = 2022;
		String msg = "";
		if((year%4 == 0 && year%100!=0) || year%400 == 0) {
			msg = "윤년";
		}else {
			msg = "평년";
		}
		System.out.printf("%d 은(는) %s 입니다.\n", year, msg);
		/*
		 * 공배수
		 */
		int no3 = 45;
		if(no3%3 == 0 && no3%4 == 0) {
			System.out.printf("%-10d 은(는) 3과 4의 공배수 입니다.\n", no3);
		}else {			
			System.out.printf("%-10d 은(는) 3과 4의 공배수가 아닙니다.\n", no3);
		}
		/*
		 * 문자판단
		 */
		char c='X';
		if(c>='A' && c<='Z') {
			System.out.printf("%c 는 알파벳대문자입니다.\n",c);
		}
		c='9';
		if(c>='0' && c<='9') {
			System.out.printf("%c 는 숫자형태문자입니다.\n",c);
		}
		
		/*
		 Quiz:
		 다음문자는 아이디의 첫글자입니다. 
		 이문자가 아이디의 첫글자로 유효한지판단후출력하세요 
		   - 아이디의첫글자는 알파벳대문자 이거나 소문자이다
		 */
//		char idFirstLetter='*';
//		
//		if((idFirstLetter >= 'A' && idFirstLetter <= '2') || (idFirstLetter <= '2'){
//			System.out.printf("%c는 유효한 문자입니다. \n"), idFirstLetter;
//		}else {
//			System.out.printf("%c는 유효하지 않은 문자입니다.");
//		}
	}

}

/*
	for문
	     -형식:
	       	       
	       for(1;2;3){
	       	//1.반복변수(선언,초기화가능)
	       	//2.반복변수의 조건검사(논리형데이타)
	       	//3.반복변수증,감(++,--)
	       }
	       
	       ex>
	       for(int i=0;i<10;i++){
	       	 stmt1;
	       }
	       ex>무한루프
	       for(;;){  	
	       }
	*/

public class ForTest {

	public static void main(String[] args) {
		System.out.println("-----while-----");
		int k = 0; // 1. 반복 변수 선언 초기화
		while (k < 10) { // 2. 반복 변수 비교(반복조건)
			// 3. 반복문
			System.out.println("k = " + k);
			k++; // 4. 반복 변수 증가(감소)
		}

		System.out.println("-----for i증가-----");
		for (int i = 0 /* 1. 반복 변수 선언 초기화 */; i < 10 /* 2. 반복조건 검사 */; i++ /* 4. 반복변수 증가 */) {
			System.out.println("i = " + i); /* 3. 반복문 실행 */
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
		}

		System.out.println("------for i감소------");
		for (int i = 10; i > 0; i--) {
			System.out.println("i = " + i);
		}

		System.out.println(">> 홀수만 출력[1~100]");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println(">>짝수만 출력[1~100] continue");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				/*
				 * - 홀수 조건을 만족하면 continue문이 실행되고 현재 실행중인 for블록을 실행하지 않고 다음 횟수의 블록을 실행한다.
				 */
				continue;
				/*
				 * 0. 반복 블록에서만 사용 가능하다. 1. continue 문 이후의 for블록코드를 실행하지 않는다. 2. 다음 반복을
				 * 계속(continue) 실행한다.
				 */
			}
			/*
			 * 짝수 출력
			 */
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(">>4의 배수 출력[1~100]");
		for (int i = 1; i <= 100; i++) {
			if (i % 4 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println(">>3과 4의 공배수[1~100]");
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				System.out.print(i + " ");
				break;
				/*
				 * break문 1. 반복문에서 사용가능 2. break문 이후의 for 블록코드를 실행하지 않는다. <- continue와 다르게 3. 다음
				 * 반복문도 실행하지않는다.(반복블록을 빠져나온다.)
				 */
			}
		}
		System.out.println();
		System.out.println(">>홀수 짝수 합[1~100]");

		int oddTot = 0;
		int evenTot = 0;
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 0) {
				// 짝수 누적
				evenTot += i; // evenTot = evenTot + i;
			} else {
				// 홀수 누적
				oddTot += i; // addTot = oddTot + i;
			}
		}
		System.out.println("짝수합 : " + evenTot);
		System.out.println("홀수합 : " + oddTot);
		System.out.println("-----문자출력-----");
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.print(c);
			if (c == 'z')/* if(c != 'z') */
				continue;
			
			System.out.print(", ");
			/*
			 * 5개 문자 찍고 개행
			 */
			if((c - 'a' + 1)%5 == 0) {
				System.out.println("\n");
			}
		}
		System.out.println();

	}

}

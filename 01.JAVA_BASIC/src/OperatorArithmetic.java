
public class OperatorArithmetic {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		int result=0;
		
		result = a+b;
		System.out.println("a+b ---> " + result);
		result = a-b;
		System.out.println("a=b ---> " + result);
		result = a*b;
		System.out.println("a*b ---> " + result);
		result = a/b;
		System.out.println("a/b ---> " + result); // int이므로 소수점 이하 잘림 -> typecasting을 통해 double로 바꿔주어야 함
		double dresult = (double)a/b;
		System.out.println("double dresult = a/b --> " + dresult);
		/*
		 * 나머지 연산자
		 * %
		 */
		result = a%b;
		System.out.println("a%b ---> " + result);
		
		// 윤년 계산 가능한 나머지 식...?
		int year=2022;
		result = year%4; // 0,1,2,3
		System.out.println("2022%4 ---> " + result);
		result = year%100; // 0~99
		System.out.println("2022%100 ---> " + result);
		result=year%400; // 0~399
		System.out.println("2022%400 ---> " + result);
		
		int no = 16;
		result = no%4;
		System.out.println("result 변수의 값이 0이면서 4의 배수 : " + result);
//		System.out.println("-----------------문자연산-----------------");
		
		/*
		 * 비트연산자
		 * << , >>
		 * int d = 1;       => 00000000|00000000|00000000|00000001|
		 * result d << 1;   => 00000000|00000000|00000000|00000010|
		 * result d << 2;   => 00000000|00000000|00000000|00000100|
		 * result d << 3;   => 00000000|00000000|00000000|00001000|
		 * result d << 4;   => 00000000|00000000|00000000|00010000|
		 */
		
		int d = 1;
		System.out.println(d);
		result = d << 1;
		System.out.println(result);
		result = d << 2;
		System.out.println(result);
		result = d << 3;
		System.out.println(result);
		result = d << 4;
		System.out.println(result);
		
		/*
		 * int d = 128;    => 00000000|00000000|00000000|10000000|
		 */
		d=128;
		System.out.println(d);
		result = d >> 1;
		System.out.println(result);
		result = d >> 2;
		System.out.println(result);
		result = d >> 3;
		System.out.println(result);
		result = d >> 4;
		System.out.println(result);
		
	}

}

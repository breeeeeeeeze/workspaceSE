
public class SwitchUse {

	public static void main(String[] args) {
		/*
		 * 짝수홀수 판별
		 */
		int number = 23; // 숫자 크니까 2로 나눠서 0,1로 구분
		switch (number % 2) {
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;
		default:
			break;
		}

		char direction = 'S';
		switch (direction) {
		case 'A':
			System.out.println("move left~");
			break;
		case 'D':
			System.out.println("move right~");			
			break;
		case 'W':
			System.out.println("move up~");
			break;
		case 'X':
			System.out.println("move down~");
			break;
		case 'S':
			System.out.println("move rotate~");
			break;
		default:
			System.out.println("don't move~");
			break;
			/*
			 * Quiz : 대소문자 구분없이 X,x 실행하도록 해보세요
			 */

			/*
			char direction = 'S';
			switch (direction) {
			case 'A':
				System.out.println("move left~");
				break;
			case 'D':
				System.out.println("move right~");			
				break;
			case 'W':
				System.out.println("move up~");
				break;
			case 'X':
				System.out.println("move down~");
				break;
			case 'S':
				System.out.println("move rotate~");
				break;
			default:
				System.out.println("don't move~");
				break;	
			}
			 */
		}
	}	

}

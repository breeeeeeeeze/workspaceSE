
public class WhileCount {

	public static void main(String[] args) {
		System.out.println("---- i = 0 ----");
		int i = 0; //반복횟수 변수
		
		while (i < 10) {
			System.out.println("stmt : i =" + i);
			i++;
		}
		System.out.println("---- i = 1 ----");
		while (i <= 10) {
			System.out.println("stmt : i =" + i);		
			i++;
		}

	}

}

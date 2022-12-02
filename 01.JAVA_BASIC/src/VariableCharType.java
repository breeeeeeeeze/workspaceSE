
public class VariableCharType {

	public static void main(String[] args) {
		char munja1, munja2, munja3, munja4, munja5, munja6;
		munja1 = 'A';
		/*
		 * 'A' ====> 00000000|000000001
		 */		
		munja2 = 65;
		/*
		 * 'A' ====> 00000000|00000000|00000000|010000001
		 */
		munja3 ='가';
		munja4 = 44032;
		munja5 = '힣';
		munja6 = 55203;
		
		System.out.println(munja1);
		System.out.println(munja2);
		System.out.println(munja3);
		System.out.println(munja4);
		System.out.println(munja5);
		System.out.println(munja6);
		System.out.println("한글글자수 " + (munja5 - munja3));

	}

}

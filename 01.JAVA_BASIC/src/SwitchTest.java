 /*
		switch 문
		
		 - 형식
		 
		    switch(변수){
		    	case 값_1: <------------- 값 = 정수값
		    	  stmt1;
		    	  break;
		    	case 값_2:
		    	  stmt2;
		    	  break;  
		        case 값_n:
		          stmt3;
		    	  break;
		        default:
		          stmt4;
		    }
		    
		    
		switch(변수)  변수값은 byte,short,int char 
		              값이올수있다.(long 은안됨)
*/
public class SwitchTest {

	public static void main(String[] args) {
		int level = 5; //게임레벨 1~5 사이의 정수
		
		switch (level) {
		case 1:
			/* 명령문 기술 위치 */
			
			System.out.println("초보");
			System.out.println("초보");
			System.out.println("초보");
			System.out.println("초보");
			System.out.println("초보");
			/*
			 * brake -> switch block을 빠져나간다.
			 * for에서도 사용
			 */
			break;
		case 2:
			System.out.println("중수");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("고수[3,4,5]");
			break;

		default:
			System.out.println("레벨은 1~5 사이의 정수입니다.");
			break; //마지막 break는 생략 가능(실행하지 않으니까)
		}
		

	}

}

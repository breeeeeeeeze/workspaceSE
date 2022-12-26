package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCFlowMain {

	public static void main(String[] args) throws Exception{
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		/*
		String driverClass = "oracle.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.12:1521:xe";
		String user="jdeveloper30";
		String password="jdeveloper30";
		 */
		String selectSql = "select deptno,dname,loc from dept order by deptno";
		
		/*
		 * 1. Driver class loading
		 * 		A. Driver Class 객체 생성
		 * 		B. DriverMangaer 객체 등록
		 * 		1번 작업을 하면 A, B가 자동으로 된다.
		 */
		//Class.forName("oracle.jdbc.OracleDriver");
		Class.forName(driverClass);
		System.out.println("1. Driver class loading");
		
		/*
		 * 2. Connection 객체 생성
		 * 	- DB Server와 연결객체
		 */
		// 이제 interface만 사용, DriverManager는 거의 유일한 클래스
		//Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. Connection 객체 생성 : " + con);
		
		/*
		 * 3. Statement 객체 생성
		 * 	- SQL전송 객체 생성
		 */
		Statement stmt = con.createStatement();
		System.out.println("3. Statement 객체 생성(SQL 전송 객체) : " + stmt);
		
		/*
		 * 4. SQL문 전송(select)
		 * 5. ResultSet 객체 얻기(select의 경우에만)
		   	---------------------------------
			DEPTNO    DNAME        	LOC
			--------------------------------- 
 (cursor) ▶ BEFORE FIRST 영역
			10	 	ACCOUNTING		NEW YORK
			20		RESEARCH		DALLAS
			30		SALES			CHICAGO
			40		OPERATIONS		BOSTON
			AFTER LAST  영역   
		 */
		//ResultSet rs = stmt.executeQuery("select deptno,dname,loc from dept order by deptno");
		ResultSet rs = stmt.executeQuery(selectSql);		
		System.out.println("4,5. ResultSet 객체얻기(select문 실행결과) : " + rs);
		System.out.println("---------------------------------");
		System.out.println("DEPNO	DNAME		LOC");
		System.out.println("---------------------------------");
		while (rs.next()) {
			int deptno = rs.getInt("deptno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			System.out.println(deptno + "\t" + dname + "\t" + loc);
		}
		System.out.println("---------------------------------");
		
		/*
		 * 6. 연결객체 해지(resource) close
		 */
		rs.close();
		stmt.close();
		con.close();
		System.out.println("6. 연결 객체 닫기");
		
		
		
		
		
		
		
		
		
		
		
	}

}







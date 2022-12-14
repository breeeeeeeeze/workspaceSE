package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddressTableUpdateByPrimaryKeyMain {

	public static void main(String[] args) throws Exception {
		/*****************데이타베이스접속정보***********/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		/***********************************************/
		String updateSQL = "update address set name = '바꾸다', phone = '899-9900', address = '서울시 강남구' where no = 2";
		
		/*
		 1.Driver class loading
	     2.Connection 객체생성
		 3.Statement객체생성
		 4.SQL문전송(update)
		 5.SQL문전송(update)결과 영향받은 행의 수 반환
		 6.연결객체해지(resource해지) close
		 */
		
		Class.forName(driverClass); // 오라클 드라이버만 로딩 생략가능한데, 다른 DBMS는 반드시 로딩을 해줘야 한다.
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(updateSQL);
		System.out.println(">> update row count : " + rowCount + " 행 update");
		
		stmt.close(); // 결과집합이 아니므로 resultset필요 없음
		con.close();
	}
}

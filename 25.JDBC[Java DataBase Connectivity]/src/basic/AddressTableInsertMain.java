package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddressTableInsertMain {

	public static void main(String[] args) throws Exception {
		/*****************데이타베이스접속정보***********/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		/***********************************************/
		String insertSQL = "insert into address values(address_no_seq.nextval, '인경호', '123-4568', '경기도 시흥시')";
		
		/*
		 1.Driver class loading
	     2.Connection 객체생성
		 3.Statement객체생성
		 4.SQL문전송(insert)
		 5.SQL문전송(insert)결과 영향받은행의수 반환
		 6.연결객체해지(resource해지) close
		 */
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(insertSQL);
		
		/*
		Statement 를 사용한 SQL문전송
		int executeUpdate(String sql) throws SQLException
			- Executes the given SQL statement, 
				which may be an INSERT, UPDATE, or DELETE statement 
				or an SQL statement that returns nothing, 
				such as an SQL DDL statement.
		Parameters:
			sql - an SQL Data Manipulation Language (DML) statement, 
				 such as INSERT, UPDATE or DELETE; 
				 ***** insert 성공하면 1, 실패하면 예외
				 ***** update나 delete는 0이나 그 이상
				 ***** select는 결과를 여러개 반환하고 아닌 것들은 영향받는 행만 반환
				 or an SQL statement that returns nothing, 
				 such as a DDL statement.
		Returns:
			either (1) the row count for SQL Data Manipulation Language (DML) statements or (2) 0 for SQL statements that return nothing
		 */
		
		System.out.println(">>insert row count : " + rowCount + " 행 insert");
		stmt.close(); // 결과집합이 아니므로 resultset필요 없음
		con.close();
	}

}

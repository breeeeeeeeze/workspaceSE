package dao.common;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 데이터베이스 설정정보를 사용해서
 Connection 객체를 생성하고, 해지하는 역할을 하는 클래스
 (DAO객체들이 사용하는 객체)
 */
public class DataSource {
	
	/*****************데이타베이스접속정보***********/
	private String driverClass = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
	private String user = "jdeveloper12";
	private String password = "jdeveloper12";
	/***********************************************/
	/*
	 * Connection 객체를 생성해서 반환하는 메소드
	 */
	public Connection getConnection() throws Exception { // 호출하는 애 입장에서는 connection을 주세요
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		return con;
	}
	
	/*
	 * Connection 객체를 close하는 메소드
	 * (참고 : DataSource가 Connection을 가지고 있진 않고, 이 것을 관리하는 클래스는 따로 있음(커넥션 풀))
	 */
	public void close(Connection con) throws Exception {
		con.close();
	}

}

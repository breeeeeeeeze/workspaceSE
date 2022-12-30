package dao.common;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/*
 데이터베이스 설정정보를 사용해서
 Connection 객체를 생성하고, 해지하는 역할을 하는 클래스
 (DAO객체들이 사용하는 객체)
 */
public class DataSource {
	/*****************데이타베이스접속정보***********/
	private String driverClass;
	private String url;
	private String user;
	private String password;
	/***********************************************/
	
	public DataSource() throws Exception {
		/***** jdbc.properties 파일을 읽어서 데이터베이스 접송정보를 필드에 저장 *****/
		Properties properties = new Properties();
		InputStream propertiesInput = DataSource.class.getResourceAsStream("/jdbc.properties");
		properties.load(propertiesInput);
		this.driverClass = properties.getProperty("driverClass");
		this.url = properties.getProperty("url");
		this.user = properties.getProperty("user");
		this.password = properties.getProperty("password");
	}	
	
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

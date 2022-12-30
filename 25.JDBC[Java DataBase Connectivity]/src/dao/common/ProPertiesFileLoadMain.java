package dao.common;

import java.io.InputStream;
import java.util.Properties;

public class ProPertiesFileLoadMain {

	public static void main(String[] args) throws Exception {

		/*
		    *.properties파일을 loading해서 Properties객체[Map] 를 만들어준다
		     
		 */

		Properties properties = new Properties();
		/*
		방법1(?). 이렇게 쓰지 말기
		FileInputStream fis 1= new FileInputStream("C:\\2022-11-JAVA-DEVELOPER\\workspaceSE\\25.JDBC[Java DataBase Connectivity]\\src\\jdbc.properties");
		System.out.println(fis1);
		*/
		/*
		방법2(?)
		System.out.println(System.getProperty("java.class.path"));
		FileInputStream fis2 = new FileInputStream(System.getProperty("java.class.path") + "/jdbc.properties");
		System.out.println(fis2);
		*/
		InputStream fis3 = DataSource.class.getResourceAsStream("/jdbc.properties"); // getResourceAsStreama메소드 /jdbc.properties파일을 만들기 위한 방법 중 하나
		//System.out.println(fis3);

		properties.load(fis3);

		/*
		 * << Properties 객체 >>
		 * ------------------------------------------------------
		 * key(String) | value(String)
		 * ------------------------------------------------------
		 * driverClass | oracle.jdbc.OracleDriver
		 * ------------------------------------------------------
		 * url		   | jdbc:oracle:thin:@182.237.126.19:1521:xe
		 * ------------------------------------------------------
		 * user		   | jdeveloper12
		 * ------------------------------------------------------
		 * password    | jdeveloper12
		 */

		System.out.println(properties.size());

		System.out.println(properties.getProperty("driverClass"));
		System.out.println(properties.getProperty("url", "jdbc:oracle:thin:@localhost:1521:xe")); // url이 있다면 쓰고 없으면
																									// 다음url을 반환해라
		System.out.println(properties.getProperty("user", "scott")); // user가 없다면 scott을 반환한다. 만약 user도 없고 이후에 기술한게 없으면
																		// null이 반환된다.
		System.out.println(properties.getProperty("password", "tiger"));

	}

}

package resultset;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import dao.common.DataSource;
/*
이름         널?       유형            
---------- -------- ------------- 
NO         NOT NULL NUMBER(7)     
NAME                VARCHAR2(50)  
SHORT_DESC          VARCHAR2(255) 
PRICE               NUMBER(10,3)  
IPGO_DATE           DATE          

 */
public class ResultSetMain {

	public static void main(String[] args) throws Exception {
		DataSource dataSource = new DataSource();
		
		String selectSQL = "select * from product";
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(selectSQL);
		ResultSet rs = pstmt.executeQuery();
		System.out.println("-------------ResultSet.get타입(\"컬럼이름\")---------------");
		while(rs.next()) {
			int no = rs.getInt("no");
			String name = rs.getString("name");
			String short_desc = rs.getString("short_desc");
			Double price = rs.getDouble("price");
			Date ipgo_date = rs.getDate("ipgo_date");
			System.out.println(no + "\t" + name + "\t" + short_desc + "\t" + price + "\t" + ipgo_date);
		}
		
		rs.close();
		// pstmt는 아직 안 닫음 -> 파싱된 sql문을 다시 사용할 것이니까 유용함
		// rs = null; close한 거랑 null값이랑 다름
		
		System.out.println("-------------ResultSet.get타입(\"컬럼index\")---------------");
		rs = pstmt.executeQuery(); // 새로운 참조로.. 대체된다?
		
		while(rs.next()) {
			int no = rs.getInt(1);
			String name = rs.getString(2);
			String short_desc = rs.getString(3);
			Double price = rs.getDouble(4);
			Date ipgo_date = rs.getDate(5);
			System.out.println(no + "\t" + name + "\t" + short_desc + "\t" + price + "\t" + ipgo_date);
		}
		
		rs.close();
		
		System.out.println("-------------ResultSet.getObject(\"컬럼이름\")---------------");
		rs = pstmt.executeQuery();
		while(rs.next()) {
			
			/* --------------------------
			 *    DB	   |	java
			 * --------------------------
			 *  number 	   |   BigDecimal
			 * -------------------------- 
			 */
			
			Object no = rs.getObject("no");
			Object name = rs.getObject("name");
			Object short_desc = rs.getObject("short_desc");
			Object price = rs.getObject("price");
			Object ipgo_date = rs.getObject("ipgo_date");
			System.out.println(no + "\t" + name + "\t" + short_desc + "\t" + price + "\t" + ipgo_date);
			/*
			System.out.println("no	     [number]-->"+no.getClass().getSimpleName());
			System.out.println("price    [number]-->"+price.getClass().getSimpleName());
			System.out.println("ipgo_date[Date  ]-->"+ipgo_date.getClass().getSimpleName());
			*/
		}
		
		rs.close();
		
		System.out.println("-------------ResultSet.getString(\"컬럼이름\")---------------");
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			String noStr = rs.getString("no"); // 빅데시..말.. bigdecimal
			String name = rs.getString("name");
			String short_desc = rs.getString("short_desc");
			String priceStr = rs.getString("price");
			String ipgo_dateStr= rs.getString("ipgo_date"); // date는 timestamp가 디폴트
			System.out.println(noStr + "\t" + name + "\t" + short_desc + "\t" + priceStr + "\t" + ipgo_dateStr);
		}
		
		rs.close();
		pstmt.close();
		dataSource.close(con);

	}

}

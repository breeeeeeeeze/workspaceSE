
package com.itwill.guest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.itwill.common.DataSource;



/*
 * Dao(Data[DataBase] Access Object)객체(클래스)
 *   - guest테이블에 CRUD(Create,Read,Update,Delet)작업을 하는 
 *     단위메쏘드를 가지고있는 객체(클래스)
 */

/*
============ 내가 보려고 쓰는 것 ==================
~~~ CRUD를 위한 단위 메소드 만들기 ~~~
1. DB접속 정보(나중에 config 파일로 뺄 것임)
2. 반환 타입, 받을 인자 유무와 타입 체크하기
3. sql문 작성하기(문법 유의)
4. JDBC flow에 따라 드라이버 로딩 ~ 커넥트하기(select는 resultset, 커서사용 잊지말기)
4-1. PreparedStatement 사용하기(날짜에 유의)
5. 각 기능의 특징을 생각해서 반환 타입에 주의하기
*/

public class GuestDao {
	
	private DataSource dataSource;

	public GuestDao() throws Exception {
		dataSource = new DataSource();
	}
	
	public int insert(Guest guest) throws Exception {
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(GuestSQL.GUEST_INSERT);
		
		Date guestDate = new Date();
		
		/*
		 * 파라메타세팅
		 */
		pstmt.setString(1, guest.getGuest_name());
		pstmt.setDate(2, new java.sql.Date(guestDate.getTime()));
		pstmt.setString(3, guest.getGuest_email());
		pstmt.setString(4, guest.getGuest_homepage());
		pstmt.setString(5, guest.getGuest_title());
		pstmt.setString(6, guest.getGuest_content());
		
		int rowCount = pstmt.executeUpdate();
		System.out.println(">> " + rowCount + "행 Insert");
		
		pstmt.close();
		dataSource.close(con);
	
		return rowCount;
	}

	public int update(Guest guest) throws Exception {

		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(GuestSQL.GUEST_UPDATE);
		
		Date guestDate = new Date();
		
		/*
		 * 파라메타세팅
		 */
		pstmt.setString(1, guest.getGuest_name());
		pstmt.setDate(2, new java.sql.Date(guestDate.getTime()));
		pstmt.setString(3, guest.getGuest_email());
		pstmt.setString(4, guest.getGuest_homepage());
		pstmt.setString(5, guest.getGuest_title());
		pstmt.setString(6, guest.getGuest_content());
		pstmt.setInt(7, guest.getGuest_no());
		
		int rowCount = pstmt.executeUpdate();
		System.out.println(">> " + rowCount + "행 Update");
		
		pstmt.close();
		dataSource.close(con);
		
		return rowCount;
	}

	public int delete(int no) throws Exception {
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(GuestSQL.GUEST_DELETE);
		/*
		 * 파라메타세팅
		 */
		pstmt.setInt(1, no);
		
		int rowCount = pstmt.executeUpdate();
		System.out.println(">> " + rowCount + "행 Delete");
		
		pstmt.close();
		dataSource.close(con);
		
		return rowCount;
	}

	public Guest findByPrimaryKey(int no) throws Exception {

		Guest findGuest = null;
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(GuestSQL.GUEST_SELECT_BY_NO);
		/*
		 * 파라메타세팅
		 */
		pstmt.setInt(1, no);
		ResultSet rs = pstmt.executeQuery();
		
		if (rs.next()) {
			int n = rs.getInt("guest_no");
			String name = rs.getString("guest_name");
			Date date = rs.getDate("guest_date");
			String email = rs.getString("guest_email");
			String homepage = rs.getString("guest_homepage");
			String title = rs.getString("guest_title");
			String content = rs.getString("guest_content");
//			findGuest = new Guest(n, name, date, email, homepage, title, content);
			System.out.println(findGuest);
		} else {
			System.out.println("조건에 만족하는 guest가 없습니다.");
//			findGuest = null;
		}
		
		rs.close();
		pstmt.close();
		dataSource.close(con);
		
		return findGuest;
	}

	public List<Guest> findAll() throws Exception {

		List<Guest> guestList = new ArrayList<Guest>();
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(GuestSQL.GUEST_SELECT_ALL);
		/*
		 * 파라메타세팅
		 */
		ResultSet rs = pstmt.executeQuery();
		
		 while(rs.next()) {
			Guest guest=
					new Guest(rs.getInt("guest_no"),
							  rs.getString("guest_name"),
							  rs.getDate("guest_date"),
							  rs.getString("guest_email"),
							  rs.getString("guest_homepage"),
							  rs.getString("guest_title"), 
							  rs.getString("guest_content"));
			guestList.add(guest);
		}
		
		rs.close();
		pstmt.close();
		dataSource.close(con);
		
		return guestList;
	}
}

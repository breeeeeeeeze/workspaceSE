package dao.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dao.common.DataSource;

/*
 * Dao(Data[DataBase] Access Object)객체
 * 		- member(회원) 데이타를 저장하고있는 테이블에
 *        CRUD(Create,Read,Update,Delete)작업을 할수있는 
 *        단위메쏘드를 가지고있는 클래스
 */
public class MemberDao {

	public MemberDao() throws Exception {
		dataSource = new DataSource();
	}
	
	private DataSource dataSource;
	
	/*
	 이름         널?       유형            
	---------- -------- ------------- 
	M_ID       NOT NULL VARCHAR2(20)  
	M_PASSWORD NOT NULL VARCHAR2(20)  
	M_NAME     NOT NULL VARCHAR2(50)  
	M_ADDRESS           VARCHAR2(100) 
	M_AGE               NUMBER(3)     
	M_MARRIED           CHAR(1)       
	M_REGDATE           DATE        
	 */

	public int insert(Member m) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MemberSQL.MEMBER_INSERT);
		
		Date date = new Date();
		
		pstmt.setString(1, m.getM_id());
		pstmt.setString(2, m.getM_password());
		pstmt.setString(3, m.getM_name());
		pstmt.setString(4, m.getM_address());
		pstmt.setInt(5, m.getM_age());
		pstmt.setString(6, String.valueOf(m.getM_age()));
		pstmt.setDate(7, new java.sql.Date(date.getTime()));
		
		int rowCount = pstmt.executeUpdate();
		
		pstmt.close();
		dataSource.close(con);
		
		return rowCount;
	}

	public int update(Member m) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MemberSQL.MEMBER_UPDATE);
		
		Date date = new Date();
		
		pstmt.setString(1, m.getM_password());
		pstmt.setString(2, m.getM_name());
		pstmt.setString(3, m.getM_address());
		pstmt.setInt(4, m.getM_age());
		pstmt.setString(5, String.valueOf(m.getM_age()));
		pstmt.setDate(6, new java.sql.Date(date.getTime()));
		pstmt.setString(7, m.getM_id());

		int rowCount = pstmt.executeUpdate();
		
		pstmt.close();
		dataSource.close(con);
		
		return rowCount;
	}

	public int delete(String id) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MemberSQL.MEMBER_DELETE);
		pstmt.setString(1, id);
		
		int rowCount = pstmt.executeUpdate();
		
		pstmt.close();
		dataSource.close(con);
		
		return rowCount;
	}

	public Member findByPrimaryKey(String id) throws Exception {
		Member findMember = null;
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MemberSQL.MEMBER_SELECT_BY_NO);
		pstmt.setString(1, id);
		ResultSet rs = pstmt.executeQuery();
		
		if (rs.next()) {
			String i = rs.getString("m_id");
			String pw = rs.getString("m_password");
			String name = rs.getString("m_name");
			String address = rs.getString("m_address");
			int age = rs.getInt("m_age");
			char married = rs.getString("m_married").charAt(0);
			Date regdate = rs.getDate("m_regdate");
			findMember = new Member(i, pw, name, address, age, married, regdate);
		} else {
			findMember = null;
			System.out.println("member가 존재하지 않습니다.");
		}
		
		rs.close();
		pstmt.close();
		dataSource.close(con);
		
		return findMember;
	}

	public List<Member> findAll() throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MemberSQL.MEMBER_SELECT_ALL);
		ResultSet rs = pstmt.executeQuery();
		
		List<Member> memberList = new ArrayList<Member>();
		
		if (rs.next()) {
			do {
				String i = rs.getString("m_id");
				String pw = rs.getString("m_password");
				String name = rs.getString("m_name");
				String address = rs.getString("m_address");
				int age = rs.getInt("m_age");
				char married = rs.getString("m_married").charAt(0);
				Date regdate = rs.getDate("m_regdate");
				Member member = new Member(i, pw, name, address, age, married, regdate);
				memberList.add(member);
			} while (rs.next());
		} else {
			System.out.println("member가 존재하지 않습니다.");
		}

		rs.close();
		pstmt.close();
		dataSource.close(con);
		
		return memberList;

	}
}

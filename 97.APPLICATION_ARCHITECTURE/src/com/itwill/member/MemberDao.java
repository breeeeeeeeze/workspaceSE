package com.itwill.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.itwill.common.DataSource;

/*
 * Dao(Data[DataBase] Access Object)객체
 * 		- member(회원) 데이타를 저장하고있는 테이블에
 *        CRUD(Create,Read,Update,Delete)작업을 할수있는 
 *        단위메쏘드를 가지고있는 클래스
 */
public class MemberDao {

	/*
	 * Dao 객체는멤버변수로 Connection을 생성하는 DataSource객체를 가짐
	 */
	private DataSource dataSource;
	public MemberDao()  throws Exception{
		dataSource=new DataSource();
	}
	
	
	public int insert(Member newMember) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(MemberSQL.MEMBER_INSERT);
		pstmt.setString(1,newMember.getM_id());
		pstmt.setString(2,newMember.getM_password());
		pstmt.setString(3,newMember.getM_name());
		pstmt.setString(4,newMember.getM_address());
		pstmt.setInt(5, newMember.getM_age());
		pstmt.setString(6, newMember.getM_married());
		int insertRowCount=pstmt.executeUpdate();
		return insertRowCount;
	}
	public int update(Member updateMember)throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(MemberSQL.MEMBER_UPDATE);
		pstmt.setString(1, updateMember.getM_password());
		pstmt.setString(2, updateMember.getM_name());
		pstmt.setString(3, updateMember.getM_address());
		pstmt.setInt(4, updateMember.getM_age());
		pstmt.setString(5, updateMember.getM_married());
		//pstmt.setDate(6,new  java.sql.Date(updateMember.getM_regdate().getTime()));
		pstmt.setString(6, updateMember.getM_id());
		int updateRowCount = pstmt.executeUpdate();
		return updateRowCount;
	}
	public int delete(String m_id) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(MemberSQL.MEMBER_DELETE);
		pstmt.setString(1, m_id);
		int deleteRowCount=pstmt.executeUpdate();
		return deleteRowCount;
	}
	public Member findByPrimaryKey(String m_id)throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(MemberSQL.MEMBER_SELECT_BY_ID);
		pstmt.setString(1,m_id);
		ResultSet rs=pstmt.executeQuery();
		
		Member findMember=null;
		if(rs.next()) {
			findMember=new Member( 
						rs.getString("m_id"),
						rs.getString("m_password"),
						rs.getString("m_name"),
						rs.getString("m_address"),
						rs.getInt("m_age"),
						rs.getString("m_married"),
						rs.getDate("m_regdate"));
		}
		return findMember;
	}
	public ArrayList<Member> findAll() throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(MemberSQL.MEMBER_SELECT_ALL);
		ResultSet rs=pstmt.executeQuery();
		ArrayList<Member> memberList=new ArrayList<Member>();
		while(rs.next()) {
			memberList.add(new Member(
						rs.getString("m_id"),
						rs.getString("m_password"),
						rs.getString("m_name"),
						rs.getString("m_address"),
						rs.getInt("m_age"),
						rs.getString("m_married"),
						rs.getDate("m_regdate"))
					 );
		}
		return memberList;
	}
}

/*package com.itwill.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.itwill.common.DataSource;



 * Dao(Data[DataBase] Access Object)객체
 * 		- member(회원) 데이타를 저장하고있는 테이블에
 *        CRUD(Create,Read,Update,Delete)작업을 할수있는 
 *        단위메쏘드를 가지고있는 클래스
 
public class MemberDao {

	public MemberDao() throws Exception {
		dataSource = new DataSource();
	}
	
	private DataSource dataSource;
	
	
	 이름         널?       유형            
	---------- -------- ------------- 
	M_ID       NOT NULL VARCHAR2(20)  
	M_PASSWORD NOT NULL VARCHAR2(20)  
	M_NAME     NOT NULL VARCHAR2(50)  
	M_ADDRESS           VARCHAR2(100) 
	M_AGE               NUMBER(3)     
	M_MARRIED           CHAR(1)       
	M_REGDATE           DATE        
	 

	public int insert(Member m) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MemberSQL.MEMBER_INSERT);
		
		pstmt.setString(1, m.getM_id());
		pstmt.setString(2, m.getM_password());
		pstmt.setString(3, m.getM_name());
		pstmt.setString(4, m.getM_address());
		pstmt.setInt(5, m.getM_age());
		pstmt.setString(6, m.getM_married());
		
		int rowCount = pstmt.executeUpdate();
		
		pstmt.close();
		dataSource.close(con);
		
		return rowCount;
	}

	public int update(Member m) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MemberSQL.MEMBER_UPDATE);
		
		pstmt.setString(1, m.getM_password());
		pstmt.setString(2, m.getM_name());
		pstmt.setString(3, m.getM_address());
		pstmt.setInt(4, m.getM_age());
		pstmt.setString(5, m.getM_married());
//		pstmt.setDate(6, new java.sql.Date(date.getTime()));
		pstmt.setString(6, m.getM_id());

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
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MemberSQL.MEMBER_SELECT_BY_NO);
		pstmt.setString(1, id);
		ResultSet rs = pstmt.executeQuery();
		
		Member findMember = null;
		if (rs.next()) {
			findMember = new Member(rs.getString("m_id"), 
									rs.getString("m_password"), 
									rs.getString("m_name"),
									rs.getString("m_address"), 
									rs.getInt("m_age"), 
//									rs.getString("m_married").charAt(0),
									rs.getString("m_married"),
									rs.getDate("m_regdate"));
		} else {
			findMember = null;
//			System.out.println("member가 존재하지 않습니다.");
		}
		
//		Member findMember = null;
//		if (rs.next()) {
//			String i = rs.getString("m_id");
//			String pw = rs.getString("m_password");
//			String name = rs.getString("m_name");
//			String address = rs.getString("m_address");
//			int age = rs.getInt("m_age");
//			char married = rs.getString("m_married").charAt(0);
//			Date regdate = rs.getDate("m_regdate");
//			findMember = new Member(i, pw, name, address, age, married, regdate);
//		} else {
//			findMember = null;
//			System.out.println("member가 존재하지 않습니다.");
//		}
		
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
//				char married = rs.getString("m_married").charAt(0);
				String married = rs.getString("m_married");
				Date regdate = rs.getDate("m_regdate");
				Member member = new Member(i, pw, name, address, age, married, regdate);
				memberList.add(member);
			} while (rs.next());
		} else {
//			System.out.println("member가 존재하지 않습니다.");
		}

		rs.close();
		pstmt.close();
		dataSource.close(con);
		
		return memberList;

	}
}
*/
package dao.member;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
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
	
	private DataSource dataSource = new DataSource();

	public int insert(Member m) throws Exception {
		
		String insertSQL = "insert into member values('" + m.getM_id() + "','" + m.getM_password() + "', '" + m.getM_name() + "','" + m.getM_address() + "', '" + m.getM_age() + "','" + m.getM_married() + "',"
				+ "sysdate" + ")";

		Connection con = dataSource.getConnection();
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(insertSQL);
		System.out.println(">> " + rowCount + "행 insert");
		
		stmt.close();
		con.close();
		
		return rowCount;
	}

	public int update(Member m) throws Exception {
		
		String updateSQL = "update member set m_password = '" + m.getM_password() + "',m_name = '" + m.getM_name() 
						+ "',m_address = '" + m.getM_address() + "',m_age = '" + m.getM_age()
						+ "',m_married = '" + m.getM_married() + "' where m_id = " + "'" + m.getM_id() + "'";
		
		
//		String updateSQL = "update member set m_id = '" + m.getM_id() + "','" + m.getM_password() + "', '" + m.getM_name() + "','" + m.getM_address() + "', '" + m.getM_age() + "','" + m.getM_married() + "',"
//				+ "sysdate" +"' where m_id="+"'"+m.getM_id()+"'";
		
	/*
	 * String updateSQL = "update member set m_password='"+updateMember.getM_password()+"', 
	 * m_name='"+updateMember.getM_name()+"'
	 * , m_address='"+updateMember.getM_address()+"'
	 * , m_age="+updateMember.getM_age()+"
	 * , m_married='"+updateMember.getM_married()+"'
	 * , m_regdate=sysdate where m_id='"
	 * +updateMember.getM_id()+"'";		
	 */
		
		Connection con = dataSource.getConnection();
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(updateSQL);
		System.out.println(">> " + rowCount + "행 update");
		
		stmt.close();
		con.close();
		
		return rowCount;
	}

	public int delete(String id) throws Exception {
		String deleteSQL = "delete member where m_id = " + id;
		
		Connection con = dataSource.getConnection();
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(deleteSQL);
		System.out.println(">> " + rowCount + "행 delete");
		
		stmt.close();
		con.close();
		
		return rowCount;
	}

	public Member findByPrimaryKey(String id) throws Exception {
		String selectSQL = "select * from member where m_id = " + id;

		Member findMember = null;
		
		Connection con = dataSource.getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectSQL);
		
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
		stmt.close();
		con.close();
		
		return findMember;
	}

	public List<Member> findAll() throws Exception {
		String selectSQL = "select * from member";
		
		Connection con = dataSource.getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectSQL);
		
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
		stmt.close();
		con.close();
		
		return memberList;

	}
}

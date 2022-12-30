package dao.emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dao.common.DataSource;

public class EmpDao {
	private DataSource dataSource;
	
	public EmpDao() throws Exception {
		dataSource = new DataSource();
	}
	
	public void findByPrimaryKey(int empno) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(EmpSQL.SELECT_BY_EMPNO_EMP_DEPT);
		pstmt.setInt(1, empno);
		ResultSet rs = pstmt.executeQuery();
		
		// if문으로 써도 된다 하나만 뽑을거니까
		while (rs.next()) {
			/*** emp table ***/
			int eno = rs.getInt("empno");
			String ename = rs.getString("ename");
			String job = rs.getString("job");
			
			/*** dept table ***/
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			// 만약 deptno 둘 다 뽑는다면...? 이럴 일은 별로 없지만 alias를 줘야함.
			
			System.out.println(eno + "\t" + ename + "\t" + job + "\t" + dname + "\t" + loc);
			
		}
		
	}
	
	public void findByAllWithDept(int empno) {
		
	}
	
}

package dao.emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dao.common.DataSource;

public class EmpDao {
	private DataSource dataSource;
	
	public EmpDao() throws Exception {
		dataSource = new DataSource();
	}
	/*
	 * join연산결과는 map으로 매핑한다.
	 */

	public Map findByPrimarKeyWithDept(int empno) throws Exception { // generic을 지정할 수 없음 뭐가 나올지 몰라서
		Map rowMap = new HashMap(); // generic을 지정할 수 없음 뭐가 나올지 몰라서
		
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
			
			// 어떻게 받을 것인가를 아래에 기술할 것
			rowMap.put("EMPNO", eno); // 대문자로 매핑을 권장(Mytabis..때문에?) // 박싱되서 int 객체로 들어간다..? // 나중엔 직접할 일은 많지 않을 것
			rowMap.put("ENAME", ename);
			rowMap.put("JOB", job);
			rowMap.put("ENAME", dname);
			rowMap.put("LOC", loc);
		}
		rs.close();
		pstmt.close();
		dataSource.close(con);
		
		return rowMap;
	}
	
	public List<Map> findByAllWithDept() throws Exception{
		List<Map> rowMapList = new ArrayList<Map>();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(EmpSQL.SELECT_BY_ALL_EMP_DEPT);
		ResultSet rs = pstmt.executeQuery();
		
		while (rs.next()) {
			Map rowMap = new HashMap();
			/*** emp table ***/
			int eno = rs.getInt("empno");
			String ename = rs.getString("ename");
			String job = rs.getString("job");
			
			/*** dept table ***/
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			// 만약 deptno 둘 다 뽑는다면...? 이럴 일은 별로 없지만 alias를 줘야함.
			
			// 어떻게 받을 것인가를 아래에 기술할 것
			rowMap.put("EMPNO", eno); // 대문자로 매핑을 권장(Mytabis..때문에?) // 박싱되서 int 객체로 들어간다..? // 나중엔 직접할 일은 많지 않을 것
			rowMap.put("ENAME", ename);
			rowMap.put("JOB", job);
			rowMap.put("ENAME", dname);
			rowMap.put("LOC", loc);
			
			rowMapList.add(rowMap);
		}
		rs.close();
		pstmt.close();
		dataSource.close(con);
		
		return rowMapList;
	}
	
}

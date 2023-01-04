package com.itwill.member.test;

import com.itwill.member.Member;
import com.itwill.member.MemberDao;
public class MemberDaoTestMain {
	public static void main(String[] args) throws Exception {
		MemberDao memberDao=new MemberDao();
		System.out.println("0.delete   --> "+memberDao.delete("dddd"));
		System.out.println("1.insert   --> "+memberDao.insert(new Member("dddd", "dddd", "디디디", "서울시", 34, "T", null)));
		System.out.println("2.update   --> "+memberDao.update(new Member("dddd", "dddd", "디변경", "부산시", 37, "F", null)));
		System.out.println("3.selectById-> "+memberDao.findByPrimaryKey("dddd"));
		System.out.println("4.selectAll--> "+memberDao.findAll());
	}
}

/*
package com.itwill.member.test;

import java.util.List;

import com.itwill.member.Member;
import com.itwill.member.MemberDao;

public class MemberDaoTestMain {

	public static void main(String[] args) throws Exception {
		MemberDao memberDao = new MemberDao();
		
		System.out.println("---------- 0.delete ----------");
		int rowCount = memberDao.delete("bbbb");
		System.out.println(rowCount + "행 delete 성공");
		
		System.out.println("---------- 1.insert ----------");
		Member insertMember = new Member("tttt", "비밀번호", "LEE", "강원", 27, "M", null);
		rowCount = memberDao.insert(insertMember);
		System.out.println(rowCount + "행 insert 성공");
		
		System.out.println("---------- 2.update ----------");
		Member updateMember = new Member("tttt", "pw", "KIM", "경기", 37, "F", null);
		rowCount = memberDao.update(updateMember);
		System.out.println(rowCount + "행 update 성공");
		
		System.out.println("---------- 3.selectById ----------"); 
		Member findMember = memberDao.findByPrimaryKey("tttt");
		System.out.println(findMember);
		
		memberDao.findByPrimaryKey("zzz");
		
		System.out.println("---------- 4.selectAll ----------");
		List<Member> memberList = memberDao.findAll();
		System.out.println(memberList);
	}

}
*/

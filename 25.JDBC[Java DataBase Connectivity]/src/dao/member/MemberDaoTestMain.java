package dao.member;

import java.util.List;

public class MemberDaoTestMain {

	public static void main(String[] args) throws Exception {
		MemberDao memberDao = new MemberDao();
		
		Member insertMember = new Member("eeee", "비밀번호", "LEE", "NY", 27, 'F', null);
		int rowCount = memberDao.insert(insertMember);
		System.out.println("0.insert   --> " + rowCount + "행 insert");
		
		rowCount = memberDao.delete("'eeee'");
		System.out.println("1.delete   --> " + rowCount + "행 delete");
		
		Member updateMember = new Member("cccc", "pw", "KIM", "경기", 37, 'F', null);
		rowCount = memberDao.update(updateMember);
		System.out.println("2.update   --> " + rowCount + "행 update");
		
		Member findMember = memberDao.findByPrimaryKey("'bbbb'");
		if (findMember != null) {
			System.out.println(findMember);
		} else {
			System.out.println("3.selectById-> member가 존재하지 않습니다.");
		}
		System.out.println("3.selectById-> " + memberDao.findByPrimaryKey("'zzz'"));
		
		System.out.println("4.selectAll--> ");
		List<Member> memberList = memberDao.findAll();
		System.out.println(memberList);
	}

}

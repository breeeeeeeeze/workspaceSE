package com.itwill.member;

import java.util.List;

public class cloneMemberService {
	private MemberDao memberDao;
	
	public cloneMemberService() throws Exception {
		memberDao = new MemberDao();
	}
	
	/*
	 * 회원가입
	 * 	- 아이디가 중복된 경우에는 메세지를 띄운다.
	 */
	public boolean addMember(Member newMember) throws Exception {
		/*
		 * 아이디존재여부체크
		 * 	- 존재하면 메세지
		 *  - 존재안하면 가입
		 */
		boolean isSuccess = false;
		if (memberDao.findByPrimaryKey(newMember.getM_id()) == null) {
			isSuccess = true;
		} else {
			isSuccess = false;
		}
		
		return isSuccess;
	}
	
	/*
	 * 회원 로그인
	 */
	public int login(String id, String password) throws Exception {
		/*
		 * 0:성공
		 * 1:아이디존재안함
		 * 2:패쓰워드불일치
		 */
		int loginResult = -9999;
		Member findMember = memberDao.findByPrimaryKey(id);
		if (findMember == null) {
			loginResult = 1;
		} else {
			loginResult = 0;
			if (password.equals(findMember.getM_password())) {
				loginResult = 0;
			} else {
				loginResult = 2;
			}
		}
		return loginResult;
	}
	
	/*
	 * 회원 아이디 중복체크
	 */
	public boolean isDuplicateId(String id) throws Exception {
		Member findMemberId = memberDao.findByPrimaryKey(id);
		if (findMemberId == null) {
			return false;
		}else {
			return true;
		}
	}
	
	/*
	 * 회원 상세보기
	 */
	public Member memberDetail(String id) throws Exception {
		return memberDao.findByPrimaryKey(id);
	}
	
	/*
	 * 회원수정
	 */
	public int memberUpdate(Member member) throws Exception {
		return memberDao.update(member);
	}
	
	/*
	 * 회원탈퇴
	 */
	public int memberDelete(String id) throws Exception {
		return memberDao.delete(id);
	}
	
	/*
	 * 회원전체리스트
	 */
	
	public List<Member> memberList() throws Exception {
		return memberDao.findAll();
	}
	
	/* admin
	 * 회원전체검색
	 * 회원이름으로검색
	 * 회원주소로검색
	 * 회원나이로검색
	 * 회원결혼여부로검색
	 * 회원가입일로검색
	 */
	
	/*
	 ************** DAO에서 메소드를 만들어야하나??? *************
	 ************* SQL도 작성하고?????? *********************
	public List<Member> findByName(String name) throws Exception {
		List<Member> findMembers = null;
		Member findMember = new Member();
		for (int i = 0; i < memberDao.findAll().size(); i++) {
			if (memberDao.findAll().equals(name)) {
				findMember = ;
				return findMembers;
				break;
			} else {
				System.out.println("존재하지 않는 회원입니다.");
			}
		}
	}
	 */
}

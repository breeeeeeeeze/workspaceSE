package com.itwill.member;

public class MemberService {
	private MemberDao memberDao;
	public MemberService() throws Exception {
		memberDao = new MemberDao();
	}
	
	/*
	 * 회원가입
 	 * 	- 아이디가 중복된 경우에는 메시지를 띄운다.
	 */
	public boolean addMember(Member newMember) throws Exception{
		boolean isSuccess = false;
		/*
		 * 아이디 존재여부 체크
		 * 	- 존재하면 메시지
		 *  - 존재하지 않으면 가입
		 */
		if (memberDao.findByPrimaryKey(newMember.getM_id()) == null) {
			int rowCount = memberDao.insert(newMember);
			isSuccess = true;
		}else {
			isSuccess = false;
			// 서비스에서는 메시지를 띄울 필요는 없음(UI에서 띄울 것)
		}
		
		return isSuccess;
	}
	
	/*
	 * 회원 로그인
	 */
	public int login(String id, String password) throws Exception {
		/*
		 * 0 : 성공
		 * 1 : 아이디 존재안함
		 * 2 : 패스워드 불일치
		 */
		int loginResult = -9999; // 의미 없는 값 주기
		Member findMember = memberDao.findByPrimaryKey(id);
		if (findMember == null) {
			// 아이디 존재안함
			loginResult = 1;
		} else {
			// 아이디 존재함
			if (password.equals(findMember.getM_password())) { 
			// (생각해보기)findMember.getM_password()는 잘 생각해보면 member(DTO)가 해야할 일..
				// 패스워드 일치
				loginResult = 0;
			} else {
				// 패스워드 불일치
				loginResult = 2;
			}
		}
		return loginResult;
	}
	
	/*
	 * 회원 아이디 중복체크
	 * 이 기능이 왜 서비스에 있어야하는가? -> 회원가입 시 중복체크해야 하니까?
	 */
	// 서비스에서 DAO에 접근하는 원칙 잊지말기 클라이언트 -> 서비스 -> DAO
	public boolean isDuplicateId(String id) throws Exception {
		Member findMember = memberDao.findByPrimaryKey(id);
		if (findMember == null) {
			return false;
		} else {
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
	 * 회원 수정
	 */
	public int memberUpdate(Member member) throws Exception {
		return memberDao.update(member);
	}
	
	/*
	 * 회원 삭제
	 */
	public int memberDelete(String id) throws Exception {
		return memberDao.delete(id);
	}

	/*
	 * admin
	 * 회원전체검색
	 * 회원이름으로검색
	 * 회원주소로검색
	 * 회원나이로검색
	 * 회원결혼여부로검색
	 * 회원가입일로검색
	 */
	
	
	
	
	
	
	

}
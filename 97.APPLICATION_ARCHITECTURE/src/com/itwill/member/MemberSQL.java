package com.itwill.member;

public class MemberSQL {
	public MemberSQL() {
	}
	public final static String MEMBER_INSERT = "insert into member values(?, ?, ?, ?, ?, ?, ?)";
	public final static String MEMBER_UPDATE = "update member set m_password =?, m_name = ?, m_address = ?, m_age = ?, m_married = ?, m_regdate = ? where m_id = ?";
	/*
	강사님 코드 : regdate는 수정하지 않기로 함(등록 날짜니까)
	public final static String MEMBER_UPDATE = "update member set m_password =?, m_name = ?, m_address = ?, m_age = ?, m_married = ?, where m_id = ?";
	 */
	public final static String MEMBER_DELETE = "delete member where m_id = ?";
	public final static String MEMBER_SELECT_BY_NO = "select * from member where m_id = ?";
	public final static String MEMBER_SELECT_ALL = "select * from member";
}

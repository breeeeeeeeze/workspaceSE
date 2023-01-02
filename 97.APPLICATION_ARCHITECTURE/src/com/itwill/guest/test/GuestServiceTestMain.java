package com.itwill.guest.test;

import com.itwill.guest.Guest;
import com.itwill.guest.GuestService;

public class GuestServiceTestMain {

	public static void main(String[] args) throws Exception{
		GuestService guestService = new GuestService();
		System.out.println("1. 방명록 쓰기");
		Guest newGuest = new Guest(1561, "asfd", null, "asdf@asdf.com", "asdffsfa.co.kr", "제목 입력", "내용 입력");
		guestService.guestWrite(newGuest);
		System.out.println("2. 방명록 수정");
		System.out.println("3. 방명록 삭제");
		System.out.println("4. 방명록 1개 보기");
		System.out.println("5. 방명록 이름으로 검색 보기");
		System.out.println("6. 방명록 리스트보기");

	}

}

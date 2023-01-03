package com.itwill.guest.test;

import com.itwill.guest.Guest;
import com.itwill.guest.GuestService;

public class GuestServiceTestMain {

	public static void main(String[] args) throws Exception{
		GuestService guestService = new GuestService();
		System.out.println("1. 방명록 쓰기");
		Guest newGuest = new Guest(0, "zzz", null, "asdffasd@asdf.com", "asdffsfa.co.kr", "제목 입력", "내용 입력");
		guestService.guestWrite(newGuest);
		
		System.out.println("2. 방명록 수정");
		Guest updateGuest = new Guest(3, "dd", null, "zzzz@mail.com", "abcd.com", "titititititi", "conconconcon");
		guestService.guestUpdate(updateGuest);
		
		System.out.println("3. 방명록 삭제");
		guestService.guestDelete(3);
		
		System.out.println("4. 방명록 1개 보기");
		guestService.guestDetail(2); // 존재하는 번호
		guestService.guestDetail(1); // 존재하지 않는 번호
		
		System.out.println("5. 방명록 이름으로 검색 보기");
		System.out.println(guestService.findByGuestName("zzz"));	// 존재하는 이름
		System.out.println(guestService.findByGuestName("empty"));	// 존재하지 않는 이름
		
		System.out.println("6. 방명록 리스트보기");
		System.out.println(guestService.guestList());

	}

}

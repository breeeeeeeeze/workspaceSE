package com.itwill.guest.test;

import java.util.List;

import com.itwill.guest.Guest;
import com.itwill.guest.GuestDao;

public class GuestDaoTestMain {

	public static void main(String[] args) throws Exception {
		GuestDao guestDao = new GuestDao();
		
		System.out.println("1.insert");
		Guest insertGuest = new Guest(0, "PARK", null, "eee@email.com", "homepage.co.kr", "titletitle", "concon");
		guestDao.insert(insertGuest);
		
		System.out.println("2.delete");
		guestDao.delete(10);
		
		System.out.println("3.update");
		Guest updateGuest = new Guest(10, "KIM", null, "abcde@gmail.com", "homepag.com", "글 제목", "내용");
		guestDao.update(updateGuest);
		
		System.out.println("4.findByPrimarykey");
		guestDao.findByPrimaryKey(1);
		guestDao.findByPrimaryKey(2);
		
		System.out.println("5.findAll");
		List<Guest> guestList = guestDao.findAll();
		System.out.println(guestList);
		
		/*
 		GuestDao guestDao=new GuestDao();
		System.out.println("1.insert");
		Guest insertGuest=new Guest(0,"김봉선",null,"bong@gmail.com","www.jbs.co.kr","타이틀","내용");
		System.out.println(">> "+guestDao.insert(insertGuest));
		System.out.println("2.delete");
		System.out.println(">> "+ guestDao.delete(1));
		System.out.println("4.findByPrimarykey");
		Guest findGuest=guestDao.findByPrimaryKey(2);
		System.out.println(">>"+findGuest);
		System.out.println("3.update");
		findGuest.setGuest_title("변경타이틀");
		findGuest.setGuest_content("우와 재미있네요ㅠㅠㅠ");
		System.out.println(">> "+guestDao.update(findGuest));
		
		System.out.println("5.findAll");
		System.out.println(">>"+guestDao.findAll());
		 */
		
	}

}

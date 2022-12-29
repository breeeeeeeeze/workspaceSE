package dao.guest;

import java.util.List;

public class GuestDaoTestMain {

	public static void main(String[] args) throws Exception {
		GuestDao guestDao = new GuestDao();
		
		System.out.println("1.insert");
		Guest insertGuest = new Guest(0, "PARK", null, "eee@email.com", "homepage.co.kr", "titletitle", "concon");
		guestDao.insert(insertGuest);
		
		System.out.println("2.delete");
		guestDao.delete(2);
		
		System.out.println("3.update");
		Guest updateGuest = new Guest(10, "KIM", null, "abcde@gmail.com", "homepag.com", "글 제목", "내용");
		guestDao.update(updateGuest);
		
		System.out.println("4.findByPrimarykey");
		guestDao.findByPrimaryKey(1);
		guestDao.findByPrimaryKey(2);
		
		System.out.println("5.findAll");
		List<Guest> guestList = guestDao.findAll();
		System.out.println(guestList);
		
	}

}

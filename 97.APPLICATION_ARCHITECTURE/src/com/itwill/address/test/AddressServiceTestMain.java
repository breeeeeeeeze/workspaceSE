package com.itwill.address.test;

import com.itwill.address.Address;
import com.itwill.address.AddressService;

public class AddressServiceTestMain {

	public static void main(String[] args) throws Exception{
		AddressService addressService = new AddressService();

		System.out.println("1. 주소록 쓰기");
		Address newAddress = new Address(0, "test", "111-1111", "LA");
		System.out.println(">> " + addressService.addressWrite(newAddress));
		
		System.out.println("2. 주소록 번호로 검색");
		Address findAddress = addressService.addressDetail(17);
		System.out.println(">> " + findAddress);
		
		System.out.println("3. 주소록 수정");
		findAddress.setAddress("주소변경");
		findAddress.setName("이름변경");
		findAddress.setPhone("333-1234");
		System.out.println(">> " + addressService.addressUpdate(findAddress));
		System.out.println(">> " + addressService.addressDetail(17));
		
		System.out.println("3. 주소록 삭제");
		System.out.println(">> " + addressService.addressDelete(2));
		System.out.println(">> " + addressService.addressDelete(3));
		
		System.out.println("4. 주소록 전체 검색");
		System.out.println(">> " + addressService.addressList());

	}

}

package com.itwill.address;

import java.util.List;

public class AddressService {
	private AddressDao addressDao;
	public AddressService() throws Exception {
		addressDao = new AddressDao();
	}
	
	/*
	 * 주소록 쓰기
	 */
	public int addressWrite(Address address) throws Exception {
		return addressDao.insert(address);
	}
	
	/*
	 * 주소록 번호(pk)로 1개 보기
	 */
	public Address addressDetail(int no) throws Exception {
		return addressDao.findByPrimaryKey(no);
	}
	
	/*
	 * 주소록 번호로 1개 수정
	 */
	public int addressUpdate(Address updateAddress) throws Exception {
		return addressDao.update(updateAddress);
	}
	
	/*
	 * 주수록 번호로 삭제하기 (필요한 경우 이름으로 삭제하기 등을 만들 수 있음)
	 */
	public int addressDelete(int no) throws Exception {
		return addressDao.delete(no);
	}
	
	/*
	 * 주소록 전체보기
	 */
	public List<Address> addressList() throws Exception {
		return addressDao.findAll();
	}
	
	
}

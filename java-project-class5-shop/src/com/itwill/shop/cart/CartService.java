package com.itwill.shop.cart;

import java.util.List;
public class CartService {
	private CartDao cartDao;
	public CartService() throws Exception {
		cartDao=new CartDao();
	}
	
	/*
	 * 카트추가 or 수정
	 */
	/*
	 * 동일 메소드인데 1. ? 버전 2. DTO 버전 풀어버전 몰아버전........
	 * DTO를 만들었으니 DTO를 쓰는게 맞다.
	 * 권장이 아니라 사용해야하는데 어렵게 느껴질까봐 두 가지 다 알려주심
	 * addCart니까 cart를 넣는게 맞다.
	 */
	public int addCart(String sUserId,int p_no,int cart_qty)throws Exception {
		if(cartDao.countByProductNo(sUserId, p_no) > 0) {
			return cartDao.updateByProductNo(sUserId, p_no, cart_qty);
		}else {
			return cartDao.insert(sUserId, p_no, cart_qty);
		}
	}
	public int addCart(Cart cart)throws Exception {
		if(cartDao.countByProductNo(cart.getUserid(),cart.getProduct().getP_no()) > 0) {
			return cartDao.updateByProductNo(cart);
		}else {
			return cartDao.insert(cart);
		}
	}
	/*
	 * 카트수량변경수정
	 */
	public int updateCart(int cart_no,int cart_qty)throws Exception {
		return cartDao.updateByCartNo(cart_no, cart_qty);
	}
	public int updateCart(Cart cart)throws Exception {
		return cartDao.updateByCartNo(cart);
	}
	/*
	 * 카트보기
	 */
	public List<Cart> getCartItemByUserId(String sUserId) throws Exception{
		return cartDao.findByUserId(sUserId);
	}
	/*
	 * 카트아이템1개보기
	 */
	public Cart getCartItemByCartNo(int cart_no) throws Exception{
		return cartDao.findByCartNo(cart_no);
	}
	
	/*
	 * 카트아이템1개삭제
	 */
	public int deleteCartItemByCartNo(int cart_no) throws Exception{
		return cartDao.deleteByCartNo(cart_no);
	}
	/*
	 * 카트삭제
	 */
	public int deleteCartItemByUserId(String sUserId)throws Exception {
		return cartDao.deleteByUserId(sUserId);
	}
}

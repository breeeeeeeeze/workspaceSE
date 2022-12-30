package dao.address;

public class AddressSQL {
	private AddressSQL() {
	} // ? --> 기본생성자를 만들어야 dao 클래스에서 생성해서 쓰지

	public static final String ADDRESS_INSERT = "insert into address values(address_no_seq.nextval, ?, ?, ?)";
	public static final String ADDRESS_UPDATE = "update address set name =  ?, phone = ?, address = ? where no = ?";
	public static final String ADDRESS_DELETE = "delete address where no = ?";
	public static final String ADDRESS_SELECT_BY_NO = "select no, name, phone, address from address where no= ?";
	public static final String ADDRESS_SELECT_ALL = "select no, name, phone, address from address";
}

package dao.address.third;
/*
 * VO(Value Object), DTO(Data Transfer Object)
 * 	- address 테이블 1개 row(혹은 튜플)의 데이터의 값을 가지는 객체
 *  ((+)객체가(에) 값을 가지기(저장하기) 위해서는 클래스의 구성요소 중 멤버필드가 필요)
 *  - address 테이블 1개의 row의 데이터값을 전달(파라메타, 리턴데이터)시키기 위한 객체
 *  - address 테이블의 컬럼과 동일한 수의 멤버필드를 가지는 객체
 */
/*
 이름      널?       유형           
------- -------- ------------ 
NO      NOT NULL NUMBER(4)    
NAME             VARCHAR2(50) 
PHONE            VARCHAR2(50) 
ADDRESS          VARCHAR2(60) 
 */
public class Address {
	private int no;
	private String name;
	private String phone;
	private String address;
	
	public Address() {
	
	}
	
	public Address(int no, String name, String phone, String address) {
		super();
		this.no = no;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Address [no=" + no + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
	
	
	
}

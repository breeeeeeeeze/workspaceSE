package dao.emp;

public class EmpDaoTestMain {

	public static void main(String[] args) throws Exception {
		EmpDao empDao = new EmpDao();
		empDao.findByPrimaryKey(7369);
	}

}

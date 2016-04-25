package data;

public class EmployeeTest {

	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDBDAO();
		Employee emp = dao.getEmpById(1123);
		System.out.println(emp);
	}

}

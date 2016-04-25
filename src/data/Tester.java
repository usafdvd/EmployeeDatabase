package data;

public class Tester {
	
	
	public static void main(String[] args) {
		Employee emp = new Employee("David", "Avila2", 3, 3);
		EmployeeDBDAO dao = new EmployeeDBDAO();
		dao.addEmployee(emp);
		
		
	}
}

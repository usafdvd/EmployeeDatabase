package data;

import java.util.List;

public interface EmployeeDAO {
	public Employee getEmpById(int id);
	public List<Department> getDepartments();
	public List<Job> getJobs();
	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public String deleteEmployee(Employee employee);
}


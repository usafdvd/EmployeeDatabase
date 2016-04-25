package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDBDAO implements EmployeeDAO {
	private static final String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/companydb";

	@Override
	public Employee getEmpById(int id) {
		Employee emp = null;
		String sql = "select id, firstname, lastname, department_id, job_id from employees where id = " + id;

		try {
			Class.forName(DRIVER_CLASS_NAME);
			Connection conn = DriverManager.getConnection(URL, "student", "student");
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(sql);

			while (rs.next()) {
				emp = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
			}

			rs.close();
			statement.close();
			conn.close();
		} catch (Exception e) {
			System.err.println(e);
		}

		return emp;
	}

	@Override
	public List<Department> getDepartments() {
		ArrayList<Department> depts = new ArrayList<>();
		try {
			Class.forName(DRIVER_CLASS_NAME);
			Connection conn = DriverManager.getConnection(URL, "student", "student");
			Statement stmt = conn.createStatement();
			String sql = "Select id, name, manager_id, location_id " + " from departments order by name";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Department d = new Department(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
				depts.add(d);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			System.err.println(e);
		}
		return depts;
	}
	
	@Override
	public List<Job> getJobs() {
		ArrayList<Job> jobs = new ArrayList<>();
		try {
			Class.forName(DRIVER_CLASS_NAME);
			Connection conn = DriverManager.getConnection(URL, "student", "student");
			Statement stmt = conn.createStatement();
			String sql = "Select id, name, minimum_salary, maximum_salary " + " from jobs order by name";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Job j = new Job(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
				jobs.add(j);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			System.err.println(e);
		}
		return jobs;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		System.out.println("inside addEmployee method");
		try {
			Class.forName(DRIVER_CLASS_NAME);
			Connection conn = DriverManager.getConnection(URL, "student", "student");
			PreparedStatement pst = conn.prepareStatement(
					"INSERT INTO employees" + "(firstname, lastname, department_id, job_id) VALUES (?, ?, ?, ?)");
			pst.setString(1, employee.getFirstname());
			pst.setString(2, employee.getLastname());
			pst.setInt(3, employee.getDepartmentId());
			pst.setInt(4, employee.getJobId());
			pst.execute();
			
			pst.close();
			conn.close();
			Connection conn1 = DriverManager.getConnection(URL, "student", "student");
			Statement stmt = conn1.createStatement();
			String sql = "Select * FROM employees";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				employee.setId(rs.getInt(1));
			}
		} catch (Exception e) {
			System.err.println(e);
		} System.out.println(employee);
		
		return employee;
	}
	
	@Override
	public Employee updateEmployee(Employee employee) {
//		String updated = "Employee " + employee.getId() + " was updated!";
		
		try {
			Class.forName(DRIVER_CLASS_NAME);
			Connection conn = DriverManager.getConnection(URL, "student", "student");
			PreparedStatement pst = conn.prepareStatement(
					"UPDATE employees SET firstname = ?, lastname = ?, department_id =  ?, job_id =  ? WHERE id = ?");
			pst.setString(1, employee.getFirstname());
			pst.setString(2, employee.getLastname());
			pst.setInt(3, employee.getDepartmentId());
			pst.setInt(4, employee.getJobId());
			pst.setInt(5, employee.getId());
			pst.executeUpdate();
			
			pst.close();
			conn.close();
		} catch (Exception e) {
			System.err.println(e);
		}
		return employee; 
	}
	
	@Override
	public String deleteEmployee(Employee employee) {
		String updated = "Employee " + employee.getId() + " was deleted!";
		try {
			Class.forName(DRIVER_CLASS_NAME);
			Connection conn = DriverManager.getConnection(URL, "student", "student");
			PreparedStatement pst = conn.prepareStatement("DELETE FROM employees where id = ?");
			pst.setInt(1, employee.getId());
			pst.execute();
		
			pst.close();
			conn.close();
		} catch (Exception e) {
			System.err.println(e);
		}
		return updated;
	}

}

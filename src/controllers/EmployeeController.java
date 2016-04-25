package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import data.Department;
import data.Job;
import data.Employee;
import data.EmployeeDAO;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeDAO employeeDAO;

	// TESTED, GOOD TO GO //
	@RequestMapping("getEmployeeById.do")
	public ModelAndView getEmployeeById(int id) {
		System.out.println(id);
		Employee emp = employeeDAO.getEmpById(id);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result.jsp");
		mv.addObject("employee", emp);
		List<Department> depts = employeeDAO.getDepartments();
		mv.addObject("departments", depts);
		List<Job> jobs = employeeDAO.getJobs();
		mv.addObject("jobs", jobs);
		return mv;

	}


	@RequestMapping("createEmployee.do")
	public ModelAndView newEmployee(Employee employee) {
		System.out.println("Inside createEmployee controller");
		System.out.println(employee.getFirstname());
		System.out.println(employee);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result.jsp");
		Employee emp = employeeDAO.addEmployee(employee);
//		System.out.println(employee.getId());
		return getEmployeeById(employee.getId());
	}


	@RequestMapping("updateEmployee.do")
	public ModelAndView updateEmployee(Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result.jsp");
		mv.addObject("employee", employeeDAO.updateEmployee(employee));
		List<Department> depts = employeeDAO.getDepartments();
		mv.addObject("departments", depts);
		List<Job> jobs = employeeDAO.getJobs();
		mv.addObject("jobs", jobs);
		return mv;
	}

	@RequestMapping("deleteEmployee.do")
	public ModelAndView deleteEmployee(Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result.jsp");
		
		return mv;
	}

}
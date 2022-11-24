package com.userdata.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.userdata.model.Employee;
import com.userdata.repository.EmployeeRepository;

@Controller
@RequestMapping(value="/employeesWebsite")
public class MainController {
	
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	
	@RequestMapping(value="/mainPage")
	public String index() {
		
		return "index.jsp";
		
	}
	@RequestMapping(value="/signinPage")
	public String signinPage() {
		
		return "signin.jsp";
		
	}
	
	@RequestMapping(value="/getEmployee")
	public ModelAndView getEmployee(@RequestParam Integer empId) {
		
		System.out.println(empId);
		ModelAndView mv = new ModelAndView("displayEmployee.jsp");
		Optional<Employee> employee = employeeRepository.findById(empId);
		if(!employee.isPresent()) {
			System.out.println("inside the if condition");
			return new ModelAndView("no susch fellow found");
		}
		System.out.println(employee.get());
		mv.addObject(employee.get());
		return mv;
		
	}
	
	@RequestMapping(value="/addEmployee")
	public String addEmployees(Employee employee) {
		System.out.println("for testing");
		System.out.println(employee.getEmpName());
		System.out.println(employee.getCity());
		System.out.println(employee.getEmpId());
		System.out.println(employee.getSalary());
		
		employeeRepository.save(employee);
		return "index.jsp";
		
	}

}

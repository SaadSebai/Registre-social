package com.master.registre.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.master.registre.entity.Employee;
import com.master.registre.serviceImp.EmployeeService;

@Controller
public class EmployeeController {
	
	private EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@RequestMapping("/home")
	public String Home() {
		return "home";
	}
	
	@RequestMapping("/showLogin")
	public String ShowLogin(Model theModel) {
		
		Employee employee = new Employee();
		theModel.addAttribute("employee", employee);
		
		return "Login";
	}
	
	@RequestMapping("/login")
	public String Login(@ModelAttribute("employee") Employee employee) {
		
		Employee e = employeeService.findByEmail(employee.getEmail());
		
		System.out.println(e.getEmail());
		
		if(e.equals(null)) {
			return "Login";
		}else {
			if(e.getPassword().equals(employee.getPassword()))
				return "home";
			else
				return "login";
		}
	}
	
	@RequestMapping("/showSignup")
	public String ShowSignup(Model theModel) {
		Employee employee = new Employee();
		theModel.addAttribute("employee", employee);
		return "signup";
	}
	
	@RequestMapping("/signup")
	public String Signup(@ModelAttribute("employee") Employee employee) {
		
		employeeService.save(employee);
		
		return "home";
	}
}

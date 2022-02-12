package com.main.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.main.dto.EmployeeDTO;
import com.main.service.EmployeeService;

@Controller
public class EmployeeController {
	
	
	@Autowired
	//EmpoloyeeDaoImpl empoloyeeDaoImpl ;
	EmployeeService  employeeService;
	
	
	
@GetMapping("showEmployees")
	
	String showAll(Model model){
		
	   List<EmployeeDTO>   employeeDTOlist=employeeService.FetchAllEmployees();	   
	  
	   model.addAttribute( "employeeDTOlist"  ,employeeDTOlist);
		
		return "showAllEmp";//showAllEmp.jsp
	}


@GetMapping("register")
String displayRegistrationPage(){
	
	return "registration";
	
}

@PostMapping("register")
String doRegistration(@ModelAttribute EmployeeDTO empDTO, Model model){
	System.out.println(empDTO);
	employeeService.saveEmployee(empDTO);

 
	 return "login";
	
}
@GetMapping("/")
String displayLoginPage(){
	
	return "login";//login.jsp
	
}


@PostMapping("login")
String authenticate(@RequestParam String email ,@RequestParam String password ,Model model){  //HttpServletRequest request
	
	System.out.println(email +"   "+password);
	
	EmployeeDTO employeeDTO=employeeService.authenticate(email, password);
	
	if (employeeDTO!=null){
		model.addAttribute("employeeDTO", employeeDTO);
		return "showAllEmp";
	}
	else {
		model.addAttribute("msg", "invalid user");
	
	
	return "login";
	}
	
}
@GetMapping("deleteEmployee")
String delEmployee(@RequestParam int employeeId,Model model){
	
	employeeService.deleteEmp(employeeId);
	
	/*
	 * List<EmployeeDTO> listOfEmp=employeeService.giveAllEmp();
	 * model.addAttribute("listOfEmp", listOfEmp); return "showAll";//showAll.jsp
	 */		
	return "showAllEmp";
}


}
	
	
	
	
	

	



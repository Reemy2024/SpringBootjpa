package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.pojo.Employee;
import com.example.demo.service.EmployeeService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService service;
	@RequestMapping("/")
	public ModelAndView defaultPageload(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index.jsp");
		return mv;
	}

	@RequestMapping("/insert")
	public ModelAndView insertData(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		Employee e=new Employee();
		e.setEname(request.getParameter("name"));
		e.setPhono(request.getParameter("phono"));
		if(service.insert(e)!=null) {
			mv.setViewName("display.jsp");
		}
		return mv;
	}


}



package com.employeemanagementsystem.employeemanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.employeemanagementsystem.employeemanagementsystem.model.EmployeeModel;
import com.employeemanagementsystem.employeemanagementsystem.service.serviceimpl.EmployeeServiceImpl;


@Controller
public class StartController {

	@Autowired
	private EmployeeServiceImpl empServiceImpl;
	
	@RequestMapping(value = {"/","/index"}, method = RequestMethod.GET)
	public ModelAndView start() {
		
		List<EmployeeModel> empList = empServiceImpl.employeeList();
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		model.addObject("employeeList", empList);
		return model;
	}
}

package com.employeemanagementsystem.employeemanagementsystem.controller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.employeemanagementsystem.employeemanagementsystem.model.EmployeeModel;
import com.employeemanagementsystem.employeemanagementsystem.service.serviceimpl.EmployeeServiceImpl;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl empServiceImpl;
	
	@RequestMapping(value = "/createData", method = RequestMethod.GET)
	public ModelAndView createData() {
		
		ModelAndView model = new ModelAndView();
		model.setViewName("createForm");
		return model;
	}
	
	@RequestMapping(value = {"/back", "/updateFormBack","/employeeList"}, method = RequestMethod.GET)
	public ModelAndView backPage() {
		
		List<EmployeeModel> empList = empServiceImpl.employeeList();
		ModelAndView model = new ModelAndView();
		model.setViewName("redirect:/index");
		model.addObject("employeeList", empList);
		return model;
	}
	
	@RequestMapping(value = "/empDataAdd", method = RequestMethod.GET)
	public ModelAndView empDataAdd(@ModelAttribute EmployeeModel empModel) {
		
		int result = empServiceImpl.employeeDataAdd(empModel);
		List<EmployeeModel> empList = empServiceImpl.employeeList();
		ModelAndView model = new ModelAndView();
		model.setViewName("redirect:/index");
		model.addObject("insertResult", result);
		model.addObject("employeeList", empList);
		//System.out.println("inssert:" + result);
		return model;
	}
	
	@RequestMapping(value = "/deleteData/{empNo}")
	public ModelAndView deleteData(@PathVariable (name = "empNo")String empNo) {
		
		int employeeNo = Integer.parseInt(empNo);
		int result = empServiceImpl.deleteEmpData(employeeNo);
		ModelAndView model = new ModelAndView();
		model.setViewName("redirect:/index");
		model.addObject("deleteResult", result);
		//System.out.println("delete:" + result);
		return model;
	}
	
	@RequestMapping(value = "/updateData/{empNo}")
	public ModelAndView updateData(@PathVariable (name = "empNo")String empNo) {
		
		int employeeNo = Integer.parseInt(empNo);
		EmployeeModel empModel = empServiceImpl.updateData(employeeNo);
		ModelAndView model = new ModelAndView(); 
		model.setViewName("updateForm");
		model.addObject("empModel", empModel);
		return model;
	}
	
	@RequestMapping(value = "/updateProcess", method = RequestMethod.GET)
	public ModelAndView updateProcess(@ModelAttribute EmployeeModel empModel) {
		
		int result = empServiceImpl.updateProcess(empModel);
		List<EmployeeModel> empList = empServiceImpl.employeeList();
		ModelAndView model = new ModelAndView();
		model.setViewName("redirect:/index");
		model.addObject("updateResult", result);
		model.addObject("employeeList", empList);
		//System.out.println("update:" + result);
		return model;
	}
}
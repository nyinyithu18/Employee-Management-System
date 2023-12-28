package com.employeemanagementsystem.employeemanagementsystem.service;

import java.util.List;

import com.employeemanagementsystem.employeemanagementsystem.model.EmployeeModel;

public interface EmployeeService {

	public int employeeDataAdd(EmployeeModel empModel);
	public List<EmployeeModel> employeeList();
	public int deleteEmpData(int empNo);
	public EmployeeModel updateData(int empNO);
	public int updateProcess(EmployeeModel empModel);
}

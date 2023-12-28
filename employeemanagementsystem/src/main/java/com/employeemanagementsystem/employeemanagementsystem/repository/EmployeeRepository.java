package com.employeemanagementsystem.employeemanagementsystem.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.employeemanagementsystem.employeemanagementsystem.model.EmployeeModel;

@Mapper
public interface EmployeeRepository {

	public int employeeDataAdd(EmployeeModel empModel);
	public List<EmployeeModel> employeeList();
	public int deleteEmpData(int empNo);
	public EmployeeModel updateData(int empNo);
	public int updateProcess(EmployeeModel empModel);
}


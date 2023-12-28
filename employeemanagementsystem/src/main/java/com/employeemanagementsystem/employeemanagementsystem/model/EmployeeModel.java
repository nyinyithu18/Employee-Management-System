package com.employeemanagementsystem.employeemanagementsystem.model;

import lombok.Getter;
import lombok.Setter;

public class EmployeeModel {

	@Getter
	@Setter
	private int empNo;
	
	@Getter
	@Setter
	private String empName;
	
	@Getter
	@Setter
	private int empAge;
	
	@Getter
	@Setter
	private int empSalary;
}

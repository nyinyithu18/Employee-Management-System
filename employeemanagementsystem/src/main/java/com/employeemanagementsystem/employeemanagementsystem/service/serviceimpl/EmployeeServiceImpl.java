package com.employeemanagementsystem.employeemanagementsystem.service.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemanagementsystem.employeemanagementsystem.model.EmployeeModel;
import com.employeemanagementsystem.employeemanagementsystem.repository.EmployeeRepository;
import com.employeemanagementsystem.employeemanagementsystem.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepository;
	
	@Override
	public int employeeDataAdd(EmployeeModel empModel) {	
		return empRepository.employeeDataAdd(empModel);
	}

	@Override
	public List<EmployeeModel> employeeList() {	
		return empRepository.employeeList();
	}

	@Override
	public int deleteEmpData(int empNo) {	
		return empRepository.deleteEmpData(empNo);
	}

	@Override
	public EmployeeModel updateData(int empNO) {
		return empRepository.updateData(empNO);
	}

	@Override
	public int updateProcess(EmployeeModel empModel) {
		return empRepository.updateProcess(empModel);
	}

}

package com.narvee.service;

import java.util.List;

import com.narvee.entity.Employee;


public interface IEmpService {

	public Employee saveEmp(Employee Emp); 
	
	public List<Employee> getAllEmp();
	
	public void deleteEmpByID(Long id);
	
	public Employee getEmpByID(Long id);
}

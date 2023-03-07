package com.narvee.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.narvee.entity.Employee;
import com.narvee.repository.IEmpRepository;
import com.narvee.service.IEmpService;

@Service
public class EmpServiceImpl implements IEmpService{
	
	private static final Logger logger = LoggerFactory.getLogger(EmpServiceImpl.class);
	
	@Autowired
	private IEmpRepository repository;
	
	@Override
	public Employee saveEmp(Employee Emp) {
		logger.debug("Start of saveEmployee() of employee service impl");
		logger.info("!!! inside class: EmpServiceImpl, !! method: saveEmp");
		logger.debug("End of saveEmployee() of employee service impl");
		return repository.save(Emp);
	}

	@Override
	public List<Employee> getAllEmp() {
		logger.debug("Start of getAllEmployees() of employee service impl");
		logger.info("!!! inside class: EmpServiceImpl, !! method: getAllEmp");
		logger.debug("End of getAllEmployees() of employee service impl");
		return repository.findAll();
	}

	@Override
	public void deleteEmpByID(Long id) {
		logger.debug("Start of deleteEmpbyId()  of employee service impl");
		logger.info("!!! inside class: EmpServiceImpl, !! method: deleteEmpByID");
		logger.debug("End of deleteEmpbyId() of employee service impl");
		Employee Emp = repository.findById(id).get();
		repository.delete(Emp);
	}

	@Override
	public Employee getEmpByID(Long id) {
		logger.debug("Start of getEmpbyId()  of employee service impl");
		logger.info("!!! inside class: EmpServiceImpl, !! method: getEmpByID");
		logger.debug("End of getEmpbyId() of employee service impl");
		return repository.findById(id).get();
	}

}

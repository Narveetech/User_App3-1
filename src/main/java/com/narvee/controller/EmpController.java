package com.narvee.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.narvee.commons.RestAPIResponse;
import com.narvee.entity.Employee;
import com.narvee.service.IEmpService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/emp")
@CrossOrigin
public class EmpController {

	private static final Logger logger = LoggerFactory.getLogger(EmpController.class);

	@Autowired
	private IEmpService service;

	@ApiOperation("To save Employee")
	@RequestMapping(value = "saveEmployee", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<RestAPIResponse> saveEmployee(@RequestBody Employee emp) {
		logger.debug("Start of saveEmp()  of employee controller class");
		logger.info("!!! inside class: EmployeeController, !! method: saveEmployee");
		logger.debug("End of saveEmp() of employee controller class");
		Employee emp1 = service.saveEmp(emp);
		if (!(emp1 == null)) {
			logger.error("Employee object saved successfully");
		} else {
			logger.error("Employee object is not saved");

		}
		return new ResponseEntity<>(new RestAPIResponse("Success", "save Employee Entity", emp1), HttpStatus.CREATED);
	}

	@ApiOperation("To getAll Employees")
	@RequestMapping(value = "getAllEmployees", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<RestAPIResponse> getAllEmployees() {
		logger.debug("Start of getAllEmployees() of employee controller class");
		logger.info("!!! inside class: EmployeeController, !! method: getAllEmployees");
		logger.debug("End of getAllEmployees() of employee controller class");
		return new ResponseEntity<>(new RestAPIResponse("Success", "getall Employees", service.getAllEmp()),
				HttpStatus.OK);
	}

	@ApiOperation("To delete Employee")
	@RequestMapping(value = "deleteEmployee/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public ResponseEntity<RestAPIResponse> deleteEmployeeByID(@PathVariable long id) {
		logger.debug("Start of deleteEmpbyId() of employee controller class");
		logger.info("!!! inside class: EmployeeController, !! method: deleteEmployeeByID");
		logger.debug("End of deleteEmpbyId() of employee controller class");
		String status = null;
		try {
			service.deleteEmpByID(id);
			logger.debug("employee deleted succesfully");
			status = "employee deleted succesfully";
		} catch (Exception e) {
			logger.error("Employee failed to delete");
			status="Employee failed to delete";
		}
		return new ResponseEntity<>(new RestAPIResponse("Success", status), HttpStatus.OK);
	}

	@ApiOperation("To get Employee")
	@RequestMapping(value = "getEmployee/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<RestAPIResponse> getEmployeeById(@PathVariable long id) {
		logger.debug("Start of getEmpbyId() of employee controller class");
		logger.info("!!! inside class: EmployeeController, !! method: getEmployeeById");
		logger.debug("End of getEmpbyId() of employee controller class");
		return new ResponseEntity<>(new RestAPIResponse("Success", "get Employees", service.getEmpByID(id)),
				HttpStatus.OK);
	}

	@ApiOperation("To update Employee")
	@RequestMapping(value = "updateEmployee", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<RestAPIResponse> updateEmployee(@RequestBody Employee emp) {
		logger.debug("Start of updateEmployee() of employee controller class");
		logger.info("!!! inside class: EmployeeController, !! method: updateEmployee");
		logger.debug("End of updateEmployee() of employee controller class");
		return new ResponseEntity<>(new RestAPIResponse("Success", "update Employee Entity", service.saveEmp(emp)), HttpStatus.CREATED);
	}

}

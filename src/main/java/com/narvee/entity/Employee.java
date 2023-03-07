package com.narvee.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Employee {
	@Id
	@GeneratedValue
	private Long id;
	
	private String empFirstName;
	
	private String empLastName;
	
	private Long sal;

	private String job;
	
	
}

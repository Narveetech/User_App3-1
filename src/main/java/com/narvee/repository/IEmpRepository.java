package com.narvee.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.narvee.entity.Employee;

@Repository
public interface IEmpRepository extends JpaRepository<Employee, Serializable>{

}

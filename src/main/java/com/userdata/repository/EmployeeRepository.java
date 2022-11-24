package com.userdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.userdata.model.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{

}

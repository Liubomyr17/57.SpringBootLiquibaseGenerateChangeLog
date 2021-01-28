package com.izdebski.SpringBootGenerateChangeLog.repository;

import com.izdebski.SpringBootGenerateChangeLog.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
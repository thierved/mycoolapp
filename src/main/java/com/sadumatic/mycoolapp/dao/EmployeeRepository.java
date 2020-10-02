package com.sadumatic.mycoolapp.dao;

import com.sadumatic.mycoolapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {}

package com.sadumatic.mycoolapp.dao;

import com.sadumatic.mycoolapp.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}

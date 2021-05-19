package com.poo.mercearia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poo.mercearia.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}

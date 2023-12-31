package com.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	List<Employee> findByIdOrFirstNameContainingOrLastNameContainingOrEmailContaining(
			String idOrFirstNameOrLastNameOrEmail, String searchTerm1, String searchTerm2, String searchTerm3);

}

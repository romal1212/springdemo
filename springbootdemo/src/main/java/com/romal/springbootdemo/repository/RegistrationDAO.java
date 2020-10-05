package com.romal.springbootdemo.repository;

import com.romal.springbootdemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationDAO extends JpaRepository<Employee,Long> {
}

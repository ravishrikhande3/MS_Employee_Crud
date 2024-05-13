package com.cjc.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.main.model.Employee;

public interface SaveRepository extends JpaRepository<Employee, Integer> {

}

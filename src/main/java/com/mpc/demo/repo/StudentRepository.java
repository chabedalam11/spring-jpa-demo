package com.mpc.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.mpc.demo.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
	
}

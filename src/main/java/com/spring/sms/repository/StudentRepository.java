package com.spring.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}

package com.sms.crud.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.crud.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}

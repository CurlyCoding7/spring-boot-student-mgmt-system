package com.sms.crud.sms.service;

import java.util.List;

import com.sms.crud.sms.entity.Student;

public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updaStudent(Student student);

    void deleteStudentById(Long id);

}

package com.example.student.service;

import com.example.student.entity.Student;
import com.example.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository repository;
    public Student add(Student student) {
      return   repository.save(student);
    }

    public List<Student> getAllDetails() {
      return  repository.findAll();
    }
}

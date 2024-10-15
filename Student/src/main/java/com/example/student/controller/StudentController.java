package com.example.student.controller;

import com.example.student.entity.Student;
import com.example.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService service;
    //StudentService serv=new StudentService();
    @PostMapping("/add")
    public Student  addDetails(@RequestBody Student student){
       return  service.add(student);
    }
    @GetMapping("/get")
    public List<Student>  allDetails(){
        return service.getAllDetails();
    }
}

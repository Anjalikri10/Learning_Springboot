package com.example.employ.service;


import com.example.employ.entity.Employ;
import com.example.employ.repository.EmployRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployService {

    @Autowired
    EmployRepository repository;

    public Employ add(Employ employ){
        return repository.save(employ);
    }

    public List<Employ> getAllDetails() {
        return  repository.findAll();
    }
}

package com.example.employ.controller;


import com.example.employ.entity.Employ;
import com.example.employ.service.EmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployController {

    @Autowired
    EmployService service ;
@PostMapping("/add")
public Employ addDetails(@RequestBody Employ employ){
    return service.add(employ);
}
    @GetMapping("/get")
    public List<Employ> allDetails(){
        return service.getAllDetails();
    }

}

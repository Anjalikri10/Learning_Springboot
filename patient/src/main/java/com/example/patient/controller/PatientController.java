package com.example.patient.controller;


import com.example.patient.entity.patient;
import com.example.patient.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
public class PatientController {

    @Autowired
    PatientService service;

    //patienttService serv=new PatienttService();
    @PostMapping("/add")
    public patient addDetails(@RequestBody patient patient) {
        return service.add(patient);
    }
     @PostMapping("/get")
    public List<patient> allDetails(){
        return service.getAllDetails();
    }
    @PostMapping("/deletebyid")
    public String delete(@RequestBody patient patient){
         service.deleteById(patient.getId());
         return "data deleted";

    }
    @PostMapping("/updatebyid")
    public patient update(@RequestBody patient patient){
        return service.updateDataById(patient.getId(), patient);
    }
}

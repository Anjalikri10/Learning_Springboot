package com.example.patient.service;


import com.example.patient.entity.patient;
import com.example.patient.repository.patientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PatientService {

    @Autowired
    patientRepository repository;
    public patient add(patient patient) {
        return   repository.save(patient);
    }

    public List<patient> getAllDetails() {
        return  repository.findAll();
    }


    public void deleteById(int id) {
         repository.deleteById(id);
    }


    public patient updateDataById(int id, patient updatedPatientData) {
        // Find the patient by id
        patient existingPatient = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found with id: " + id));

        // Update the patient details
        existingPatient.setName(updatedPatientData.getName()); // Assuming 'name' is a field
        existingPatient.setAge(updatedPatientData.getAge());   // Assuming 'age' is a field
        // Update other fields as necessary

        // Save the updated patient details
        return repository.save(existingPatient);
    }
}

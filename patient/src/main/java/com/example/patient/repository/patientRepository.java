package com.example.patient.repository;

import com.example.patient.entity.patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface patientRepository extends JpaRepository<patient,Integer> {
}

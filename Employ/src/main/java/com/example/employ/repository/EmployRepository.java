package com.example.employ.repository;

import com.example.employ.entity.Employ;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployRepository extends JpaRepository<Employ,Integer> {
}

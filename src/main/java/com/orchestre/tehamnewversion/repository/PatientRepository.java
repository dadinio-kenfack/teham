package com.orchestre.tehamnewversion.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.orchestre.tehamnewversion.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
	
}

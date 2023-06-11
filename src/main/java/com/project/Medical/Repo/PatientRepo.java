package com.project.Medical.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Medical.Entity.Patient;

public interface PatientRepo extends JpaRepository<Patient, Integer> 
{
	
}

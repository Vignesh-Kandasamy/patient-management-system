package com.project.Medical.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.Medical.Entity.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Integer> 
{
	
//	@Procedure(name = "GetPatientById")
//    List<Patient> findById(@Param("empId") Long empId);
}

package com.project.Medical.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.Medical.Entity.Patient;
import com.project.Medical.Exception.PatientNotFoundException;
import com.project.Medical.Repo.PatientRepo;


@Service
public class PatientService 
{
	@Autowired
	private PatientRepo repo;
	
	//Save Patients
	@Transactional(rollbackFor=Exception.class)
	public Patient savePatients(Patient patient)
	{
		System.out.println("Gender::::"+patient.getGender());
		return repo.save(patient);
	}

	//Retrieve patient by id
	public Patient getPatientById(int patientId) throws PatientNotFoundException
	{
		Patient patient=repo.findById(patientId).orElseThrow(()-> new PatientNotFoundException("User not found with id:: "+patientId));		
		return patient;
	}

	//Delete the Patient
	public void  deletePatient(int patientId) throws PatientNotFoundException 
	{
		repo.findById(patientId).orElseThrow(()->new PatientNotFoundException("User not found with id:: "+patientId));
		repo.deleteById(patientId);
	}

	//Update Patient
	public Patient updatePatient(Patient patient)
	{
		repo.findById(patient.getPatientId()).orElseThrow();
		return repo.save(patient); 
			
	}
	
	//Retrieve all Patients
	public List<Patient> getAllPatients() 
	{
		List<Patient> patientsList = new ArrayList<Patient>();
		repo.findAll().forEach(patient1->patientsList.add(patient1));
		return patientsList;
	}
}

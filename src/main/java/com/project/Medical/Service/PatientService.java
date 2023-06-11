package com.project.Medical.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Medical.Entity.Patient;
import com.project.Medical.Exception.PatientNotFoundException;
import com.project.Medical.Repo.PatientRepo;

@Service
public class PatientService 
{
	@Autowired
	private PatientRepo repo;
	
	//Save Patients	
	public Patient savePatients(Patient patient)
	{
		return repo.save(patient);
	}

	//Retrieve patient by id
	public Patient getPatientById(int patientId) throws PatientNotFoundException
	{
		Patient patient=repo.findById(patientId).orElse(null);
		
		if(patient!=null)
		{
			return patient;
		}
		else
		{
			throw new PatientNotFoundException("User not found with id:: "+patientId);
		}
		
	}

	//Delete the Patient
	public void deletePatient(int patientId) 
	{
		repo.deleteById(patientId);
	}

	//Update Patient
	public Patient updatePatient(Patient patient) 
	{
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

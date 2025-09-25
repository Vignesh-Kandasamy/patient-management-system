package com.project.Medical.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.Medical.Entity.Address;
import com.project.Medical.Entity.Patient;
import com.project.Medical.Exception.PatientNotFoundException;
import com.project.Medical.Service.PatientService;

import jakarta.validation.Valid;

@RestController
public class PatientController 
{
	@Autowired
	private PatientService service;
	
	@PostMapping("/savePatient")
	public ResponseEntity<Patient> savePatient( @Valid @RequestBody  Patient patient)
	{
		Patient savedPatient=service.savePatients(patient);
		return new ResponseEntity<Patient>(savedPatient,HttpStatus.CREATED); 
	}
	
	@GetMapping("/getPatient/{id}")
	public Patient getPatient(@PathVariable("id") int patientId) throws PatientNotFoundException
	{
		return service.getPatientById(patientId);
	}
	
	@GetMapping("/getAllPatients")
	public List<Patient> getAllPatients()
	{
		return service.getAllPatients();
	}
	
	@DeleteMapping("/deletePatient/{id}")
	public ResponseEntity<String> deletePatient(@PathVariable("id") int patientId) throws PatientNotFoundException
	{
		service.deletePatient(patientId);
		return ResponseEntity.ok("Patient with id "+patientId+" has been deleted successfully");
	}
	
	@PutMapping("/updatePatient")
	public Patient updatePatient( @RequestBody Patient patient)
	{
		return service.updatePatient(patient);
	}
}

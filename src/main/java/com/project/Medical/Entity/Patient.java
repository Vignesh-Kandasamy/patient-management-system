package com.project.Medical.Entity;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table
public class Patient 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int PatientId;
	
	@NotNull(message = "Name may not be null")
	@NotEmpty(message = "Name may not be empty")
	private String firstName;
	
	private String lastName;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dob;
	
	private String gender;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_clinical_id")
	private Clinical clinical;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_patient_id")
	private List<Address> address;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_patient_id")
	private List<Contact> contact;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_insurance_id")
	private Insurance insurance;
	
	@OneToOne(cascade=CascadeType.ALL, targetEntity=Prescriptions.class)
	@JoinColumn(name="fk_prescription_id")
	private Prescriptions prescriptions;
	
	public Patient()
	{
		
	}
	
	public int getPatientId() {
		return PatientId;
	}

	public void setPatientId(int patientId) {
		PatientId = patientId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public Clinical getClinical() {
		return clinical;
	}

	public void setClinical(Clinical clinical) {
		this.clinical = clinical;
	}

	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}

	public List<Contact> getContact() {
		return contact;
	}

	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

	public Prescriptions getPrescriptions() {
		return prescriptions;
	}

	public void setPrescriptions(Prescriptions prescriptions) {
		this.prescriptions = prescriptions;
	}
	
}

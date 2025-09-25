package com.project.Medical.Entity;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

@Entity
@Table(name ="patient_info")
public class Patient 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int patientId;
	
	@NotBlank(message = "FirstName cannot be null or empty or blank!")
	@Column(name="first_name")
	private String firstName;
	
	@Length(min=2, max=6, message="Lastname should be Min 2 and Max 6 characters!")
	@Column(name="last_name")
	private String lastName;
	
	@NotNull(message="Date of birth is required")
	@Past(message="Date of Birth must to be in past")
	@Column(name="date_of_birth")
	private LocalDate  dob;
	
	@NotEmpty(message = "Gender is Mandatory!")
	@Column(name="gender")
	private String gender;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_clinical_id")
	private Clinical clinical;
	
	@OneToMany(mappedBy="patient",cascade=CascadeType.ALL)
	//@JoinColumn(name="fk_patient_id", referencedColumnName="patientId")
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
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
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

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
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

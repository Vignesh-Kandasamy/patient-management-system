package com.project.Medical.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Clinical 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int clinicalId;
	
	private double height;
	
	private double weight;
	
//	@OneToOne(cascade=CascadeType.ALL, targetEntity=Allergies.class)
//	@JoinColumn(name="fk_allergies_id")
//	private List<Allergies> allergies;
//	
	public Clinical()
	{
		
	}

	public int getClinicalId() {
		return clinicalId;
	}

	public void setClinicalId(int clinicalId) {
		this.clinicalId = clinicalId;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

//	public List<Allergies> getAllergies() {
//		return allergies;
//	}
//
//	public void setAllergies(List<Allergies> allergies) {
//		this.allergies = allergies;
//	}
//	
	
}

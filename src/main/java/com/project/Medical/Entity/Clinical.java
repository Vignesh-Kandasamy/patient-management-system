package com.project.Medical.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="clinical_info")
public class Clinical 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int clinicalId;
	
	@Column(name="height")
	private double height;
	
	@Column(name="weight")
	private double weight;
	
	@OneToOne(mappedBy = "clinical")  //Bi-directional
	private Patient patient;
	
//	@OneToOne(cascade=CascadeType.ALL, targetEntity=Allergies.class)
//	@JoinColumn(name="fk_allergies_id")
//	private List<Allergies> allergies;
	
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

	/*public List<Allergies> getAllergies() {
		return allergies;
	}

	public void setAllergies(List<Allergies> allergies) {
		this.allergies = allergies;
	}*/
	
	
}

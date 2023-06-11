package com.project.Medical.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;

@Entity
@Table
public class Prescriptions 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int prescriptionId;
	
	private String drugName;
	
	//@Min(value=1)
	private long rxNumber;
	
	public Prescriptions()
	{
		
	}

	public int getPrescriptionId() {
		return prescriptionId;
	}

	public void setPrescriptionId(int prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

	public String getDrugName() {
		return drugName;
	}

	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	public long getRxNumber() {
		return rxNumber;
	}

	public void setRxNumber(long rxNumber) {
		this.rxNumber = rxNumber;
	}
	
	
}

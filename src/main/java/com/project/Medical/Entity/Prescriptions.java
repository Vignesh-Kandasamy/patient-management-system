package com.project.Medical.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="prescription_info")
public class Prescriptions 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int prescriptionId;
	
	@Column(name="drug_name")
	private String drugName;
	
	//@Min(value=1)
	@Column(name="rx_number")
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

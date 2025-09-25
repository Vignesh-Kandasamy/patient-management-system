package com.project.Medical.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="insurance_info")
public class Insurance 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int insuranceId;
	
	@Column(name="insurance_first_name")
	private String policyHolderFirstName;
	
	@Column(name="insurance_last_name")
	private String policyHolderLastName;
	
	@Column(name="policy_amount")
	private long policyAmount; 
	
	public Insurance()
	{
		
	}

	public int getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId(int insuranceId) {
		this.insuranceId = insuranceId;
	}

	public String getPolicyHolderFirstName() {
		return policyHolderFirstName;
	}

	public void setPolicyHolderFirstName(String policyHolderFirstName) {
		this.policyHolderFirstName = policyHolderFirstName;
	}

	public String getPolicyHolderLastName() {
		return policyHolderLastName;
	}

	public void setPolicyHolderLastName(String policyHolderLastName) {
		this.policyHolderLastName = policyHolderLastName;
	}

	public long getPolicyAmount() {
		return policyAmount;
	}

	public void setPolicyAmount(long policyAmount) {
		this.policyAmount = policyAmount;
	}
	
	
}

package com.project.Medical.Controller;

public class PatientErrorResponse 
{
	private int statusCode;
	private  String description;
	private Long timeStamp;
	
	public PatientErrorResponse()
	{
		
	}

	public PatientErrorResponse(int statusCode, String description, Long timeStamp) {
		super();
		this.statusCode = statusCode;
		this.description = description;
		this.timeStamp = timeStamp;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
}

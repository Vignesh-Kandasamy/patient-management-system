package com.project.Medical.Exception;

public class PatientNotFoundException extends Exception
{
	public PatientNotFoundException(String message, Throwable cause) 
	{
		super(message, cause);
	}

	public PatientNotFoundException(String message) 
	{
		super(message);
	}

	public PatientNotFoundException(Throwable cause) 
	{
		super(cause);
	}
}

package com.project.Medical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class MedicalApplication 
{
	public static void main(String[] args)
	{
		SpringApplication.run(MedicalApplication.class, args);
	}

} 

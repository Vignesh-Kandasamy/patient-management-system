package com.project.Medical.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name="contact_info")
public class Contact 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int contactId;
	
	@Column(name="email")
	@NotBlank(message="Email should not be blank")
	@Email(message="Invalid email format")
	private String email;
	
	@Pattern(regexp = "^\\d{10}$", message = "invalid mobile number")
	@Column(name="contact_number")
	private String  phone;
	
	public Contact()
	{
		
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(@Pattern(regexp = "^\\d{10}$", message = "invalid mobile number") String phone) {
		this.phone = phone;
	}
	
}

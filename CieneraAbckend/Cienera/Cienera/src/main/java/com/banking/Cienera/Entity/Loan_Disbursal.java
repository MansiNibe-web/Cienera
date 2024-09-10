package com.banking.Cienera.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Loan_Disbursal {
	
	
	
	@Id
	private long Mobile_number;
	public long getMobile_number() {
		return Mobile_number;
	}
	public void setMobile_number(long mobile_number) {
		Mobile_number = mobile_number;
	}
	private String Password;
	private String Name;
	private String Period;
	private String Type;
	
	public void setPassword(String password) {
		Password = password;
	}
	public String getPassword() {
		return Password;
	}
	
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public String getPeriod() {
		return Period;
	}
	public void setPeriod(String period) {
		Period = period;
	}
	
	 
	

}

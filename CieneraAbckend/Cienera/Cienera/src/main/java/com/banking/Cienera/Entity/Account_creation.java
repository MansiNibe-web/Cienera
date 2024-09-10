package com.banking.Cienera.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Account_creation {

	

	@Id
	private String Password;
	private String Account_holder_name;
	private String Email;
	private String Home_branch;
	private String City;
	private String Locality;
	private String Pin_code;
	private String House_number;
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getAccount_holder_name() {
		return Account_holder_name;
	}
	public void setAccount_holder_name(String account_holder_name) {
		Account_holder_name = account_holder_name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getHome_branch() {
		return Home_branch;
	}
	public void setHome_branch(String home_branch) {
		Home_branch = home_branch;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getLocality() {
		return Locality;
	}
	public void setLocality(String locality) {
		Locality = locality;
	}
	public String getPin_code() {
		return Pin_code;
	}
	public void setPin_code(String pin_code) {
		Pin_code = pin_code;
	}
	public String getHouse_number() {
		return House_number;
	}
	public void setHouse_number(String house_number) {
		House_number = house_number;
	}
	
	

	
	
	
	
	
	
}

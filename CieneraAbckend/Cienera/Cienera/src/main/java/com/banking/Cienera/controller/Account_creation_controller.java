package com.banking.Cienera.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.banking.Cienera.Entity.Account_creation;
import com.banking.Cienera.Service.Account_creation_service;

@RestController
@CrossOrigin(allowedHeaders ="*")
public class Account_creation_controller {

	
	
	@Autowired
	Account_creation_service service;
	
	@PostMapping("/add-account")
	public String addaccount(@RequestBody Account_creation acc)
	{
		service.createaccount(acc);
		
		return "the account for the user :"+acc.getAccount_holder_name()+" is created sucessfully !";
	}
	
	@GetMapping("/get-all-accounts")
	public List<Account_creation> getall()
	{
	   return service.getallaccounts();	
	}
	
	public String deleteuserbyname(@RequestParam("name") String name,@RequestParam("password") String password)
	{
		return service.deletebyname(name, password);
	}
	
	@GetMapping("/get-by-name")
	public List<Account_creation> getbyname(@RequestParam("name") String name)
	{
		return service.getaccount(name);
	}
	
	@DeleteMapping("/delete-by-name")
	public String deletebyname(@RequestParam("name") String name,@RequestParam("password") String password)
	{
	
		return service.deletebyname(name, password);
	}
	
	@GetMapping("/get-by-name-password")
	public Account_creation getbynmpw(@RequestParam("nm") String nm,@RequestParam("pw") String pw)
	{
		return service.namepw(nm, pw);
		
	}
	
	@PutMapping("/change-home-branch")
	public String changehomebranch(@RequestParam("nb") String nb,@RequestParam("ob") String ob,@RequestParam("pw") String pw)
	{
		 service.changeb(nb, ob, pw);
		
		return "branch changed from :"+ob+": to => :"+nb;
	}
	   
	
	@PutMapping("/update-account-details")
	public String update_bank_account(@RequestParam("name") String name,@RequestParam("pw")String pw)
	{
		
		Account_creation creation2=new Account_creation();
		 creation2=service.namepw(name, pw);
		 //change the name, pw,
		
		return "done!";
		
	}
//	@PostMapping("/add-updated-details")
//	public void add_new_details()
//	{
//		
//		
//	}
	
	@PutMapping("/update-email")
	public String changeemail2(@RequestParam("em")String em,@RequestParam("pw") String pw)
	{
		service.updateemail(em, pw);
		
		return "the email changed sucessfully !";
	}
	@PutMapping("/update-city")
	public String changecity(@RequestParam("ct")String ct,@RequestParam("pw") String pw)
	{
		service.updatecity(ct, pw);
		
		return "the city has been changed successfully!";
	}
	
	@PutMapping("/update-pincode")
	public String  changepincode(@RequestParam("pc") String pc,@RequestParam("pw") String pw)
	{
		service.updatepincode(pc, pw);
		return "Pincode changed successfully !";
	}
	
	@PutMapping("/update-home")
	public String changehome(@RequestParam("hn")String hn,@RequestParam("pw") String pw)
	{
		service.updatehouse(hn, pw);
		return "done! , the house number has been sucessfully changed !";
	}
}

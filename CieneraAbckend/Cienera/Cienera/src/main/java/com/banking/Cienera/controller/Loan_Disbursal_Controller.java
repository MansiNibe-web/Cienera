package com.banking.Cienera.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.banking.Cienera.Entity.Loan_Disbursal;
import com.banking.Cienera.Service.Loan_Disbursal_Service;

@RestController
@CrossOrigin(allowedHeaders ="*")
public class Loan_Disbursal_Controller {

	@Autowired
	private Loan_Disbursal_Service Service;
	
	
	@PostMapping("/add-loan")
	public String addloan(@RequestBody Loan_Disbursal Dis)
	{
		
		
		Service.AddLoan(Dis);
		
		return "Dear , your request for the Loan is registered successfully !";
	}
	
	@GetMapping("/get-your-loan-request")
	public Loan_Disbursal getallloans( @RequestParam String Id)
	{
	  return Service.GetLoan(Id);
	}
	
	@GetMapping("/get-your-loan-request-by-mobile")
	public Loan_Disbursal getloanbymn(@RequestParam long Mobile,@RequestParam String Paassword)
	{
		return Service.getbymobile(Mobile, Paassword);
	}
	
	@GetMapping("/get-all-loan-requests")
	public List<Loan_Disbursal> getall()
	{
		return Service.getallloans();
	}
}

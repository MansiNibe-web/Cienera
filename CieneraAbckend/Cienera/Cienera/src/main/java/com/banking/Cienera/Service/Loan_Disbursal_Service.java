package com.banking.Cienera.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.Cienera.Entity.Loan_Disbursal;
import com.banking.Cienera.repository.Loan_Disbursal_repo;

@Service
public class Loan_Disbursal_Service {

	@Autowired
	private Loan_Disbursal_repo repo;
	
	
	public void AddLoan (Loan_Disbursal dis)
	{
		repo.save(dis);
	}
	
	public Loan_Disbursal GetLoan(String Password)
	{
		return repo.findbypassword(Password);
	}
	
	
	public Loan_Disbursal getbymobile(long mobile, String Password)
	{
		return repo.findbymobile(mobile, Password);
	}
	public List<Loan_Disbursal> getallloans()
	{
		return repo.findAll();
	}
	
}

package com.banking.Cienera.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.Cienera.Entity.Account_creation;
import com.banking.Cienera.repository.Account_creation_repo;

@Service
public class Account_creation_service {

	
	@Autowired
	private Account_creation_repo repo;
	
//	@Autowired
//	private Account_enquiry_repo repo1;
	
		
	Account_creation creation=new Account_creation();
	
	public void createaccount(Account_creation creation) 
	{
		repo.save(creation);
	}
	
	public Account_creation namepw(String name,String Password)
	{
		
	 return	repo.getbypwname(name, Password);
		
	}
	
	public  List<Account_creation> getaccount(String name)
	{
		return repo.getbyname(name);
	}
	
	public String deletebyname(String name, String Password)
	{
		ArrayList<Account_creation> users= new ArrayList();
		users.addAll(repo.getbyname(name));
		
		String str="";
		String str1="";
		int i=0;
		
		Iterator<Account_creation> it=users.iterator();
		
		while(it.hasNext())
		{
			Account_creation creation2=new Account_creation();
			
			creation2=it.next();
			if(Password.equals(creation2.getPassword()))
			{
				
				repo.deletebyname(name);
				
				str="the user with the name"+name+"is deleted successfully !";
				i=1;
			}
			else
			{
			  str1="The password does not matches !";
			 
			}
				
		}
		if(i==1)
		{
			return str;
		}
		else
		{
			return str1;
		}
	}
	
	public List<Account_creation> getallaccounts()
	{
		return repo.findAll(); 
	}
	
	public void changeb(String nb, String ob, String pw)
	{
		repo.changebranch(nb,ob,pw);
	}
	
	public void updatedetails(Account_creation creation, String name, String password)
	{
		
		Account_creation creation3 = new Account_creation();
		
		creation3=repo.getbypwname(name, password);
		
		
		creation3.setAccount_holder_name(creation.getAccount_holder_name());
		creation3.setEmail(creation.getEmail());
		
	}
	
	public void updateemail(String Email,String Password)
	{
	
		repo.changeemail(Email, Password);
	}
	public void updatecity(String city , String password)
	{
		repo.changecity(city, password);
	}
	public void updatepincode(String pin,String password)
	{
		repo.changepincode(pin, password);
		
	}
	public void updatehouse(String house,String password)
	{
		repo.changehomenumber(house, password);
	}
	
//	public void updatedetails(String pw)
//	{
//	
//		Account_creation creation_new=new Account_creation();
//		
//		creation_new=repo.findById(pw).get();
//		
//		
//	}
//	public void updatedetails(String pw,String email)
//	{
//		updateemail(pw,email);
//	}
//	
//	public void updatedetails(String pw,String city)
//	{
//		
//	}
	
}

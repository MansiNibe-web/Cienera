package com.banking.Cienera.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.banking.Cienera.Entity.Loan_Disbursal;

@Repository
public interface Loan_Disbursal_repo extends JpaRepository<Loan_Disbursal,String> {

	
	@Query(value="Select * from Loan_Disbursal where Password= :pw", nativeQuery=true)
	public Loan_Disbursal findbypassword(@Param("pw") String Password);
	
	
	@Query(value="select * from Loan_Disbursal where Mobile_number= :mn and Password= :pw", nativeQuery=true)
	public Loan_Disbursal findbymobile(@Param("mn")long mobile, @Param("pw")String Password);
}

package com.banking.Cienera.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.banking.Cienera.Entity.Account_creation;

import jakarta.transaction.Transactional;

@Repository
public interface Account_creation_repo extends JpaRepository<Account_creation,String> {

	
	@Query(value="select * from Account_creation where Account_holder_name= :nm",nativeQuery=true)
	public List<Account_creation> getbyname(@Param("nm") String nm);
	
	@Modifying
	@Transactional
	@Query(value="delete from Account_creation where Account_holder_name = :nm", nativeQuery=true)
	public int deletebyname(@Param("nm") String nm);
	
	@Query(value="select * from Account_creation where Account_holder_name= :nm and password= :pw",nativeQuery=true)
	public Account_creation getbypwname(@Param("nm") String nm,@Param("pw") String pw);
     
	
	 @Modifying
	 @Transactional
     @Query(value="update account_creation set home_branch= :nb where home_branch= :ob and password= :pw" ,nativeQuery=true)
     public int changebranch(@Param("nb") String nb,@Param("ob") String ob, @Param("pw") String pw);
	 
	 //whenever we use the dml queries we have to use the @Modifying and @Transactional along with the execute update 
	 
	 @Modifying
	 @Transactional
	 @Query(value="update account_creation set email = :em where password= :pw",nativeQuery=true)
	 public int changeemail(@Param("em") String em,@Param("pw") String pw);
	 
	 @Modifying
	 @Transactional
	 @Query(value="update account_creation set password = :np where password= :op", nativeQuery=true)
	 public int changepassword(@Param("np") String np,@Param("op") String op);
	 
	 @Modifying
	 @Transactional
	 @Query(value="update account_creation set city= :nc where password= :oc",nativeQuery=true)
	 public int changecity(@Param("nc") String nc,@Param("oc") String oc);
	 
	 @Modifying
	 @Transactional
	 @Query(value="update account_creation set pin_code= :np where password= :pw",nativeQuery=true)
	 public int changepincode(@Param("np") String np, @Param("pw")String pw);
	 
	 @Modifying
	 @Transactional
	 @Query(value="update account_creation set house_number= :nh where password= :pw",nativeQuery=true)
	 public int changehomenumber(@Param("nh")String nh, @Param("pw") String pw);
	 
}

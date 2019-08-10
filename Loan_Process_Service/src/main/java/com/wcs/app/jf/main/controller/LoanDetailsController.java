package com.wcs.app.jf.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wcs.app.jf.main.model.LoanDetails;
import com.wcs.app.jf.main.repository.HomeRepository;
import com.wcs.app.jf.main.service.RegisterServiceInterface;

@RestController
@CrossOrigin("*")
public class LoanDetailsController
{
	@Autowired
	RegisterServiceInterface rs;
	
	@Autowired
	HomeRepository repo;
	
	
	@RequestMapping(value="/setdata",method=RequestMethod.POST)
	public void insertdata(@RequestBody LoanDetails ld)
	{
		System.out.println("printed");
		
		rs.RegisterDetails(ld);
	} 

	@RequestMapping(value="/updatedata/{loanId}",method=RequestMethod.PUT)
	public void updatedata(@PathVariable (name="loanId")int loanId ,@RequestBody LoanDetails loan)
	{
		rs.updateData(loan);
	}
	

	@GetMapping("/getsingleloan/{loanId}")
	 public LoanDetails getLoanDetails(@PathVariable(name="loanId")int loanId)
	 {
		System.out.println("------------------------------"+loanId);
		
		LoanDetails loan=rs.getSingleData(loanId);
		return loan;
	 }
	
	@RequestMapping(value="/*",method=RequestMethod.GET)
	public String errorPage()
	{
		return "Error";
	} 

	
	
}

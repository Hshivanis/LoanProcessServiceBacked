package com.wcs.app.jf.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Enquiry {

	@RequestMapping("/getdata")
	public String m1()
	{
		return "Customer Relationship Service";
	}
	
	@RequestMapping("/data")
	public String m2()
	{
		return "Loan Process System";
	}
}

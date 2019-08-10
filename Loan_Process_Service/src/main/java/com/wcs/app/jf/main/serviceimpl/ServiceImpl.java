package com.wcs.app.jf.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wcs.app.jf.main.model.LoanDetails;
import com.wcs.app.jf.main.repository.HomeRepository;
import com.wcs.app.jf.main.service.RegisterServiceInterface;
@Service
public class ServiceImpl implements RegisterServiceInterface {

	@Autowired
	HomeRepository hr;


	@Override
	public void RegisterDetails(LoanDetails ld) 
	{

		LoanDetails l=hr.save(ld);

	}


	@Override
	public LoanDetails getSingleData(int loanId) {
		LoanDetails loan=hr.findByLoanId(loanId);
		return loan;
		// TODO Auto-generated method stub
	}


	@Override
	public void updateData(LoanDetails loan) {
		int flag=1;
		 loan.setStatus(flag);
		 loan.setStatusName("Approved");
		hr.save(loan);
		
		// TODO Auto-generated method stub
		
	}

}

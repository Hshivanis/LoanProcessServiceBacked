package com.wcs.app.jf.main.service;

import com.wcs.app.jf.main.model.LoanDetails;

public interface RegisterServiceInterface 
{
public void RegisterDetails(LoanDetails ld);
public LoanDetails getSingleData(int loanId);
public void updateData(LoanDetails loan);



}

 package com.wcs.app.jf.main.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.wcs.app.jf.main.model.LoanDetails;

@Repository
public interface HomeRepository extends PagingAndSortingRepository<LoanDetails, Integer> 
{

	public LoanDetails save(LoanDetails ld);

	public LoanDetails findByLoanId(int loanId);

}

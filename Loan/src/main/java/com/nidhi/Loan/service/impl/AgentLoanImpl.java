package com.nidhi.Loan.service.impl;

import com.nidhi.Loan.entity.Loan;
import com.nidhi.Loan.enums.LoanStatus;
import com.nidhi.Loan.enums.LoanType;
import com.nidhi.Loan.repository.LoanRepository;
import com.nidhi.Loan.service.AgentLoanService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AgentLoanImpl implements AgentLoanService {
    @Autowired
    LoanRepository loanRepo;
    @Override
    public List<Loan> getLoanByLoanStatus(LoanStatus status) {

        return loanRepo.findByLoanStatus(status);
    }

    @Override
    public void changeLoanStatus(int loanId) {

    }

    @Override
    public void approveLoanClosure(int loanId) {

    }
    @Override
    public void cancelLoan(int loanId) {
         loanRepo.deleteById(loanId);

    }

    @Override
    public List<Loan> getLoanByLoanType(LoanType loanType) {
        //questionable
       return loanRepo.findByLoanType(loanType);
    }

    @Override
    public String getLoanCalcDetailsByLoanType(LoanType loanType) {

        String CalcDetails = "LoanType:"+loanType+"Interest rate:"+loanType.getLoanInterestRate();
        return CalcDetails;
    }

    @Override
    public void setLoanCalcDetailsByLoanType(LoanType loanType,double interestRate) {
        loanType.setLoanInterestRate(interestRate); // request to be sent to admin

    }
}

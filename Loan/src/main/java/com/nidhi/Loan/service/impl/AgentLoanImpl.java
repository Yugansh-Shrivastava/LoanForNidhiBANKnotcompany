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
        if(loanRepo.existsByLoanStatus(status)) {
            return loanRepo.findByLoanStatus(status);
        }
        else {
            return null;
        }
    }

    @Override
    public void changeLoanStatus(int loanId, LoanStatus loanStatus) {
        Loan loan =loanRepo.findById(loanId).orElseThrow();
        loan.setStatus(loanStatus);
    }

    @Override
    public void approveLoanClosure(int loanId) {
        Loan lon = loanRepo.findById(loanId).orElseThrow();
        LoanStatus status =lon.getStatus();
        if(status.equals("REQUESTEDFORFORECLOSURE")) {
            status = LoanStatus.valueOf("FORECLOSED");
            changeLoanStatus(loanId,status);
        }
    }
    @Override
    public void cancelLoan(int loanId) {
        If
        LoanStatus status = LoanStatus.valueOf("CLOSED");
        changeLoanStatus(loanId,status);

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
        loanType.setLoanInterestRate(interestRate);

    }
}

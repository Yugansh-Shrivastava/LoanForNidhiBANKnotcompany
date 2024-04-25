package com.nidhi.Loan.service.impl;

import com.nidhi.Loan.entity.Loan;
import com.nidhi.Loan.enums.LoanStatus;
import com.nidhi.Loan.enums.LoanType;
import com.nidhi.Loan.repository.LoanRepository;
import com.nidhi.Loan.service.AdminLoanService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AdminLoanImpl implements AdminLoanService {
    @Autowired
    LoanRepository loanRepo;

    @Override
    public List<Loan> getLoanRequestsByStatus(LoanStatus status) {
        return loanRepo.findByLoanStatus(status);
    }

    @Override
    public List<Loan> getLoanRequests() {
        return loanRepo.findAll();

    }
    @Override
    public List<Loan> getLoanRequestsByType(LoanType loanType) {
        return loanRepo.findByLoanType(loanType);
    }
}

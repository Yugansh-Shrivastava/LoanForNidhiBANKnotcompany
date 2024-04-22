package com.nidhi.Loan.service;

import com.nidhi.Loan.entity.Loan;
import com.nidhi.Loan.enums.LoanStatus;
import com.nidhi.Loan.enums.LoanType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AgentLoanService {
    List<Loan> getLoanByLoanStatus(LoanStatus status);
    void changeLoanStatus(int loanId);
    void approveLoanClosure(int loanId);// cancel loan + change repayment term
    void cancelLoan(int loanId); // will call delete Loan
    void cancelLoanApplication(Long loanId); // (Non-approved)
    List<Loan> getLoanByLoanType(LoanType loanType);
    String getLoanCalculationByLoanType(LoanType loanType);
    void setLoanCalculationByLoanType(double interestRate);
}

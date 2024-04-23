package com.nidhi.Loan.service;

import com.nidhi.Loan.entity.Loan;
import com.nidhi.Loan.enums.LoanStatus;
import com.nidhi.Loan.enums.LoanType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AgentLoanService {
    List<Loan> getLoanByLoanStatus(LoanStatus status);
    void changeLoanStatus(int loanId, LoanStatus loanStatus);
    void approveLoanClosure(int loanId);// cancel loan + change repayment term
    void cancelLoan(int loanId); // will call close Loan

    List<Loan> getLoanByLoanType(LoanType loanType);
    String getLoanCalcDetailsByLoanType(LoanType loanType);
    void setLoanCalcDetailsByLoanType(LoanType loanType, double interestRate);
}

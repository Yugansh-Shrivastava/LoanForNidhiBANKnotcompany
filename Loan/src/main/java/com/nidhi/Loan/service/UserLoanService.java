package com.nidhi.Loan.service;

import com.nidhi.Loan.entity.Loan;
import com.nidhi.Loan.enums.LoanStatus;
import com.nidhi.Loan.enums.LoanType;

import java.util.List;

public interface UserLoanService {

    // Users
    int maxApplicableLoan(int loanId);
    void applyLoan(Loan loan);
    LoanStatus checkLoanStatus(int loanId);
    int checkCurrentEMI(int loanId); // calculate EMI
    String payEMI(int loanId, int payedEMI);
    void applyLoanClosure(int loanId);

/*
    void changeLoanClosureDate(int loanId, int rePaymentTerm);

    //Agents
    List<Loan> getLoanByLoanStatus(LoanStatus status);
    void changeLoanStatus(int loanId);
    void approveLoanClosure(int loanId);// cancel loan + change repayment term
    void cancelLoan(int loanId); // will call delete Loan
    void cancelLoanApplication(int loanId); // (Non-approved)
    List<Loan> getLoanByLoanType(LoanType loanType);
    String getLoanCalculationByLoanType(LoanType loanType);
    void setLoanCalculationByLoanType(double interestRate);


    //Admin
    // (After mapping) List<Loan> getLoanRequestsByManager(int ManagerID);
    List<Loan> getLoanRequestsByStatus(LoanStatus status);
    List<Loan> getLoanRequests(LoanStatus status); // all requests differentiated by status
    List<Loan> getLoanRequests(LoanType loanType); // might convert this into chart form
    void approveLoanCalculationChange();

    // internal services
    List<Double> loanCalculation(int loanId, int time); // part of Loan Closure & Apply Loan
    void deleteLoan(int loanId);// for cancelLoan / closure

*/
}

package com.nidhi.Loan.service;

public interface InternalLoanServices {
    int totalLoanPayableAmountCalculation(int loanId);
    int monthlyEMICalculation(int loanId);
    int fineCalculator(int loanId);
}

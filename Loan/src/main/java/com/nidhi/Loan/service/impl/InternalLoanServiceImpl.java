package com.nidhi.Loan.service.impl;

import com.nidhi.Loan.entity.Loan;
import com.nidhi.Loan.repository.LoanRepository;
import com.nidhi.Loan.service.InternalLoanServices;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class InternalLoanServiceImpl implements InternalLoanServices {
    @Autowired
    LoanRepository loanRepository;
    @Override
    public int totalLoanPayableAmountCalculation(int loanId) {
        Loan currentLoan = loanRepository.findLoanbyLoanId(loanId);
        int n = currentLoan.getRePaymentTerm(); // Duration/Tenure of total loan divided by EMI term
        int totalLoanPayableAmount = monthlyEMICalculation(loanId)*n;
        return totalLoanPayableAmount;
    }

    @Override
    public int monthlyEMICalculation(int loanId) {
        Loan currentLoan = loanRepository.findLoanbyLoanId(loanId);
        int p = currentLoan.getLoanAmount(); // Principal Loan Amount
        int n = currentLoan.getRePaymentTerm(); // Duration/Tenure of total loan divided by EMI term
        double r = currentLoan.getInterestRate(); // rate of interest calculated div by EMI term

        int monthlyEMI = (int) (p*r*(Math.pow((1+r),n))/((Math.pow((1+r),n))-1));
        return monthlyEMI;
    }

    @Override
    public int fineCalculator(int loanId){
        /*
        int fine;
        check of penalty - returns no of penalty
        for(int i = 0; i<no of penalty;i++)
            fine = (int)(+ loanRepository.findEMIByLoanId(loanId)*0.1);
        */
        return 0;
    }
}

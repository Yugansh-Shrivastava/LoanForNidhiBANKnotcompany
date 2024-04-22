package com.nidhi.Loan.dto;

import com.nidhi.Loan.enums.LoanType;
import lombok.Data;

@Data
public class LoanDto {
    private int tenure;
    private double initialLoanAmount;
    private LoanType loanType;
}
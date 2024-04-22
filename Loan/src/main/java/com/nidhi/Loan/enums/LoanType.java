package com.nidhi.Loan.enums;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public enum LoanType {
    Gold(10),
    Vehicle(5),
    Appliance(7),
    Home(4);
    public double loanInterestRate;
    private LoanType(double loanInterestRate){this.loanInterestRate=loanInterestRate;}
}

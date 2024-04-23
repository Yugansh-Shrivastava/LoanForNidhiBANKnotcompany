package com.nidhi.Loan.enums;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
public enum LoanType {
    Gold(10),
    Vehicle(5),
    Appliance(7),
    Home(4);
    public double loanInterestRate;
    private LoanType(double loanInterestRate){this.loanInterestRate=loanInterestRate;}

    public void setLoanInterestRate(double loanInterestRate) {
        this.loanInterestRate = loanInterestRate;
    }
}

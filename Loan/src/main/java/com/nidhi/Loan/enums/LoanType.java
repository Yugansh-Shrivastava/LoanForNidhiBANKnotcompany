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
<<<<<<< HEAD
    LoanType(double loanInterestRate){this.loanInterestRate=loanInterestRate;}
=======
    private LoanType(double loanInterestRate){this.loanInterestRate=loanInterestRate;}

    public void setLoanInterestRate(double loanInterestRate) {
        this.loanInterestRate = loanInterestRate;
    }
>>>>>>> 1bbf30f0fb814170e93fc4dabb7ae2828bfe6e05
}

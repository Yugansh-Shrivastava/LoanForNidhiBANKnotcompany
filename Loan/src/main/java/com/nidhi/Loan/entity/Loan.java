package com.nidhi.Loan.entity;

import com.nidhi.Loan.enums.LoanStatus;
import com.nidhi.Loan.enums.LoanType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Loan {
    @Id
    private int loanId;
    private int loanAmount;
    private int rePaymentTerm;
    private double interestRate;
    private int EMI;
    private int fine;
    @Enumerated(EnumType.STRING)
    private LoanType loanType;
    @Enumerated(EnumType.STRING)
    private LoanStatus status;

    public void setInterestRate(LoanType loanType) {
        this.interestRate = loanType.loanInterestRate;
    }
//        @ManyToOne
//    @JoinColumn
//    private Accounts account;
//    @ManyToOne
//    @JoinColumn
//    private Agent agent;
//    @OneToMany(mappedBy = "loan", cascade = CascadeType.ALL)
//    private List<Transactions> transactionsList;
//    @OneToMany(mappedBy = "loan", cascade = CascadeType.ALL)
//    private List<Penalty> penalty;
}

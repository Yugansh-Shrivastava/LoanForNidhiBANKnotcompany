package com.nidhi.Loan.enums;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
public enum LoanStatus {
    APPLIED(),
    APPROVED(),
    SANCTIONED(),
    PENDING(),
    REJECTED(),
    REQUESTEDFORFORECLOSURE(),
    FORECLOSED(),
    CLOSED();
    public Date startDate;
    private LoanStatus (Date startDate){this.startDate=startDate;}
}
/*
Applied - User has applied
Approved - approved by agent
SANCTIONED - loan has been provided
Pending - EMI is being paid
Rejected - rejected by agent
RequestedForForeClosure - loan requested by user to be closed before/after repayment term
ForeClosed - loan  closed before/after repayment term
Closed - loan closed at repayment term
 */
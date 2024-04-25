package com.nidhi.Loan.service;

import com.nidhi.Loan.entity.Loan;
import com.nidhi.Loan.enums.LoanStatus;
import com.nidhi.Loan.enums.LoanType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminLoanService {
    List<Loan> getLoanRequestsByStatus(LoanStatus status);
    List<Loan> getLoanRequests(); // all requests differentiated by status
    List<Loan> getLoanRequestsByType(LoanType loanType); // might convert this into chart form


//    Get Loan Requests By Manager ID (Loan req differentiated by managers)	X
//    Loan Request Chart
//    Approve LoanCalc changes by agent

}

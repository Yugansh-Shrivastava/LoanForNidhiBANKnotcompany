package com.nidhi.Loan.controller;

import com.nidhi.Loan.entity.Loan;
import com.nidhi.Loan.enums.LoanStatus;
import com.nidhi.Loan.enums.LoanType;
import com.nidhi.Loan.service.AdminLoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminLoanController {
    @Autowired
    AdminLoanService adminLoanService;
    @GetMapping("/get-loan-request-by-status")
    public List<Loan> getLoanRequestsByStatus(@RequestBody LoanStatus status){
       return adminLoanService.getLoanRequestsByStatus(status);
    }
    @GetMapping("/get-loan-requests")
    public List<Loan> getLoanRequests(){
        return getLoanRequests();
    }
    @GetMapping("/get-loan-requests-by-type")
    List<Loan> getLoanRequestsByType(@RequestParam LoanType loanType){
        return getLoanRequestsByType(loanType);
    }
}

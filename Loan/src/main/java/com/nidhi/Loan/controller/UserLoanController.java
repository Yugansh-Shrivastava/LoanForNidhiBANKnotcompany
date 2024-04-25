package com.nidhi.Loan.controller;

import com.nidhi.Loan.entity.Loan;
import com.nidhi.Loan.enums.LoanStatus;
import com.nidhi.Loan.service.UserLoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserLoanController {
    @Autowired
    UserLoanService userLoanService;

    @GetMapping("/max-applicable-loan/{loanId}")
    public int maxApplicableLoan(@PathVariable int loanId){
        return userLoanService.maxApplicableLoan(loanId);
    }
    @PostMapping("/apply-loan")
    public void applyLoan(@RequestBody Loan loan){
        userLoanService.applyLoan(loan);
    }
    @GetMapping("/check-loan-status/{loanId}")
    public LoanStatus checkLoanStatus(@PathVariable int loanId){
        return userLoanService.checkLoanStatus(loanId);

    }
    @GetMapping("/check-current-status/{loanId}")
    public int checkCurrentEMI(@PathVariable int loanId){
        return userLoanService.checkCurrentEMI(loanId);

    }
    @PutMapping("/pay-emi/{loanId}")
    public String payEMI(@PathVariable int loanId,@RequestParam int payedEMI){
        return userLoanService.payEMI(loanId,payedEMI);

    }
    @PutMapping("/apply-loan-closure/{loanId}")
    public void applyLoanClosure(@PathVariable int loanId){
        userLoanService.applyLoanClosure(loanId);

    }

}

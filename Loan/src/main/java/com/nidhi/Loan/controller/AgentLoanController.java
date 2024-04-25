package com.nidhi.Loan.controller;

import com.nidhi.Loan.entity.Loan;
import com.nidhi.Loan.enums.LoanStatus;
import com.nidhi.Loan.enums.LoanType;
import com.nidhi.Loan.service.AgentLoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agent")
public class AgentLoanController {
    @Autowired
    AgentLoanService agentLoanService;
    @GetMapping("/get-loan-by-status")
    public List<Loan> getLoanByLoanStatus(@RequestParam LoanStatus status){
        return  agentLoanService.getLoanByLoanStatus(status);
    }
    @GetMapping("/change-loan-status")
    public void changeLoanStatus(@PathVariable int loanId, @RequestParam LoanStatus loanStatus){
        agentLoanService.changeLoanStatus(loanId,loanStatus);
    }
    @PutMapping("/approve-loan-closure/{loanId}")
    public void approveLoanClosure(@PathVariable int loanId){
        agentLoanService.approveLoanClosure(loanId);
    }// cancel loan + change repayment term
    @PutMapping("/cancel-loan/{loanId}")
    public  void cancelLoan(@PathVariable int loanId){
        agentLoanService.cancelLoan(loanId);
    } // will call close Loan
    @GetMapping("/get-loan-by-type")
    public List<Loan> getLoanByLoanType(@RequestParam LoanType loanType){
        return agentLoanService.getLoanByLoanType(loanType);
    }
    @GetMapping("/get-loan-details")
    public String getLoanCalcDetailsByLoanType(@RequestParam LoanType loanType){
       return  agentLoanService.getLoanCalcDetailsByLoanType(loanType);
    }
    @PutMapping("/set-loan-details")
    public void setLoanCalcDetailsByLoanType(@RequestParam LoanType loanType, @RequestParam double interestRate){
        agentLoanService.setLoanCalcDetailsByLoanType(loanType,interestRate);
    }
}

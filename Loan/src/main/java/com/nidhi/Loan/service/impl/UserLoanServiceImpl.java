package com.nidhi.Loan.service.impl;
import com.nidhi.Loan.entity.Loan;
import com.nidhi.Loan.enums.LoanStatus;
import com.nidhi.Loan.repository.LoanRepository;
import com.nidhi.Loan.service.UserLoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoanServiceImpl implements UserLoanService {
    @Autowired
    LoanRepository loanRepository;
    @Override
    public int maxApplicableLoan(int loanId) {// For User must take acc id as input later
        //return (loanRepository.findAccountBalanceByLoanId(loanId)*10);
        return loanRepository.findLoanAmountByLoanId(loanId);
    }
    @Override
    public void applyLoan(Loan loan) {// For User
        Loan currentLoan = new Loan();
        currentLoan.setLoanAmount(loan.getLoanAmount());
        currentLoan.setLoanType(loan.getLoanType());
        currentLoan.setRePaymentTerm(loan.getRePaymentTerm());
        currentLoan.setStatus(LoanStatus.APPLIED);
        loanRepository.save(currentLoan);
    }
    @Override
    public LoanStatus checkLoanStatus(int loanId) {// For User
        return loanRepository.findStatusByLoanId(loanId);
    }
    @Override
    public int checkCurrentEMI(int loanId){
        int currentEMI = loanRepository.findEMIByLoanId(loanId);
        if(loanRepository.findFineByLoanId(loanId) != 0)
            currentEMI =+ loanRepository.findFineByLoanId(loanId);
        return currentEMI;
    }
    @Override
    public String payEMI(int loanId, int payedEMI) {
        int currentEMI = checkCurrentEMI(loanId);
        Loan currentLoan = loanRepository.findLoanbyLoanId(loanId);
        if (loanRepository.findEMIByLoanId(loanId) == currentEMI) {
            currentLoan.setLoanAmount(currentLoan.getLoanAmount() - currentEMI);
            return "EMI payed";
        } else if (currentEMI != loanRepository.findEMIByLoanId(loanId)){
            return  "You have not entered the correct amount. " +
                    "You need to enter"+currentEMI+
                    ". Please enter the correct amount before due date";
       }
        else
            return "Invalid data";
    }
    @Override
    public void applyLoanClosure(int loanId){
        Loan currentLoan = loanRepository.findLoanbyLoanId(loanId);
        currentLoan.setStatus(LoanStatus.REQUESTEDFORFORECLOSURE);
    }
//    @Override
//    public void changeLoanClosureDate(int loanId, int rePaymentTerm){
//        Loan currentLoan = loanRepository.findLoanbyLoanId(loanId);
//        if(currentLoan.getStatus() == FORECLOSED)
//
//    }
}

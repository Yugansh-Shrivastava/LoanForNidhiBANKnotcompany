package com.nidhi.Loan.repository;

import com.nidhi.Loan.entity.Loan;
import com.nidhi.Loan.enums.LoanStatus;
import com.nidhi.Loan.enums.LoanType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Integer> {
    int findLoanAmountByLoanId(int loanId);

    LoanStatus findStatusByLoanId(int loanId);

    int findEMIByLoanId(int loanId);

    int findFineByLoanId(int loanId);

    Loan findLoanbyLoanId(int loanId);
}

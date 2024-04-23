package com.nidhi.Loan.repository;

import com.nidhi.Loan.entity.Loan;
import com.nidhi.Loan.enums.LoanStatus;
import com.nidhi.Loan.enums.LoanType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
<<<<<<< HEAD
public interface LoanRepository extends JpaRepository<Loan, Integer> {
=======
public interface LoanRepository extends JpaRepository<Loan,Integer> {
>>>>>>> d6388f441d02194fda510c99b0579686e41bdf1b
    int findLoanAmountByLoanId(int loanId);

    LoanStatus findStatusByLoanId(int loanId);

    int findEMIByLoanId(int loanId);

    int findFineByLoanId(int loanId);

    Loan findLoanbyLoanId(int loanId);

    List<Loan> findByLoanType(LoanType loanType);

    List<Loan> findByLoanStatus(LoanStatus status);
}

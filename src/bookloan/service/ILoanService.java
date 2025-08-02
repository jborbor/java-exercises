package bookloan.service;

import bookloan.model.LoanReport;
import bookloan.model.Loan;

import java.time.LocalDate;
import java.util.List;

public interface ILoanService {
    void registerLoan(Loan loan);
    List<Loan> listLoans();
    List<Loan> filterLoansByDateRange(LocalDate startDate, LocalDate endDate);
    List<Loan> filterLoansByDniStudent(String studentDni);
    Loan findLoanById(String loanId);

    List<LoanReport> getLoansByDateRange(LocalDate startDate, LocalDate endDate);
}

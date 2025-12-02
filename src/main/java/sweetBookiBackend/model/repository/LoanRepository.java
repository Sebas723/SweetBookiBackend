package sweetBookiBackend.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sweetBookiBackend.model.entity.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
}

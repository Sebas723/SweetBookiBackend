package sweetBookiBackend.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "loans")
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idLoan;

    private LocalDate loanDate;
    private LocalDate returnDeadline;
    private LocalDate returnDate;
    private String loanState;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private User users;

    // LOAN → BOOK COPY
    @ManyToOne
    @JoinColumn(name = "idBookEdition")
    private BookEditions editions;
}

package sweetBookiBackend.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "bookEditions")
public class BookEditions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBookEdition;

    private String language;
    private String state;
    private String codeInventory;
    private LocalDate dateAdded;

    @ManyToOne
    @JoinColumn(name = "idBook")
    private Book books;

    // COPY → LOAN
    @OneToMany(mappedBy = "editions")
    private List<Loan> loans;
}

package sweetBookiBackend.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBook;

    private String title;
    private String description;
    private LocalDate publicationDate;
    private LocalDate registrationDate;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private User users;

    // BOOK → BOOK COPY
    @OneToMany(mappedBy = "books")
    private List<BookEditions> editions;
}

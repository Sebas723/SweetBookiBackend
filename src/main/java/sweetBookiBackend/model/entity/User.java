package sweetBookiBackend.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUser;

    private String role;
    private String firstName;
    private String secondName;
    private String lastName;
    private String docType;

    @Column(name = "docNumber",unique = true, nullable = false)
    private String docNumber;

    private String phoneNumber;
    private LocalDate birthDate;

    @Column(name = "email",unique = true, nullable = false)
    private String email;

    private String password;
    private String guardianName;
    private String guardianDocType;
    private String guardianDocNumber;
    private String guardianPhoneNumber;

    @OneToMany(mappedBy = "users")
    private List<Book> books;

    @OneToMany(mappedBy = "users")
    private List<Loan> loans;

    //GETTERS
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    //SETTERS
    public void setRole(String role) {
        this.role = role;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

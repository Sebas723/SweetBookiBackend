package sweetBookiBackend.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class RegisterRequest {
    @NotBlank(message = "El primer nombre es obligatorio")
    private String firstName;

    private String secondName;

    @NotBlank(message = "El apellido es obligatorio")
    private String lastName;

    @NotBlank(message = "El tipo de documento es obligatorio")
    private String docType;

    @NotBlank(message = "El número de documento es obligatorio")
    private String docNumber;

    private String phoneNumber;

    @NotNull(message = "La fecha de nacimiento es obligatoria")
    private LocalDate birthDate;

    @Email(message = "El correo no tiene un formato válido")
    @NotBlank(message = "El correo es obligatorio")
    private String email;

    @NotBlank(message = "La contraseña es obligatoria")
    private String password;

    private String guardianName;
    private String guardianDocType;
    private String guardianDocNumber;
    private String guardianPhoneNumber;

    public @NotBlank(message = "El primer nombre es obligatorio") String getFirstName() {
        return firstName;
    }

    public @NotBlank(message = "El apellido es obligatorio") String getLastName() {
        return lastName;
    }

    public @NotBlank(message = "El tipo de documento es obligatorio") String getDocType() {
        return docType;
    }

    public @NotBlank(message = "El número de documento es obligatorio") String getDocNumber() {
        return docNumber;
    }

    public @NotNull(message = "La fecha de nacimiento es obligatoria") LocalDate getBirthDate() {
        return birthDate;
    }

    public @Email(message = "El correo no tiene un formato válido") @NotBlank(message = "El correo es obligatorio") String getEmail() {
        return email;
    }

    public @NotBlank(message = "La contraseña es obligatoria") String getPassword() {
        return password;
    }
}

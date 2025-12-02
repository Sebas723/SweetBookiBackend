package sweetBookiBackend.model.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sweetBookiBackend.model.dto.LoginAuthResponse;
import sweetBookiBackend.model.dto.LoginRequest;
import sweetBookiBackend.model.dto.RegisterRequest;
import sweetBookiBackend.model.entity.User;
import sweetBookiBackend.model.repository.UserRepository;
import sweetBookiBackend.model.exceptions.DocNumAlreadyRegistered;
import sweetBookiBackend.model.exceptions.EmailAlreadyRegistered;

@Service
public class AuthService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private JwtService jwtService;

    public String register(RegisterRequest request){
        if(userRepository.existsByEmail(request.getEmail())){
            throw new EmailAlreadyRegistered("El correo ya se encuentra registrado");
        }

        if(userRepository.existsByDocNumber(request.getDocNumber())){
            throw new DocNumAlreadyRegistered("El numero de documento ya se encuentra registrado");
        }

        User user = new User();
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setDocType(request.getDocType());
        user.setDocNumber(request.getDocNumber());
        user.setBirthDate(request.getBirthDate());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setRole("user");

        userRepository.save(user);

        return "Usuario registrado ecxitosamente.";
    }

    public LoginAuthResponse login(LoginRequest request) {

        User user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new RuntimeException("Credenciales incorrectas"));

        if (!user.getPassword().equals(request.getPassword())) {
            throw new RuntimeException("Las credenciales son incorrectas");
        }

        String token = jwtService.generateToken(user.getEmail());

        return new LoginAuthResponse(token);
    }
}

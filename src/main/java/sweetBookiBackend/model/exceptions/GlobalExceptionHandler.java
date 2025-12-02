package sweetBookiBackend.model.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EmailAlreadyRegistered.class)
    public ResponseEntity<?> handleEmailAlreadyRegistered (EmailAlreadyRegistered ex){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("email", ex.getMessage()));
    }

    @ExceptionHandler(DocNumAlreadyRegistered.class)
    public ResponseEntity<?> handleDocNumAlreadyRegistered (DocNumAlreadyRegistered ex){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("doc_number", ex.getMessage()));
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<?> handleRunTime(RuntimeException ex){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Map.of("error", ex.getMessage()));
    }
}

package sweetBookiBackend.model.exceptions;

public class EmailAlreadyRegistered extends RuntimeException{
    public EmailAlreadyRegistered() {
        super();
    }

    public EmailAlreadyRegistered(String message){
        super(message);
    }
}

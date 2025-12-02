package sweetBookiBackend.model.exceptions;

public class DocNumAlreadyRegistered extends RuntimeException{
    public DocNumAlreadyRegistered(){
        super();
    }

    public DocNumAlreadyRegistered(String message){
        super(message);
    }
}

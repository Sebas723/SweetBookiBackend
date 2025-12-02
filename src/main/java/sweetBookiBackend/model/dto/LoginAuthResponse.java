package sweetBookiBackend.model.dto;

public class LoginAuthResponse {
    private String token;

    public LoginAuthResponse() {}

    public LoginAuthResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

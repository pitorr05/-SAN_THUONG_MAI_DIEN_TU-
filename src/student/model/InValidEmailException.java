
package student.model;

public class InValidEmailException extends Exception {
    private String email;

    public InValidEmailException(String email, String message) {
        super(message);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}

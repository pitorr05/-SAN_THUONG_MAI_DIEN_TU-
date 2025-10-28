
package student.model;

public class InValidPhoneException extends Exception{
    private String phone;

    public InValidPhoneException(String phone, String message) {
        super(message);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
}

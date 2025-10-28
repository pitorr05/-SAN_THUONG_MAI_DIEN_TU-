
package book.Controller;

public class InValidPriceException extends Exception{
   
    private String price;

    public InValidPriceException(String price, String message) {
        super(message);
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
    
}

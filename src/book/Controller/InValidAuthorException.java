
package book.Controller;

public class InValidAuthorException extends Exception{
    
    private String author;

    public InValidAuthorException(String author, String message) {
        super(message);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    
}

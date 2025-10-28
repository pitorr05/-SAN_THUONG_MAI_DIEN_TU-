
package book.Controller;

public interface DataInValidException {

    public Boolean inValidAuthorException(String author)  throws InValidAuthorException;
    public Boolean inVaildPriceException(String price) throws InValidPriceException;
    
}

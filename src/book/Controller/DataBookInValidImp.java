
package book.Controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataBookInValidImp implements DataInValidException  {

    @Override
    public Boolean inValidAuthorException(String author) throws InValidAuthorException{
        String regex = "^[^0-9!@#$%^&*()-=<>/;?':_]{2,40}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(author);
        if (matcher.matches()) {
           return true;
        } else {
            throw  new InValidAuthorException(author, "Tên tác giả không hợp lệ");
        }
    }

    @Override
    public Boolean inVaildPriceException(String price) throws InValidPriceException{
        String regex = "^[0-9]+[.]*[0-9]*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(price);
        if (matcher.matches()) {
           return true;
        } else {
            throw  new InValidPriceException(price, "Giá tiền không hợp lệ.");
           
        }
    }
    
}

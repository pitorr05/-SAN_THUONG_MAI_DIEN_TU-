/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package book.Controller;

/**
 *
 * @author DELL
 */
public interface DataInValidException {

    /**
     *
     * @param author
     * @return
     * @throws book.Controller.InValidAuthorException
     */
    public Boolean inValidAuthorException(String author)  throws InValidAuthorException;

    /**
     *
     * @param price
     * @return
     * @throws book.Controller.InValidPriceException
     */
    public Boolean inVaildPriceException(String price) throws InValidPriceException;
    
}

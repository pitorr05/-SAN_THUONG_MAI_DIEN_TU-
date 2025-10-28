
package book.Controller;

import book.Model.Book;
import java.util.ArrayList;

public interface DataBookFuction  {
    
    public void readBookSQL(ArrayList<Book> listBook);
    public int writeBookSQL(Book b);
    public int updateBookSQL(Book b);
    public int delBookSQL(Book b);
    public ArrayList<Book> seachByNameBook(ArrayList<Book> listBook,String bookName);
    public ArrayList<Book> seachByAuthor(ArrayList<Book> listBook, String authorName);
    public Book seachBookId(ArrayList<Book> listBook,String bookId); 
    
}

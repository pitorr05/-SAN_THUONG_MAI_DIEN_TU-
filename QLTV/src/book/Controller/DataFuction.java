/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package book.Controller;

import book.Model.Book;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public interface DataFuction  {
    public void readBookSQL(ArrayList<Book> listBook);
    public int writeBookSQL(Book b);
    public int updateBookSQL(Book b);
    public int delBookSQL(Book b);
    public ArrayList<Book> seachByNameBook(ArrayList<Book> listBook,String bookName);
    public ArrayList<Book> seachByAuthor(ArrayList<Book> listBook, String authorName);
    public Book seachBookId(ArrayList<Book> listBook,String bookId); 
}

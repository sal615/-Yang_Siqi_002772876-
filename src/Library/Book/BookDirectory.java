/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Book;

import Library.Author.Author;
import Library.Genre.Genre;
import java.util.ArrayList;

/**
 *
 * @author siqiyang
 */
public class BookDirectory {
    ArrayList<Book> bookList;
    
    public BookDirectory(){
    this.bookList=new ArrayList<Book>();
    }

    public BookDirectory(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }
    
    public Book createBook(String name, int registeredDate, boolean isAvailablityFlag,int noOfPages, String language, String typeOfBinding, Author author, Genre genre) {
        Book book = new Book( name, registeredDate, isAvailablityFlag,noOfPages, language, typeOfBinding, author, genre);
        
        this.bookList.add(book);
        return book;
    }
    
    
}

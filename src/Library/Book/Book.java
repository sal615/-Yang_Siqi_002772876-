/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Book;

import Library.Author.Author;
import Library.Genre.Genre;
import Material.Material;

/**
 *
 * @author siqiyang
 */
public class Book extends Material{
    int noOfPages;
    String language;
    String typeOfBinding;
    Author author;
    Genre genre;

    public Book() {
        
    }
    public Book(String name, int registeredDate) {
        super( name, registeredDate);
    }
    
    public Book( String name, int registeredDate, int noOfPages, String language, String typeOfBinding, Author author, Genre genre) {
        super( name, registeredDate);
        this.noOfPages = noOfPages;
        this.language = language;
        this.typeOfBinding = typeOfBinding;
        this.author = author;
        this.genre = genre;
    }


    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    public void setTypeOfBinding(String typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    
}

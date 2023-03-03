/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RentalService;


import Customer.Customer;
import Library.Book.Book;
import Library.General.Magazine;
import Library.Library;


/**
 *
 * @author siqiyang
 */
public class RentalRequest {
    private static int count = 0;    
    String rentalID;
    int price ;
    String status;
    int duration;
    Book book;
    Magazine magazine;
    Customer customer;
    Library lib;
    

    public RentalRequest( int duration, Book book, Magazine magazine, Customer customer, Library lib) {
        this.count++;     
        this.rentalID = "ORDERNO"+this.count;
        this.price = 1;
        this.status = "Created";
        this.duration = duration;
        this.book = book;
        this.magazine = magazine;
        this.customer = customer;
        this.lib=lib;
    }




    public String getID() {
        return rentalID;
    }

    public void setID(String ID) {
        this.rentalID = ID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String Status) {
        this.status = Status;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Magazine getMagazine() {
        return magazine;
    }

    public void setMagazine(Magazine magazine) {
        this.magazine = magazine;
    }
            
    
}

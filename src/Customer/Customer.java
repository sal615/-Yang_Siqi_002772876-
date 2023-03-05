/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import Library.Book.Book;
import Library.General.Magazine;
import Library.Library;
import Profile.Profile;
import RentalService.RentalRequest;
import java.util.ArrayList;


/**
 *
 * @author siqiyang
 */
public class Customer extends Profile {
    ArrayList<RentalRequest> rentalrequest;

    public Customer() {
        super(); 
        this.rentalrequest=new ArrayList<RentalRequest>();
    }
    
    public Customer(String name, String id) {
        super(name, id);
    }

    public Customer(ArrayList<RentalRequest> rentalrequest) {
        this.rentalrequest = rentalrequest;
    }

    public Customer(ArrayList<RentalRequest> rentalrequest, String name, String id) {
        super(name, id);
        this.rentalrequest = rentalrequest;
    }
    

    public ArrayList<RentalRequest> getRentalrequest() {
        return rentalrequest;
    }

    public void setRentalrequest(ArrayList<RentalRequest> rentalrequest) {
        this.rentalrequest = rentalrequest;
    }
    
    public RentalRequest createRentalrequest( int duration, Book book, Magazine magazine, Customer customer, Library lib){
        RentalRequest rental = new RentalRequest();
        rental.setBook(book);
        rental.setLib(lib);
        lib.getRentalrequest().getRentalRequestList().add(rental);
        rental.setMagazine(magazine);
        rental.setDuration(duration);
        this.rentalrequest.add(rental);
        return rental;
        
    }
    

     


    
    
    
    
}

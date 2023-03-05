/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AppSystem;

import UserAccount.UserAccountDirectory;
import Library.Library;
import RentalService.RentalRequest;
import java.util.ArrayList;

/**
 *
 * @author siqiyang
 */
public class Branch {
    String name;
    Library library;
    UserAccountDirectory branchuseraccountDirectory;
    
    Branch(String name) {
        this.name = name;
        this.branchuseraccountDirectory = new UserAccountDirectory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserAccountDirectory getBranchuseraccountDirectory() {
        return branchuseraccountDirectory;
    }

    public void setBranchuseraccountDirectory(UserAccountDirectory branchuseraccountDirectory) {
        this.branchuseraccountDirectory = branchuseraccountDirectory;
    }

    public Library getLibrary() {
        return this.library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
    

    
    public Library getLibrary(String buildingNo){
        return library;
    }
    
    
    public Library createLibrary(String buildingNo) {
        this.library = new Library(buildingNo);
        return this.library;
    }
    
    public int totalRevenue(){
        int totalRevenue =0;
        for(RentalRequest rr:library.getRentalrequest().getRentalRequestList()){
           
            if(rr.getStatus().equals("Approve")||rr.getStatus().equals("Return")){
                totalRevenue += rr.getPrice();
            }
        }
        return totalRevenue;
    }
   

     
    
    @Override
    public String toString() {
        return String.valueOf(name);
    }
        
    
    
    
}

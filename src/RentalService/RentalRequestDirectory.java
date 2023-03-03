/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RentalService;

import java.util.ArrayList;

/**
 *
 * @author siqiyang
 */
public class RentalRequestDirectory {
    ArrayList<RentalRequest> rentalRequestList;
    
    public RentalRequestDirectory(){
        this.rentalRequestList = new ArrayList<RentalRequest>();
    }

    public RentalRequestDirectory(ArrayList<RentalRequest> rentalRequestList) {
        this.rentalRequestList = rentalRequestList;
    }

    public ArrayList<RentalRequest> getRentalRequestList() {
        return rentalRequestList;
    }

    public void setRentalRequestList(ArrayList<RentalRequest> rentalRequestList) {
        this.rentalRequestList = rentalRequestList;
    }
    
}

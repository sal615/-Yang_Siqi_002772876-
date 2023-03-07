/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import RentalService.RentalRequest;
import java.util.ArrayList;

/**
 *
 * @author siqiyang
 */
public class CustomerDirectory {
    ArrayList<Customer> customerList;
    
    

    public CustomerDirectory() {
        this.customerList = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
       
    public Customer findById(String id) {
        for(Customer c: this.customerList) {
            if(c.getId().equals(id)) {
                return c;
            }
        }
        
        return null;
    }
    
//    public Customer createCustomer(String id, String name, RentalRequest rentalrequest) {
//        Customer c = new Customer();
//        c.setId(id);
//        c.setName(name);
//      
//        this.customerList.add(c);
//        return c;
//    } 
    
        public Customer createCustomer(String id, String name) {
        Customer c = new Customer();
        c.setId(id);
        c.setName(name);
      
        this.customerList.add(c);
        return c;
    } 
}

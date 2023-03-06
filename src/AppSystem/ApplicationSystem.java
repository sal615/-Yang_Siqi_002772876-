/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AppSystem;

import UserAccount.UserAccountDirectory;
import Customer.CustomerDirectory;
import Library.Book.Book;
import Library.General.Magazine;
import Library.Library;
import Material.Material;
import Role.SystemAdminRole;
import java.util.ArrayList;



/**
 *
 * @author siqiyang
 */
public class ApplicationSystem {
    ArrayList<Branch> branches;
    CustomerDirectory customerDirectory;
    UserAccountDirectory systemAdminAccount;
    
    ApplicationSystem() {
        this.branches = new ArrayList<Branch>();
        this.systemAdminAccount = new UserAccountDirectory();
        this.systemAdminAccount.createUserAccount("admin", "admin", new SystemAdminRole());
        this.customerDirectory=new CustomerDirectory();
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void setBranches(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public UserAccountDirectory getSystemAdminAccount() {
        return systemAdminAccount;
    }

    public void setSystemAdminAccount(UserAccountDirectory systemAdminAccount) {
        this.systemAdminAccount = systemAdminAccount;
    }
    
    
    public Branch createBranch(String name) {
        Branch branch = new Branch(name);
        this.branches.add(branch);
        return branch;
    }
    

    
    public static ApplicationSystem getInstance() {
        return new ApplicationSystem();
    }
    
    public Branch getBranch(String name){
       for( Branch br: branches){
           if(br.getName().equals(name)){
               return br;
           }
       } return null;
    }
    
    public void deleteBranch(Branch branch){
        branches.remove(branch);
    }
    
    public Branch getBranchforLib(Library lib){
       for( Branch br: branches){
           if(br.getLibrary().equals(lib)){
               return br;
           }
       } return null;
    } 
    
    public Branch findBranchByMaterial(Material material){
        for (Branch br: branches){
            for(Book b: br.getLibrary().getBookDirectory().getBookList()){
                if(b==material){
                    return br;
                }
            }
            for (Magazine m: br.getLibrary().getGeneralDirectory().getMagazineList()){
                if(m==material){
                    return br;
                }
            }
           
        }
        return null;
        
    }
    
        public Branch findBranchBySerial(String serial){
        for (Branch br: branches){
            for(Book b: br.getLibrary().getBookDirectory().getBookList()){
                if(b.getSerialNumber().equals(serial)){
                    return br;
                }
            }
            for (Magazine m: br.getLibrary().getGeneralDirectory().getMagazineList()){
                if(m.getSerialNumber().equals(serial)){
                    return br;
                }
            }
           
        }
        return null;
        
    }
    
    

    
}

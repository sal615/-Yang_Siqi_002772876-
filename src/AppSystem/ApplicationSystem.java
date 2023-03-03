/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AppSystem;

import UserAccount.UserAccountDirectory;
import Customer.CustomerDirectory;
import Library.Library;
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
    

    
    // admin amdin for the role systemadmin
//    public Boolean checkAdminCredentials(String username, String password) {
//        // check if the username and password is equal to the systemadminaccount object's username and password
//        // return true;
//    }
}

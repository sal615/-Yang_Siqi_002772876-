package UserAccount;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import UserAccount.UserAccount;
import Role.Role;
import java.util.ArrayList;

/**
 *
 * @author siqiyang
 */
public class UserAccountDirectory {
    ArrayList<UserAccount> userAccountList;

    
    public UserAccountDirectory() {
        this.userAccountList = new ArrayList<UserAccount>();
    }
    
     public String[] getAllRoles() {
       return Role.getRoles();
    }
       
     
    public ArrayList<UserAccount> getUseraccountList() {
        return userAccountList;
    }

    public void setUseraccountList(ArrayList<UserAccount> useraccountlist) {
        this.userAccountList = userAccountList;
    } 
    

    public UserAccount createUserAccount(String name, String password, Role role) {
        UserAccount user = new UserAccount(name, password, role);
        this.userAccountList.add(user);
        return user;
    }
    
    public UserAccount authenticateUser(String name, String password) {
        for(UserAccount ua: this.userAccountList) {
            if(ua.getUserName().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }   
        
    public UserAccount findById(String id) {
        for(UserAccount u: this.userAccountList) {
            if(u.getAccountId().equals(id)) {
                return u;
            }
        }
        
        return null;
    }
    
    public UserAccount getUserAccount(String username, String password, Role role) {
        for(UserAccount u: this.userAccountList) {
            if(u.getUserName().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role)) {
                return u;
            }
        }
        
        return null;
    }
    
    public Boolean accountExists(String username, String password) {
        for(UserAccount u: this.userAccountList) {
            if(u.getUserName().equals(username) && u.getPassword().equals(password)) {
                return true;
            }
        }
        
        return false;
    }    
}

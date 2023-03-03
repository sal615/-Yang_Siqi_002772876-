/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserAccount;

import AppSystem.ApplicationSystem;
import AppSystem.ApplicationSystem;
import Role.BranchAdminRole;
import Role.Role;
import AppSystem.Branch;
import UI.CustomerWorkArea.CustomerJFrame;
import UI.LibrarianWorkArea.LibrarianJFrame;
import javax.swing.JFrame;

/**
 *
 * @author siqiyang
 */
public class UserAccount {
    private static int counter = 0;
    String accountId;
    String userName;
    String password;
    Role role;



    public UserAccount(String userName, String password, Role role) {
        this.accountId = "user" + this.counter++;
        this.userName = userName;
        this.password = password;
        this.role = role;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        UserAccount.counter = counter;
    }



    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }



    
    

//    public JFrame createWorkArea(String role, ApplicationSystem appSystem, UserAccount useraccount) {
//        // the abstract class way
//        if (role.equals("Branch Manager")) {
//            return new BranchAdminRole().createWorkArea(appSystem, branch, useraccount);
//        }
//        if (role.equals("Customers")) {
//            //return new CustomerJFrame(appSystem, useraccount);
//        }
//        if (role.equals("Librarian")) {
//            //return new LibrarianJFrame(appSystem, useraccount);
//        }
//        if(role.equals("systemadmin")) {
//            // return new SystemAdminRole().getWorkArea(appSystem, branch, useraccount)
//        }
//        return null;
//    }



    
    
}

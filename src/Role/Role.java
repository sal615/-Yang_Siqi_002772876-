/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import AppSystem.ApplicationSystem;
import UserAccount.UserAccount;
import AppSystem.Branch;
import javax.swing.JFrame;

/**
 *
 * @author siqiyang
 */
public abstract class Role {
    private static String[] roles = {"System Admin","Branch Manager","Librarian", "customer" };

    public static String[] getRoles() {
        return roles;
    }
    
//    
//    public static String getRole(int role){
//        return roles[role];
//    }
//    
    public abstract JFrame createWorkArea(ApplicationSystem applicationSystem, Branch branch, UserAccount useraccount);
        
}

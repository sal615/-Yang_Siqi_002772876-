/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import AppSystem.ApplicationSystem;
import AppSystem.Branch;
import UI.LibrarianWorkArea.LibrarianJFrame;
import UserAccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author siqiyang
 */
public class LibrarianRole extends Role{
    static final int role = 2;

    public static int getRole() {
        return role;
    }
    
    @Override
    public JFrame createWorkArea(ApplicationSystem applicationSystem, Branch branch, UserAccount useraccount) {
        return new LibrarianJFrame(applicationSystem, branch, useraccount);
    }
    
}

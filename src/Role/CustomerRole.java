/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import AppSystem.ApplicationSystem;
import AppSystem.Branch;
import UI.CustomerWorkArea.CustomerJFrame;
import UserAccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author siqiyang
 */
public class CustomerRole extends Role {


    @Override
    public JFrame createWorkArea(ApplicationSystem applicationSystem, Branch branch, UserAccount useraccount) {
        return new CustomerJFrame(applicationSystem, branch, useraccount);
    }
    
}

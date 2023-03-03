/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SystemAdminWorkArea;

import AppSystem.ApplicationSystem;
import AppSystem.Branch;
import Library.Library;
import Role.Role;
import UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author siqiyang
 */
public class BranchManagementJPanel extends javax.swing.JPanel {
    private ApplicationSystem appSystem;
    private Branch branch;
    private Library library;
    private UserAccount useraccount;
    DefaultTableModel viewtableModel;
    /**
     * Creates new form LibraianManagement
     */

    
    public BranchManagementJPanel(ApplicationSystem appSystem, Branch branch, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);

        this.appSystem = appSystem;
        this.branch=branch;
        this.useraccount = useraccount;
        this.viewtableModel = (DefaultTableModel) jTable1.getModel();
        
        displayBranchInfo();
    }  
    
 


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addBranchBtn = new javax.swing.JButton();
        branchField = new javax.swing.JTextField();
        branchNameLabel = new javax.swing.JLabel();
        libraryLabel = new javax.swing.JLabel();
        libraryField = new javax.swing.JTextField();
        DeleteBranchBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Branch Name", "Library Building no."
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 350, 120));

        addBranchBtn.setText("Add Branch and Library");
        addBranchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBranchBtnActionPerformed(evt);
            }
        });
        add(addBranchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));
        add(branchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 160, -1));

        branchNameLabel.setText("Branch Name:");
        add(branchNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        libraryLabel.setText("Library Building No.");
        add(libraryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));
        add(libraryField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 160, -1));

        DeleteBranchBtn.setText("Delete Branch and Library");
        DeleteBranchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBranchBtnActionPerformed(evt);
            }
        });
        add(DeleteBranchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addBranchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBranchBtnActionPerformed
        // TODO add your handling code here:
        this.branch = this.appSystem.createBranch(branchField.getText());
        this.library=this.branch.createLibrary(libraryField.getText());
        branch.setLibrary(library);


        JOptionPane.showMessageDialog(null, "Branch and Library Created");
        displayBranchInfo();

    }//GEN-LAST:event_addBranchBtnActionPerformed

    private void DeleteBranchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBranchBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        
        if(selectedRow >=0){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete the applicant details?", "Warning", dialogButton);
            if(dialogResult == JOptionPane.YES_NO_OPTION){
                Branch deletedB = (Branch) jTable1.getValueAt(selectedRow, 0);
                appSystem.deleteBranch(deletedB);
                
                displayBranchInfo();
                
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Please select a row to delete");
        }        
    }//GEN-LAST:event_DeleteBranchBtnActionPerformed
    public void displayBranchInfo() {
        
        ArrayList<Branch> branch = this.appSystem.getBranches();
        
        if(branch.size()>0){
            viewtableModel.setRowCount(0);
            for (Branch br : branch){
                Object row[] = new Object[2];
                row[0] = br;
                row[1] = br.getLibrary().getBuildingNo();
             
                viewtableModel.addRow(row);
            }
            
        } else {
            System.out.print("");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteBranchBtn;
    private javax.swing.JButton addBranchBtn;
    private javax.swing.JTextField branchField;
    private javax.swing.JLabel branchNameLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField libraryField;
    private javax.swing.JLabel libraryLabel;
    // End of variables declaration//GEN-END:variables
}

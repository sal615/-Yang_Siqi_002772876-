/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.CustomerWorkArea;

import AppSystem.ApplicationSystem;
import AppSystem.Branch;
import Customer.Customer;
import Library.Book.Book;
import Library.General.Magazine;
import Library.Library;
import RentalService.RentalRequest;
import UI.MainJFrame;
import UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author siqiyang
 */
public class CustomerJFrame extends javax.swing.JFrame {
    private ApplicationSystem appSystem; 
    private Branch branch;
    private Library library;
    private Book book; 
    private Magazine magazine;
    private RentalRequest rentalrequest;

    private UserAccount useraccount;
    DefaultTableModel booktableModel;
    DefaultTableModel magazinetableModel;
    DefaultTableModel historytableModel;
    private Customer c;
    /**
     * Creates new form CustomerJFrame
     */
    public CustomerJFrame() {
        initComponents();
    }
    
    public CustomerJFrame(ApplicationSystem appSystem, Branch branch, UserAccount useraccount) {
       initComponents();
       this.setVisible(true);
       
       this.appSystem = appSystem;
       this.branch = branch;
       this.useraccount = useraccount;
       this.booktableModel = (DefaultTableModel) bookTable.getModel();
       this.magazinetableModel = (DefaultTableModel) magazinelTable.getModel();
       this.historytableModel=(DefaultTableModel)rentalHistoryTable.getModel();
       this.c = this.appSystem.getCustomerDirectory().findById(this.useraccount.getAccountId());
       this.library =library;
       displayBookInfo();
       displayMagazineInfo();
       displayHistory();
       


    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        rentalHistoryTable = new javax.swing.JTable();
        rentBtn = new javax.swing.JButton();
        rentDurationField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        magazinelTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Branch", "Library", "Serieal Number", "Book Name", "Avaliablity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        bookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bookTable);

        rentalHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Status", "Price", "Rent Duration", "book", "magazin"
            }
        ));
        jScrollPane2.setViewportView(rentalHistoryTable);

        rentBtn.setText("Rent");
        rentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Rent duration(Days)");

        magazinelTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Branch", "Library", "Serieal Number", "Magazine Name", "Avaliablity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        magazinelTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                magazinelTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(magazinelTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(rentBtn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rentDurationField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rentDurationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(27, 27, 27)
                        .addComponent(rentBtn)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MainJFrame(appSystem, branch, useraccount);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentBtnActionPerformed
        // TODO add your handling code here:

        // create order
        //if
        Branch branch=appSystem.findBranchByMaterial(magazine);
        String duration = rentDurationField.getText(); 
 
        
        if(this.book.isIsAvailablityFlag() ){
            RentalRequest rr = c.createRentalrequest(Integer.valueOf(duration), this.book, this.magazine,c, branch.getLibrary());
            displayHistory(); 
            displayMagazineInfo();
            displayBookInfo();
            this.book = null;
            this.magazine = null;
                }
        else if(this.magazine.isIsAvailablityFlag()){
            RentalRequest rr = c.createRentalrequest(Integer.valueOf(duration), this.book, this.magazine,c, branch.getLibrary());
            displayHistory(); 
            displayMagazineInfo();
            displayBookInfo();
            this.book = null;
            this.magazine = null;
        }
        else{
            showmessage
            }
        
    }//GEN-LAST:event_rentBtnActionPerformed

    private void bookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTableMouseClicked
        // TODO add your handling code here:
        int selectedRow = bookTable.getSelectedRow();
        if(selectedRow >= 0) {
        this.book= (Book) booktableModel.getValueAt(selectedRow, 2);
        this.library=(Library) booktableModel.getValueAt(selectedRow, 1);
        }
    }//GEN-LAST:event_bookTableMouseClicked

    private void magazinelTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_magazinelTableMouseClicked
        // TODO add your handling code here:
        int selectedRow = magazinelTable.getSelectedRow();
        if(selectedRow >= 0) {
        this.magazine=  (Magazine) magazinelTable.getValueAt(selectedRow, 2);
        this.library=(Library) magazinelTable.getValueAt(selectedRow, 1);
        }
    }//GEN-LAST:event_magazinelTableMouseClicked
    public void displayBookInfo() {
       ArrayList<Branch> branches = this.appSystem.getBranches();
        
        if(branches.size()>0){
            booktableModel.setRowCount(0);
            for (Branch br : branches){
                for(Book b:br.getLibrary().getBookDirectory().getBookList()){
                    Object row[] = new Object[5];
                    row[0] = br;
                    row[1] = br.getLibrary();
                    row[2]= b;
                    row[3] = b.getName();
                    row[4] = b.isIsAvailablityFlag();
        
                    booktableModel.addRow(row);
                }
            }
            
        } else {
            System.out.print("");
        }
    }
    public void displayMagazineInfo() {
       ArrayList<Branch> branches = this.appSystem.getBranches();
        
        if(branches.size()>0){
            magazinetableModel.setRowCount(0);
            for (Branch br : branches){
                for (Magazine m:br.getLibrary().getGeneralDirectory().getMagazineList()){
                    Object row[] = new Object[5];
                    row[0] = br;
                    row[1] = br.getLibrary();
                    row[2]= m;
                    row[3] = m.getName();
                    row[4] = m.isIsAvailablityFlag();

                    
                    magazinetableModel.addRow(row);
                }        
            }
            
        } else {
            System.out.print("");
        }
    }
    
    public void displayHistory(){
        ArrayList<RentalRequest> rentalrequest= c.getRentalrequest();
        
        if(rentalrequest.size()>0){
            historytableModel.setRowCount(0);
            for (RentalRequest rr:rentalrequest){
                Object row[] = new Object[6];
                row[0] = rr.getID();
                row[1] = rr.getStatus();
                row[2]= rr.getPrice();
                row[3]= rr.getDuration();
                row[4] = rr.getBook();
                row[5] = rr.getMagazine();
            
                historytableModel.addRow(row);
            }
        }  else {
            System.out.print("");
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bookTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable magazinelTable;
    private javax.swing.JButton rentBtn;
    private javax.swing.JTextField rentDurationField;
    private javax.swing.JTable rentalHistoryTable;
    // End of variables declaration//GEN-END:variables
}

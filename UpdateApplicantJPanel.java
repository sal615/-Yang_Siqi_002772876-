/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Applicant;
import Model.ApplicantsDirectory;
import Model.Business;
import Model.Pet;
import Model.PlanDetails;
import Model.Vaccine;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author siqiyang
 */
public class UpdateApplicantJPanel extends javax.swing.JPanel {
    private Business business;
    DefaultTableModel viewtableModel;
    DefaultTableModel miniTableModel;
    
    Applicant applicant;
    Pet pet;
    Vaccine vaccine;

    /**
     * Creates new form UpdateApplicantJPanel
     */
    public UpdateApplicantJPanel(Business business) {
        initComponents();
        this.business=business;
        this.viewtableModel = (DefaultTableModel) applicantTable.getModel();
        this.miniTableModel=(DefaultTableModel) vaccineTable.getModel();
        
        displayApplicantDetails();
        vaccineCompletionComboBox.setSelectedItem(null);
        displayInsuranceDropdown();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        applicantIDField = new javax.swing.JTextField();
        firstNameField = new javax.swing.JTextField();
        applicantIDLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        ApplicationDateField = new javax.swing.JTextField();
        ApplicationDateLabel = new javax.swing.JLabel();
        petAgeField = new javax.swing.JTextField();
        petNameField = new javax.swing.JTextField();
        petTypeField = new javax.swing.JTextField();
        petTypeLabel = new javax.swing.JLabel();
        petNameLabel = new javax.swing.JLabel();
        vaccineNameLabel = new javax.swing.JLabel();
        vaccineNameField = new javax.swing.JTextField();
        vaccinecompletionLabel = new javax.swing.JLabel();
        petGenderLabel = new javax.swing.JLabel();
        petGenderField = new javax.swing.JTextField();
        petBreedField = new javax.swing.JTextField();
        petBreedLabel = new javax.swing.JLabel();
        updateApplicantBtn = new javax.swing.JButton();
        petAgeLabel = new javax.swing.JLabel();
        deleteApplicantBtn = new javax.swing.JButton();
        viewApplicantBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        applicantTable = new javax.swing.JTable();
        searchBtn = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        lastNameLabel1 = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        vaccineTable = new javax.swing.JTable();
        InsuranceComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        viewVaccineBtn = new javax.swing.JButton();
        vaccineCompletionComboBox = new javax.swing.JComboBox();
        updateVaccine = new javax.swing.JButton();
        searchIdBtn = new javax.swing.JButton();
        serachIdField = new javax.swing.JTextField();
        titleLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 237, 237));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        applicantIDField.setEnabled(false);
        add(applicantIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 120, -1));

        firstNameField.setEnabled(false);
        add(firstNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 120, -1));

        applicantIDLabel.setText("Applicant ID");
        add(applicantIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        firstNameLabel.setText("Applicant First Name: ");
        add(firstNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        ApplicationDateField.setEnabled(false);
        add(ApplicationDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 220, -1));

        ApplicationDateLabel.setText("Application Date: ");
        add(ApplicationDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));
        add(petAgeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 120, -1));
        add(petNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 120, -1));
        add(petTypeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 120, -1));

        petTypeLabel.setText("Pet Type:");
        add(petTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        petNameLabel.setText("Pet Name:");
        add(petNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        vaccineNameLabel.setText("Vaccine Name:");
        add(vaccineNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));
        add(vaccineNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 120, -1));

        vaccinecompletionLabel.setText("Vaccine completion:");
        add(vaccinecompletionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        petGenderLabel.setText("Pet Gender:");
        add(petGenderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));
        add(petGenderField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 120, -1));
        add(petBreedField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 120, -1));

        petBreedLabel.setText("Pet Breed:");
        add(petBreedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        updateApplicantBtn.setText("Update Applicant");
        updateApplicantBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateApplicantBtnActionPerformed(evt);
            }
        });
        add(updateApplicantBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, -1));

        petAgeLabel.setText("Pet Age:");
        add(petAgeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        deleteApplicantBtn.setText("Delete Applicant");
        deleteApplicantBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteApplicantBtnActionPerformed(evt);
            }
        });
        add(deleteApplicantBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, -1, -1));

        viewApplicantBtn.setText("View Applicant");
        viewApplicantBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewApplicantBtnActionPerformed(evt);
            }
        });
        add(viewApplicantBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 130, -1));

        applicantTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Pet Name"
            }
        ));
        jScrollPane1.setViewportView(applicantTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 280, 140));

        searchBtn.setText("Search Applicant by Name");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));
        add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 150, -1));

        lastNameLabel1.setText("Applicant Last Name: ");
        add(lastNameLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        lastNameField.setEnabled(false);
        add(lastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 120, -1));

        vaccineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Name", "Completion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(vaccineTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 270, 140));

        add(InsuranceComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 560, 160, -1));

        jLabel1.setText("Insurance ID:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        viewVaccineBtn.setText("View Vaccine");
        viewVaccineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVaccineBtnActionPerformed(evt);
            }
        });
        add(viewVaccineBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, 130, -1));

        vaccineCompletionComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        add(vaccineCompletionComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 120, -1));

        updateVaccine.setText("Update Vaccine");
        updateVaccine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateVaccineActionPerformed(evt);
            }
        });
        add(updateVaccine, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, 130, -1));

        searchIdBtn.setText("Search Applicant by ID");
        searchIdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchIdBtnActionPerformed(evt);
            }
        });
        add(searchIdBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 180, -1));

        serachIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serachIdFieldActionPerformed(evt);
            }
        });
        add(serachIdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 150, -1));

        titleLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        titleLabel1.setText("View and Update Applicant");
        add(titleLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 300, 30));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setText("Pet's Information:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 130, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel4.setText("Insurance Information:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 170, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel5.setText("Pet's Vaccine details:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void viewApplicantBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewApplicantBtnActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = applicantTable.getSelectedRow();

        if (selectedRow >= 0) {

            // we can directly fetch the Observation object from the Zeroth position
            this.applicant = (Applicant) applicantTable.getValueAt(selectedRow, 0);
            this.pet = this.applicant.getPet();
       
            applicantIDField.setText(String.valueOf(this.applicant.getApplicatiionID()));
            firstNameField.setText(String.valueOf(this.applicant.getOwnerFirstName()));
            lastNameField.setText(String.valueOf(this.applicant.getOwnerLastName()));
            ApplicationDateField.setText(String.valueOf(this.applicant.getDate()));
            
            petNameField.setText(this.pet.getName());
            petAgeField.setText(String.valueOf(this.applicant.getPet().getAge()));
            petGenderField.setText(this.pet.getPetGender());
            petBreedField.setText(String.valueOf(this.pet.getBreed()));
            petTypeField.setText(String.valueOf(this.pet.getPetType()));
            
            InsuranceComboBox.setSelectedItem(applicant.getPlan());
//            InsuranceComboBox.removeAllItems();
//            for(PlanDetails plan: business.getInsuranceplan().getPlans()){
//                InsuranceComboBox.addItem(plan);
//                if(plan.getPlanID()==applicant.getPlan().getPlanID()){
//                    InsuranceComboBox.setSelectedItem(plan);
//                }
//            }
            
            displayVaccineDetails();
           

        } else {
            JOptionPane.showMessageDialog(null, "Please select a row!");
        }
       
        
    }//GEN-LAST:event_viewApplicantBtnActionPerformed

    private void updateApplicantBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateApplicantBtnActionPerformed
        // TODO add your handling code here:
        
        if(!applicantIDField.getText().isEmpty()){
            this.pet.setName(petNameField.getText());
            this.pet.setAge(Integer.valueOf(petAgeField.getText()));
            this.pet.setBreed(petBreedField.getText());
            this.pet.setPetType(petTypeField.getText());
            
            this.applicant.setPlan((PlanDetails) InsuranceComboBox.getSelectedItem());

        } else {
            JOptionPane.showMessageDialog(null, "You have not made any selection");
        }
        
        displayApplicantDetails();  

    }//GEN-LAST:event_updateApplicantBtnActionPerformed

    private void viewVaccineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVaccineBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = vaccineTable.getSelectedRow();

        if (selectedRow >= 0) {
            this.vaccine = (Vaccine) vaccineTable.getValueAt(selectedRow, 0);
            vaccineNameField.setText(this.vaccine.getVaccineName());
            
            
            Boolean isCompleted;
            if (this.vaccine.isIsCompleted()){
                vaccineCompletionComboBox.setSelectedItem("Yes");
            }else{
                vaccineCompletionComboBox.setSelectedItem("No");
            }
            
//        displayVaccineDetails();
            
            
        }else {
            JOptionPane.showMessageDialog(null, "Please select a Vaccine to view");
        }
        
        
//        populateVaccineDropdown();
        
        
    }//GEN-LAST:event_viewVaccineBtnActionPerformed

    private void updateVaccineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateVaccineActionPerformed
        // TODO add your handling code here:
        
        // set the vaccine object's values
        if(this.vaccine != null) {
            this.vaccine.setVaccineName(vaccineNameField.getText());
            String completion = (String) vaccineCompletionComboBox.getSelectedItem();
            Boolean isCompleted;
            if(completion.equals("Yes") ){
                isCompleted = true;   
            }else{
                isCompleted=false;
            }            
            this.vaccine.setIsCompleted(isCompleted);
            
            displayVaccineDetails();
            
        } else {
            JOptionPane.showMessageDialog(null, "Please select a vaccine to update");
            
        }
    }//GEN-LAST:event_updateVaccineActionPerformed

    private void deleteApplicantBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteApplicantBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = applicantTable.getSelectedRow();
        
        if(selectedRow >=0){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete the applicant details?", "Warning", dialogButton);
            if(dialogResult == JOptionPane.YES_NO_OPTION){
                Applicant applicant = (Applicant) applicantTable.getValueAt(selectedRow, 0);
                business.getApplicantdirectory().deleteApplicant(applicant);
                this.applicant=null;
                displayApplicantDetails();
                displayVaccineDetails();
                
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Please select a row to delete");
        }
    }//GEN-LAST:event_deleteApplicantBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        
        String input= searchField.getText();
        
        ArrayList<Applicant> result = this.business.getApplicantdirectory().searchApplicant(input);
        
        if (result==null){
            JOptionPane.showMessageDialog(null, "Not exist");
        }else{
            viewtableModel.setRowCount(0);
            for (Applicant applicant:result){
                Object row[] = new Object[4];
                row[0] = applicant;
                row[1] = applicant.getOwnerFirstName();
                row[2] = applicant.getOwnerLastName();
                row[3] = applicant.getPet().getName();
                
                viewtableModel.addRow(row);
            }
         
        }
        
        //applicantTable
        
       
    }//GEN-LAST:event_searchBtnActionPerformed

    private void serachIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serachIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serachIdFieldActionPerformed

    private void searchIdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchIdBtnActionPerformed
        // TODO add your handling code here:
        String input= serachIdField.getText();
        
        ArrayList<Applicant> result = this.business.getApplicantdirectory().searchApplicantByID(Integer.valueOf(input));
        
        if (result==null){
            JOptionPane.showMessageDialog(null, "Not exist");
        }else{
            viewtableModel.setRowCount(0);
            for (Applicant applicant:result){
                Object row[] = new Object[4];
                row[0] = applicant;
                row[1] = applicant.getOwnerFirstName();
                row[2] = applicant.getOwnerLastName();
                row[3] = applicant.getPet().getName();
                
                viewtableModel.addRow(row);
            }
         
        }
    }//GEN-LAST:event_searchIdBtnActionPerformed
    public void displayApplicantDetails() {
        viewtableModel.setRowCount(0);
        ApplicantsDirectory applicantDirectory = this.business.getApplicantdirectory();
        
        if(applicantDirectory.getApplicantlist().size()>0){
            viewtableModel.setRowCount(0);
            for (Applicant applicant:applicantDirectory.getApplicantlist()){
                Object row[] = new Object[4];
                row[0] = applicant;
                row[1] = applicant.getOwnerFirstName();
                row[2] = applicant.getOwnerLastName();
                row[3] = applicant.getPet().getName();
                
                viewtableModel.addRow(row);
            }
            
        } else {
            System.out.print("Empty list");
        }
    }
    
    public void displayVaccineDetails(){
        miniTableModel.setRowCount(0);
       if(applicant!=null){
           
           ArrayList<Vaccine> vaccineList = this.applicant.getPet().getVaccineList();

       if(vaccineList.size()>0){
           miniTableModel.setRowCount(0);
           for (Vaccine vaccine:applicant.getPet().getVaccineList()){
               Object row[] = new Object[2];
               
               row[0] = vaccine;
               row[1] = vaccine.isIsCompleted();
               
               miniTableModel.addRow(row);
           }
       } else{ 
           System.out.print("Select ");
       }
    }
    }
    
    public void displayInsuranceDropdown(){
        ArrayList<PlanDetails> plans = this.business.getInsuranceplan().getPlans();
        //InsuranceComboBox.removeAllItems();
        for(PlanDetails p: plans){
            InsuranceComboBox.addItem(p);
        }
    }
    
//    public void populateVaccineDropdown(){
//        ArrayList<Vaccine> vaccine = this.pet.getVaccineList();
//        
//        for(Vaccine v: vaccine){
//            vaccineCompletionComboBox.addItem(v);
//        }
//    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApplicationDateField;
    private javax.swing.JLabel ApplicationDateLabel;
    private javax.swing.JComboBox InsuranceComboBox;
    private javax.swing.JTextField applicantIDField;
    private javax.swing.JLabel applicantIDLabel;
    private javax.swing.JTable applicantTable;
    private javax.swing.JButton deleteApplicantBtn;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel1;
    private javax.swing.JTextField petAgeField;
    private javax.swing.JLabel petAgeLabel;
    private javax.swing.JTextField petBreedField;
    private javax.swing.JLabel petBreedLabel;
    private javax.swing.JTextField petGenderField;
    private javax.swing.JLabel petGenderLabel;
    private javax.swing.JTextField petNameField;
    private javax.swing.JLabel petNameLabel;
    private javax.swing.JTextField petTypeField;
    private javax.swing.JLabel petTypeLabel;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton searchIdBtn;
    private javax.swing.JTextField serachIdField;
    private javax.swing.JLabel titleLabel1;
    private javax.swing.JButton updateApplicantBtn;
    private javax.swing.JButton updateVaccine;
    private javax.swing.JComboBox vaccineCompletionComboBox;
    private javax.swing.JTextField vaccineNameField;
    private javax.swing.JLabel vaccineNameLabel;
    private javax.swing.JTable vaccineTable;
    private javax.swing.JLabel vaccinecompletionLabel;
    private javax.swing.JButton viewApplicantBtn;
    private javax.swing.JButton viewVaccineBtn;
    // End of variables declaration//GEN-END:variables
}

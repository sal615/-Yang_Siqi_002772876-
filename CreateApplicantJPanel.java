/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Applicant;
import Model.ApplicantsDirectory;
import Model.Business;
import Model.InsurancePlans;
import Model.Pet;
import Model.Vaccine;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author siqiyang
 */
public class CreateApplicantJPanel extends javax.swing.JPanel {
    private Business business;
    private Boolean isnull = false;
    /**
     * Creates new form CreateApplicantJPanel
     */
    public CreateApplicantJPanel(Business business) {
        initComponents();
        this.business=business;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lastNameField = new javax.swing.JTextField();
        applicantIDField = new javax.swing.JTextField();
        dateLabel = new javax.swing.JLabel();
        applicantIDLabel = new javax.swing.JLabel();
        petGenderLabel = new javax.swing.JLabel();
        petGenderField = new javax.swing.JTextField();
        firstNameField = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JLabel();
        vaccinecompletionLabel = new javax.swing.JLabel();
        vaccineCompletionField = new javax.swing.JTextField();
        petBreedField = new javax.swing.JTextField();
        petBreedLabel = new javax.swing.JLabel();
        petNameLabel = new javax.swing.JLabel();
        petNameField = new javax.swing.JTextField();
        petAgeLabel = new javax.swing.JLabel();
        petAgeField = new javax.swing.JTextField();
        petTypeLabel = new javax.swing.JLabel();
        petTypeField = new javax.swing.JTextField();
        vaccineNameLabel = new javax.swing.JLabel();
        vaccineNameField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        lastNameLabel1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(lastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 120, -1));
        add(applicantIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 120, -1));

        dateLabel.setText("Application Date: ");
        add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        applicantIDLabel.setText("Applicant ID");
        add(applicantIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        petGenderLabel.setText("Pet Gender:");
        add(petGenderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, -1, -1));
        add(petGenderField, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 120, -1));
        add(firstNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 120, -1));

        firstNameLabel.setText("Applicant First Name: ");
        add(firstNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        vaccinecompletionLabel.setText("Vaccine completion:");
        add(vaccinecompletionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));
        add(vaccineCompletionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 120, -1));
        add(petBreedField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 120, -1));

        petBreedLabel.setText("Pet Breed:");
        add(petBreedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        petNameLabel.setText("Pet Name:");
        add(petNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));
        add(petNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 120, -1));

        petAgeLabel.setText("Pet Age:");
        add(petAgeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));
        add(petAgeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 120, -1));

        petTypeLabel.setText("Pet Type:");
        add(petTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));
        add(petTypeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 120, -1));

        vaccineNameLabel.setText("Vaccine Name:");
        add(vaccineNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));
        add(vaccineNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 120, -1));

        jButton1.setText("Add Applicant");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, -1, -1));

        titleLabel.setText("Create Applicant");
        add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 220, 30));

        lastNameLabel1.setText("Applicant Last Name: ");
        add(lastNameLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        jDateChooser1.setDateFormatString("MM-dd-yyyy");
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 120, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ApplicantsDirectory applicantsDirectory = this.business.getApplicantdirectory();

        String id = applicantIDField.getText();
        String firstName = firstNameField.getText();
        String lastName= lastNameField.getText();
        Date date = jDateChooser1.getDate();
        
        
        String petName =petNameField.getText();
        String petAge =petAgeField.getText();
        String petGender =petGenderField.getText();

        String petType =petTypeField.getText();
        String petBreed =petBreedField.getText();
        

        String vaccineName = vaccineNameField.getText();
        String completion = vaccineCompletionField.getText();

  

        if(id==null||firstName==null||lastName==null||date==null|| petName==null||petAge==null||petGender==null||
               petType==null||petBreed==null||vaccineName==null||completion==null){
            this.isnull = true;
            JOptionPane.showMessageDialog(null, "Pleae fill all fields");
        } else {
            Boolean isFemale;
            if (petGender == "male"){
                isFemale = false;
            }else{
                isFemale =true;
            }
            
            Pet pet = new Pet(petName,Integer.valueOf(petAge),isFemale,petType,petBreed);

            Applicant applicant = applicantsDirectory.createApplicant(Integer.valueOf(id), firstName, lastName, date, pet);
            
            Boolean isCompleted;
            if (completion == "Yes" ){
                isCompleted = true;   
            }else{
                isCompleted=false;
            }
            Vaccine vaccine = new Vaccine(vaccineName,isCompleted);
            
            applicant.setPet(pet);
            pet.setOwner(applicant);
            pet.setVaccine(vaccine);
            vaccine.setPet(pet);
      
        
            JOptionPane.showMessageDialog(null, "Created");
                       
                      
        
        }

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField applicantIDField;
    private javax.swing.JLabel applicantIDLabel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
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
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField vaccineCompletionField;
    private javax.swing.JTextField vaccineNameField;
    private javax.swing.JLabel vaccineNameLabel;
    private javax.swing.JLabel vaccinecompletionLabel;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author siqiyang
 */
public class ApplicantsDirectory {
    ArrayList<Applicant> applicantList;
    
    public ApplicantsDirectory(){
        this.applicantList = new ArrayList<Applicant>();
        
    }

    public ArrayList<Applicant> getApplicantlist() {
        return applicantList;
    }

    public void setApplicantlist(ArrayList<Applicant> applicantlist) {
        this.applicantList = applicantlist;
    }
    
    
    public Applicant createApplicant(int applicationId, String firstName, String lastName,Date date, Pet pet) {
        Applicant applicant = new Applicant();
        applicant.setApplicatiionID(applicationId);
        applicant.setOwnerFirstName(firstName);
        applicant.setOwnerLastName(lastName);
        applicant.setDate(date);
        applicant.setPet(pet);
        
        this.applicantList.add(applicant);
        
        return applicant;
    }
    
    
    public Boolean checkIfApplicantUnique(String lastName, String firstName){
        for(Applicant applicant: this.applicantList){
            if (applicant.getOwnerFirstName().equals(firstName) ){
                if(applicant.getOwnerLastName().equals(lastName))
                return false;
            }
        }
        return true;
    }
    
    
    public Boolean checkApplicationIDUnique(int id){
        for (Applicant a: this.applicantList){
            if(a.getApplicatiionID()==id){
                return false;
            }
        }
        
        return true;
    } 
    public void removeApplicant(int id) {
        for(Applicant app: this.getApplicantlist()){
            if(app.getApplicatiionID()==id){
                this.applicantList.remove(id);
                break;
            }
        }
    }
    

      
    
   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;




/**
 *
 * @author siqiyang
 */
public class Applicant {
    int applicatiionID;
    String ownerFirstName;
    String ownerLastName;
    Date date;
    Pet pet;
    ApplicantsDirectory applicants;
    
    public Applicant(){
        this.applicants= new ApplicantsDirectory();
        this.date = new Date();  
        this.pet = new Pet();
        
    }

    public int getApplicatiionID() {
        return applicatiionID;
    }

    public void setApplicatiionID(int applicatiionID) {
        this.applicatiionID = applicatiionID;
    }

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public void setOwnerFirstName(String ownerFirstName) {
        this.ownerFirstName = ownerFirstName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public void setOwnerLastName(String ownerLastName) {
        this.ownerLastName = ownerLastName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public ApplicantsDirectory getApplicants() {
        return applicants;
    }

    public void setApplicants(ApplicantsDirectory applicants) {
        this.applicants = applicants;
    }
    
    
    public Pet createPet(String name, int age, boolean isFemle, String petType,String breed) {
        Pet pet = new Pet();
        pet.setName(name);
        pet.setAge(age);
        pet.setIsFemale(isFemle);
        pet.setPetType(petType);
        pet.setBreed(breed);
        
        this.pet = pet;
        
        return pet;
    }
    
    
    
    
    
}

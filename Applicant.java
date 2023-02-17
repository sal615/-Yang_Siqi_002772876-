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
    PlanDetails plan;
    
    
    public Applicant(){
        
        this.date = new Date();  
        this.pet = new Pet();
        
    }
    
    public Applicant(int id,String firstName, String lastName,Date date,Pet p){
        applicatiionID = id;
        ownerFirstName = firstName;
        ownerLastName = lastName;
        
        this.date = date;
        pet = p;
        
        
       
        
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

    public PlanDetails getPlan() {
        return plan;
    }

    public void setPlan(PlanDetails plan) {
        this.plan = plan;
    }


    
    
    public Pet createPet(String name, int age, String gender, String petType,String breed) {
        Pet pet = new Pet();
        pet.setName(name);
        pet.setAge(age);
        pet.setPetGender(gender);
        pet.setPetType(petType);
        pet.setBreed(breed);
        
        pet.setOwner(this);
        
        this.pet = pet;
        
        return pet;
    }
    
    @Override
    public String toString() {
        return String.valueOf(applicatiionID);
    }
    
    
    
    
    
}

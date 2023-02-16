/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author siqiyang
 */
public class Pet {
    String name;
    int age;
    boolean isFemale;
    String petType;
    String breed;
    Applicant owner;
    Vaccine vaccine;
    
    public Pet(){
        //this.owner = new Applicant();
    }
    public Pet(String n,int a, boolean isfemale, String t, String b ){
        name = n;
        age = a;
        isFemale = isfemale;
        petType = t;
        breed = b;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIsFemale() {
        return isFemale;
    }

    public void setIsFemale(boolean isFemale) {
        this.isFemale = isFemale;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Applicant getOwner() {
        return owner;
    }

    public void setOwner(Applicant owner) {
        this.owner = owner;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }
    
    
    
    
//    public Vaccine createVaccineDetails(String vaccineName, boolean isComplete) {
//        Vaccine vaccine = new Vaccine();
//        vaccine.setVaccineName(vaccineName);
//        vaccine.setIsCompleted(isComplete);
//       
//        vaccine.setPet(this);
//        
//        
//        
//        this.vaccine = vaccine;
//        
//        return vaccine;
//    }
    
    
    
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author siqiyang
 */
public class Pet {
    String name;
    int age;
    String petGender;
    String petType;
    String breed;
    Applicant owner;
    ArrayList<Vaccine> vaccineList;
    
    public Pet(){
        //this.owner = new Applicant();
        vaccineList = new ArrayList<Vaccine>();
    }
    public Pet(String n,int a, String g, String t, String b){
        name = n;
        age = a;
        petGender = g;
        petType = t;
        breed = b;  
        vaccineList = new ArrayList<Vaccine>();
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

    public String getPetGender() {
        return petGender;
    }

    public void setPetGender(String petGender) {
        this.petGender = petGender;
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

    public ArrayList<Vaccine> getVaccineList() {
        return vaccineList;
    }

    public void setVaccineList(ArrayList<Vaccine> vaccineList) {
        this.vaccineList = vaccineList;
    }
 
    public Vaccine createVaccineDetails(String vaccineName, boolean isComplete) {
        Vaccine vaccine = new Vaccine();
        vaccine.setVaccineName(vaccineName);
        vaccine.setIsCompleted(isComplete);
       
        vaccine.setPet(this);
        
        
        this.vaccineList.add(vaccine);
        
        return vaccine;
    }
    
    
    
    
    
}

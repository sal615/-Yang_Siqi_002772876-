/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Employee;

import Profile.Profile;

/**
 *
 * @author siqiyang
 */
public class Employee extends Profile {

    int experience;
    String designation;

    public Employee(String name, String id) {
        super(name, id);
    }

    public Employee(int experience, String designation, String name, String id) {
        super(name, id);
        this.experience = experience;
        this.designation = designation;
    }
    

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    
}

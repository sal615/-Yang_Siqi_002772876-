/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Employee;

import java.util.ArrayList;

/**
 *
 * @author siqiyang
 */
public class EmployeeDirectory {
    ArrayList<Employee> employeeList;

    public EmployeeDirectory(){
        this.employeeList = new ArrayList<Employee>();
        
    }
    
    public EmployeeDirectory(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    
    public Employee createEmployee(int experience, String designation, String name, String id) {
        Employee e = new Employee(experience, designation, name, id);
        this.employeeList.add(e);
        return e;
    }  
    
    public String getEmployeeId(String id) {
        for(Employee e: this.getEmployeeList()){
            if(e.getId().equals(id)){
                return e.getName();
            }
        }
        
        return null;
    }
    
    

}

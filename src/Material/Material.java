/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Material;

import java.util.Date;

/**
 *
 * @author siqiyang
 */
public class Material {
    private static int counter = 0;
    String serialNumber;
    String name;
    int registeredDate;
    boolean isAvailablityFlag;

    public Material() {
        
    }
    public Material(String name, int registeredDate) {
        this.serialNumber = "serial" + this.counter++;
        this.name = name;
        this.registeredDate = registeredDate;
        this.isAvailablityFlag = true;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Material.counter = counter;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(int registeredDate) {
        this.registeredDate = registeredDate;
    }

    public boolean isIsAvailablityFlag() {
        return isAvailablityFlag;
    }

    public void setIsAvailablityFlag(boolean isAvailablityFlag) {
        this.isAvailablityFlag = isAvailablityFlag;
    }

        
    @Override
    public String toString() {
        return serialNumber;
    }
    
    
}

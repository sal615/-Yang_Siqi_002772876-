/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.General;

import java.util.ArrayList;

/**
 *
 * @author siqiyang
 */
public class GeneralDirectory {
    ArrayList<Magazine> magazineList;
    
    public GeneralDirectory(){
        this.magazineList=new ArrayList<Magazine>();
    }

    public GeneralDirectory(ArrayList<Magazine> magazineList) {
        this.magazineList = magazineList;
    }

    public ArrayList<Magazine> getMagazineList() {
        return magazineList;
    }

    public void setMagazineList(ArrayList<Magazine> magazineList) {
        this.magazineList = magazineList;
    }
    
    public Magazine createMagazine( String name, int registeredDate, String companyName, String issueType) {
        Magazine magazine = new Magazine(name, registeredDate, companyName, issueType);
        
        this.magazineList.add(magazine);
        return magazine;
    }
    
    public Magazine findMagazineBySerial(String serial){
        for(Magazine m: magazineList){
            if(m.getSerialNumber().equals(serial)){
                return m;
            }
        }return null;
        
    }    
    
    
}

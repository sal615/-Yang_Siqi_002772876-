/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.General;

import Material.Material;

/**
 *
 * @author siqiyang
 */
public class Magazine extends Material {
    String companyName;
    String issueType;

    public Magazine( String name, int registeredDate, boolean isAvailablityFlag) {
        super( name, registeredDate, isAvailablityFlag);
    }
    
    public Magazine(String name, int registeredDate, boolean isAvailablityFlag,String companyName, String issueType) {
        super(name, registeredDate, isAvailablityFlag);
        this.companyName = companyName;
        this.issueType = issueType;
    }



    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }
    
}

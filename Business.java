/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author siqiyang
 */
public class Business {
    ApplicantsDirectory applicantdirectory;
    InsurancePlans insuranceplan;
    
    public Business(){
        this.applicantdirectory = new ApplicantsDirectory();
        this.insuranceplan = new InsurancePlans();
    }

    public ApplicantsDirectory getApplicantdirectory() {
        return applicantdirectory;
    }

    public void setApplicantdirectory(ApplicantsDirectory applicantdirectory) {
        this.applicantdirectory = applicantdirectory;
    }

    public InsurancePlans getInsuranceplan() {
        return insuranceplan;
    }

    public void setInsuranceplan(InsurancePlans insuranceplan) {
        this.insuranceplan = insuranceplan;
    }
    
    
    
    
}

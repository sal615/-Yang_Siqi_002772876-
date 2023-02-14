/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author siqiyang
 */
public class PlanDetails {
    int planID;
    String name;
    double costPerMonth;
    double costPerAnnum;
    InsurancePlans plans;
    
    
    public PlanDetails(){
        this.plans = new InsurancePlans();    
    }

    public int getPlanID() {
        return planID;
    }

    public void setPlanID(int planID) {
        this.planID = planID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCostPerMonth() {
        return costPerMonth;
    }

    public void setCostPerMonth(double costPerMonth) {
        this.costPerMonth = costPerMonth;
    }

    public double getCostPerAnnum() {
        return costPerAnnum;
    }

    public void setCostPerAnnum(double costPerAnnum) {
        this.costPerAnnum = costPerAnnum;
    }

    public InsurancePlans getPlans() {
        return plans;
    }

    public void setPlans(InsurancePlans plans) {
        this.plans = plans;
    }
    
    
}

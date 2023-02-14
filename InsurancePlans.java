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
public class InsurancePlans {
    ArrayList<PlanDetails> plansList;
    
    public InsurancePlans(){
        this.plansList = new ArrayList<PlanDetails>();
    }

    public ArrayList<PlanDetails> getPlans() {
        return plansList;
    }

    public void setPlans(ArrayList<PlanDetails> plans) {
        this.plansList = plans;
    }
    
    public PlanDetails createPlans(int planID, String name, double costPerMonth, double costPerAnnum) {
        PlanDetails plan = new PlanDetails();
        plan.setPlanID(planID);
        plan.setName(name);
        plan.setCostPerMonth(costPerMonth);
        plan.setCostPerAnnum(costPerAnnum);
        
        this.plansList.add(plan);
        
        return plan;
    }

    
    
    
    
}

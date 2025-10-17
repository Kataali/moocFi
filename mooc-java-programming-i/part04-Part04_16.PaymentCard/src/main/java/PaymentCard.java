/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kataali
 */
public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
    public void eatAffordably() {
        double tempBalance = this.balance - 2.60;
        if (tempBalance >= 0)
            this.balance = tempBalance;
    }

    public void eatHeartily() {
        double tempBalance = this.balance - 4.60;
        if (tempBalance >= 0)
            this.balance = tempBalance;
    }
    
    public void addMoney(double amount) {
        double tempBalance = this.balance + amount;
        if (amount < 0){
//        Do nothing
        }
        else if (tempBalance > 150)
            this.balance = 150;
        else 
            this.balance = tempBalance;
    }
}

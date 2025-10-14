/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kataali
 */
public class Debt {
    private double balance;
    private double interestRate;
//    Constructor
    public Debt(double initialBalance, double initialInterestRate){
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }
//    Method
    public void printBalance(){
        System.out.println(this.balance);
    } 
//    Method 
    public void waitOneYear(){
        this.balance = this.balance * this.interestRate;
    }
}

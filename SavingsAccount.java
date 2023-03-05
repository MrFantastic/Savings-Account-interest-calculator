/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *holds varables and methods for the tester
 * @author Alexander Raymond
 */
public class SavingsAccount {
    static double annualInterestRate = 4;//decares varaiable
    private double savingsBalance;//decares varaiable
    
    // Makes the methods for the tester class
    public SavingsAccount(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }
    public void calculateMonthlyInterest(){
        savingsBalance = savingsBalance + savingsBalance*(annualInterestRate/100)/12;
    }
    public double getLatestBalance(){
        return this.savingsBalance;
    }
    public static void modifyinterestRate(double newInterestRate){
        annualInterestRate = newInterestRate;
    }
}

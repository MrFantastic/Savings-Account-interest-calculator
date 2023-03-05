/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * calculate the interest for the savings account using the variables and methods from SavingsAccount
 * @author Alexander Raymond
 */
public class SavingsAccountTester {
    public static void main(String[] args){
        SavingsAccount.annualInterestRate = 4;// sets the interest rate to 4
        SavingsAccount saver1 = new SavingsAccount(2000.0);//sets the base amount in account 1 to $2000
        SavingsAccount saver2 = new SavingsAccount(3000.0);//sets the base amount in account 2 to $3000
        
        saver1.calculateMonthlyInterest();// calls the function to do a calculate to get updated interest amount
        System.out.println("New balance of saver1 after adding interest: " + Math.round(saver1.getLatestBalance()*100/100.0));//adds the addded amount
        
        saver2.calculateMonthlyInterest();// calls the function to do a calculate to get updated interest amount
        System.out.println("New balance of saver2 after adding interest: " + Math.round(saver2.getLatestBalance()*100/100.0));//adds the addded amount
        
        
        System.out.println("Setting interest rate to 5%");
        SavingsAccount.modifyinterestRate(5.0);// sets the interest rate to 5
        
        saver1.calculateMonthlyInterest();// calls the function to do a calculate to get updated interest amount
        System.out.println("New balance of saver1 after changing interest rate: " + Math.round(saver1.getLatestBalance()*100/100.0));//adds the addded amount
        
        saver2.calculateMonthlyInterest();// calls the function to do a calculate to get updated interest amount
        System.out.println("New balance of saver1 after changing interest rate: " + Math.round(saver2.getLatestBalance()*100/100.0));//adds the addded amount
    }
}

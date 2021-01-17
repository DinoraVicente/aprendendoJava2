package application;

import entities.Inheritance.Account;
import entities.Inheritance.BusinessAccount;
import entities.Inheritance.SavingsAccount;

public class Inheritance {
    public static void main(String [] args) {
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

    /*
    Upcasting - é pegar um objeto do tipo "BusinessAccount" e atribuí-lo
    para uma variável do tipo Account.
     */

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 500.0);
        Account acc3 = new SavingsAccount(1004, "Helton", 0.0, 0.01);

    /*
    Downcasting - converter um objeto da super classe p/ subclasse
     */

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        // BusinessAccount acc5 = (BusinessAccount) acc3;

        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(500.0);
        }
        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!!");
        }
    }
}

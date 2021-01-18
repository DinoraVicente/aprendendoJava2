package application;

import entities.Inheritance.Account;
import entities.Inheritance.BusinessAccount;
import entities.Inheritance.SavingsAccount;

public class Polimorfismo {
    public static void main(String [] args) {
        Account x = new Account(1001, "Alex", 1000.0);
        Account y = new SavingsAccount(1002,"Maria", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}

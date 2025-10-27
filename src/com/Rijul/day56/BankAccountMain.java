package com.Rijul.day56;

class BankAccount{
    int AccountNum;
    String name;
    double balance;
    BankAccount(int id, String nam, double bal){
        this.AccountNum = id;
        this.name = nam;
        this.balance = bal;
    }
    public void display(){
        System.out.println("Account Number: " + AccountNum + " Name : " + name + " Balance: " + balance);
    }
    public void deposit(int amount){
        if(amount<=0){
            System.out.println("The amount is invalid");
        }
        else{
            System.out.println("The updated balance is: " + (balance+amount));
            balance = balance+amount;
        }
    }
    public void withdraw(int amount){
        if(amount>balance){
            System.out.println("The balance is not enough for money withdrawl");
        }
        else{
            System.out.println("The Remaining balance is: " + (balance-amount));
            balance=balance-amount;
        }
    }
}
public class BankAccountMain {
    public static void main(String[] args) {
        // Creating accounts
        BankAccount acc1 = new BankAccount(101, "Alice", 1000);
        BankAccount acc2 = new BankAccount(102, "Bob", 500);

        acc1.display();
        acc2.display();

        System.out.println();

        acc1.deposit(500);
        acc1.withdraw(200);

        acc2.deposit(300);
        acc2.withdraw(900);

        System.out.println();

        acc1.display();
        acc2.display();
    }
}

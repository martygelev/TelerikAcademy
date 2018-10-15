package com.company;

public class BankAccount {
    private  final static  double DEFAULT_INTEREST = 0.02;

    private int id;
    private double balance;
    private static double rate = DEFAULT_INTEREST;
    private  int bankAccountCount ;
    public BankAccount() {
        this.id=++bankAccountCount;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getBankAccountCount() {
        return bankAccountCount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void Deposit(double amount) {
        if (amount < 0.0D) {
            throw new IllegalArgumentException("Negative amount");
        } else {
            this.balance += amount;
        }
    }
    public double GetInterest(int years){
        return this.getBalance()*rate*years;
    }

    public static  void setDefaultInterest (double interest){
        rate=interest;
    }

    public void Withdraw(double amount) {
        if (amount > this.balance) {
            throw new IllegalArgumentException("Insufficient balance");
        } else {
            this.balance -= amount;
        }
    }

    public String toString() {
        return "ID"+ this.id;
    }
}

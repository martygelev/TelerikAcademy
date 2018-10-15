package com.company;
import javax.swing.plaf.basic.BasicMenuBarUI;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Spliterator;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Integer, BankAccount> accounts = new HashMap<>();

        String input = in.nextLine();

        while (!input.equals("End")) {
            String[] splitted = input.split(" ");
            String command = splitted[0];
            Integer id = Integer.parseInt(splitted[1]);

            switch (command) {
                case "Create":
                    if (accounts.containsKey(id)) {
                        System.out.println("Account already exists");
                    } else {
                        BankAccount acc = new BankAccount();
                        acc.setId(id);
                        accounts.put(id, acc);
                    }
                    break;
                case "Withdraw":
                    double amountWithdraw = Double.parseDouble(splitted[2]);
                    BankAccount acc = accounts.get(id);

                    if (acc != null) {
                        if (acc.getBalance() < amountWithdraw) {
                            System.out.println("Insufficient balance");
                        } else {
                            acc.Withdraw(amountWithdraw);
                        }
                    }
                    else{
                        System.out.println("Account does not exist");

                    }
                    break;
                case "Deposit":
                    double amountDeposit = Double.parseDouble(splitted[2]);

                    if (accounts.get(id)==null)
                    {
                        System.out.println("Account does not exist");
                        break;
                    }
                    accounts.get(id).Deposit(amountDeposit);
                    break;
                case "Print":
                    if (accounts.get(id)==null)
                    {
                        System.out.println("Account does not exist");
break;
                    }
                    System.out.println(accounts.get(id));
                    break;
            }

            input = in.nextLine();
        }
    }
}

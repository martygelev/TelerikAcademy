package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        HashMap<Integer, BankAccount> accounts = new HashMap<>();

        String input = in.nextLine();

        while (!input.equals("End")) {
            String[] splitted = input.split(" ");
            String command = splitted[0];

            switch (command) {
                case "Create":
                        BankAccount acc = new BankAccount();
                        accounts.put(acc.getBankAccountCount(), acc);
                    break;
                case "SetInterest":

                    break;

                case"GetInterest":
                    break;


                case "Deposit":
                    Integer id = Integer.parseInt(splitted[1]);
                    double amountDeposit = Double.parseDouble(splitted[2]);
                    if (accounts.get(id)==null)
                    {
                        System.out.println("Account does not exist");
                        break;
                    }
                    accounts.get(id).Deposit(amountDeposit);
                    break;
            }
            input = in.nextLine();
        }
    }
}

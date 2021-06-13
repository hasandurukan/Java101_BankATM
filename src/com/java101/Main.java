package com.java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int blockLimit = 3;
        double balance = 5000;
        int selection;

        while (blockLimit > 0) {
            System.out.print("Please enter your username :");
            userName = input.nextLine();

            System.out.print("Please type your password :");
            password = input.nextLine();

            if (userName.equals("patikaDev") && password.equals("java101")) {
                System.out.println("Welcome to the jungle GNR !");
                do {
                    System.out.println("1- Deposit\n2- Withdraw\n3- Balance\n4- Exit");
                    System.out.print("Your selection :");
                    selection = input.nextInt();
                    switch (selection) {
                        case 1:
                            System.out.print("Please type an amount to deposit :");
                            balance += input.nextDouble();
                            System.out.println("Deposit completed new balance :" + balance);
                            break;
                        case 2:
                            System.out.print("Please type an amount to withdraw :");
                            double withdrawAmount = input.nextDouble();
                            if (withdrawAmount < balance) {
                                balance -= withdrawAmount;
                                System.out.println("Withdraw completed new balance :" + balance);
                            } else {
                                System.out.print("Insufficient funds !");
                            }
                            break;
                        case 3:
                            System.out.println("Your balance : " + balance);
                            break;
                    }
                } while (selection != 4);
                System.out.println("Goodbye !");
                break;
            } else {
                blockLimit--;
                System.out.println("Your username or password is wrong, try again");
                if (blockLimit == 0) {
                    System.out.print("Your account has been blocked !");
                } else {
                    System.out.print("You can try " + blockLimit + " more time !");
                }
            }
        }
    }
}

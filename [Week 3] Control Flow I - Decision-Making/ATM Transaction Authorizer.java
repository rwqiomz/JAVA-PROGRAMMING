/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cf1.decision.making;

/**
 *
 * @author Ely Estolloso
 */
public class ATMtrans_Auth {
    public static void main(String[] args) {
        String username = "ellijah";
        String correctUsername = "ellijah";
        String tier = "";

        int pin = 1765;
        int correctPin = 1765;

        double balance = 15000.00;
        double withdrawal = 3000.00;

        double dailyLimit = 0;
        double feePercent = 0;
        double fee = 0;
        double totalAmount = 0;
        double remainingBalance = balance;

        // Header
        System.out.println("=================================================");
        System.out.println("           ATM TRANSACTION AUTHORIZER");
        System.out.println("=================================================");

        // Check username and PIN
        if (username.equals(correctUsername)) {
            if (pin == correctPin) {

                // Determine account tier
                if (balance < 5000) {
                    tier = "Bronze";
                    dailyLimit = 2000;
                } else if (balance < 10000) {
                    tier = "Silver";
                    dailyLimit = 5000;
                } else if (balance < 20000) {
                    tier = "Gold";
                    dailyLimit = 10000;
                } else {
                    tier = "Platinum";
                    dailyLimit = 20000;
                }

                // Select transaction fee
                switch (tier) {
                    case "Bronze":
                        feePercent = 0.02;
                        break;
                    case "Silver":
                        feePercent = 0.015;
                        break;
                    case "Gold":
                        feePercent = 0.01;
                        break;
                    case "Platinum":
                        feePercent = 0.005;
                        break;
                }

                // Calculate transaction fee
                fee = withdrawal * feePercent;
                totalAmount = withdrawal + fee;

                // Check withdrawal amount
                if (withdrawal > 0) {
                    if (withdrawal <= balance) {
                        if (withdrawal <= dailyLimit) {

                            // Final authorization
                            if (totalAmount <= balance) {
                                remainingBalance = balance - totalAmount;

                                System.out.println("Username: " + username);
                                System.out.println("Balance: PHP " + balance);
                                System.out.println("=================================================");
                                System.out.println("Account Tier: " + tier);
                                System.out.println("=================================================");
                                System.out.println("Transaction: APPROVED");
                                System.out.println("Withdrawal: PHP " + withdrawal);
                                System.out.println("Transaction Fee: PHP " + fee);
                                System.out.println("Total Amount: PHP " + totalAmount);
                                System.out.println("Remaining Balance: PHP "
                                        + remainingBalance);

                            } else {
                                System.out.println("Transaction: DENIED - "
                                        + "Insufficient balance for fee.");
                            }

                        } else {
                            System.out.println("Transaction: DENIED - "
                                    + "Daily withdrawal limit exceeded.");
                        }
                    } else {
                        System.out.println("Transaction: DENIED - "
                                + "Insufficient balance.");
                    }
                } else {
                    System.out.println("Transaction: DENIED - "
                            + "Withdrawal must be greater than zero.");
                }

            } else {
                System.out.println("Login failed: Incorrect PIN.");
            }

        } else {
            System.out.println("Login failed: Incorrect username.");
        }

        System.out.println("=================================================");
    }
    
}

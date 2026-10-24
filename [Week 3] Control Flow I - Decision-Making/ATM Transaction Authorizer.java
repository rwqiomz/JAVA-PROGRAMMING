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
        String username = "student";
        String correctUsername = "student";

        int pin = 1234;
        int correctPin = 1234;

        double balance = 15000;
        double withdrawal = 3000;
        double dailyLimit = 0;
        double feeRate = 0;
        double fee;
        double total;

        String tier = "";

        // Check username first
        if (username.equals(correctUsername)) {

            // Check PIN only if username is correct
            if (pin == correctPin) {
                System.out.println("Login successful!");

                // Determine account tier
                if (balance >= 50000) {
                    tier = "Platinum";
                    dailyLimit = 20000;
                } else if (balance >= 20000) {
                    tier = "Gold";
                    dailyLimit = 10000;
                } else if (balance >= 5000) {
                    tier = "Silver";
                    dailyLimit = 5000;
                } else {
                    tier = "Bronze";
                    dailyLimit = 1000;
                }

                System.out.println("Account Tier: " + tier);

                // Select transaction fee
                switch (tier) {
                    case "Bronze":
                        feeRate = 0.02;
                        break;
                    case "Silver":
                        feeRate = 0.015;
                        break;
                    case "Gold":
                        feeRate = 0.01;
                        break;
                    case "Platinum":
                        feeRate = 0.005;
                        break;
                }

                // Check withdrawal conditions
                if (withdrawal > 0) {
                    if (withdrawal <= balance) {
                        if (withdrawal <= dailyLimit) {

                            fee = withdrawal * feeRate;
                            total = withdrawal + fee;

                            // Final authorization
                            if (total <= balance) {
                                System.out.println("Transaction: APPROVED");
                                System.out.println("Withdrawal: " + withdrawal);
                                System.out.println("Transaction Fee: " + fee);
                                System.out.println("Total Amount: " + total);
                                System.out.println("Remaining Balance: "
                                        + (balance - total));
                            } else {
                                System.out.println(
                                        "Transaction: DENIED - Insufficient balance for fee.");
                            }

                        } else {
                            System.out.println(
                                    "Transaction: DENIED - Daily withdrawal limit exceeded.");
                        }
                    } else {
                        System.out.println(
                                "Transaction: DENIED - Insufficient balance.");
                    }
                } else {
                    System.out.println(
                            "Transaction: DENIED - Withdrawal must be greater than zero.");
                }

            } else {
                System.out.println("Login failed: Incorrect PIN.");
            }

        } else {
            System.out.println("Login failed: Incorrect username.");
        }
    }
    
}

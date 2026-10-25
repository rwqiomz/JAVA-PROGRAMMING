/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cf1.decision.making;

/**
 *
 * @author Ely Estolloso
 */
public class Multier_Disc {
    public static void main(String[] args) {
        double purchaseAmount = 7500.00;
        double discountPercent = 0;
        double discountAmount;
        double finalPrice;
        String tier;

        System.out.println("=================================================");
        System.out.println("      MULTI-TIER DISCOUNT SYSTEM");
        System.out.println("=================================================");

        if (purchaseAmount < 1000) {
            tier = "Bronze";
            discountPercent = 0;
        } else if (purchaseAmount < 3000) {
            tier = "Silver";
            discountPercent = 0.05;
        } else if (purchaseAmount < 5000) {
            tier = "Gold";
            discountPercent = 0.10;
        } else {
            tier = "Platinum";
            discountPercent = 0.15;
        }

        // Calculate discount and final price
        discountAmount = purchaseAmount * discountPercent;
        finalPrice = purchaseAmount - discountAmount;

        System.out.println("Purchase Amount: PHP " + purchaseAmount);
        System.out.println("=================================================");
        System.out.println("Discount Tier: " + tier);
        System.out.println("Discount Rate: " + (discountPercent * 100) + "%");
        System.out.println("Discount Amount: PHP " + discountAmount);
        System.out.println("Final Discounted Price: PHP " + finalPrice);
        System.out.println("=================================================");
    }
}

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
        double purchaseAmount = 2500;
        double discount;
        double finalPrice;

        if (purchaseAmount >= 3000) {
            discount = 0.15;
        } else if (purchaseAmount >= 2000) {
            discount = 0.10;
        } else if (purchaseAmount >= 1000) {
            discount = 0.05;
        } else {
            discount = 0.00;
        }

        finalPrice = purchaseAmount - (purchaseAmount * discount);

        System.out.println("Purchase Amount: " + purchaseAmount);
        System.out.println("Discount Tier: " + (discount * 100) + "%");
        System.out.println("Final Discounted Price: " + finalPrice);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package data.types.and.variabless;

/**
 *
 * @author Ely Estolloso
 */
public class Type_SafeshoppingCalculator {
    public static void main(String[] args) {
        
        String storeName = "Pan Pastry - Ne";
        int quantity = 11;
        double unitPrice = 65.07;
        
        // totalCost should not be an int because the cost can include decimal values.
        double totalCost = quantity * unitPrice;
        
        System.out.println("=================================================");
        System.out.println( "               " +  storeName );
        System.out.println("=================================================");

        // Display the purchase summary
        System.out.println("------------------- SUMMARY ---------------------");
        
        System.out.println("Quantity: " + quantity);
        System.out.printf("Unit Price: %.2f%n", unitPrice);
        System.out.printf("Total Cost: %.2f%n", totalCost);
        
        System.out.println("=================================================");
    }
    
}

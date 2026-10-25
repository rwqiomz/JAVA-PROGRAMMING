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
        int quantity = 7;
        double unitPrice = 25;
        
        double totalCost = quantity * unitPrice;
        
        System.out.println("=================================================");
        System.out.println( "               " +  storeName );
        System.out.println("=================================================");

        System.out.println(storeName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: PHP " + unitPrice);
        System.out.println("Total Price: PHP " + totalCost);
        
        System.out.println("=================================================");
    }
    
}

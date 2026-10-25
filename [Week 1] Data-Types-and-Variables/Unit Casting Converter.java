/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package data.types.and.variabless;

/**
 *
 * @author Ely Estolloso
 */
public class Unit_CastingConverter {
    public static void main(String[] args) {

        double centimeters = 6517;
        
        int meters = (int) (centimeters / 100);   
        double remainingCm = centimeters - (meters * 100);
        
        System.out.println("=================================================");
        System.out.println("\t     UNIT CASTING CONVERTER");
        System.out.println("=================================================");
        
        System.out.println("Total Centimeters: " + centimeters + " cm");
        System.out.println("Whole Meters: " + meters + " m");
        System.out.println("Remaining Centimeters: " + remainingCm + " cm");
        
        /* In Implicit Widening it automatically converts int to double because 
        double can store both whole numbers and decimal numbers and can safely 
        store an int value. */
        int number = 25;
        double widenedNumber = number;
        
        System.out.println("\n============== IMPLICIT WIDENING ==============");
        System.out.println("Integer Value: " + number);
        System.out.println("Double Value: " + widenedNumber);
        
        /* In Explicit Narrowing is to convert double to int. An int cannot 
        store decimal values, so the decimal part .75 is lost and it 
        becomes 18.*/
        double decimalValue = 18.75;
        int narrowedValue = (int) decimalValue;

        System.out.println("\n============== EXPLICIT NARROWING =============");
        System.out.println("Original Double: " + decimalValue);
        System.out.println("Converted Integer: " + narrowedValue);
    }
    
}

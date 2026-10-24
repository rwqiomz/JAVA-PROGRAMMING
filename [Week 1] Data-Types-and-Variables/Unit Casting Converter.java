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
        double centimeters = 275.8;
        int wholeMeters = (int) (centimeters / 100);
           
        double remainingCm = centimeters - (wholeMeters * 100);
           
        System.out.println("===== UNIT CASTING CONVERTER =====");
        System.out.println("Total Centimeters: " + centimeters + " cm");
        System.out.println("Whole Meters: " + wholeMeters + " m");
        System.out.println("Remaining Centimeters: " + remainingCm + " cm");
        
        int number = 25;
        double widenedNumber = number;
        
        System.out.println("\n===== IMPLICIT WIDENING =====");
        System.out.println("Integer Value: " + number);
        System.out.println("Double Value: " + widenedNumber);
        
        double decimalValue = 18.75;
        int narrowedValue = (int) decimalValue;

        System.out.println("\n===== EXPLICIT NARROWING =====");
        System.out.println("Original Double: " + decimalValue);
        System.out.println("Converted Integer: " + narrowedValue);
    }
    
}

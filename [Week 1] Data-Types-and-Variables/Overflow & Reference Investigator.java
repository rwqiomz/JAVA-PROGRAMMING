/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package data.types.and.variabless;

/**
 * 
 * @author Ely Estolloso
 */
public class Overflow_ReferenceInvestigator {
    public static void main(String[] args) {
        byte number = 127;
        number++; // Increases the value, causing it to wrap around to -128

        String text1 = new String("Paradise BKK");
        String text2 = new String("Paradise BKK");
        String text3 = "Paradise BKK";
        
        System.out.println("=================================================");
        System.out.println("        OVERFLOW & REFERENCE INVESTIGATOR ");
        System.out.println("=================================================");
        
        System.out.println("Byte Overflow: " + number);
        
        System.out.println("\nString Comparisons:");
        // False because text1 and text2 are separate objects
        System.out.println("text1 == text2: " + (text1 == text2));
        
        // False because text1 is a new object and text3 is a string constant
        System.out.println("text1 == text3: " + (text1 == text3));
        
        // False because text2 is a new object and text3 is a string constant
        System.out.println("text2 == text3: " + (text2 == text3));

        // String contents using .equals(), all results are true because the text is the same
        System.out.println("text1.equals(text2): " + text1.equals(text2));
        System.out.println("text1.equals(text3): " + text1.equals(text3));
        System.out.println("text2.equals 3(text3): " + text2.equals(text3));

        int[] array1 = {10, 20, 30};
        int[] array2 = array1;

        array2[0] = 99;

        // Both variables show 99 because they share the same array
        System.out.println("\nArray Reference:");
        System.out.println("array1[0]: " + array1[0]);
        System.out.println("array2[0]: " + array2[0]);
    }
}

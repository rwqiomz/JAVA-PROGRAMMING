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
        number++;

        System.out.println("Byte Overflow: " + number);

        String text1 = new String("Hello");
        String text2 = new String("Hello");
        String text3 = "Hello";

        System.out.println("\nString Comparisons:");
        System.out.println("text1.equals(text2): " + text1.equals(text2));
        System.out.println("text1.equals(text3): " + text1.equals(text3));
        System.out.println("text2.equals 3(text3): " + text2.equals(text3));

        System.out.println("\nReference Comparisons:");
        System.out.println("text1 == text2: " + (text1 == text2));
        System.out.println("text1 == text3: " + (text1 == text3));
        System.out.println("text2 == text3: " + (text2 == text3));

        int[] array1 = {10, 20, 30};
        int[] array2 = array1;

        array2[0] = 99;

        System.out.println("\nArray Reference:");
        System.out.println("array1[0]: " + array1[0]);
        System.out.println("array2[0]: " + array2[0]);
    }
}

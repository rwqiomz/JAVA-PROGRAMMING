/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jv.operators;

/**
 *
 * @author Ely Estolloso
 */

public class FourFunc_calxc {
    public static void main(String[] args) {
        
        int num1= 54; 
        int num2= 86;
        
        System.out.print("Enter the first integer: " + num1);

        System.out.print("Enter the second integer: " + num2);

        System.out.println("\n===== CALCULATOR RESULTS =====");

        // Addition 
        System.out.println("Addition: " + (num1 + num2));

        // Subtraction
        System.out.println("Subtraction: " + (num1 - num2));

        // Multiplication
        System.out.println("Multiplication: " + (num1 * num2));
        
        if (num2 != 0) {
            // Integer division removes the fractional part. 
            // With negative operands, division truncates toward zero.
            System.out.println("Division: " + (num1 / num2));

            // The remainder follows the sign of the first operand.
            System.out.println("Modulus: " + (num1 % num2));
        } else {
            System.out.println("Division: Cannot divide by zero.");
            System.out.println("Modulus: Cannot calculate modulus by zero.");
        }

    }
    
}

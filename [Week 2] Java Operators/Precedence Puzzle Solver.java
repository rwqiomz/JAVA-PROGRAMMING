/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jv.operators;

/**
 *
 * @author Ely Estolloso
 */
public class Precedpuzzer {
    public static void main(String[] args) {
        
        int first = 5;
        int second = 4;
        int third = 7;
        
        // EXPERT PRECEDENCE PUZZLE SOLVER //
        System.out.println("\nEXPERT PRECEDENCE PUZZLE SOLVER");
        
        /* PREDICTED: 33
           Multiplication (*) happens before addition (+).
        */
        
        System.out.println("Expression 1: " + (first + second * third));
        /* PREDICTED: true
            Arithmetic (+) and relational (>) are evaluated before logical (&&).
        */
        
        System.out.println("Expression 2: " + (first > second && second + third == 10));
        /* PREDICTED: 11
            Increment (++) increases first before addition (+).
        */
        
        System.out.println("Expression 3: " + (++first + second));
        
    }
    
}

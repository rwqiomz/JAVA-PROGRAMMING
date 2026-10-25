/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jv.operators;

/**
 *
 * @author Ely Estolloso
 */
public class CompGrot_Inceter {
    public static void main(String[] args) {
        
        double balance = 1000;
        
        System.out.println("===================================================");
        System.out.println("\tCOMPOUND GROWTH & INCREMENT TRACKER");
        System.out.println("===================================================");
        
        System.out.println("Initial Balance: " + balance);

        // Compound assignment operators update the balance.
        balance += 100;
        System.out.println("After +100 deposit: " + balance);

        balance *= 1.10;
        System.out.println("After 10% growth: " + balance);

        balance *= 500;
        System.out.println("After adding 500: " + balance);

        System.out.println("---------------------------------------------------");
        int count = 5;

        System.out.println("POSTFIX INCREMENT count++: " + count++);
        System.out.println("After count++: " + count);
        /*Postfix (count++) uses the current value first, then increases count by 1.*/

        System.out.println("---------------------------------------------------");
        System.out.println("PREFIX INCREMENT of ++count: " + ++count);
        System.out.println("After ++count: " + count);
        /*Prefix (++count) increases count by 1 first, then uses the updated value.*/
        
    }
    
}

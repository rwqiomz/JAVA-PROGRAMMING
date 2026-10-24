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

        balance += 100;
        System.out.println("After Step 1: " + balance);

        balance *= 1.10;
        System.out.println("After Step 2: " + balance);

        balance += 200;
        System.out.println("After Step 3: " + balance);

        int count = 5;

        System.out.println("\nPostfix Increment:");
        System.out.println(count++);
        System.out.println(count);

        System.out.println("\nPrefix Increment:");
        System.out.println(++count);
        System.out.println(count);

        // count++ prints the old value first, then increases count by 1.
        // ++count increases count by 1 first, then prints the new value.+++++++++++++ 
        
    }
    
}

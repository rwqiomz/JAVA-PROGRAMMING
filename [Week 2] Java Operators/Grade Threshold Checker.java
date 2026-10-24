/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jv.operators;

/**
 *
 * @author Ely Estolloso
 */
public class GrThreshl_Cher {
    public static void main(String[] args) {
       double average = 85;
        int absences = 2;

        if ((average >= 75 && absences < 3) || average > 90) {
            System.out.println("Grade: " + average);
            System.out.println("Absences: " + absences);
            System.out.println("PASS");
            System.out.println("Reason: You meet the passing requirements.");
        } else {
            System.out.println("Grade: " + average);
            System.out.println("Absences: " + absences);
            System.out.println("FAIL");
            System.out.println("Reason: You did not meet the passing requirements.");
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

/**
 *
 * @author Ely Estolloso
 */
public class Statistics_Calculator {
    public static void main(String[] args) {
       int[] scores = {85, 90, 87, 92, 88, 93, 95, 81};

        int sum = 0;
        int highest = scores[0];
        int lowest = scores[0];

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];

            if (scores[i] > highest) {
                highest = scores[i];
            }

            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }

        double average = (double) sum / scores.length;

        System.out.println("=================================================");
        System.out.println("           CLASS STATISTICS CALCULATOR");
        System.out.println("=================================================");
        
        System.out.println("Student Scores: ");
        System.out.println("85, 90, 87, 92, 88, 93, 95, 81");
        System.out.println("\nAverage: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
    }
    
}

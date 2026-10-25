/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

/**
 *
 * @author Ely Estolloso
 */
import java.util.Arrays;

public class Mini_Tool {
    public static void main(String[] args) {
        int[] scores = {85, 91, 87, 95, 88, 83, 90, 97};
        int target = 97;
        int index = -1;
        
        System.out.println("=================================================");
        System.out.println("           SEARCH & SORT MINI-TOOL");
        System.out.println("=================================================");
        
        // For linear search
        for (int i = 0; i < scores.length; i++) 
            {
                if (scores[i] == target) 
                {
                    index = i;
                    break;
                }
            }

        if (index != -1) 
        {
            System.out.println("Score " + target + " found at index " + index);
        } 
        else 
        {
            System.out.println("Score " + target + " not found.");
        }

        /* Copy the original array before sorting.
        Sorting a copy keeps the original scores in their original order.*/
        int[] sortedScores = Arrays.copyOf(scores, scores.length);

        // Sort the copied array from lowest to highest
        Arrays.sort(sortedScores);
        

        // Displays the original and sorted arrays
        System.out.println("\nOriginal Array: " + Arrays.toString(scores));
        System.out.println("Sorted Array: " + Arrays.toString(sortedScores));
    }
    
}

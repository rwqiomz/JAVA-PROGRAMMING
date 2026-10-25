/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cf2.looping.n.jump;

/**
 *
 * @author Ely Estolloso
 */
import java.util.Scanner;

public class Until_SenValti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.println("           SUM UNTIL SENTINEL VALUE");
        System.out.println("=================================================");

        int number = 0;
        int total = 0;

        while (number != -1) {
            System.out.print("Enter a number (-1 to stop): ");
            number = input.nextInt();

            if (number != -1) {
                total += number;
            }
        }

        System.out.println("Final Total: " + total);

        input.close();
    }
    
}

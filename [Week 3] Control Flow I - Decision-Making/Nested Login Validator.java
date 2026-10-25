/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cf1.decision.making;

/**
 *
 * @author Ely Estolloso
 */
import java.util.Scanner;

public class NestLog_Validt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String usernamed = "ellijah";
        String correctPassword = "1125";
        boolean accountLocked = false;

        System.out.println("=================================================");
        System.out.println("             NESTED LOGIN VALIDATOR ");
        System.out.println("=================================================");

        System.out.print("Enter username: ");
        String username = input.nextLine();

        // Check username first
        if (username.equals(username)) {

            // Enter password only if username is correct
            System.out.print("Enter password: ");
            String password = input.nextLine();

            if (password.equals(correctPassword)) {

                // Check if account is locked
                if (!accountLocked) {
                    System.out.println("Login successful!");
                } else {
                    System.out.println("Login failed: Account is locked.");
                }

            } else {
                System.out.println("Login failed: Incorrect password.");
            }

        } else {
            System.out.println("Login failed: Incorrect username.");
        }

        System.out.println("==================================");

        input.close();
    }
    
}

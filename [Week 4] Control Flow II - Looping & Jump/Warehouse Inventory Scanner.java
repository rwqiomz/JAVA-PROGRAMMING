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

public class Warehouse_Invner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
         // -1 means the shelf is damaged
        int[] inventory = {10, 5, -1, 2, 15, 8, 1, 20, 4, 12, 7, 3, 9, -1, 6, 
            11, 2, 14, 5, 10
        };

        int choice;

        do {
            System.out.println("\n=== WAREHOUSE INVENTORY ===");
            System.out.println("1. View Total Inventory");
            System.out.println("2. Find Low Inventory Shelf");
            System.out.println("3. Restock a Shelf");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();

            if (choice == 1) {
                int total = 0;

                for (int i = 0; i < inventory.length; i++) {
                    // CONTINUE: Skip damaged shelves
                    if (inventory[i] == -1) {
                        continue;
                    }

                    total += inventory[i];
                }

                System.out.println("Total Inventory: " + total);

            } else if (choice == 2) {
                boolean found = false;

                // Nested loops with BREAK to find the first low shelf
                for (int i = 0; i < inventory.length; i++) {
                    for (int j = i; j <= i; j++) {
                        if (inventory[i] != -1 && inventory[i] <= 2) {
                            System.out.println(
                                "Low inventory found at Shelf " + (i + 1)
                                + ": " + inventory[i] + " items"
                            );
                            found = true;
                            break;
                        }
                    }

                    if (found) {
                        break;
                    }
                }

                if (!found) {
                    System.out.println("No critically low shelves found.");
                }

            } else if (choice == 3) {
                System.out.print("Enter shelf number (1-20): ");
                int shelf = input.nextInt();

                if (shelf >= 1 && shelf <= 20) {
                    if (inventory[shelf - 1] == -1) {
                        System.out.println("Cannot restock a damaged shelf.");
                    } else {
                        restock(input, inventory, shelf - 1);
                    }
                } else {
                    System.out.println("Invalid shelf number.");
                }

            } else if (choice == 4) {
                System.out.println("Exiting inventory system.");

            } else {
                System.out.println("Invalid menu choice.");
            }

        } while (choice != 4);

        input.close();
    }

    public static void restock(Scanner input, int[] inventory, int shelf) {
        int amount = 0;

        while (amount <= 0) {
            System.out.print("Enter quantity to add (greater than 0): ");

            if (input.hasNextInt()) {
                amount = input.nextInt();

                if (amount <= 0) {
                    System.out.println("Invalid quantity. Try again.");
                }
            } else {
                System.out.println("Please enter a valid whole number.");
                input.next(); // Remove invalid input
            }
        }

        inventory[shelf] += amount;

        System.out.println("Restocking successful!");
        System.out.println("Updated shelf count: " + inventory[shelf]);

        return; // End the restock method 
    }
    
}

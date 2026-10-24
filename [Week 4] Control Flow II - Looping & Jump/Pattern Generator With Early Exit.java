/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cf2.looping.n.jump;

/**
 *
 * @author Ely Estolloso
 */
public class PattGenwrlyxit {
    public static void main(String[] args) {
        int size = 6;

        for (int row = 1; row <= size; row++) {

            // CONTINUE: Skip row 3
            if (row == 5) {
                continue;
            }

            for (int col = 1; col <= row; col++) {

                // BREAK: Stop the inner loop when column reaches 4
                if (col == 6) {
                    break;
                }

                System.out.print("* ");
            }

            System.out.println();
        }
    }
    
}

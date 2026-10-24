/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

/**
 *
 * @author Ely Estolloso
 */
public class FavoriteThings_Array {
    public static void main(String[] args) {
        String[] favorites = {"Music", "Photography", "Thai GL Series", "Food", 
            "Travel"};

        for (int i = 0; i < favorites.length; i++) {
            System.out.println((i + 1) + ". " + favorites[i]);
        }

        System.out.println("The Favorite Thinngs I love is: " + favorites.length);
    }
    
}

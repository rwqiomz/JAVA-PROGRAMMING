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
        String[] favorites = {"Music", "Photography", "Food", "Badminton", "Travel"};

        System.out.println("=================================================");
        System.out.println("           FAVORITE THINGS ARRAY :) ");
        System.out.println("=================================================");

        for (int i = 0; i < favorites.length; i++) {
            System.out.println((i + 1) + ". " + favorites[i]);
        }

        System.out.println("=================================================");
        System.out.println("Total Favorite Things: " + favorites.length);
    }
}

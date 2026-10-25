/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cf1.decision.making;

/**
 *
 * @author Ely Estolloso
 */
public class NestLog_Validt {
    public static void main(String[] args) {
        String username = "ellijah";
        String correctPassword = "1125";
        boolean accountLocked = false;

        System.out.println("============ NESTED LOGIN VALIDATOR ==============");

        if (username.equals("ellijah")) {
            if (correctPassword.equals("1125")) {
                if (!accountLocked) {
                    System.out.println("Login Successful!");
                } else {
                    System.out.println("Login Failed: Account is locked.");
                }
            } else {
                System.out.println("Login Failed: Wrong password.");
            }
        } else {
            System.out.println("Login Failed: Wrong username.");
        }
    }
    
}

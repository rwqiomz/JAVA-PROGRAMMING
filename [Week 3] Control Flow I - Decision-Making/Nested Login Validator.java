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
        String username = "student";
        String password = "12345";
        boolean accountLocked = false;

        if (username.equals("student")) {
            if (password.equals("12345")) {
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
